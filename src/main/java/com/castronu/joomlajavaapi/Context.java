package com.castronu.joomlajavaapi;

import java.util.*;

import javax.sql.DataSource;

import com.castronu.joomlajavaapi.app.JoomlaJavaApi;
import com.castronu.joomlajavaapi.dao.CategoryDao;
import com.castronu.joomlajavaapi.dao.ContentDao;
import com.castronu.joomlajavaapi.dao.MenuDao;
import com.castronu.joomlajavaapi.domain.Content;
import com.castronu.joomlajavaapi.domain.CustomNamingStrategy;
import com.castronu.joomlajavaapi.domain.Menu;

import org.apache.commons.lang.StringUtils;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.HibernateTransactionManager;
import org.springframework.orm.hibernate3.annotation.AnnotationSessionFactoryBean;

/**
 * @author SivaLabs
 *
 */
@Configuration
@PropertySource("joomlajavaapi.properties")
public class Context
{

    @Autowired
    Environment environment;

    @Bean
    public JoomlaJavaApi joomlaJavaApi(SessionFactory sessionFactory){
        return new JoomlaJavaApi(contentDao(sessionFactory),
                categoryDao(sessionFactory),menuDao(sessionFactory));
    }

    @Bean
    public CategoryDao categoryDao(SessionFactory sessionFactory) {
        CategoryDao categoryDao = new CategoryDao();
        categoryDao.setSessionFactory(sessionFactory);
        return categoryDao;
    }
    
    @Bean
    public MenuDao menuDao(SessionFactory sessionFactory) {
    	MenuDao md = new MenuDao();
        md.setSessionFactory(sessionFactory);
        return md;
    }



    @Bean
    public ContentDao contentDao(SessionFactory sessionFactory) {
        ContentDao contentDao = new ContentDao(categoryDao(sessionFactory));
        contentDao.setSessionFactory(sessionFactory);
        return contentDao;
    }
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyPlaceHolderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean()
    public DataSource getDataSource()
    {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName(environment.getProperty("jdbc.driverClassName"));
        ds.setUrl(environment.getProperty("jdbc.url"));
        ds.setUsername(environment.getProperty("jdbc.username"));
        ds.setPassword(environment.getProperty("jdbc.password"));
        return ds;
    }

    @Bean
    @Autowired
    public HibernateTransactionManager transactionManager(SessionFactory sessionFactory)
    {
        HibernateTransactionManager htm = new HibernateTransactionManager();
        htm.setSessionFactory(sessionFactory);
        return htm;
    }

    @Bean
    @Autowired
    public HibernateTemplate getHibernateTemplate(SessionFactory sessionFactory)
    {
        HibernateTemplate hibernateTemplate = new HibernateTemplate(sessionFactory);
        return hibernateTemplate;
    }

    @Bean
    public AnnotationSessionFactoryBean getSessionFactory()
    {
        AnnotationSessionFactoryBean asfb = new AnnotationSessionFactoryBean();
        asfb.setDataSource(getDataSource());
        asfb.setHibernateProperties(getHibernateProperties());
        String prefixTable = environment.getProperty("joomladb.prefixtable");
        if (StringUtils.isEmpty(prefixTable)) {
            throw new IllegalStateException("Please provide joomladb.prefixtable");
        }
        asfb.setNamingStrategy(new CustomNamingStrategy(prefixTable));
        List<Class> classes = new ArrayList<Class>();
        classes.add(com.castronu.joomlajavaapi.domain.Category.class);
        classes.add(Content.class);
        classes.add(Menu.class);
        asfb.setAnnotatedClasses((classes.toArray(new Class[classes.size()])));
        return asfb;
    }

    @Bean
    public Properties getHibernateProperties()
    {
        Properties properties = new Properties();
        properties.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
        properties.put("hibernate.show_sql", "true");
        //properties.put("hibernate.globally_quoted_identifiers", "true");
        return properties;
    }

}

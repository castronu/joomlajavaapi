package com.castronu.joomladsl;

import java.util.*;

import javax.sql.DataSource;

import com.castronu.joomladsl.dao.CategoryDao;
import com.castronu.joomladsl.dao.ContentDao;
import com.castronu.joomladsl.dao.MenuDao;
import com.castronu.joomladsl.domain.Content;
import com.castronu.joomladsl.domain.Menu;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.HibernateTransactionManager;
import org.springframework.orm.hibernate3.annotation.AnnotationSessionFactoryBean;
import org.springframework.orm.hibernate3.support.IdTransferringMergeEventListener;
import org.springframework.transaction.annotation.AnnotationTransactionAttributeSource;
import org.springframework.transaction.interceptor.TransactionAttributeSource;
import org.springframework.transaction.interceptor.TransactionInterceptor;

/**
 * @author SivaLabs
 *
 */
@Configuration
public class Context
{
    //${jdbc.driverClassName}
    @Value("${jdbc.driverClassName}")     private String driverClassName;
    @Value("${jdbc.url}")                 private String url;
    @Value("${jdbc.username}")             private String username;
    @Value("${jdbc.password}")             private String password;

    @Value("${hibernate.dialect}")         private String hibernateDialect;
    @Value("${hibernate.show_sql}")     private String hibernateShowSql;
    @Value("${hibernate.hbm2ddl.auto}") private String hibernateHbm2ddlAuto;

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
    public PropertyPlaceholderConfigurer getPropertyPlaceholderConfigurer()
    {
        PropertyPlaceholderConfigurer ppc = new PropertyPlaceholderConfigurer();
        ppc.setLocation(new ClassPathResource("application.properties"));
        ppc.setIgnoreUnresolvablePlaceholders(false);
        return ppc;
    }

    @Bean()
    public DataSource getDataSource()
    {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://testJoomlaDsl.db.10868310.hostedresource.com:3306/testJoomlaDsl?zeroDateTimeBehavior=convertToNull");
        ds.setUsername("testJoomlaDsl");
        ds.setPassword("piazzaDEGRAD1!");
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
        List<Class> classes = new ArrayList<Class>();
        classes.add(com.castronu.joomladsl.domain.Category.class);
        classes.add(Content.class);
        classes.add(Menu.class);
        asfb.setAnnotatedClasses((classes.toArray(new Class[classes.size()])));
        return asfb;
    }

    @Bean
    public Properties getHibernateProperties()
    {
        Properties properties = new Properties();
        properties.put("hibernate.dialect", "org.hibernate.dialect.HSQLDialect");
        properties.put("hibernate.show_sql", "true");
        return properties;
    }

}

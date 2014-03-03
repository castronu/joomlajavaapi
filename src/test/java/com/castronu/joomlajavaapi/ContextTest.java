package com.castronu.joomlajavaapi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 * User: castronu
 * Date: 03/03/14
 * Time: 14:04
 * To change this template use File | Settings | File Templates.
 */
@Configuration
@Import(Context.class)
public class ContextTest {

    @Bean
    public DataSource getDataSource()
    {

        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("org.hsqldb.jdbcDriver");
        ds.setUrl("jdbc:hsqldb:mem:aname;MODE=MySQL");
        ds.setUsername("sa");
        ds.setPassword("");
        return ds;

    }

    @Bean
    public Properties getHibernateProperties()
    {
        Properties properties = new Properties();
        properties.put("hibernate.dialect", "org.hibernate.dialect.HSQLDialect");
        properties.put("hibernate.show_sql", "true");
        properties.put("hibernate.hbm2ddl.auto", "create");
        properties.put("hibernate.jdbc.factory_class","org.hibernate.jdbc.NonBatchingBatcherFactory");

        return properties;
    }

}


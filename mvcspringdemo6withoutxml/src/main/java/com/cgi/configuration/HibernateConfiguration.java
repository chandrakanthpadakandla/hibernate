package com.cgi.configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.cgi.model.Student;

@Configuration
@EnableTransactionManagement
public class HibernateConfiguration {

// Get a bean for sessionFactory
	public DataSource dataSource() {
		BasicDataSource dataSource=new BasicDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/mydatabase");
		dataSource.setUsername("root");
		dataSource.setPassword("cgi123");
	    return dataSource;
		
	}
	
	@Bean
	@Autowired
    public LocalSessionFactoryBean sessionFactory(DataSource dataSource) {
	{
		LocalSessionFactoryBean sessionFactory=new LocalSessionFactoryBean();        
        sessionFactory.setDataSource(dataSource);
 
		
		Properties properties=new Properties();
		properties.put("hibernate.show_sql",true);
		properties.put("hibernate.hbm2ddl.auto", "update");
		properties.put("hibernate.dialect","org.hibernate.dialect.MYSQLDialect");
		sessionFactory.setPackagesToScan(new String[] {"com.cgi"});
		sessionFactory.setAnnotatedClasses(Student.class);
        sessionFactory.setHibernateProperties(properties);
			return sessionFactory;
			}
	}
	@Bean
	@Autowired
		public HibernateTransactionManager transactionManager(SessionFactory sessionFactory) {
		   HibernateTransactionManager transactionManager=new HibernateTransactionManager();
	        transactionManager.setSessionFactory(sessionFactory);
	        return transactionManager;
	
	}

	}

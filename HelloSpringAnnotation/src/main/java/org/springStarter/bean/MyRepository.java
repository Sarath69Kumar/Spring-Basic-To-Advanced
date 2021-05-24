package org.springStarter.bean;

import java.util.Date;

import org.springframework.stereotype.Repository;

/*
 * https://stackoverflow.com/questions/6827752/whats-the-difference-between-component-repository-service-annotations-in
 * 
 * @Component
 * 		>Indicates a auto scan component. 
 * 		>generic stereotype for any Spring-managed component
 * 
 * @Repository 
 * 		>Indicates DAO component in the persistence layer.
 * 		>stereotype for persistence layer
 *
 * 
 * @Service 
 * 		>Indicates a Service component in the business layer.
 *  	>stereotype for service layer
 * 
 * @Controller 
 * 		>Indicates a controller component in the presentation layer.
 * 		>stereotype for presentation layer (spring-mvc)
 */

@Repository
public class MyRepository 
{
	public String getAppName()
	{
		return "Hello Spring App";
	}
	
	public Date getSystemDateTime()
	{
		return new Date();
	}
}

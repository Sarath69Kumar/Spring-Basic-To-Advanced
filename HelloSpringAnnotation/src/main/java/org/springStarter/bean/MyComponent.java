package org.springStarter.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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

@Component
public class MyComponent 
{
	@Autowired
	private MyRepository repository;
	
	public void showAppInfo()
	{
		System.out.println("Now is : " + repository.getSystemDateTime());
		System.out.println("App Name :" + repository.getAppName());
	}
}

package org.springStarter.bean;

import org.springStarter.Language.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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



//To inform spring that the class is a Spring Bean
@Service
public class GreetingService 
{
	
	/*@Autowired is annotated on a field 
	to inform Spring that let's inject 
	value into the field. 
	Note: The meaning of term "inject" 
	is similar to assigning a value to that field.*/
	
	@Autowired
	private Language language;
	
	
	public GreetingService()
	{
		
	}
	
	public void sayGreeting()
	{
		String greeting = language.getGreeting();
		
		System.out.println("Greeting : "+greeting);
	}
}

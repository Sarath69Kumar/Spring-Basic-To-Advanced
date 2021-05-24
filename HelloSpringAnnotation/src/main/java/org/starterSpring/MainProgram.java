package org.starterSpring;

import org.springStarter.Language.Language;
import org.springStarter.bean.GreetingService;
import org.springStarter.bean.MyComponent;
import org.springStarter.config.AppConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainProgram 
{
	public static void main(String[] args)
	{
		//Creating a Context Application object by reading
		//The configuration of the "AppConfiguration class"
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		
		System.out.println("-------");
		Language language = (Language) context.getBean("language");
		
		System.out.println("Bean Language : " + language);
		System.out.println("Call Language.sayBye() : "+language.getBye());
		
		System.out.println("-------");
		
		GreetingService service = (GreetingService) context.getBean("greetingService");
		
		service.sayGreeting();
		
		System.out.println("--------");
		
		MyComponent myComponent = (MyComponent) context.getBean("myComponent");
		
		myComponent.showAppInfo();
	}
}

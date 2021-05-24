package org.springStarter.config;

import org.springStarter.Language.Language;
import org.springStarter.Language.impl.Tamil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
 * 
 *@Configuration Indicates that a class declares one or more @Bean methods and may be processed by the Spring container to generate bean definitions and service requests for those beans at runtime
 *
 *@Component Indicates that an annotated class is a "component". Such classes are considered as candidates for auto-detection when using annotation-based configuration and classpath scanning.
 *
 *@Configuration is meta-annotated with @Component, therefore @Configuration classes are candidates for component scanning
 *
 */

@Configuration
@ComponentScan({"org.springStarter.bean"})
public class AppConfiguration 
{
	@Bean(name="language")
	public Language getLanguage()
	{
		return new Tamil();
	}
}

/*
 * Spring BEANS that are created will be managed in Spring IoC container.
 * 
 * IoC - Inversion of control
 * 
 * DI  - Dependen
 */

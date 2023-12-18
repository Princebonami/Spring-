package removeConfigurationFile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationFile {
	
	@Bean("address")
	public Address run()
	{
		return new Address();
	}
	
	@Bean("student")
	public Student walk()
	{
		return new Student();
	}

}

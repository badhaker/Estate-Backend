package com.estate;

import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableAsync;

import com.estate.resource.AppConstant;


@SpringBootApplication
@EnableAsync
public class EstateBackendApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		new SpringApplicationBuilder(EstateBackendApplication.class).sources(EstateBackendApplication.class)
		.properties(getProperties())
		.run(args);
	}
	
	@Override protected SpringApplicationBuilder
	configure(SpringApplicationBuilder springApplicationBuilder) { return
			springApplicationBuilder.sources(EstateBackendApplication.class).properties(
					getProperties()); }

	static Properties getProperties() { Properties props = new Properties();
	props.put("spring.config.location", AppConstant.FileLocation.PROPERTY_PATH);
	return props; }

}

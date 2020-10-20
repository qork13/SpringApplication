package computers.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import computers.beans.Computers;

@Configuration
public class BeanConfiguration {

	@Bean
	public Computers computers() {
	Computers bean = new Computers( );
	bean.setManufacturer("Dell");
	bean.setGhz(2.4);
	bean.setSerialNum(125699855);
	bean.setProcessorManufacturer("Intel");
	return bean;
	}
	
}

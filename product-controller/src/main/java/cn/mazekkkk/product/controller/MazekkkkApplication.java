package cn.mazekkkk.product.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
//@EnableWebMvc
//@EnableAutoConfiguration(exclude = DataSourceAutoConfiguration.class)
@EnableAutoConfiguration
@EnableJms
@ComponentScan(basePackages = { "cn.mazekkkk.product" })
public class MazekkkkApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(MazekkkkApplication.class);
		app.run(args);
	}

}

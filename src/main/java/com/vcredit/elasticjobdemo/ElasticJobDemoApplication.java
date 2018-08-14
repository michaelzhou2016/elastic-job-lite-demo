package com.vcredit.elasticjobdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource(value = {"classpath:job.xml"})
@SpringBootApplication
public class ElasticJobDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElasticJobDemoApplication.class, args);
	}
}

package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@MapperScan("com.example.demo")
@SpringBootApplication
public class DemoApplication extends SpringBootServletInitializer {
	
	@RestController
	public static class WellcomeController {
		@GetMapping("/")
		public String wellcome() {
			return "<H1>Wellcome Line Bank - WEB</H1>目前處於開發階段的後端 API，尚未與前端 angular 畫面整合！故請透過 VScode 執行才有畫面-謝謝！";
		}
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(DemoApplication.class);
	}
	
	public static void main(String[] args) {
		SpringApplication springApp = new SpringApplication(DemoApplication.class);
		springApp.run(args);
	}
}

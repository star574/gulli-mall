package com.lsh.gulimall.auth.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class GulimallWebConfig implements WebMvcConfigurer {

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {

		/*映射视图*/
//		registry.addViewController("/login.html").setViewName("login");
		registry.addViewController("/reg.html").setViewName("reg");
	}
}

package com.eventmanagement.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

//Enabling method level security
@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	// add authentication using user/password that can come from in-memory or database or providers
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("kumaran").password("{noop}kumaran").roles("USER").and().withUser("admin")
				.password("{noop}admin").roles("ADMIN");
	}

	//Add http url and http method level security
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.httpBasic().and().authorizeRequests().antMatchers(HttpMethod.POST, "/events").hasRole("ADMIN")
				.antMatchers(HttpMethod.PUT, "/events/**").hasRole("ADMIN").antMatchers(HttpMethod.PATCH, "/events/**")
				.hasRole("ADMIN").and().csrf().disable();
	}

}
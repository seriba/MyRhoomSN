package com.rhoomsn.app.web.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.annotation.Order;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;



import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.web.csrf.CsrfFilter;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.security.web.csrf.CsrfTokenRepository;
import org.springframework.security.web.csrf.HttpSessionCsrfTokenRepository;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.util.WebUtils;

@EnableAutoConfiguration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.rhoomsn.app.web")
@ComponentScan("com.rhoomsn.app.web")
@EntityScan("com.rhoomsn.app.web.entity")
@PropertySource(value = { "classpath:configuration/application.properties" })
@SpringBootApplication

public class RhoomSnWebConfig {

	// MAIN CLASS RUN
	public static void main(String[] args) {
		SpringApplication.run(RhoomSnWebConfig.class, args);
	}

	@Bean
	public PlatformTransactionManager transactionManager() {
		return new JpaTransactionManager();
	}

	@Bean
	public WebSecurityConfigurerAdapter webSecurityConfigurerAdapter() {
		return new MySecurityConfigurer();
	}

	@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
	public static class MySecurityConfigurer extends WebSecurityConfigurerAdapter {
		
		//Spring Security nous propose un basic authentication form acceptant uniquement user user
		 @Override
		 protected void configure(AuthenticationManagerBuilder builder) throws
		 Exception {
		 builder.inMemoryAuthentication()
		 .withUser("user").password("user").roles("USER");
		
		 }
		 
//		@Override
//		protected void configure(HttpSecurity http) throws Exception {
//			//pour customiser le login page
//			http.authorizeRequests().antMatchers("/dist/*","/home/**","/index.html","/login.html","/").permitAll()
//					.anyRequest().authenticated()
//			.and().csrf()
//			.csrfTokenRepository(csrfTokenRepository()).and()
//			.addFilterAfter(csrfHeaderFilter(), CsrfFilter.class);
//		}
//		
//		private Filter csrfHeaderFilter() {
//			return new OncePerRequestFilter() {
//				@Override
//				protected void doFilterInternal(HttpServletRequest request,
//						HttpServletResponse response, FilterChain filterChain)
//						throws ServletException, IOException {
//					CsrfToken csrf = (CsrfToken) request.getAttribute(CsrfToken.class
//							.getName());
//					if (csrf != null) {
//						Cookie cookie = WebUtils.getCookie(request, "XSRF-TOKEN");
//						String token = csrf.getToken();
//						if (cookie == null || token != null
//								&& !token.equals(cookie.getValue())) {
//							cookie = new Cookie("XSRF-TOKEN", token);
//							cookie.setPath("/home");
//							response.addCookie(cookie);
//						}
//					}
//					filterChain.doFilter(request, response);
//				}
//			};
//		}

//		private CsrfTokenRepository csrfTokenRepository() {
//			HttpSessionCsrfTokenRepository repository = new HttpSessionCsrfTokenRepository();
//			repository.setHeaderName("X-XSRF-TOKEN");
//			return repository;
//		}

	}

}

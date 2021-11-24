package fr.eni.tpcine.security;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import fr.eni.tpcine.bo.AppUser;
import fr.eni.tpcine.services.UserService;
import fr.eni.tpcine.services.UserServiceInterface;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		String[] allowedResources  =  {
		        "/img/**",
		        "/js/**",
		        "/style/**",
		};
		
		http.authorizeRequests().antMatchers(allowedResources).permitAll().anyRequest().authenticated().and()
		.formLogin()
		.loginPage("/login")
		.permitAll().and().logout().permitAll();
	}

	 
	@Bean
	public UserDetailsService userDetailsService(PasswordEncoder encoder, UserServiceInterface userService) {
		var user = new AppUser("bob",encoder.encode("azerty"));
		
		userService.create(user);

		return (UserDetailsService) userService;
	}

	@Autowired
    public void configureAuthentication(AuthenticationManagerBuilder authenticationManagerBuilder, UserServiceInterface userService) throws Exception {
        authenticationManagerBuilder
        		.userDetailsService((UserDetailsService)userService)
                .passwordEncoder(passwordEncoder());
    }
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}

package edu.sabanciuniv.berry.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;


@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled=true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
    @Autowired
    private UserDetailsService userDetailsService;

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

	
	private static final String[] PUBLIC_MATCHERS = {
			"/css/**",
			"/js/**",
			"/images/**",
			"/",
			"/myAccount",
			"welcome",
			"/home",
			"/index",
			"/register",
			"/fontawesome-free/**",
			"/templates/**",
			"/static/**",
			"/jquery/**",
			"/simple-line-icons/**",
			"/**",
			"/welcome",
			"login"
	};
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests().
			antMatchers(PUBLIC_MATCHERS).
			permitAll().anyRequest().authenticated();
		http
			.csrf().disable().cors().disable()
			.formLogin().failureUrl("/login?error").defaultSuccessUrl("/")
			.loginPage("/login").permitAll()
			.and()
			.logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
			.logoutSuccessUrl("/?logout").deleteCookies("remember-me").permitAll()
			.and()
			.rememberMe();
		
	}
	
    @Bean
    public AuthenticationManager customAuthenticationManager() throws Exception {
        return authenticationManager();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(bCryptPasswordEncoder());
    }
	

}

package edu.sabanciuniv.berry.domain.security;

import org.springframework.security.core.GrantedAuthority;

public class Authorization implements GrantedAuthority{
	
	private final String authorization;
	
	public Authorization(String authorization) {
		this.authorization=authorization;
	}
	
	@Override
	public String getAuthority() {
		return authorization;
	}

}

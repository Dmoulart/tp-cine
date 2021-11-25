package fr.eni.tpcine.services;

import java.util.List;
import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import fr.eni.tpcine.bo.AppUser;

public interface UserServiceInterface extends EntityServiceInterface<AppUser> {
	public UserDetails loadUserByUsername(String username);
}

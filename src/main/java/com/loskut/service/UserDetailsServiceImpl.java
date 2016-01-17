package com.loskut.service;

/**
 * Created by RAYANT on 26.04.2015.
 */

import com.loskut.model.User;
import com.loskut.model.enums.UserRole;
import com.loskut.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service("userDetailsServiceImpl")
public class UserDetailsServiceImpl implements UserDetailsService {


    @Autowired
    private UserService dao;

    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {

        User user = dao.findUserByLogin(login);
        Set<GrantedAuthority> roles = new HashSet();

        if (user.getUserRole() == UserRole.ROLE_ADMIN) {
            roles.add(new SimpleGrantedAuthority("ROLE_ADMIN"));}
        else {
            roles.add(new SimpleGrantedAuthority("ROLE_USER"));
        }

        UserDetails userDetails =
                new org.springframework.security.core.userdetails.User(
                        user.getLogin(),
                        user.getPassword(),
                        roles);

        return userDetails;
    }

}
package com.green.greengram4.security;

import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

@Data
@Builder
public class MyUserDetails implements UserDetails { //

    private MyPrincipal myPrincipal;

    @Override //권한이 무엇이있는지에 대한 리턴
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override //1. 루틴(여기에 값이 리턴하도록_아이디가 리턴되도록..) 2. 커스터마이징(직접응답, 리턴까지 직접구현)
    public String getPassword() {
        return null;
    }

    @Override//1. 루틴(여기에 값이 리턴하도록_비번이 리턴되도록..) 2. 커스터마이징(직접응답, 리턴까지 직접구현)
    public String getUsername() {
        return null;
    }

    @Override //Account가Expired가 안되었나
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override//Account가 Locked이 안되었나
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }
//활성화 true, 비활성화 : false
    @Override
    public boolean isEnabled() {
        return true;
    }
}

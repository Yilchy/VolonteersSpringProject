package ua.edu.sumdu.volonteerProject.model;

import org.jboss.resteasy.spi.touri.MappedBy;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

@Entity
public class JwtUserDetails implements UserDetails {

    @ManyToMany(mappedBy = "userDetails")
    private List<Authority> authorityList;
    private String password;
    @Id
    @GeneratedValue
    private UUID id;
    private String username;
    private boolean isBlocked;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorityList;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return isBlocked;
    }

    @Override
    public boolean isAccountNonLocked() {
        return isBlocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return isBlocked;
    }

    @Override
    public boolean isEnabled() {
        return isBlocked;
    }
}

package co.edu.uniquindio.barberiavip.seguridad.modelo;

import co.edu.uniquindio.barberiavip.modelo.Rol;
import co.edu.uniquindio.barberiavip.modelo.Usuario;
import lombok.AllArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
@AllArgsConstructor
public class UserDetailsImpl implements UserDetails {

    private String username, password;
    private Collection<? extends GrantedAuthority> authorities;
    public static UserDetailsImpl build(Usuario user){
        List<GrantedAuthority> authorities = new ArrayList<>();
        if(user.getRol().equals(Rol.CLIENTE)){
            authorities.add( new SimpleGrantedAuthority("CLIENTE") );
        }else if(user.getRol().equals(Rol.BARBERO)){
            authorities.add( new SimpleGrantedAuthority("BARBERO") );
        } else if (user.getRol().equals(Rol.ADMIN)) {
            authorities.add( new SimpleGrantedAuthority("BARBERO") );
        }
        return new UserDetailsImpl(user.getEmail(), user.getPassword(), authorities);
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
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
        return true;
    }
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }
    @Override
    public boolean isEnabled() {
        return true;
    }
}

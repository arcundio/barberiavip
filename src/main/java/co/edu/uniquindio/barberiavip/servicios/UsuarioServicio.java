package co.edu.uniquindio.barberiavip.servicios;

import co.edu.uniquindio.barberiavip.modelo.Usuario;
import co.edu.uniquindio.barberiavip.modelo.dto.UsuarioGetDTO;
import co.edu.uniquindio.barberiavip.modelo.dto.UsuarioPostDTO;

import java.util.List;
import java.util.Optional;

public interface UsuarioServicio {

    int registrarUsuario(UsuarioPostDTO u) throws Exception;

    UsuarioGetDTO actualizarUsuario(int id_usuario, UsuarioGetDTO usuario) throws Exception;
    int eliminarUsuario(Usuario u) throws Exception;

    UsuarioGetDTO obtenerUsuario(int codigo) throws Exception;

    List<UsuarioGetDTO> listarUsuarios();


}

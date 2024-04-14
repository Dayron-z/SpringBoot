package com.cursojava.curso.controllers;


import com.cursojava.curso.dao.UsuarioDaoImplements;
import com.cursojava.curso.entity.Usuario;
import com.cursojava.curso.dao.CRUD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController implements CRUD {


    @Autowired
    private UsuarioDaoImplements usuarioDao;


    @RequestMapping(value = "usuarios")
    public  List<Usuario> getUsuarios(){
        return usuarioDao.listar();
    }

    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable int id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Dayron");
        usuario.setApellido("Zapata");
        usuario.setEmail("zbastian.zapata@gmail.com");
        usuario.setPassword("Dayron12345");
        usuario.setTelefono("3044545841");

        return usuario;
    }

    @Override
    public List<Usuario> listar() {
        return null;
    }

    @Override
    public Object create(Object obj) {
        return null;
    }

    @Override
    public boolean update(Object obj) {
        return false;
    }

    @Override
    public boolean delete(Object obj) {
        return false;
    }
}

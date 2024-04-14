package com.cursojava.curso.dao;

import com.cursojava.curso.entity.Usuario;

import java.util.ArrayList;
import java.util.List;

public interface CRUD {
    public List<Usuario> listar();
    public Object create(Object obj);
    public boolean update(Object obj);
    public boolean delete(Object obj);
}

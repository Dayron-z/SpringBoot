package com.cursojava.curso.dao;

import com.cursojava.curso.entity.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


@Repository
@Transactional
public class UsuarioDaoImplements implements  CRUD {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public List<Usuario> listar() {
        /*Al trabajar con hibernate, trabajamos con el nombre de nuestra clase no con el de nuestra base de datos*/
        String query = "FROM Usuario";
        List<Usuario> usuarios = entityManager.createQuery(query).getResultList();


        return usuarios;

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

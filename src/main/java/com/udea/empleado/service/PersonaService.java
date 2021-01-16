/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.empleado.service;

/**
 *
 * @author Alejandro Rios
 */

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.udea.empleado.model.Persona;
import com.udea.empleado.dao.IPersonaDAO;

@Service
public class PersonaService {

@Autowired
private IPersonaDAO dao;
public Persona save(Persona t) {return dao.save(t);}
public Persona update(Persona t) {return dao.save(t);}

public void delete(Persona t) {dao.delete(t);}
public Iterable<Persona> list() {return dao.findAll();}
public Optional<Persona> listId(long id) {return dao.findById(id);}
}

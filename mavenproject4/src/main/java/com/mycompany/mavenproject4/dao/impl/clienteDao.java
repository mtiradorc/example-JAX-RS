/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject4.dao.impl;

import com.mycompany.mavenproject4.dao.IClienteDao;
import com.mycompany.mavenproject4.dto.ClienteDto;
//import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
//import javax.persistence.StoredProcedureQuery;

/**
 *
 * @author MTIRADORC
 */
@Stateless
public class clienteDao implements IClienteDao {

    @PersistenceContext(unitName = "book")
    EntityManager emf;

    @Override
    public List<ClienteDto> getCliente() {
        Query query = emf.createNamedQuery("ClientEntity.findAll");
        List<ClienteDto> listEmployee = query.getResultList();
        emf.close();
        return listEmployee;
    }
}

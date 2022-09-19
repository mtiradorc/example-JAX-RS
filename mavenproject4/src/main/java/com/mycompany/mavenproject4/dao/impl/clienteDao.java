/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject4.dao.impl;

import com.mycompany.mavenproject4.dao.IClienteDao;
import com.mycompany.mavenproject4.dto.ClienteDto;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.StoredProcedureQuery;
import javax.persistence.TypedQuery;

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
        List<ClienteDto> listCliente = null;
        try {
            // get all the objects from Client table
            listCliente = emf.createNativeQuery("select * from cliente ", ClienteDto.class).getResultList();

        } catch (Exception e) {
            e.fillInStackTrace();
        }

        return listCliente;
    }

    @Override
    public ClienteDto getClienteById(Long id) {
        ClienteDto cliente = null;
        try {
            // get all the objects from Client table
            
            TypedQuery<ClienteDto> query  = emf.createQuery("select * from cliente WHERE id = :clienteId", ClienteDto.class);
            query.setParameter("clienteId", id);
            cliente = query.getSingleResult();
            System.out.println("prueba");
        } catch (Exception e) {
            e.fillInStackTrace();
        }

        return cliente;
    }

}

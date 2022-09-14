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
            // get all the objects from Employee table
            listCliente = emf.createNativeQuery("select * from cliente").getResultList();

            if (listCliente == null) {
                System.out.println("No employee found . ");
            } else {
                for (ClienteDto empl : listCliente) {
                    System.out.println("Employee name= " + empl.getNombre() + ", Usuario id " + empl.getId_usuario());
                }
            }

        } catch (Exception e) {
            e.fillInStackTrace();
        }

        return listCliente;
    }

}

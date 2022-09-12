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
        
        
       StoredProcedureQuery storedProcedure =
           emf.createStoredProcedureQuery("cliente_all");
       // execute SP
       storedProcedure.execute();
       // get result
       List<ClienteDto> result = (List<ClienteDto>) storedProcedure.getResultList();
       System.out.println("result is: " + result);
        
       return result;
    }

}

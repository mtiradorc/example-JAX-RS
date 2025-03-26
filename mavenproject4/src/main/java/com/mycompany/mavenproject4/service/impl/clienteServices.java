/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject4.service.impl;

import com.mycompany.mavenproject4.dao.IClienteDao;
import com.mycompany.mavenproject4.dto.ClienteDto;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import com.mycompany.mavenproject4.service.IClienteServices;


/**
 *
 * @author MTIRADORC
 */

@Stateless
public class clienteServices implements IClienteServices{
    
    @EJB
    private IClienteDao clienteDao;
    
    @Override
    public List<ClienteDto> getCliente() {
        return clienteDao.getCliente();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyect.client.services.impl;

import com.mycompany.proyect.client.connector.IClienteConnector;
import com.mycompany.proyect.client.dto.ClienteDto;
import com.mycompany.proyect.client.services.IClienteServices;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author MTIRADORC
 */
@Stateless
public class clientesServices implements IClienteServices{
    
    @EJB
    public IClienteConnector clienteConnector;

    @Override
    public List<ClienteDto> getListCliente() {
        return clienteConnector.getListCliente();
    }
    
    
}

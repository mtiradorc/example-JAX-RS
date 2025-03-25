/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject4.controller;

import com.mycompany.mavenproject4.dto.ClienteDto;
import com.mycompany.mavenproject4.service.IClienteServices;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author MTIRADORC
 */
@Path("/api")
@Stateless
public class Controller {
    
    
    @EJB
    private IClienteServices clienteServices;
    
	@GET
        @Path("/cliente")
        @Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<ClienteDto> allClient() {
            
            return clienteServices.getCliente();
            
	}

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject4.controller;

import com.mycompany.mavenproject4.dto.ClienteDto;
import com.mycompany.mavenproject4.service.IClienteServices;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
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
    public Map<String, Object> allClient() {
        Map<String, Object> param = new HashMap<String, Object>();
        List<ClienteDto> LaClienteDtos = clienteServices.getCliente();
        param.put("cliente", LaClienteDtos);
        return param;

    }

    @GET
    @Path("/cliente/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Map<String, Object> clienteById(@PathParam("id") Long id) {
        Map<String, Object> param = new HashMap<String, Object>();
        ClienteDto clietDto = clienteServices.getClienteById(id);
        param.put("cliente", clietDto);
        return param;
    }
}

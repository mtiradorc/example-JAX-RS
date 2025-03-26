/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyect.client;

import com.mycompany.proyect.client.dto.ClienteDto;
import com.mycompany.proyect.client.services.IClienteServices;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author MTIRADORC
 */
@ManagedBean
@ViewScoped
public class ClienteManagedBean {

    @EJB
    private IClienteServices clienteServices;

    private List<ClienteDto> laCliente;
    private ClienteDto selectedClient;

    @PostConstruct
    public void init() {
        laCliente = clienteServices.getListCliente();
        for (ClienteDto list : laCliente) {
            System.out.println(list);
        }
    }

    public List<ClienteDto> getLaCliente() {
        return laCliente;
    }

    public void setLaCliente(List<ClienteDto> laCliente) {
        this.laCliente = laCliente;
    }

    public ClienteDto getSelectedClient() {
        return selectedClient;
    }

    public void setSelectedClient(ClienteDto selectedClient) {
        this.selectedClient = selectedClient;
    }

    public void deleteProduct() {
        laCliente.remove(selectedClient);
        selectedClient = null;
    }

}

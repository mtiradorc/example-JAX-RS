/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyect.client.connector;

import com.mycompany.proyect.client.dto.ClienteDto;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author MTIRADORC
 */
@Local
public interface IClienteConnector {

    public List<ClienteDto> getListCliente();
}

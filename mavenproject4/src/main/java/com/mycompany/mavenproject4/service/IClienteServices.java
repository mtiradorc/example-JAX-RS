/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject4.service;

import com.mycompany.mavenproject4.dto.ClienteDto;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author MTIRADORC
 */
@Local
public interface IClienteServices {
    
    public List<ClienteDto> getCliente();
    
    public ClienteDto getClienteById(Long id);
    
}

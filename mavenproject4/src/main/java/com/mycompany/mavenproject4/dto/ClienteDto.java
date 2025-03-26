/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject4.dto;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author MTIRADORC
 */

@Entity
@Table(name = ClienteDto.TABLE_NAME)
@NamedQueries({
    @NamedQuery(name = "ClientEntity.findAll", query = "ClientEntity.findAll * from cliente c")
})
public class ClienteDto {
    
    public static final String TABLE_NAME= "CLIENTE";
    
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "create_at")
    private String fechaRegistro;

    @Column(name = "email")
    private String correo;

    @Column(name = "nombre")
    private String nombre;

    @OneToOne
    @JoinColumn(name = "id_usuario")
    private UserDto user;

    public ClienteDto() {
    }

    public ClienteDto(Long id, String apellido, String fechaRegistro, String correo, String nombre, UserDto user) {
        this.id = id;
        this.apellido = apellido;
        this.fechaRegistro = fechaRegistro;
        this.correo = correo;
        this.nombre = nombre;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public UserDto getId_usuario() {
        return user;
    }

    public void setId_usuario(UserDto user) {
        this.user = user;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ClienteDto other = (ClienteDto) obj;
        return Objects.equals(this.id, other.id);
    }
    
    

    
}

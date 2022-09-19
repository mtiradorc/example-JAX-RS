/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject4.dto;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author MTIRADORC
 */
@Entity
@Table(name = ClienteDto.TABLE_NAME)
public class ClienteDto {

    public static final String TABLE_NAME = "cliente";

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    private UserDto id_usuario;

    public ClienteDto() {
    }

    public ClienteDto(Long id, String apellido, String fechaRegistro, String correo, String nombre, UserDto id_usuario) {
        this.id = id;
        this.apellido = apellido;
        this.fechaRegistro = fechaRegistro;
        this.correo = correo;
        this.nombre = nombre;
        this.id_usuario = id_usuario;
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
        DateFormat outputFormat  = new SimpleDateFormat("yyyy-mm-dd");
        this.fechaRegistro = outputFormat .format(fechaRegistro);
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
        return id_usuario;
    }

    public void setId_usuario(UserDto id_usuario) {
        this.id_usuario = id_usuario;
    }

    @Override
    public String toString() {
        return "ClienteDto{" + "id=" + id + ", apellido=" + apellido + ", fechaRegistro=" + fechaRegistro + ", correo=" + correo + ", nombre=" + nombre + ", id_usuario=" + id_usuario + '}';
    }

}

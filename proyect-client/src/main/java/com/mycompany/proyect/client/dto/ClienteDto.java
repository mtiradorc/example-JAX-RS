/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyect.client.dto;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
/**
 *
 * @author MTIRADORC
 */
public class ClienteDto {


    private Long id;

    private String apellido;

    private String fechaRegistro;

    private String correo;

    private String nombre;

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

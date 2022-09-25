package com.ciclo3.Sprint2.Models;

import java.util.Date;
import java.util.List;

public class Empleado {
    private Long idEmpleado;
    private String nombreEmpleado;
    private String telefonoEmpleado;
    private String emailEmpleado;


    private List<Roles> rolesEmpleado;
    private Empresa empleadoEmpresa;
    private List<Transaction> transactions;
    private Date updatedAtEmpleado;
    private Date createdAtEmpleado;

    public Empleado(Long idEmpleado, String nombreEmpleado, String telefonoEmpleado, String emailEmpleado, Date updatedAtEmpleado, Date createdAtEmpleado) {
        this.idEmpleado = idEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.telefonoEmpleado = telefonoEmpleado;
        this.emailEmpleado = emailEmpleado;
        this.updatedAtEmpleado = updatedAtEmpleado;
        this.createdAtEmpleado = createdAtEmpleado;
    }

    public Empleado() {
    }

    public Long getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getTelefonoEmpleado() {
        return telefonoEmpleado;
    }

    public void setTelefonoEmpleado(String telefonoEmpleado) {
        this.telefonoEmpleado = telefonoEmpleado;
    }

    public String getEmailEmpleado() {
        return emailEmpleado;
    }

    public void setEmailEmpleado(String emailEmpleado) {
        this.emailEmpleado = emailEmpleado;
    }

    public List<Roles> getRolesEmpleado() {
        return rolesEmpleado;
    }

    public void setRolesEmpleado(List<Roles> rolesEmpleado) {
        this.rolesEmpleado = rolesEmpleado;
    }

    public Empresa getEmpleadoEmpresa() {
        return empleadoEmpresa;
    }

    public void setEmpleadoEmpresa(Empresa empleadoEmpresa) {
        this.empleadoEmpresa = empleadoEmpresa;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public Date getUpdatedAtEmpleado() {
        return updatedAtEmpleado;
    }

    public void setUpdatedAtEmpleado(Date updatedAtEmpleado) {
        this.updatedAtEmpleado = updatedAtEmpleado;
    }

    public Date getCreatedAtEmpleado() {
        return createdAtEmpleado;
    }

    public void setCreatedAtEmpleado(Date createdAtEmpleado) {
        this.createdAtEmpleado = createdAtEmpleado;
    }
}



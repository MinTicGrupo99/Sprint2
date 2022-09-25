package com.ciclo3.Sprint2.Models;

import java.util.Date;

public class Empresa {

    private Long idEmpresa;
    private String nombreEmpresa;
    private String nitEmpresa;
    private String telefonoEmpresa;
    private String direccionEmpresa;
    private Empleado empleadoEmpresa;
    private Date createdAtEmpresa;
    private Date updatedAtEmpresa;


    public Empresa(Long idEmpresa, String nombreEmpresa, String nitEmpresa, String telefonoEmpresa, String direccionEmpresa, Empleado empleadoEmpresa, Date createdAtEmpresa, Date updatedAtEmpresa) {
        this.idEmpresa = idEmpresa;
        this.nombreEmpresa = nombreEmpresa;
        this.nitEmpresa = nitEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.empleadoEmpresa = empleadoEmpresa;
        this.createdAtEmpresa = createdAtEmpresa;
        this.updatedAtEmpresa = updatedAtEmpresa;
    }

    public Empresa() {
    }

    public Long getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Long idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getNitEmpresa() {
        return nitEmpresa;
    }

    public void setNitEmpresa(String nitEmpresa) {
        this.nitEmpresa = nitEmpresa;
    }

    public String getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(String telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public String getDireccionEmpresa() {
        return direccionEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }

    public Empleado getEmpleadoEmpresa() {
        return empleadoEmpresa;
    }

    public void setEmpleadoEmpresa(Empleado empleadoEmpresa) {
        this.empleadoEmpresa = empleadoEmpresa;
    }

    public Date getCreatedAtEmpresa() {
        return createdAtEmpresa;
    }

    public void setCreatedAtEmpresa(Date createdAtEmpresa) {
        this.createdAtEmpresa = createdAtEmpresa;
    }

    public Date getUpdatedAtEmpresa() {
        return updatedAtEmpresa;
    }

    public void setUpdatedAtEmpresa(Date updatedAtEmpresa) {
        this.updatedAtEmpresa = updatedAtEmpresa;
    }
}

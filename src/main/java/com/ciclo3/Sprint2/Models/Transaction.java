package com.ciclo3.Sprint2.Models;

import java.util.Date;

public class Transaction {
    //movimientoDinero

    private Long idTransaction;
    private String conceptTransaction;
    private float amountTransaction;
    private Empleado EmployeeTransaction;
    private Empresa enterpriseTransaction;
    private Date createdAtTransaction;
    private Date updatedAtTransaction;


    public Transaction(Long idTransaction, String conceptTransaction, float amountTransaction, Date createdAtTransaction, Date updatedAtTransaction) {
        this.idTransaction = idTransaction;
        this.conceptTransaction = conceptTransaction;
        this.amountTransaction = amountTransaction;
        this.createdAtTransaction = createdAtTransaction;
        this.updatedAtTransaction = updatedAtTransaction;
    }

    public Transaction() {
    }

    public Long getIdTransaction() {
        return idTransaction;
    }

    public void setIdTransaction(Long idTransaction) {
        this.idTransaction = idTransaction;
    }

    public String getConceptTransaction() {
        return conceptTransaction;
    }

    public void setConceptTransaction(String conceptTransaction) {
        this.conceptTransaction = conceptTransaction;
    }

    public float getAmountTransaction() {
        return amountTransaction;
    }

    public void setAmountTransaction(float amountTransaction) {
        this.amountTransaction = amountTransaction;
    }

    public Empleado getEmployeeTransaction() {
        return EmployeeTransaction;
    }

    public void setEmployeeTransaction(Empleado employeeTransaction) {
        EmployeeTransaction = employeeTransaction;
    }

    public Empresa getEnterpriseTransaction() {
        return enterpriseTransaction;
    }

    public void setEnterpriseTransaction(Empresa enterpriseTransaction) {
        this.enterpriseTransaction = enterpriseTransaction;
    }

    public Date getCreatedAtTransaction() {
        return createdAtTransaction;
    }

    public void setCreatedAtTransaction(Date createdAtTransaction) {
        this.createdAtTransaction = createdAtTransaction;
    }

    public Date getUpdatedAtTransaction() {
        return updatedAtTransaction;
    }

    public void setUpdatedAtTransaction(Date updatedAtTransaction) {
        this.updatedAtTransaction = updatedAtTransaction;
    }
}

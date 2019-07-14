package com.dmsistemas.poliza.model;

import java.util.Date;

public class Regpol implements java.io.Serializable {

    private int transaccio;
    private String tipopol;
    private String numpol;
    private Date fechapol;
    private Date fechaopr;
    private String sistema;
    private Integer numusr;
    private Integer operacion;
    private Short status;
    private String tippolintr;
    private String polmodelo;
    private Integer regconcli;
    private String statuscli;

    public Regpol() {
    }

    public Regpol(int transaccio) {
        this.transaccio = transaccio;
    }

    public Regpol(int transaccio, String tipopol, String numpol, Date fechapol, Date fechaopr, String sistema, Integer numusr, Integer operacion, Short status, String tippolintr, String polmodelo, Integer regconcli, String statuscli) {
        this.transaccio = transaccio;
        this.tipopol = tipopol;
        this.numpol = numpol;
        this.fechapol = fechapol;
        this.fechaopr = fechaopr;
        this.sistema = sistema;
        this.numusr = numusr;
        this.operacion = operacion;
        this.status = status;
        this.tippolintr = tippolintr;
        this.polmodelo = polmodelo;
        this.regconcli = regconcli;
        this.statuscli = statuscli;
    }

    public int getTransaccio() {
        return this.transaccio;
    }

    public void setTransaccio(int transaccio) {
        this.transaccio = transaccio;
    }

    public String getTipopol() {
        return this.tipopol;
    }

    public void setTipopol(String tipopol) {
        this.tipopol = tipopol;
    }

    public String getNumpol() {
        return this.numpol;
    }

    public void setNumpol(String numpol) {
        this.numpol = numpol;
    }

    public Date getFechapol() {
        return this.fechapol;
    }

    public void setFechapol(Date fechapol) {
        this.fechapol = fechapol;
    }

    public Date getFechaopr() {
        return this.fechaopr;
    }

    public void setFechaopr(Date fechaopr) {
        this.fechaopr = fechaopr;
    }

    public String getSistema() {
        return this.sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    public Integer getNumusr() {
        return this.numusr;
    }

    public void setNumusr(Integer numusr) {
        this.numusr = numusr;
    }

    public Integer getOperacion() {
        return this.operacion;
    }

    public void setOperacion(Integer operacion) {
        this.operacion = operacion;
    }

    public Short getStatus() {
        return this.status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getTippolintr() {
        return this.tippolintr;
    }

    public void setTippolintr(String tippolintr) {
        this.tippolintr = tippolintr;
    }

    public String getPolmodelo() {
        return this.polmodelo;
    }

    public void setPolmodelo(String polmodelo) {
        this.polmodelo = polmodelo;
    }

    public Integer getRegconcli() {
        return this.regconcli;
    }

    public void setRegconcli(Integer regconcli) {
        this.regconcli = regconcli;
    }

    public String getStatuscli() {
        return this.statuscli;
    }

    public void setStatuscli(String statuscli) {
        this.statuscli = statuscli;
    }

}

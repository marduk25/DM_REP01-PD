package com.dmsistemas.poliza.model;

import java.util.Date;

public class Uuidtimbres implements java.io.Serializable {

    private int numreg;
    private String uuidtimbre;
    private Double monto;
    private String serie;
    private String folio;
    private String rfcemisor;
    private String rfcreceptor;
    private Integer orden;
    private Date fecha;
    private Short tipocomprobante;
    private Double tipocambio;
    private String versioncfdi;
    private String moneda;

    public Uuidtimbres() {
    }

    public Uuidtimbres(int numreg, String uuidtimbre) {
        this.numreg = numreg;
        this.uuidtimbre = uuidtimbre;
    }

    public Uuidtimbres(int numreg, String uuidtimbre, Double monto, String serie, String folio, String rfcemisor, String rfcreceptor, Integer orden, Date fecha, Short tipocomprobante, Double tipocambio, String versioncfdi, String moneda) {
        this.numreg = numreg;
        this.uuidtimbre = uuidtimbre;
        this.monto = monto;
        this.serie = serie;
        this.folio = folio;
        this.rfcemisor = rfcemisor;
        this.rfcreceptor = rfcreceptor;
        this.orden = orden;
        this.fecha = fecha;
        this.tipocomprobante = tipocomprobante;
        this.tipocambio = tipocambio;
        this.versioncfdi = versioncfdi;
        this.moneda = moneda;
    }

    public int getNumreg() {
        return this.numreg;
    }

    public void setNumreg(int numreg) {
        this.numreg = numreg;
    }

    public String getUuidtimbre() {
        return this.uuidtimbre;
    }

    public void setUuidtimbre(String uuidtimbre) {
        this.uuidtimbre = uuidtimbre;
    }

    public Double getMonto() {
        return this.monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public String getSerie() {
        return this.serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getFolio() {
        return this.folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public String getRfcemisor() {
        return this.rfcemisor;
    }

    public void setRfcemisor(String rfcemisor) {
        this.rfcemisor = rfcemisor;
    }

    public String getRfcreceptor() {
        return this.rfcreceptor;
    }

    public void setRfcreceptor(String rfcreceptor) {
        this.rfcreceptor = rfcreceptor;
    }

    public Integer getOrden() {
        return this.orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Short getTipocomprobante() {
        return this.tipocomprobante;
    }

    public void setTipocomprobante(Short tipocomprobante) {
        this.tipocomprobante = tipocomprobante;
    }

    public Double getTipocambio() {
        return this.tipocambio;
    }

    public void setTipocambio(Double tipocambio) {
        this.tipocambio = tipocambio;
    }

    public String getVersioncfdi() {
        return this.versioncfdi;
    }

    public void setVersioncfdi(String versioncfdi) {
        this.versioncfdi = versioncfdi;
    }

    public String getMoneda() {
        return this.moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

}

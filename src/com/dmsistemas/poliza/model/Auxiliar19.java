package com.dmsistemas.poliza.model;

import java.util.Date;

public class Auxiliar19 implements java.io.Serializable {

    private String tipoPoli;
    private String numPoliz;
    private double numPart;
    private short periodo;
    private short ejercicio;
    private String numCta;
    private Date fechaPol;
    private String concepPo;
    private String debeHaber;
    private Double montomov;
    private Short numdepto;
    private Double tipcambio;
    private Short contrapar;
    private Integer orden;
    private Integer ccostos;
    private Integer cgrupos;
    private Integer idinfadipar;
    private Integer iduuid;

    public Auxiliar19() {
    }

    public Auxiliar19(String tipoPoli) {
        this.tipoPoli = tipoPoli;
    }

    public Auxiliar19(String tipoPoli, String numPoliz, double numPart, short periodo, short ejercicio, String numCta, Date fechaPol, String concepPo, String debeHaber, Double montomov, Short numdepto, Double tipcambio, Short contrapar, Integer orden, Integer ccostos, Integer cgrupos, Integer idinfadipar, Integer iduuid) {
        this.tipoPoli = tipoPoli;
        this.numPoliz = numPoliz;
        this.numPart = numPart;
        this.periodo = periodo;
        this.ejercicio = ejercicio;
        this.numCta = numCta;
        this.fechaPol = fechaPol;
        this.concepPo = concepPo;
        this.debeHaber = debeHaber;
        this.montomov = montomov;
        this.numdepto = numdepto;
        this.tipcambio = tipcambio;
        this.contrapar = contrapar;
        this.orden = orden;
        this.ccostos = ccostos;
        this.cgrupos = cgrupos;
        this.idinfadipar = idinfadipar;
        this.iduuid = iduuid;
    }

    public String getTipoPoli() {
        return tipoPoli;
    }

    public void setTipoPoli(String tipoPoli) {
        this.tipoPoli = tipoPoli;
    }

    public String getNumPoliz() {
        return numPoliz;
    }

    public void setNumPoliz(String numPoliz) {
        this.numPoliz = numPoliz;
    }

    public double getNumPart() {
        return numPart;
    }

    public void setNumPart(double numPart) {
        this.numPart = numPart;
    }

    public short getPeriodo() {
        return periodo;
    }

    public void setPeriodo(short periodo) {
        this.periodo = periodo;
    }

    public short getEjercicio() {
        return ejercicio;
    }

    public void setEjercicio(short ejercicio) {
        this.ejercicio = ejercicio;
    }

    public String getNumCta() {
        return numCta;
    }

    public void setNumCta(String numCta) {
        this.numCta = numCta;
    }

    public Date getFechaPol() {
        return fechaPol;
    }

    public void setFechaPol(Date fechaPol) {
        this.fechaPol = fechaPol;
    }

    public String getConcepPo() {
        return concepPo;
    }

    public void setConcepPo(String concepPo) {
        this.concepPo = concepPo;
    }

    public String getDebeHaber() {
        return debeHaber;
    }

    public void setDebeHaber(String debeHaber) {
        this.debeHaber = debeHaber;
    }

    public Double getMontomov() {
        return montomov;
    }

    public void setMontomov(Double montomov) {
        this.montomov = montomov;
    }

    public Short getNumdepto() {
        return numdepto;
    }

    public void setNumdepto(Short numdepto) {
        this.numdepto = numdepto;
    }

    public Double getTipcambio() {
        return tipcambio;
    }

    public void setTipcambio(Double tipcambio) {
        this.tipcambio = tipcambio;
    }

    public Short getContrapar() {
        return contrapar;
    }

    public void setContrapar(Short contrapar) {
        this.contrapar = contrapar;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }

    public Integer getCcostos() {
        return ccostos;
    }

    public void setCcostos(Integer ccostos) {
        this.ccostos = ccostos;
    }

    public Integer getCgrupos() {
        return cgrupos;
    }

    public void setCgrupos(Integer cgrupos) {
        this.cgrupos = cgrupos;
    }

    public Integer getIdinfadipar() {
        return idinfadipar;
    }

    public void setIdinfadipar(Integer idinfadipar) {
        this.idinfadipar = idinfadipar;
    }

    public Integer getIduuid() {
        return iduuid;
    }

    public void setIduuid(Integer iduuid) {
        this.iduuid = iduuid;
    }

}

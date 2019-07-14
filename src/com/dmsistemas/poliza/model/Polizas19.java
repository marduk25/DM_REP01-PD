package com.dmsistemas.poliza.model;

import java.util.Date;

public class Polizas19 implements java.io.Serializable {

    private String tipoPoli;
    private String numPoliz;
    private short periodo;
    private int ejercicio;
    private Date fechaPol;
    private String concepPo;
    private Integer numPart;
    private String logaudita;
    private String contabiliz;
    private Short numparcua;
    private Short tienedocumentos;
    private Integer proccontab;
    private String origen;
    private String uuid;
    private Integer espolizaprivada;
    private String uuidop;

    public Polizas19() {
    }

    public Polizas19(String tipoPoli) {
        this.tipoPoli = tipoPoli;
    }

    public Polizas19(String tipoPoli, String numPoliz, short periodo, int ejercicio, Date fechaPol, String concepPo, Integer numPart, String logaudita, String contabiliz, Short numparcua, Short tienedocumentos, Integer proccontab, String origen, String uuid, Integer espolizaprivada, String uuidop) {
        this.tipoPoli = tipoPoli;
        this.numPoliz = numPoliz;
        this.periodo = periodo;
        this.ejercicio = ejercicio;
        this.fechaPol = fechaPol;
        this.concepPo = concepPo;
        this.numPart = numPart;
        this.logaudita = logaudita;
        this.contabiliz = contabiliz;
        this.numparcua = numparcua;
        this.tienedocumentos = tienedocumentos;
        this.proccontab = proccontab;
        this.origen = origen;
        this.uuid = uuid;
        this.espolizaprivada = espolizaprivada;
        this.uuidop = uuidop;
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

    public short getPeriodo() {
        return periodo;
    }

    public void setPeriodo(short periodo) {
        this.periodo = periodo;
    }

    public int getEjercicio() {
        return ejercicio;
    }

    public void setEjercicio(int ejercicio) {
        this.ejercicio = ejercicio;
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

    public Integer getNumPart() {
        return numPart;
    }

    public void setNumPart(Integer numPart) {
        this.numPart = numPart;
    }

    public String getLogaudita() {
        return logaudita;
    }

    public void setLogaudita(String logaudita) {
        this.logaudita = logaudita;
    }

    public String getContabiliz() {
        return contabiliz;
    }

    public void setContabiliz(String contabiliz) {
        this.contabiliz = contabiliz;
    }

    public Short getNumparcua() {
        return numparcua;
    }

    public void setNumparcua(Short numparcua) {
        this.numparcua = numparcua;
    }

    public Short getTienedocumentos() {
        return tienedocumentos;
    }

    public void setTienedocumentos(Short tienedocumentos) {
        this.tienedocumentos = tienedocumentos;
    }

    public Integer getProccontab() {
        return proccontab;
    }

    public void setProccontab(Integer proccontab) {
        this.proccontab = proccontab;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Integer getEspolizaprivada() {
        return espolizaprivada;
    }

    public void setEspolizaprivada(Integer espolizaprivada) {
        this.espolizaprivada = espolizaprivada;
    }

    public String getUuidop() {
        return uuidop;
    }

    public void setUuidop(String uuidop) {
        this.uuidop = uuidop;
    }

}

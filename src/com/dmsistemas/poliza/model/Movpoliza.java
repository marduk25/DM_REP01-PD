package com.dmsistemas.poliza.model;

import java.util.Date;

public class Movpoliza implements java.io.Serializable {

    private int numReg;
    private Integer numCheque;
    private Date fecha;
    private Integer procesado;

    public Movpoliza() {
    }

    public Movpoliza(int numReg, Date fecha) {
        this.numReg = numReg;
        this.fecha = fecha;
    }

    public Movpoliza(int numReg, Integer numCheque, Date fecha, Integer procesado) {
        this.numReg = numReg;
        this.numCheque = numCheque;
        this.fecha = fecha;
        this.procesado = procesado;
    }

    public int getNumReg() {
        return this.numReg;
    }

    public void setNumReg(int numReg) {
        this.numReg = numReg;
    }

    public Integer getNumCheque() {
        return this.numCheque;
    }

    public void setNumCheque(Integer numCheque) {
        this.numCheque = numCheque;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getProcesado() {
        return this.procesado;
    }

    public void setProcesado(Integer procesado) {
        this.procesado = procesado;
    }

}

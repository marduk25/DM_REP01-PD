package com.dmsistemas.poliza.model;

import java.util.Date;

public class Infadipar implements java.io.Serializable {

    private int numreg;
    private String frmpago;
    private String numcheque;
    private int banco;
    private String ctaorig;
    private Date fecha;
    private Double monto;
    private String benef;
    private String rfc;
    private int bancodest;
    private String ctadest;
    private String bancoorigext;
    private String bancodestext;
    private String idfiscal;

    public Infadipar() {
    }

    public Infadipar(int numreg, int banco, Date fecha, int bancodest) {
        this.numreg = numreg;
        this.banco = banco;
        this.fecha = fecha;
        this.bancodest = bancodest;
    }

    public Infadipar(int numreg, String frmpago, String numcheque, int banco, String ctaorig, Date fecha, Double monto, String benef, String rfc, int bancodest, String ctadest, String bancoorigext, String bancodestext, String idfiscal) {
        this.numreg = numreg;
        this.frmpago = frmpago;
        this.numcheque = numcheque;
        this.banco = banco;
        this.ctaorig = ctaorig;
        this.fecha = fecha;
        this.monto = monto;
        this.benef = benef;
        this.rfc = rfc;
        this.bancodest = bancodest;
        this.ctadest = ctadest;
        this.bancoorigext = bancoorigext;
        this.bancodestext = bancodestext;
        this.idfiscal = idfiscal;
    }

    public int getNumreg() {
        return this.numreg;
    }

    public void setNumreg(int numreg) {
        this.numreg = numreg;
    }

    public String getFrmpago() {
        return this.frmpago;
    }

    public void setFrmpago(String frmpago) {
        this.frmpago = frmpago;
    }

    public String getNumcheque() {
        return this.numcheque;
    }

    public void setNumcheque(String numcheque) {
        this.numcheque = numcheque;
    }

    public int getBanco() {
        return this.banco;
    }

    public void setBanco(int banco) {
        this.banco = banco;
    }

    public String getCtaorig() {
        return this.ctaorig;
    }

    public void setCtaorig(String ctaorig) {
        this.ctaorig = ctaorig;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Double getMonto() {
        return this.monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public String getBenef() {
        return this.benef;
    }

    public void setBenef(String benef) {
        this.benef = benef;
    }

    public String getRfc() {
        return this.rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public int getBancodest() {
        return this.bancodest;
    }

    public void setBancodest(int bancodest) {
        this.bancodest = bancodest;
    }

    public String getCtadest() {
        return this.ctadest;
    }

    public void setCtadest(String ctadest) {
        this.ctadest = ctadest;
    }

    public String getBancoorigext() {
        return this.bancoorigext;
    }

    public void setBancoorigext(String bancoorigext) {
        this.bancoorigext = bancoorigext;
    }

    public String getBancodestext() {
        return this.bancodestext;
    }

    public void setBancodestext(String bancodestext) {
        this.bancodestext = bancodestext;
    }

    public String getIdfiscal() {
        return this.idfiscal;
    }

    public void setIdfiscal(String idfiscal) {
        this.idfiscal = idfiscal;
    }

}

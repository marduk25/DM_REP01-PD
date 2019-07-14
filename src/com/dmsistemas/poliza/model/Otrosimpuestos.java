package com.dmsistemas.poliza.model;

public class Otrosimpuestos implements java.io.Serializable {

    private int idopter;
    private int numreg;
    private String nombre;
    private Double tasa;
    private Double monto;
    private short tipo;
    private Double base;
    private short tipoimpuesto;
    private Short aplicadiot;
    private String tipofactor;
    private String aux;

    public Otrosimpuestos() {
    }

    public Otrosimpuestos(int idopter, int numreg, String nombre, short tipo, short tipoimpuesto, String tipofactor) {
        this.idopter = idopter;
        this.numreg = numreg;
        this.nombre = nombre;
        this.tipo = tipo;
        this.tipoimpuesto = tipoimpuesto;
        this.tipofactor = tipofactor;
    }

    public Otrosimpuestos(int idopter, int numreg, String nombre, Double tasa, Double monto, short tipo, Double base, short tipoimpuesto, Short aplicadiot, String tipofactor, String aux) {
        this.idopter = idopter;
        this.numreg = numreg;
        this.nombre = nombre;
        this.tasa = tasa;
        this.monto = monto;
        this.tipo = tipo;
        this.base = base;
        this.tipoimpuesto = tipoimpuesto;
        this.aplicadiot = aplicadiot;
        this.tipofactor = tipofactor;
        this.aux = aux;
    }

    public int getIdopter() {
        return this.idopter;
    }

    public void setIdopter(int idopter) {
        this.idopter = idopter;
    }

    public int getNumreg() {
        return this.numreg;
    }

    public void setNumreg(int numreg) {
        this.numreg = numreg;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getTasa() {
        return this.tasa;
    }

    public void setTasa(Double tasa) {
        this.tasa = tasa;
    }

    public Double getMonto() {
        return this.monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public short getTipo() {
        return this.tipo;
    }

    public void setTipo(short tipo) {
        this.tipo = tipo;
    }

    public Double getBase() {
        return this.base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public short getTipoimpuesto() {
        return this.tipoimpuesto;
    }

    public void setTipoimpuesto(short tipoimpuesto) {
        this.tipoimpuesto = tipoimpuesto;
    }

    public Short getAplicadiot() {
        return this.aplicadiot;
    }

    public void setAplicadiot(Short aplicadiot) {
        this.aplicadiot = aplicadiot;
    }

    public String getTipofactor() {
        return this.tipofactor;
    }

    public void setTipofactor(String tipofactor) {
        this.tipofactor = tipofactor;
    }

    public String getAux() {
        return this.aux;
    }

    public void setAux(String aux) {
        this.aux = aux;
    }

}

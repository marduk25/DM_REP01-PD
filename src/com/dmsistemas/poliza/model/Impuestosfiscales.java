package com.dmsistemas.poliza.model;

public class Impuestosfiscales implements java.io.Serializable {

    private int numimpuesto;
    private String uuidtimbrecfdi;
    private String impuesto;
    private Integer tipoimpuesto;
    private Integer eslocal;
    private Double base;
    private String tipofactor;
    private Double tasacuota;
    private Double importe;

    public Impuestosfiscales() {
    }

    public Impuestosfiscales(int numimpuesto, String uuidtimbrecfdi) {
        this.numimpuesto = numimpuesto;
        this.uuidtimbrecfdi = uuidtimbrecfdi;
    }

    public Impuestosfiscales(int numimpuesto, String uuidtimbrecfdi, String impuesto, Integer tipoimpuesto, Integer eslocal, Double base, String tipofactor, Double tasacuota, Double importe) {
        this.numimpuesto = numimpuesto;
        this.uuidtimbrecfdi = uuidtimbrecfdi;
        this.impuesto = impuesto;
        this.tipoimpuesto = tipoimpuesto;
        this.eslocal = eslocal;
        this.base = base;
        this.tipofactor = tipofactor;
        this.tasacuota = tasacuota;
        this.importe = importe;
    }

    public int getNumimpuesto() {
        return this.numimpuesto;
    }

    public void setNumimpuesto(int numimpuesto) {
        this.numimpuesto = numimpuesto;
    }

    public String getUuidtimbrecfdi() {
        return this.uuidtimbrecfdi;
    }

    public void setUuidtimbrecfdi(String uuidtimbrecfdi) {
        this.uuidtimbrecfdi = uuidtimbrecfdi;
    }

    public String getImpuesto() {
        return this.impuesto;
    }

    public void setImpuesto(String impuesto) {
        this.impuesto = impuesto;
    }

    public Integer getTipoimpuesto() {
        return this.tipoimpuesto;
    }

    public void setTipoimpuesto(Integer tipoimpuesto) {
        this.tipoimpuesto = tipoimpuesto;
    }

    public Integer getEslocal() {
        return this.eslocal;
    }

    public void setEslocal(Integer eslocal) {
        this.eslocal = eslocal;
    }

    public Double getBase() {
        return this.base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public String getTipofactor() {
        return this.tipofactor;
    }

    public void setTipofactor(String tipofactor) {
        this.tipofactor = tipofactor;
    }

    public Double getTasacuota() {
        return this.tasacuota;
    }

    public void setTasacuota(Double tasacuota) {
        this.tasacuota = tasacuota;
    }

    public Double getImporte() {
        return this.importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

}

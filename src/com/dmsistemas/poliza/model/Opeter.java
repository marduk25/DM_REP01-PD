package com.dmsistemas.poliza.model;

import java.util.Date;

public class Opeter implements java.io.Serializable {

    private String tipopol;
    private String numpol;
    private Date fechapol;
    private int numpart;
    private String numcta;
    private String rfcprove;
    private Integer tipope;
    private Double monconiva;
    private Double mondedisr;
    private Double actos15;
    private Double ivaop15;
    private Double actos10;
    private Double ivaop10;
    private Double actoscero;
    private Double actosexent;
    private Double ivaretenid;
    private Double ivatraslad;
    private Double ivadevolu;
    private Date percausac;
    private Double ivanoac15;
    private Double ivanoac10;
    private String esimporta;
    private Double otrasret;
    private Integer esdevol;
    private Double isrretenid;
    private Integer ivageneral;
    private Integer ivafronterizo;
    private Integer idconcepivaa;
    private Short desdecfdi;
    private Integer idopter;

    public Opeter() {
    }

    public Opeter(String tipopol, String numpol, Date fechapol, int numpart) {
        this.tipopol = tipopol;
        this.numpol = numpol;
        this.fechapol = fechapol;
        this.numpart = numpart;
    }

    public Opeter(String tipopol, String numpol, Date fechapol, int numpart, String numcta, String rfcprove, Integer tipope, Double monconiva, Double mondedisr, Double actos15, Double ivaop15, Double actos10, Double ivaop10, Double actoscero, Double actosexent, Double ivaretenid, Double ivatraslad, Double ivadevolu, Date percausac, Double ivanoac15, Double ivanoac10, String esimporta, Double otrasret, Integer esdevol, Double isrretenid, Integer ivageneral, Integer ivafronterizo, Integer idconcepivaa, Short desdecfdi, Integer idopter) {
        this.tipopol = tipopol;
        this.numpol = numpol;
        this.fechapol = fechapol;
        this.numpart = numpart;
        this.numcta = numcta;
        this.rfcprove = rfcprove;
        this.tipope = tipope;
        this.monconiva = monconiva;
        this.mondedisr = mondedisr;
        this.actos15 = actos15;
        this.ivaop15 = ivaop15;
        this.actos10 = actos10;
        this.ivaop10 = ivaop10;
        this.actoscero = actoscero;
        this.actosexent = actosexent;
        this.ivaretenid = ivaretenid;
        this.ivatraslad = ivatraslad;
        this.ivadevolu = ivadevolu;
        this.percausac = percausac;
        this.ivanoac15 = ivanoac15;
        this.ivanoac10 = ivanoac10;
        this.esimporta = esimporta;
        this.otrasret = otrasret;
        this.esdevol = esdevol;
        this.isrretenid = isrretenid;
        this.ivageneral = ivageneral;
        this.ivafronterizo = ivafronterizo;
        this.idconcepivaa = idconcepivaa;
        this.desdecfdi = desdecfdi;
        this.idopter = idopter;
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

    public int getNumpart() {
        return this.numpart;
    }

    public void setNumpart(int numpart) {
        this.numpart = numpart;
    }

    public String getNumcta() {
        return this.numcta;
    }

    public void setNumcta(String numcta) {
        this.numcta = numcta;
    }

    public String getRfcprove() {
        return this.rfcprove;
    }

    public void setRfcprove(String rfcprove) {
        this.rfcprove = rfcprove;
    }

    public Integer getTipope() {
        return this.tipope;
    }

    public void setTipope(Integer tipope) {
        this.tipope = tipope;
    }

    public Double getMonconiva() {
        return this.monconiva;
    }

    public void setMonconiva(Double monconiva) {
        this.monconiva = monconiva;
    }

    public Double getMondedisr() {
        return this.mondedisr;
    }

    public void setMondedisr(Double mondedisr) {
        this.mondedisr = mondedisr;
    }

    public Double getActos15() {
        return this.actos15;
    }

    public void setActos15(Double actos15) {
        this.actos15 = actos15;
    }

    public Double getIvaop15() {
        return this.ivaop15;
    }

    public void setIvaop15(Double ivaop15) {
        this.ivaop15 = ivaop15;
    }

    public Double getActos10() {
        return this.actos10;
    }

    public void setActos10(Double actos10) {
        this.actos10 = actos10;
    }

    public Double getIvaop10() {
        return this.ivaop10;
    }

    public void setIvaop10(Double ivaop10) {
        this.ivaop10 = ivaop10;
    }

    public Double getActoscero() {
        return this.actoscero;
    }

    public void setActoscero(Double actoscero) {
        this.actoscero = actoscero;
    }

    public Double getActosexent() {
        return this.actosexent;
    }

    public void setActosexent(Double actosexent) {
        this.actosexent = actosexent;
    }

    public Double getIvaretenid() {
        return this.ivaretenid;
    }

    public void setIvaretenid(Double ivaretenid) {
        this.ivaretenid = ivaretenid;
    }

    public Double getIvatraslad() {
        return this.ivatraslad;
    }

    public void setIvatraslad(Double ivatraslad) {
        this.ivatraslad = ivatraslad;
    }

    public Double getIvadevolu() {
        return this.ivadevolu;
    }

    public void setIvadevolu(Double ivadevolu) {
        this.ivadevolu = ivadevolu;
    }

    public Date getPercausac() {
        return this.percausac;
    }

    public void setPercausac(Date percausac) {
        this.percausac = percausac;
    }

    public Double getIvanoac15() {
        return this.ivanoac15;
    }

    public void setIvanoac15(Double ivanoac15) {
        this.ivanoac15 = ivanoac15;
    }

    public Double getIvanoac10() {
        return this.ivanoac10;
    }

    public void setIvanoac10(Double ivanoac10) {
        this.ivanoac10 = ivanoac10;
    }

    public String getEsimporta() {
        return this.esimporta;
    }

    public void setEsimporta(String esimporta) {
        this.esimporta = esimporta;
    }

    public Double getOtrasret() {
        return this.otrasret;
    }

    public void setOtrasret(Double otrasret) {
        this.otrasret = otrasret;
    }

    public Integer getEsdevol() {
        return this.esdevol;
    }

    public void setEsdevol(Integer esdevol) {
        this.esdevol = esdevol;
    }

    public Double getIsrretenid() {
        return this.isrretenid;
    }

    public void setIsrretenid(Double isrretenid) {
        this.isrretenid = isrretenid;
    }

    public Integer getIvageneral() {
        return this.ivageneral;
    }

    public void setIvageneral(Integer ivageneral) {
        this.ivageneral = ivageneral;
    }

    public Integer getIvafronterizo() {
        return this.ivafronterizo;
    }

    public void setIvafronterizo(Integer ivafronterizo) {
        this.ivafronterizo = ivafronterizo;
    }

    public Integer getIdconcepivaa() {
        return this.idconcepivaa;
    }

    public void setIdconcepivaa(Integer idconcepivaa) {
        this.idconcepivaa = idconcepivaa;
    }

    public Short getDesdecfdi() {
        return this.desdecfdi;
    }

    public void setDesdecfdi(Short desdecfdi) {
        this.desdecfdi = desdecfdi;
    }

    public Integer getIdopter() {
        return this.idopter;
    }

    public void setIdopter(Integer idopter) {
        this.idopter = idopter;
    }

}

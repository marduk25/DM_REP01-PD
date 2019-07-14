package com.dmsistemas.poliza.model;

public class Parmovs04 implements java.io.Serializable {

    private int numRegp;
    private Integer numMov;
    private String cveConcep;
    private String referencia;
    private Double montoIva;
    private String fact;
    private double montoDoc;
    private Double montoExt;
    private int orden;
    private String XObser;
    private Integer numcargo;
    private Integer numcptopadre;
    private Double tipocambiosae;
    private Double tipocambiobanco;
    private String docto;
    private Integer noPartidasae;
    private Integer monedadoc;
    private String partClpv;
    private String partClpvRfc;
    private String partAnombrede;
    private Double ivaMc;
    private String partCtaContabAsoc;
    private Integer partConcepsae;
    private Integer partAnticipo;
    private String partCtaBancoAsoc;
    private String partCveBancoAsoc;

    public Parmovs04() {
    }

    public Parmovs04(int numRegp, double montoDoc, int orden) {
        this.numRegp = numRegp;
        this.montoDoc = montoDoc;
        this.orden = orden;
    }

    public Parmovs04(int numRegp, Integer numMov, String cveConcep, String referencia, Double montoIva, String fact, double montoDoc, Double montoExt, int orden, String XObser, Integer numcargo, Integer numcptopadre, Double tipocambiosae, Double tipocambiobanco, String docto, Integer noPartidasae, Integer monedadoc, String partClpv, String partClpvRfc, String partAnombrede, Double ivaMc, String partCtaContabAsoc, Integer partConcepsae, Integer partAnticipo, String partCtaBancoAsoc, String partCveBancoAsoc) {
        this.numRegp = numRegp;
        this.numMov = numMov;
        this.cveConcep = cveConcep;
        this.referencia = referencia;
        this.montoIva = montoIva;
        this.fact = fact;
        this.montoDoc = montoDoc;
        this.montoExt = montoExt;
        this.orden = orden;
        this.XObser = XObser;
        this.numcargo = numcargo;
        this.numcptopadre = numcptopadre;
        this.tipocambiosae = tipocambiosae;
        this.tipocambiobanco = tipocambiobanco;
        this.docto = docto;
        this.noPartidasae = noPartidasae;
        this.monedadoc = monedadoc;
        this.partClpv = partClpv;
        this.partClpvRfc = partClpvRfc;
        this.partAnombrede = partAnombrede;
        this.ivaMc = ivaMc;
        this.partCtaContabAsoc = partCtaContabAsoc;
        this.partConcepsae = partConcepsae;
        this.partAnticipo = partAnticipo;
        this.partCtaBancoAsoc = partCtaBancoAsoc;
        this.partCveBancoAsoc = partCveBancoAsoc;
    }

    public int getNumRegp() {
        return numRegp;
    }

    public void setNumRegp(int numRegp) {
        this.numRegp = numRegp;
    }

    public int getNumMov() {
        return numMov;
    }

    public void setNumMov(Integer numMov) {
        this.numMov = numMov;
    }

    public String getCveConcep() {
        return cveConcep;
    }

    public void setCveConcep(String cveConcep) {
        this.cveConcep = cveConcep;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public Double getMontoIva() {
        return montoIva;
    }

    public void setMontoIva(Double montoIva) {
        this.montoIva = montoIva;
    }

    public String getFact() {
        return fact;
    }

    public void setFact(String fact) {
        this.fact = fact;
    }

    public double getMontoDoc() {
        return montoDoc;
    }

    public void setMontoDoc(double montoDoc) {
        this.montoDoc = montoDoc;
    }

    public Double getMontoExt() {
        return montoExt;
    }

    public void setMontoExt(Double montoExt) {
        this.montoExt = montoExt;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    public String getXObser() {
        return XObser;
    }

    public void setXObser(String XObser) {
        this.XObser = XObser;
    }

    public Integer getNumcargo() {
        return numcargo;
    }

    public void setNumcargo(Integer numcargo) {
        this.numcargo = numcargo;
    }

    public Integer getNumcptopadre() {
        return numcptopadre;
    }

    public void setNumcptopadre(Integer numcptopadre) {
        this.numcptopadre = numcptopadre;
    }

    public Double getTipocambiosae() {
        return tipocambiosae;
    }

    public void setTipocambiosae(Double tipocambiosae) {
        this.tipocambiosae = tipocambiosae;
    }

    public Double getTipocambiobanco() {
        return tipocambiobanco;
    }

    public void setTipocambiobanco(Double tipocambiobanco) {
        this.tipocambiobanco = tipocambiobanco;
    }

    public String getDocto() {
        return docto;
    }

    public void setDocto(String docto) {
        this.docto = docto;
    }

    public Integer getNoPartidasae() {
        return noPartidasae;
    }

    public void setNoPartidasae(Integer noPartidasae) {
        this.noPartidasae = noPartidasae;
    }

    public Integer getMonedadoc() {
        return monedadoc;
    }

    public void setMonedadoc(Integer monedadoc) {
        this.monedadoc = monedadoc;
    }

    public String getPartClpv() {
        return partClpv;
    }

    public void setPartClpv(String partClpv) {
        this.partClpv = partClpv;
    }

    public String getPartClpvRfc() {
        return partClpvRfc;
    }

    public void setPartClpvRfc(String partClpvRfc) {
        this.partClpvRfc = partClpvRfc;
    }

    public String getPartAnombrede() {
        return partAnombrede;
    }

    public void setPartAnombrede(String partAnombrede) {
        this.partAnombrede = partAnombrede;
    }

    public Double getIvaMc() {
        return ivaMc;
    }

    public void setIvaMc(Double ivaMc) {
        this.ivaMc = ivaMc;
    }

    public String getPartCtaContabAsoc() {
        return partCtaContabAsoc;
    }

    public void setPartCtaContabAsoc(String partCtaContabAsoc) {
        this.partCtaContabAsoc = partCtaContabAsoc;
    }

    public Integer getPartConcepsae() {
        return partConcepsae;
    }

    public void setPartConcepsae(Integer partConcepsae) {
        this.partConcepsae = partConcepsae;
    }

    public Integer getPartAnticipo() {
        return partAnticipo;
    }

    public void setPartAnticipo(Integer partAnticipo) {
        this.partAnticipo = partAnticipo;
    }

    public String getPartCtaBancoAsoc() {
        return partCtaBancoAsoc;
    }

    public void setPartCtaBancoAsoc(String partCtaBancoAsoc) {
        this.partCtaBancoAsoc = partCtaBancoAsoc;
    }

    public String getPartCveBancoAsoc() {
        return partCveBancoAsoc;
    }

    public void setPartCveBancoAsoc(String partCveBancoAsoc) {
        this.partCveBancoAsoc = partCveBancoAsoc;
    }

}

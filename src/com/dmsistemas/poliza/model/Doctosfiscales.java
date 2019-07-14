package com.dmsistemas.poliza.model;

import java.util.Date;

public class Doctosfiscales implements java.io.Serializable {

    private String uuidtimbrecfdi;
    private String rutaarchivo;
    private double total;
    private double subtotal;
    private String rfcemisor;
    private String rfcreceptor;
    private Date fechaemision;
    private String serie;
    private String folio;
    private String versioncfdi;
    private String lugarexpedicion;
    private String moneda;
    private String numctapago;
    private Double tipocambio;
    private Double descuento;
    private String formapago;
    private String metodopago;
    private Double totalimpuestostrasladados;
    private Double totalimpuestosretenidos;
    private String nombreemisor;
    private String nombrereceptor;
    private String regimenfiscal;
    private String usocfdi;
    private String sellocfdi;
    private String nocertificado;
    private String nocertificadotimbre;
    private String condicionesdepago;
    private String sello;
    private String tipodecomprobante;
    private String xml;

    public Doctosfiscales() {
    }

    public Doctosfiscales(String uuidtimbrecfdi, double total, double subtotal, String rfcemisor, String rfcreceptor, Date fechaemision, String versioncfdi, String lugarexpedicion, String moneda, String regimenfiscal, String sellocfdi, String nocertificado, String nocertificadotimbre, String sello, String tipodecomprobante) {
        this.uuidtimbrecfdi = uuidtimbrecfdi;
        this.total = total;
        this.subtotal = subtotal;
        this.rfcemisor = rfcemisor;
        this.rfcreceptor = rfcreceptor;
        this.fechaemision = fechaemision;
        this.versioncfdi = versioncfdi;
        this.lugarexpedicion = lugarexpedicion;
        this.moneda = moneda;
        this.regimenfiscal = regimenfiscal;
        this.sellocfdi = sellocfdi;
        this.nocertificado = nocertificado;
        this.nocertificadotimbre = nocertificadotimbre;
        this.sello = sello;
        this.tipodecomprobante = tipodecomprobante;
    }

    public Doctosfiscales(String uuidtimbrecfdi, String rutaarchivo, double total, double subtotal, String rfcemisor, String rfcreceptor, Date fechaemision, String serie, String folio, String versioncfdi, String lugarexpedicion, String moneda, String numctapago, Double tipocambio, Double descuento, String formapago, String metodopago, Double totalimpuestostrasladados, Double totalimpuestosretenidos, String nombreemisor, String nombrereceptor, String regimenfiscal, String usocfdi, String sellocfdi, String nocertificado, String nocertificadotimbre, String condicionesdepago, String sello, String tipodecomprobante, String xml) {
        this.uuidtimbrecfdi = uuidtimbrecfdi;
        this.rutaarchivo = rutaarchivo;
        this.total = total;
        this.subtotal = subtotal;
        this.rfcemisor = rfcemisor;
        this.rfcreceptor = rfcreceptor;
        this.fechaemision = fechaemision;
        this.serie = serie;
        this.folio = folio;
        this.versioncfdi = versioncfdi;
        this.lugarexpedicion = lugarexpedicion;
        this.moneda = moneda;
        this.numctapago = numctapago;
        this.tipocambio = tipocambio;
        this.descuento = descuento;
        this.formapago = formapago;
        this.metodopago = metodopago;
        this.totalimpuestostrasladados = totalimpuestostrasladados;
        this.totalimpuestosretenidos = totalimpuestosretenidos;
        this.nombreemisor = nombreemisor;
        this.nombrereceptor = nombrereceptor;
        this.regimenfiscal = regimenfiscal;
        this.usocfdi = usocfdi;
        this.sellocfdi = sellocfdi;
        this.nocertificado = nocertificado;
        this.nocertificadotimbre = nocertificadotimbre;
        this.condicionesdepago = condicionesdepago;
        this.sello = sello;
        this.tipodecomprobante = tipodecomprobante;
        this.xml = xml;
    }

    public String getUuidtimbrecfdi() {
        return this.uuidtimbrecfdi;
    }

    public void setUuidtimbrecfdi(String uuidtimbrecfdi) {
        this.uuidtimbrecfdi = uuidtimbrecfdi;
    }

    public String getRutaarchivo() {
        return this.rutaarchivo;
    }

    public void setRutaarchivo(String rutaarchivo) {
        this.rutaarchivo = rutaarchivo;
    }

    public double getTotal() {
        return this.total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getSubtotal() {
        return this.subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
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

    public Date getFechaemision() {
        return this.fechaemision;
    }

    public void setFechaemision(Date fechaemision) {
        this.fechaemision = fechaemision;
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

    public String getVersioncfdi() {
        return this.versioncfdi;
    }

    public void setVersioncfdi(String versioncfdi) {
        this.versioncfdi = versioncfdi;
    }

    public String getLugarexpedicion() {
        return this.lugarexpedicion;
    }

    public void setLugarexpedicion(String lugarexpedicion) {
        this.lugarexpedicion = lugarexpedicion;
    }

    public String getMoneda() {
        return this.moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getNumctapago() {
        return this.numctapago;
    }

    public void setNumctapago(String numctapago) {
        this.numctapago = numctapago;
    }

    public Double getTipocambio() {
        return this.tipocambio;
    }

    public void setTipocambio(Double tipocambio) {
        this.tipocambio = tipocambio;
    }

    public Double getDescuento() {
        return this.descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

    public String getFormapago() {
        return this.formapago;
    }

    public void setFormapago(String formapago) {
        this.formapago = formapago;
    }

    public String getMetodopago() {
        return this.metodopago;
    }

    public void setMetodopago(String metodopago) {
        this.metodopago = metodopago;
    }

    public Double getTotalimpuestostrasladados() {
        return this.totalimpuestostrasladados;
    }

    public void setTotalimpuestostrasladados(Double totalimpuestostrasladados) {
        this.totalimpuestostrasladados = totalimpuestostrasladados;
    }

    public Double getTotalimpuestosretenidos() {
        return this.totalimpuestosretenidos;
    }

    public void setTotalimpuestosretenidos(Double totalimpuestosretenidos) {
        this.totalimpuestosretenidos = totalimpuestosretenidos;
    }

    public String getNombreemisor() {
        return this.nombreemisor;
    }

    public void setNombreemisor(String nombreemisor) {
        this.nombreemisor = nombreemisor;
    }

    public String getNombrereceptor() {
        return this.nombrereceptor;
    }

    public void setNombrereceptor(String nombrereceptor) {
        this.nombrereceptor = nombrereceptor;
    }

    public String getRegimenfiscal() {
        return this.regimenfiscal;
    }

    public void setRegimenfiscal(String regimenfiscal) {
        this.regimenfiscal = regimenfiscal;
    }

    public String getUsocfdi() {
        return this.usocfdi;
    }

    public void setUsocfdi(String usocfdi) {
        this.usocfdi = usocfdi;
    }

    public String getSellocfdi() {
        return this.sellocfdi;
    }

    public void setSellocfdi(String sellocfdi) {
        this.sellocfdi = sellocfdi;
    }

    public String getNocertificado() {
        return this.nocertificado;
    }

    public void setNocertificado(String nocertificado) {
        this.nocertificado = nocertificado;
    }

    public String getNocertificadotimbre() {
        return this.nocertificadotimbre;
    }

    public void setNocertificadotimbre(String nocertificadotimbre) {
        this.nocertificadotimbre = nocertificadotimbre;
    }

    public String getCondicionesdepago() {
        return this.condicionesdepago;
    }

    public void setCondicionesdepago(String condicionesdepago) {
        this.condicionesdepago = condicionesdepago;
    }

    public String getSello() {
        return this.sello;
    }

    public void setSello(String sello) {
        this.sello = sello;
    }

    public String getTipodecomprobante() {
        return this.tipodecomprobante;
    }

    public void setTipodecomprobante(String tipodecomprobante) {
        this.tipodecomprobante = tipodecomprobante;
    }

    public String getXml() {
        return this.xml;
    }

    public void setXml(String xml) {
        this.xml = xml;
    }

}

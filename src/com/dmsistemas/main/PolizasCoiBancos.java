package com.dmsistemas.main;

import com.dmsistemas.poliza.dao.AuxiliarDao;
import com.dmsistemas.poliza.dao.AuxiliarDaoImp;
import com.dmsistemas.poliza.dao.ControlDao;
import com.dmsistemas.poliza.dao.ControlDaoImp;
import com.dmsistemas.poliza.dao.CuentasDao;
import com.dmsistemas.poliza.dao.CuentasDaoImp;
import com.dmsistemas.poliza.dao.DoctofiscalesDao;
import com.dmsistemas.poliza.dao.DoctosfiscalesDaoImp;
import com.dmsistemas.poliza.dao.FacturaDao;
import com.dmsistemas.poliza.dao.FacturaDaoImpl;
import com.dmsistemas.poliza.dao.FoliosDao;
import com.dmsistemas.poliza.dao.FoliosDaoImp;
import com.dmsistemas.poliza.dao.ImpuestosfiscalesDao;
import com.dmsistemas.poliza.dao.ImpuestosfiscalesDaoImp;
import com.dmsistemas.poliza.dao.InfadiparDao;
import com.dmsistemas.poliza.dao.InfadiparDaoImp;
import com.dmsistemas.poliza.dao.MovpolizaDao;
import com.dmsistemas.poliza.dao.MovpolizaDaoImp;
import com.dmsistemas.poliza.dao.OpeterDao;
import com.dmsistemas.poliza.dao.OpeterDaoImp;
import com.dmsistemas.poliza.dao.OtrosimpuestosDao;
import com.dmsistemas.poliza.dao.OtrosimpuestosDaoImp;
import com.dmsistemas.poliza.dao.Parmovs04Dao;
import com.dmsistemas.poliza.dao.Parmovs04DaoImp;
import com.dmsistemas.poliza.dao.RegpolDao;
import com.dmsistemas.poliza.dao.RegpolDaoImp;
import com.dmsistemas.poliza.dao.UuidtimbresDao;
import com.dmsistemas.poliza.dao.UuidtimbresDaoImp;
import com.dmsistemas.poliza.model.Auxiliar19;
import com.dmsistemas.poliza.model.Control;
import com.dmsistemas.poliza.model.Doctosfiscales;
import com.dmsistemas.poliza.model.Factura;
import com.dmsistemas.poliza.model.Folios;
import com.dmsistemas.poliza.model.Impuestosfiscales;
import com.dmsistemas.poliza.model.Infadipar;
import com.dmsistemas.poliza.model.Movpoliza;
import com.dmsistemas.poliza.model.Movs04;
import com.dmsistemas.poliza.model.Opeter;
import com.dmsistemas.poliza.model.Otrosimpuestos;
import com.dmsistemas.poliza.model.Parmovs04;
import com.dmsistemas.poliza.model.Regpol;
import com.dmsistemas.poliza.model.Uuidtimbres;
import static java.sql.Types.NULL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PolizasCoiBancos {

    private Control control;
    private List<Control> listacontrol;
    private Doctosfiscales doctosFiscales;
    private List<Doctosfiscales> listadoctosFiscales;
    private Folios folios;
    private List<Folios> listafolios;
    private Impuestosfiscales impuestosFiscales;
    private List<Impuestosfiscales> listaimpuestosFiscales;
    private Infadipar infadipar;
    private List<Infadipar> listainfadipar;
    private Movpoliza movpoliza;
    private List<Movpoliza> listamovpoliza;
    private Movs04 movs04;
    private List<Movs04> listamovs04;
    private Opeter opeter;
    private List<Opeter> listaopeter;
    private Otrosimpuestos otrosImpuestos;
    private List<Otrosimpuestos> listaotrosImpuestos;
    private Parmovs04 parmovs04;
    private List<Parmovs04> listaparmovs04;
    private Regpol regpol;
    private List<Regpol> listaregpol;
    private Uuidtimbres uuidtimbres;
    private List<Uuidtimbres> listauuidtimbres;
    private List<Factura> listaFactura;
    private Auxiliar19 aux19;
    private Double valorTotal = 0.0;
    private int partidaNo = 0;
    private int valorMaxPol = 0;
    private Uuidtimbres uuidTimbres;
    private int valMaxNumReg = 0;
    private int valIdOpter = 0;

    public Control getControl() {
        return control;
    }

    public void setControl(Control control) {
        this.control = control;
    }

    public Doctosfiscales getDoctosFiscales() {
        return doctosFiscales;
    }

    public void setDoctosFiscales(Doctosfiscales doctosFiscales) {
        this.doctosFiscales = doctosFiscales;
    }

    public Folios getFolios() {
        return folios;
    }

    public void setFolios(Folios folios) {
        this.folios = folios;
    }

    public Impuestosfiscales getImpuestosFiscales() {
        return impuestosFiscales;
    }

    public void setImpuestosFiscales(Impuestosfiscales impuestosFiscales) {
        this.impuestosFiscales = impuestosFiscales;
    }

    public Infadipar getInfadipar() {
        return infadipar;
    }

    public void setInfadipar(Infadipar infadipar) {
        this.infadipar = infadipar;
    }

    public Movpoliza getMovpoliza() {
        return movpoliza;
    }

    public void setMovpoliza(Movpoliza movpoliza) {
        this.movpoliza = movpoliza;
    }

    public Movs04 getMovs04() {
        return movs04;
    }

    public void setMovs04(Movs04 movs04) {
        this.movs04 = movs04;
    }

    public Opeter getOpeter() {
        return opeter;
    }

    public void setOpeter(Opeter opeter) {
        this.opeter = opeter;
    }

    public Otrosimpuestos getOtrosImpuestos() {
        return otrosImpuestos;
    }

    public void setOtrosImpuestos(Otrosimpuestos otrosImpuestos) {
        this.otrosImpuestos = otrosImpuestos;
    }

    public Parmovs04 getParmovs04() {
        return parmovs04;
    }

    public void setParmovs04(Parmovs04 parmovs04) {
        this.parmovs04 = parmovs04;
    }

    public Regpol getRegpol() {
        return regpol;
    }

    public void setRegpol(Regpol regpol) {
        this.regpol = regpol;
    }

    public Uuidtimbres getUuidtimbres() {
        return uuidtimbres;
    }

    public void setUuidtimbres(Uuidtimbres uuidtimbres) {
        this.uuidtimbres = uuidtimbres;
    }

    public List<Control> getListacontrol() {
        return listacontrol;
    }

    public List<Doctosfiscales> getListadoctosFiscales() {
        return listadoctosFiscales;
    }

    public List<Folios> getListafolios() {
        return listafolios;
    }

    public List<Impuestosfiscales> getListaimpuestosFiscales() {
        return listaimpuestosFiscales;
    }

    public List<Infadipar> getListainfadipar() {
        return listainfadipar;
    }

    public List<Movpoliza> getListamovpoliza() {
        return listamovpoliza;
    }

    public List<Movs04> getListamovs04() {
        return listamovs04;
    }

    public List<Opeter> getListaopeter() {
        return listaopeter;
    }

    public List<Otrosimpuestos> getListaotrosImpuestos() {
        return listaotrosImpuestos;
    }

    public List<Parmovs04> getListaparmovs04() {
        return listaparmovs04;
    }

    public List<Regpol> getListaregpol() {
        return listaregpol;
    }

    public List<Uuidtimbres> getListauuidtimbres() {
        return listauuidtimbres;
    }

    public List<Factura> getListaFactura() {
        return listaFactura;
    }

    public void setListaFactura(List<Factura> listaFactura) {
        this.listaFactura = listaFactura;
    }

    public Auxiliar19 getAux19() {
        return aux19;
    }

    public void setAux19(Auxiliar19 aux19) {
        this.aux19 = aux19;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getPartidaNo() {
        return partidaNo;
    }

    public void setPartidaNo(int partidaNo) {
        this.partidaNo = partidaNo;
    }

    public int getValorMaxPol() {
        return valorMaxPol;
    }

    public void setValorMaxPol(int valorMaxPol) {
        this.valorMaxPol = valorMaxPol;
    }

    public Uuidtimbres getUuidTimbres() {
        return uuidTimbres;
    }

    public void setUuidTimbres(Uuidtimbres uuidTimbres) {
        this.uuidTimbres = uuidTimbres;
    }

    public int getValMaxNumReg() {
        return valMaxNumReg;
    }

    public void setValMaxNumReg(int valMaxNumReg) {
        this.valMaxNumReg = valMaxNumReg;
    }

    public int getValIdOpter() {
        return valIdOpter;
    }

    public void setValIdOpter(int valIdOpter) {
        this.valIdOpter = valIdOpter;
    }

    public PolizasCoiBancos() {
        control = new Control();
        listacontrol = new ArrayList<>();
        doctosFiscales = new Doctosfiscales();
        listadoctosFiscales = new ArrayList<>();
        folios = new Folios();
        listafolios = new ArrayList<>();
        impuestosFiscales = new Impuestosfiscales();
        listaimpuestosFiscales = new ArrayList<>();
        infadipar = new Infadipar();
        listainfadipar = new ArrayList<>();
        movpoliza = new Movpoliza();
        listamovpoliza = new ArrayList<>();
        movs04 = new Movs04();
        listamovs04 = new ArrayList<>();
        opeter = new Opeter();
        listaopeter = new ArrayList<>();
        otrosImpuestos = new Otrosimpuestos();
        listaotrosImpuestos = new ArrayList<>();
        parmovs04 = new Parmovs04();
        listaparmovs04 = new ArrayList<>();
        regpol = new Regpol();
        listaregpol = new ArrayList<>();
        uuidtimbres = new Uuidtimbres();
        listauuidtimbres = new ArrayList<>();
        listaFactura = new ArrayList<>();
        aux19 = new Auxiliar19();
        uuidTimbres = new Uuidtimbres();
    }

    public static void main(String[] args) {
        PolizasCoiBancos main = new PolizasCoiBancos();
        main.RevisarTablaMovPoliza();
        System.exit(0);
    }

//**INICIA MÉTODO PARA REVISAR SI HAY NUEVAS POLIZAS DE CHEQUE EN LA TABLA MOVS04**//
    public void RevisarTablaMovPoliza() {
        MovpolizaDao movDao = new MovpolizaDaoImp();
        listamovpoliza = movDao.listaTblMovpoliza();
        //**REVISAMOS LOS NUEVO DATOS INGRESADOS EN LA TABLA MOVPOLIZA BANCOS**//
        for (int i = 0; i < listamovpoliza.size(); i++) {
            //**INICIA-REVISAR LAS PARTIDAS EN LA TABLA PARMOVS04 BANCOS**//
            Parmovs04Dao pMovs = new Parmovs04DaoImp();
            listaparmovs04 = pMovs.listaTblParmovs04(listamovpoliza.get(i).getNumReg());
            AuxiliarDao ValDao = new AuxiliarDaoImp();
            valorMaxPol = Integer.parseInt(ValDao.maxValPol()); //MÁXIMO VALOR DE LA PÓLIZA

            for (int j = 0; j < listaparmovs04.size(); j++) {
                //**INICIA-REVISAR WCXP EN PORTAL**//
                FacturaDao fDao = new FacturaDaoImpl();
                listaFactura = fDao.listaFactura(Integer.parseInt((listaparmovs04.get(j).getFact().replace("WCXP", ""))));
                for (int k = 0; k < listaFactura.size(); k++) {
                    //**INICIA-GUARDAR EN COI-AUXILIARES-IMPORTES**//
                    partidaNo = partidaNo + 1;
                    AuxiliarDao aDao = new AuxiliarDaoImp();
                    aux19.setTipoPoli("Et");
                    aux19.setNumPoliz(String.valueOf(valorMaxPol));
                    aux19.setNumPart(partidaNo);//REVISAR NUM_PARTIDA
                    aux19.setPeriodo(Short.parseShort("8"));//REVISAR EL PERIODO CONTABLE
                    aux19.setEjercicio(Short.parseShort("2019")); //REVISAR EL AÑO DEL PERIODO
                    CuentasDao cuentaDao = new CuentasDaoImp();
                    aux19.setNumCta(cuentaDao.listaCuenta(listaFactura.get(k).getRfcE()).toString().replace("[", "").replace("]", "")); //REVISAR LA CUENTA
                    aux19.setFechaPol(new Date());
                    aux19.setConcepPo(listaFactura.get(k).getFactura().concat("-".concat(listaFactura.get(k).getReferencia())));
                    aux19.setDebeHaber("D");
                    aux19.setMontomov(Double.parseDouble(listaFactura.get(k).getImporte().toString()));
                    aux19.setNumdepto(Short.parseShort("0"));
                    aux19.setTipcambio(1.0);
                    aux19.setContrapar(Short.parseShort("0"));
                    aux19.setOrden(partidaNo);
                    aux19.setCcostos(0);
                    aux19.setCgrupos(0);
                    aux19.setIdinfadipar(-1);
                    UuidtimbresDao ValNumRegDao = new UuidtimbresDaoImp();
                    valMaxNumReg = Integer.parseInt(ValNumRegDao.maxValNumReg()); //MÁXIMO VALOR DEL NUMREG UUIDTIMBRES
                    aux19.setIduuid(valMaxNumReg);

                    aDao.insertarAuxiliares(aux19);//D
                    aux19 = new Auxiliar19();//LIMPIAMOS EL OBJETO DE LA TABLA AUXILIARES
                    //aDao.insertarAuxiliares(aux19);//D
                    valorTotal = valorTotal + Double.parseDouble(listaFactura.get(k).getTotal().toString());
//                    //GUARDAMOS EN LA TABLA UUIDTIMBRES
                    UuidtimbresDao uDao = new UuidtimbresDaoImp();
                    uDao.insertarTblControl(new Uuidtimbres(valMaxNumReg, listaFactura.get(k).getUuid(), valorTotal, listaFactura.get(k).getSerie(),
                            listaFactura.get(k).getFolio(), listaFactura.get(k).getRfcE(), listaFactura.get(k).getRfcR(), 1, new Date(),
                            Short.parseShort("1"), Double.parseDouble(listaFactura.get(k).getTipoCambio().toString()), listaFactura.get(k).getVersioncfdi(), listaFactura.get(k).getMoneda()));
                    //GUARDAMOS EN LA TABLA DOCTOSFISCALES
                    DoctofiscalesDao doctosFisDao = new DoctosfiscalesDaoImp();
                    doctosFisDao.insertarTblDoctosFiscales(new Doctosfiscales(listaFactura.get(k).getUuid(), "ruta", Double.parseDouble(listaFactura.get(k).getTotal().toString()),
                            Double.parseDouble(listaFactura.get(k).getImporte().toString()),
                            listaFactura.get(k).getRfcE(), listaFactura.get(k).getRfcR(), new Date(), listaFactura.get(k).getSerie(),
                            listaFactura.get(k).getFolio(), listaFactura.get(k).getVersioncfdi(), listaFactura.get(k).getLugarExpedicion(), listaFactura.get(k).getMoneda(),
                            "", Double.parseDouble(listaFactura.get(k).getTipoCambio().toString()), 0.0, listaFactura.get(k).getFormaPago(), listaFactura.get(k).getMetodoPago(),
                            Double.parseDouble(listaFactura.get(k).getImporteCouta().toString()), 0.0,
                            listaFactura.get(k).getNombreE(), listaFactura.get(k).getNombreR(), listaFactura.get(k).getRegimenFiscal(), listaFactura.get(k).getUsoCfdi(),
                            listaFactura.get(k).getSelloSat().substring(0, 100), listaFactura.get(k).getNoCertificado(), listaFactura.get(k).getNoCertificadoSat(), listaFactura.get(k).getCondicionesPago(),
                            listaFactura.get(k).getSello().substring(0, 100), listaFactura.get(k).getTipoComprobante(), "RUTA"));

                    //GUARDAMOS EN LA TABLA IMPUESTOSFISCALES
                    ImpuestosfiscalesDao impFiscDao = new ImpuestosfiscalesDaoImp();
                    impFiscDao.insertarTblImpuestosfiscales(new Impuestosfiscales(1, listaFactura.get(k).getUuid(), listaFactura.get(k).getImpuesto(),
                            0, 0, Double.parseDouble(listaFactura.get(k).getTotal().toString()), "Tasa", Double.parseDouble(listaFactura.get(k).getTasaCouta()),
                            Double.parseDouble(listaFactura.get(k).getImporteCouta().toString())));
                    //GUARDAMOS EN LA TABLA OPETER
                    OpeterDao opeterDao = new OpeterDaoImp();
                    OtrosimpuestosDao oDao = new OtrosimpuestosDaoImp();
                    valIdOpter = Integer.parseInt(oDao.maxValIdopter());
                    opeterDao.insertarTblOpeter(new Opeter("Et", String.valueOf(valorMaxPol), new Date(), partidaNo, "210603600000000000002",//CUENTA DEL PROVEEDOR
                            listaFactura.get(i).getRfcE(), 85,
                            Double.parseDouble(listaFactura.get(i).getTotal().toString()),
                            Double.parseDouble(listaFactura.get(i).getImporte().toString()),
                            Double.parseDouble(listaFactura.get(i).getImporte().toString()), Double.parseDouble(listaFactura.get(i).getImporteCouta().toString()),
                            0.0, 0.0, 0.0, 0.0, 0.0, Double.parseDouble(listaFactura.get(i).getImporteCouta().toString()), 0.0,
                            new Date(), 0.0, 0.0, "N", 0.0, 1, 0.0,
                            16, 11, NULL, Short.parseShort("0"), valIdOpter));
                    uuidtimbres = new Uuidtimbres();

                    //**FINALIZA-GUARDAR EN COI-AUXILIARES**//
                }

                for (int l = 0; l < listaFactura.size(); l++) {
                    //**INICIA-GUARDAR EN COI-AUXILIARES-IMPORTES**//
                    partidaNo = partidaNo + 1;
                    AuxiliarDao aDao = new AuxiliarDaoImp();
                    aux19.setTipoPoli("Et");
                    aux19.setNumPoliz(String.valueOf(valorMaxPol));
                    aux19.setNumPart(partidaNo);//REVISAR NUM_PARTIDA
                    aux19.setPeriodo(Short.parseShort("8")); //REVISAR EL PERIODO CONTABLE
                    aux19.setEjercicio(Short.parseShort("2019")); //REVISAR EL AÑO DEL PERIODO
                    aux19.setNumCta("111000700000000000002"); //REVISAR LA CUENTA DEL IVA
                    aux19.setFechaPol(new Date());
                    aux19.setConcepPo("&  " + listaFactura.get(i).getRfcE());
                    aux19.setDebeHaber("D");
                    aux19.setMontomov(Double.parseDouble(listaFactura.get(l).getImporteCouta().toString()));
                    aux19.setNumdepto(Short.parseShort("0"));
                    aux19.setTipcambio(1.0);
                    aux19.setContrapar(Short.parseShort("0"));
                    aux19.setOrden(partidaNo);
                    aux19.setCcostos(0);
                    aux19.setCgrupos(0);
                    aux19.setIdinfadipar(-1);
                    aux19.setIduuid(-1);
                    aDao.insertarAuxiliares(aux19);//D
                    aux19 = new Auxiliar19();//LIMPIAMOS EL OBJETO DE LA TABLA AUXILIARES
                }

            }
            partidaNo = partidaNo + 1;
            AuxiliarDao aDao = new AuxiliarDaoImp();
            aux19.setTipoPoli("Et");
            aux19.setNumPoliz(String.valueOf(valorMaxPol));
            aux19.setNumPart(partidaNo);//REVISAR NUM_PARTIDA
            aux19.setPeriodo(Short.parseShort("8")); //REVISAR EL PERIODO CONTABLE
            aux19.setEjercicio(Short.parseShort("2019"));//REVISAR EL AÑO DEL PERIODO CONTABLE
            CuentasDao cuentaDao = new CuentasDaoImp();
            aux19.setNumCta(cuentaDao.listaCuenta(listaFactura.get(i).getRfcE()).toString().replace("[", "").replace("]", ""));//AQUI VA LA CUENTA DEL PROVEEDOR
            aux19.setFechaPol(new Date());
            aux19.setConcepPo(listaFactura.get(i).getNombreE());
            aux19.setDebeHaber("H");
            aux19.setMontomov(valorTotal);
            aux19.setNumdepto(Short.parseShort("0"));
            aux19.setTipcambio(1.0);
            aux19.setContrapar(Short.parseShort("0"));
            aux19.setOrden(partidaNo);
            aux19.setCcostos(0);
            aux19.setCgrupos(0);
            InfadiparDao infaDao = new InfadiparDaoImp(); //BUSCAMOS EL VALOR MÁXIMO DE INFADIPAR
            aux19.setIdinfadipar(Integer.parseInt(infaDao.maxValNumReg()));
            aux19.setIduuid(-1);
            aDao.insertarAuxiliares(aux19);//D
            aux19 = new Auxiliar19();//LIMPIAMOS EL OBJETO DE LA TABLA AUXILIARES

            //GUARDAMOS EN LA TABLA INFADIPAR
            InfadiparDao infadiparDao = new InfadiparDaoImp();
            int valInfa = Integer.parseInt(infaDao.maxValNumReg());
            infadiparDao.insertarTblInfadipar(new Infadipar(valInfa, "02", String.valueOf(valorMaxPol), 21,
                    "4100822197", new Date(), valorTotal, listaparmovs04.get(i).getPartAnombrede(), listaparmovs04.get(i).getPartClpvRfc(),
                    0, "", "", "", ""));

            //GUARDAMOS EN LA TABLA REGPOL
            RegpolDao regPolDao = new RegpolDaoImp();
            RegpolDao regPolMaxDao = new RegpolDaoImp();
            int valRegPol = Integer.parseInt(regPolMaxDao.maxValNumReg());
            regPolDao.insertarTblRegpol(new Regpol(valRegPol, "Et", String.valueOf(valorMaxPol), new Date(), new Date(),
                    "          BANCO", 0, 1, Short.parseShort("1"), "?", "", 0, "?"));

            //ACTUALIZAMOS EN LA TABLA CONTROL
            ControlDao controlDao = new ControlDaoImp();
            controlDao.actualizarTblControl(valRegPol, valInfa, valMaxNumReg, valIdOpter);

            //ACTUALIZAMOS EN LA TABLA FOLIOS
            FoliosDao foliosDao = new FoliosDaoImp();
            foliosDao.actualizarTblFolios(String.valueOf(valorMaxPol));

            valorTotal = 0.0;
            partidaNo = 0;
            //**FINALIZA-REVISAR LAS PARTIDAS EN LA TABLA PARMOVS04 BANCOS**//

        }
    }

}

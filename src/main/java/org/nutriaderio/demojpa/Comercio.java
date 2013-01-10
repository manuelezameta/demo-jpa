/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nutriaderio.demojpa;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author carloseg
 */
@Entity
@Table(name = "COMERCIOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Comercio.findAll", query = "SELECT c FROM Comercio c"),
    @NamedQuery(name = "Comercio.nextId", query = "SELECT COUNT(*) + 1 FROM Comercio o where o.comercioPK.comCodpsf = :psf")})
public class Comercio implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ComercioPK comercioPK;
    @Column(name = "COM_CARCON1")
    private String comCarcon1;
    @Column(name = "COM_CARCON2")
    private String comCarcon2;
    @Column(name = "COM_CODCLI")
    private String comCodcli;
    @Column(name = "COM_CODGRU")
    private String comCodgru;
    @Column(name = "COM_DEPAR")
    private String comDepar;
    @Column(name = "COM_DIRECC")
    private String comDirecc;
    @Column(name = "COM_DISTRI")
    private String comDistri;
    @Column(name = "COM_MAILCON1")
    private String comMailcon1;
    @Column(name = "COM_MAILCON2")
    private String comMailcon2;
    @Column(name = "COM_MAILRECINF")
    private String comMailrecinf;
    @Column(name = "COM_NOMCON1")
    private String comNomcon1;
    @Column(name = "COM_NOMCON2")
    private String comNomcon2;
    @Column(name = "COM_NOMCOMCRT")
    private String comNomcomcrt;
    @Column(name = "COM_NOMCOMLRG")
    private String comNomcomlrg;
    @Column(name = "COM_NUMDOI")
    private String comNumdoi;
    @Column(name = "COM_NUMTEL1")
    private String comNumtel1;
    @Column(name = "COM_NUMTEL2")
    private String comNumtel2;
    @Column(name = "COM_PAIS")
    private String comPais;
    @Column(name = "COM_PROVI")
    private String comProvi;
    @Column(name = "COM_SECTIENDA")
    private String comSectienda;
    @Column(name = "COM_SMSALE")
    private String comSmsale;
    @Column(name = "COM_TELCON1")
    private String comTelcon1;
    @Column(name = "COM_TELCON2")
    private String comTelcon2;
    @Column(name = "COM_URBAN")
    private String comUrban;
    @Column(name = "COM_CATCOM")
    private String comCatcom;
    @Column(name = "COM_CODSCT")
    private String comCodsct;
    @Column(name = "COM_TIPENVINF")
    private String comTipenvinf;
    @Column(name = "COM_ESTADO")
    private String comEstado;
    @Column(name = "COM_TIPDOI")
    private String comTipdoi;
    @Column(name = "COM_NROCTAFINANCIERA")
    private String comNroctafinanciera;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "COM_LINEACREDITO")
    private Double comLineacredito;

    public Comercio() {
    }

    public Comercio(ComercioPK comercioPK) {
        this.comercioPK = comercioPK;
    }

    public Comercio(String comCodsec, String comCodpsf) {
        this.comercioPK = new ComercioPK(comCodsec, comCodpsf);
    }

    public ComercioPK getComercioPK() {
        return comercioPK;
    }

    public void setComercioPK(ComercioPK comercioPK) {
        this.comercioPK = comercioPK;
    }

    public String getComCarcon1() {
        return comCarcon1;
    }

    public void setComCarcon1(String comCarcon1) {
        this.comCarcon1 = comCarcon1;
    }

    public String getComCarcon2() {
        return comCarcon2;
    }

    public void setComCarcon2(String comCarcon2) {
        this.comCarcon2 = comCarcon2;
    }

    public String getComCodcli() {
        return comCodcli;
    }

    public void setComCodcli(String comCodcli) {
        this.comCodcli = comCodcli;
    }

    public String getComCodgru() {
        return comCodgru;
    }

    public void setComCodgru(String comCodgru) {
        this.comCodgru = comCodgru;
    }

    public String getComDepar() {
        return comDepar;
    }

    public void setComDepar(String comDepar) {
        this.comDepar = comDepar;
    }

    public String getComDirecc() {
        return comDirecc;
    }

    public void setComDirecc(String comDirecc) {
        this.comDirecc = comDirecc;
    }

    public String getComDistri() {
        return comDistri;
    }

    public void setComDistri(String comDistri) {
        this.comDistri = comDistri;
    }

    public String getComMailcon1() {
        return comMailcon1;
    }

    public void setComMailcon1(String comMailcon1) {
        this.comMailcon1 = comMailcon1;
    }

    public String getComMailcon2() {
        return comMailcon2;
    }

    public void setComMailcon2(String comMailcon2) {
        this.comMailcon2 = comMailcon2;
    }

    public String getComMailrecinf() {
        return comMailrecinf;
    }

    public void setComMailrecinf(String comMailrecinf) {
        this.comMailrecinf = comMailrecinf;
    }

    public String getComNomcon1() {
        return comNomcon1;
    }

    public void setComNomcon1(String comNomcon1) {
        this.comNomcon1 = comNomcon1;
    }

    public String getComNomcon2() {
        return comNomcon2;
    }

    public void setComNomcon2(String comNomcon2) {
        this.comNomcon2 = comNomcon2;
    }

    public String getComNomcomcrt() {
        return comNomcomcrt;
    }

    public void setComNomcomcrt(String comNomcomcrt) {
        this.comNomcomcrt = comNomcomcrt;
    }

    public String getComNomcomlrg() {
        return comNomcomlrg;
    }

    public void setComNomcomlrg(String comNomcomlrg) {
        this.comNomcomlrg = comNomcomlrg;
    }

    public String getComNumdoi() {
        return comNumdoi;
    }

    public void setComNumdoi(String comNumdoi) {
        this.comNumdoi = comNumdoi;
    }

    public String getComNumtel1() {
        return comNumtel1;
    }

    public void setComNumtel1(String comNumtel1) {
        this.comNumtel1 = comNumtel1;
    }

    public String getComNumtel2() {
        return comNumtel2;
    }

    public void setComNumtel2(String comNumtel2) {
        this.comNumtel2 = comNumtel2;
    }

    public String getComPais() {
        return comPais;
    }

    public void setComPais(String comPais) {
        this.comPais = comPais;
    }

    public String getComProvi() {
        return comProvi;
    }

    public void setComProvi(String comProvi) {
        this.comProvi = comProvi;
    }

    public String getComSectienda() {
        return comSectienda;
    }

    public void setComSectienda(String comSectienda) {
        this.comSectienda = comSectienda;
    }

    public String getComSmsale() {
        return comSmsale;
    }

    public void setComSmsale(String comSmsale) {
        this.comSmsale = comSmsale;
    }

    public String getComTelcon1() {
        return comTelcon1;
    }

    public void setComTelcon1(String comTelcon1) {
        this.comTelcon1 = comTelcon1;
    }

    public String getComTelcon2() {
        return comTelcon2;
    }

    public void setComTelcon2(String comTelcon2) {
        this.comTelcon2 = comTelcon2;
    }

    public String getComUrban() {
        return comUrban;
    }

    public void setComUrban(String comUrban) {
        this.comUrban = comUrban;
    }

    public String getComCatcom() {
        return comCatcom;
    }

    public void setComCatcom(String comCatcom) {
        this.comCatcom = comCatcom;
    }

    public String getComCodsct() {
        return comCodsct;
    }

    public void setComCodsct(String comCodsct) {
        this.comCodsct = comCodsct;
    }

    public String getComTipenvinf() {
        return comTipenvinf;
    }

    public void setComTipenvinf(String comTipenvinf) {
        this.comTipenvinf = comTipenvinf;
    }

    public String getComEstado() {
        return comEstado;
    }

    public void setComEstado(String comEstado) {
        this.comEstado = comEstado;
    }

    public String getComTipdoi() {
        return comTipdoi;
    }

    public void setComTipdoi(String comTipdoi) {
        this.comTipdoi = comTipdoi;
    }

    public String getComNroctafinanciera() {
        return comNroctafinanciera;
    }

    public void setComNroctafinanciera(String comNroctafinanciera) {
        this.comNroctafinanciera = comNroctafinanciera;
    }

    public Double getComLineacredito() {
        return comLineacredito;
    }

    public void setComLineacredito(Double comLineacredito) {
        this.comLineacredito = comLineacredito;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (comercioPK != null ? comercioPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Comercio)) {
            return false;
        }
        Comercio other = (Comercio) object;
        if ((this.comercioPK == null && other.comercioPK != null) || (this.comercioPK != null && !this.comercioPK.equals(other.comercioPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.nutriaderio.demojpa.Comercio[ comercioPK=" + comercioPK + " ]";
    }
}

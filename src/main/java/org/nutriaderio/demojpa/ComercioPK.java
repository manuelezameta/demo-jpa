/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nutriaderio.demojpa;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author carloseg
 */
@Embeddable
public class ComercioPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "COM_CODSEC")
    private String comCodsec;
    @Basic(optional = false)
    @Column(name = "COM_CODPSF")
    private String comCodpsf;

    public ComercioPK() {
    }

    public ComercioPK(String comCodsec, String comCodpsf) {
        this.comCodsec = comCodsec;
        this.comCodpsf = comCodpsf;
    }

    public String getComCodsec() {
        return comCodsec;
    }

    public void setComCodsec(String comCodsec) {
        this.comCodsec = comCodsec;
    }

    public String getComCodpsf() {
        return comCodpsf;
    }

    public void setComCodpsf(String comCodpsf) {
        this.comCodpsf = comCodpsf;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (comCodsec != null ? comCodsec.hashCode() : 0);
        hash += (comCodpsf != null ? comCodpsf.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ComercioPK)) {
            return false;
        }
        ComercioPK other = (ComercioPK) object;
        if ((this.comCodsec == null && other.comCodsec != null) || (this.comCodsec != null && !this.comCodsec.equals(other.comCodsec))) {
            return false;
        }
        if ((this.comCodpsf == null && other.comCodpsf != null) || (this.comCodpsf != null && !this.comCodpsf.equals(other.comCodpsf))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.nutriaderio.demojpa.ComercioPK[ comCodsec=" + comCodsec + ", comCodpsf=" + comCodpsf + " ]";
    }
}

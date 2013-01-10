/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nutriaderio.demojpa;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author carloseg
 */
@Entity
public class Fool implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private Long id;
    private String dato1;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dato2;
    @Lob
    private byte[] dato3;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDato1() {
        return dato1;
    }

    public void setDato1(String dato1) {
        this.dato1 = dato1;
    }

    public Date getDato2() {
        return dato2;
    }

    public void setDato2(Date dato2) {
        this.dato2 = dato2;
    }

    public byte[] getDato3() {
        return dato3;
    }

    public void setDato3(byte[] dato3) {
        this.dato3 = dato3;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fool)) {
            return false;
        }
        Fool other = (Fool) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.nutriaderio.demojpa.Foo[ id=" + id + " ]";
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nutriaderio.demojpa;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author carloseg
 */
@Entity
public class Bar implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof Bar)) {
            return false;
        }
        Bar other = (Bar) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.nutriaderio.demojpa.Bar[ id=" + id + " ]";
    }
}

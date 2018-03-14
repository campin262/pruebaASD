/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Camilo
 */
@Entity
@Table(name = "area_empresa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AreaEmpresa.findAll", query = "SELECT a FROM AreaEmpresa a")
    , @NamedQuery(name = "AreaEmpresa.findByIdArea", query = "SELECT a FROM AreaEmpresa a WHERE a.idArea = :idArea")
    , @NamedQuery(name = "AreaEmpresa.findByNombreArea", query = "SELECT a FROM AreaEmpresa a WHERE a.nombreArea = :nombreArea")
    , @NamedQuery(name = "AreaEmpresa.findByDescripcionArea", query = "SELECT a FROM AreaEmpresa a WHERE a.descripcionArea = :descripcionArea")
    , @NamedQuery(name = "AreaEmpresa.findByFechaCreacion", query = "SELECT a FROM AreaEmpresa a WHERE a.fechaCreacion = :fechaCreacion")})
public class AreaEmpresa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idArea")
    private Integer idArea;
    @Basic(optional = false)
    @Column(name = "nombreArea")
    private String nombreArea;
    @Basic(optional = false)
    @Column(name = "descripcionArea")
    private String descripcionArea;
    @Column(name = "fechaCreacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idArea", fetch = FetchType.LAZY)
    private List<Persona> personaList;

    public AreaEmpresa() {
    }

    public AreaEmpresa(Integer idArea) {
        this.idArea = idArea;
    }

    public AreaEmpresa(Integer idArea, String nombreArea, String descripcionArea) {
        this.idArea = idArea;
        this.nombreArea = nombreArea;
        this.descripcionArea = descripcionArea;
    }

    public Integer getIdArea() {
        return idArea;
    }

    public void setIdArea(Integer idArea) {
        this.idArea = idArea;
    }

    public String getNombreArea() {
        return nombreArea;
    }

    public void setNombreArea(String nombreArea) {
        this.nombreArea = nombreArea;
    }

    public String getDescripcionArea() {
        return descripcionArea;
    }

    public void setDescripcionArea(String descripcionArea) {
        this.descripcionArea = descripcionArea;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @XmlTransient
    public List<Persona> getPersonaList() {
        return personaList;
    }

    public void setPersonaList(List<Persona> personaList) {
        this.personaList = personaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idArea != null ? idArea.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AreaEmpresa)) {
            return false;
        }
        AreaEmpresa other = (AreaEmpresa) object;
        if ((this.idArea == null && other.idArea != null) || (this.idArea != null && !this.idArea.equals(other.idArea))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.AreaEmpresa[ idArea=" + idArea + " ]";
    }
    
}

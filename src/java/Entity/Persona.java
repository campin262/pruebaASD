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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "persona")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Persona.findAll", query = "SELECT p FROM Persona p")
    , @NamedQuery(name = "Persona.findByIdPersona", query = "SELECT p FROM Persona p WHERE p.idPersona = :idPersona")
    , @NamedQuery(name = "Persona.findByNombresPersona", query = "SELECT p FROM Persona p WHERE p.nombresPersona = :nombresPersona")
    , @NamedQuery(name = "Persona.findByApellidoPersona", query = "SELECT p FROM Persona p WHERE p.apellidoPersona = :apellidoPersona")
    , @NamedQuery(name = "Persona.findByCargoPersona", query = "SELECT p FROM Persona p WHERE p.cargoPersona = :cargoPersona")
    , @NamedQuery(name = "Persona.findByFechaCreacion", query = "SELECT p FROM Persona p WHERE p.fechaCreacion = :fechaCreacion")})
public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idPersona")
    private Integer idPersona;
    @Basic(optional = false)
    @Column(name = "nombresPersona")
    private String nombresPersona;
    @Basic(optional = false)
    @Column(name = "apellidoPersona")
    private String apellidoPersona;
    @Basic(optional = false)
    @Column(name = "cargoPersona")
    private String cargoPersona;
    @Column(name = "fechaCreacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @JoinColumn(name = "idArea", referencedColumnName = "idArea")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private AreaEmpresa idArea;
    @OneToMany(mappedBy = "idPersonaACargo", fetch = FetchType.LAZY)
    private List<ActivoFijo> activoFijoList;

    public Persona() {
    }

    public Persona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public Persona(Integer idPersona, String nombresPersona, String apellidoPersona, String cargoPersona) {
        this.idPersona = idPersona;
        this.nombresPersona = nombresPersona;
        this.apellidoPersona = apellidoPersona;
        this.cargoPersona = cargoPersona;
    }

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombresPersona() {
        return nombresPersona;
    }

    public void setNombresPersona(String nombresPersona) {
        this.nombresPersona = nombresPersona;
    }

    public String getApellidoPersona() {
        return apellidoPersona;
    }

    public void setApellidoPersona(String apellidoPersona) {
        this.apellidoPersona = apellidoPersona;
    }

    public String getCargoPersona() {
        return cargoPersona;
    }

    public void setCargoPersona(String cargoPersona) {
        this.cargoPersona = cargoPersona;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public AreaEmpresa getIdArea() {
        return idArea;
    }

    public void setIdArea(AreaEmpresa idArea) {
        this.idArea = idArea;
    }

    @XmlTransient
    public List<ActivoFijo> getActivoFijoList() {
        return activoFijoList;
    }

    public void setActivoFijoList(List<ActivoFijo> activoFijoList) {
        this.activoFijoList = activoFijoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPersona != null ? idPersona.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Persona)) {
            return false;
        }
        Persona other = (Persona) object;
        if ((this.idPersona == null && other.idPersona != null) || (this.idPersona != null && !this.idPersona.equals(other.idPersona))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Persona[ idPersona=" + idPersona + " ]";
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Camilo
 */
@Entity
@Table(name = "activo_fijo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ActivoFijo.findAll", query = "SELECT a FROM ActivoFijo a")
    , @NamedQuery(name = "ActivoFijo.findByIdActivoFijo", query = "SELECT a FROM ActivoFijo a WHERE a.idActivoFijo = :idActivoFijo")
    , @NamedQuery(name = "ActivoFijo.findByNombre", query = "SELECT a FROM ActivoFijo a WHERE a.nombre = :nombre")
    , @NamedQuery(name = "ActivoFijo.findByDescripcion", query = "SELECT a FROM ActivoFijo a WHERE a.descripcion = :descripcion")
    , @NamedQuery(name = "ActivoFijo.findBySerialActivo", query = "SELECT a FROM ActivoFijo a WHERE a.serialActivo = :serialActivo")
    , @NamedQuery(name = "ActivoFijo.findByNumeroInternoInventario", query = "SELECT a FROM ActivoFijo a WHERE a.numeroInternoInventario = :numeroInternoInventario")
    , @NamedQuery(name = "ActivoFijo.findByPeso", query = "SELECT a FROM ActivoFijo a WHERE a.peso = :peso")
    , @NamedQuery(name = "ActivoFijo.findByAlto", query = "SELECT a FROM ActivoFijo a WHERE a.alto = :alto")
    , @NamedQuery(name = "ActivoFijo.findByAncho", query = "SELECT a FROM ActivoFijo a WHERE a.ancho = :ancho")
    , @NamedQuery(name = "ActivoFijo.findByLargo", query = "SELECT a FROM ActivoFijo a WHERE a.largo = :largo")
    , @NamedQuery(name = "ActivoFijo.findByValorCompra", query = "SELECT a FROM ActivoFijo a WHERE a.valorCompra = :valorCompra")
    , @NamedQuery(name = "ActivoFijo.findByFechaCompra", query = "SELECT a FROM ActivoFijo a WHERE a.fechaCompra = :fechaCompra")
    , @NamedQuery(name = "ActivoFijo.findByFechaBaja", query = "SELECT a FROM ActivoFijo a WHERE a.fechaBaja = :fechaBaja")
    , @NamedQuery(name = "ActivoFijo.findByEstadoActual", query = "SELECT a FROM ActivoFijo a WHERE a.estadoActual = :estadoActual")
    , @NamedQuery(name = "ActivoFijo.findByColor", query = "SELECT a FROM ActivoFijo a WHERE a.color = :color")
    , @NamedQuery(name = "ActivoFijo.findByFechaCreacion", query = "SELECT a FROM ActivoFijo a WHERE a.fechaCreacion = :fechaCreacion")})
public class ActivoFijo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idActivoFijo")
    private Integer idActivoFijo;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "serialActivo")
    private String serialActivo;
    @Column(name = "numeroInternoInventario")
    private Integer numeroInternoInventario;
    @Column(name = "peso")
    private Long peso;
    @Column(name = "alto")
    private Integer alto;
    @Column(name = "ancho")
    private Integer ancho;
    @Column(name = "largo")
    private Integer largo;
    @Column(name = "valorCompra")
    private Long valorCompra;
    @Column(name = "fechaCompra")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCompra;
    @Column(name = "fechaBaja")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaBaja;
    @Column(name = "estadoActual")
    private String estadoActual;
    @Column(name = "color")
    private String color;
    @Column(name = "fechaCreacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @JoinColumn(name = "idPersonaACargo", referencedColumnName = "idPersona")
    @ManyToOne(fetch = FetchType.LAZY)
    private Persona idPersonaACargo;

    public ActivoFijo() {
    }

    public ActivoFijo(Integer idActivoFijo) {
        this.idActivoFijo = idActivoFijo;
    }

    public ActivoFijo(Integer idActivoFijo, String nombre, String descripcion, String serialActivo) {
        this.idActivoFijo = idActivoFijo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.serialActivo = serialActivo;
    }

    public Integer getIdActivoFijo() {
        return idActivoFijo;
    }

    public void setIdActivoFijo(Integer idActivoFijo) {
        this.idActivoFijo = idActivoFijo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getSerialActivo() {
        return serialActivo;
    }

    public void setSerialActivo(String serialActivo) {
        this.serialActivo = serialActivo;
    }

    public Integer getNumeroInternoInventario() {
        return numeroInternoInventario;
    }

    public void setNumeroInternoInventario(Integer numeroInternoInventario) {
        this.numeroInternoInventario = numeroInternoInventario;
    }

    public Long getPeso() {
        return peso;
    }

    public void setPeso(Long peso) {
        this.peso = peso;
    }

    public Integer getAlto() {
        return alto;
    }

    public void setAlto(Integer alto) {
        this.alto = alto;
    }

    public Integer getAncho() {
        return ancho;
    }

    public void setAncho(Integer ancho) {
        this.ancho = ancho;
    }

    public Integer getLargo() {
        return largo;
    }

    public void setLargo(Integer largo) {
        this.largo = largo;
    }

    public Long getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(Long valorCompra) {
        this.valorCompra = valorCompra;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public String getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(String estadoActual) {
        this.estadoActual = estadoActual;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Persona getIdPersonaACargo() {
        return idPersonaACargo;
    }

    public void setIdPersonaACargo(Persona idPersonaACargo) {
        this.idPersonaACargo = idPersonaACargo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idActivoFijo != null ? idActivoFijo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ActivoFijo)) {
            return false;
        }
        ActivoFijo other = (ActivoFijo) object;
        if ((this.idActivoFijo == null && other.idActivoFijo != null) || (this.idActivoFijo != null && !this.idActivoFijo.equals(other.idActivoFijo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.ActivoFijo[ idActivoFijo=" + idActivoFijo + " ]";
    }
    
}

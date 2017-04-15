/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author vidarte
 */
@Entity
@Table(name = "clientes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Clientes.findAll", query = "SELECT c FROM Clientes c"),
    @NamedQuery(name = "Clientes.findByCliCodigo", query = "SELECT c FROM Clientes c WHERE c.cliCodigo = :cliCodigo"),
    @NamedQuery(name = "Clientes.findByCliDni", query = "SELECT c FROM Clientes c WHERE c.cliDni = :cliDni"),
    @NamedQuery(name = "Clientes.findByCliNombre", query = "SELECT c FROM Clientes c WHERE c.cliNombre = :cliNombre"),
    @NamedQuery(name = "Clientes.findByCliApellido", query = "SELECT c FROM Clientes c WHERE c.cliApellido = :cliApellido"),
    @NamedQuery(name = "Clientes.findByCliFecNac", query = "SELECT c FROM Clientes c WHERE c.cliFecNac = :cliFecNac"),
    @NamedQuery(name = "Clientes.findByCliDomicilio", query = "SELECT c FROM Clientes c WHERE c.cliDomicilio = :cliDomicilio"),
    @NamedQuery(name = "Clientes.findByCliProvincia", query = "SELECT c FROM Clientes c WHERE c.cliProvincia = :cliProvincia"),
    @NamedQuery(name = "Clientes.findByCliTelefono", query = "SELECT c FROM Clientes c WHERE c.cliTelefono = :cliTelefono"),
    @NamedQuery(name = "Clientes.findByCliCodPostal", query = "SELECT c FROM Clientes c WHERE c.cliCodPostal = :cliCodPostal"),
    @NamedQuery(name = "Clientes.findByCliFechaAlta", query = "SELECT c FROM Clientes c WHERE c.cliFechaAlta = :cliFechaAlta")})
public class Clientes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cliCodigo")
    private Integer cliCodigo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "cliDni")
    private String cliDni;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "cliNombre")
    private String cliNombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "cliApellido")
    private String cliApellido;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cliFecNac")
    @Temporal(TemporalType.DATE)
    private Date cliFecNac;
    @Size(max = 50)
    @Column(name = "cliDomicilio")
    private String cliDomicilio;
    @Size(max = 50)
    @Column(name = "cliProvincia")
    private String cliProvincia;
    @Size(max = 32)
    @Column(name = "cliTelefono")
    private String cliTelefono;
    @Column(name = "cliCodPostal")
    private Integer cliCodPostal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cliFechaAlta")
    @Temporal(TemporalType.DATE)
    private Date cliFechaAlta;

    public Clientes() {
    }

    public Clientes(Integer cliCodigo) {
        this.cliCodigo = cliCodigo;
    }

    public Clientes(Integer cliCodigo, String cliDni, String cliNombre, String cliApellido, Date cliFecNac, Date cliFechaAlta) {
        this.cliCodigo = cliCodigo;
        this.cliDni = cliDni;
        this.cliNombre = cliNombre;
        this.cliApellido = cliApellido;
        this.cliFecNac = cliFecNac;
        this.cliFechaAlta = cliFechaAlta;
    }

    public Integer getCliCodigo() {
        return cliCodigo;
    }

    public void setCliCodigo(Integer cliCodigo) {
        this.cliCodigo = cliCodigo;
    }

    public String getCliDni() {
        return cliDni;
    }

    public void setCliDni(String cliDni) {
        this.cliDni = cliDni;
    }

    public String getCliNombre() {
        return cliNombre;
    }

    public void setCliNombre(String cliNombre) {
        this.cliNombre = cliNombre;
    }

    public String getCliApellido() {
        return cliApellido;
    }

    public void setCliApellido(String cliApellido) {
        this.cliApellido = cliApellido;
    }

    public Date getCliFecNac() {
        return cliFecNac;
    }

    public void setCliFecNac(Date cliFecNac) {
        this.cliFecNac = cliFecNac;
    }

    public String getCliDomicilio() {
        return cliDomicilio;
    }

    public void setCliDomicilio(String cliDomicilio) {
        this.cliDomicilio = cliDomicilio;
    }

    public String getCliProvincia() {
        return cliProvincia;
    }

    public void setCliProvincia(String cliProvincia) {
        this.cliProvincia = cliProvincia;
    }

    public String getCliTelefono() {
        return cliTelefono;
    }

    public void setCliTelefono(String cliTelefono) {
        this.cliTelefono = cliTelefono;
    }

    public Integer getCliCodPostal() {
        return cliCodPostal;
    }

    public void setCliCodPostal(Integer cliCodPostal) {
        this.cliCodPostal = cliCodPostal;
    }

    public Date getCliFechaAlta() {
        return cliFechaAlta;
    }

    public void setCliFechaAlta(Date cliFechaAlta) {
        this.cliFechaAlta = cliFechaAlta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cliCodigo != null ? cliCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clientes)) {
            return false;
        }
        Clientes other = (Clientes) object;
        if ((this.cliCodigo == null && other.cliCodigo != null) || (this.cliCodigo != null && !this.cliCodigo.equals(other.cliCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "clientesDAO.Clientes[ cliCodigo=" + cliCodigo + " ]";
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parsisten;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author fatiq
 */
@Entity
@Table(name = "kategori")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kategori.findAll", query = "SELECT k FROM Kategori k"),
    @NamedQuery(name = "Kategori.findByIdKategori", query = "SELECT k FROM Kategori k WHERE k.idKategori = :idKategori"),
    @NamedQuery(name = "Kategori.findByKategori", query = "SELECT k FROM Kategori k WHERE k.kategori = :kategori")})
public class Kategori implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_kategori")
    private String idKategori;
    @Column(name = "kategori")
    private String kategori;
    @JoinTable(name = "kategori_skripsi", joinColumns = {
        @JoinColumn(name = "id_kategori", referencedColumnName = "id_kategori")}, inverseJoinColumns = {
        @JoinColumn(name = "id_skripsi", referencedColumnName = "id_skripsi")})
    @ManyToMany
    private Collection<Skripsi> skripsiCollection;
    @ManyToMany(mappedBy = "kategoriCollection")
    private Collection<Buku> bukuCollection;

    public Kategori() {
    }

    public Kategori(String idKategori) {
        this.idKategori = idKategori;
    }

    public String getIdKategori() {
        return idKategori;
    }

    public void setIdKategori(String idKategori) {
        this.idKategori = idKategori;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    @XmlTransient
    public Collection<Skripsi> getSkripsiCollection() {
        return skripsiCollection;
    }

    public void setSkripsiCollection(Collection<Skripsi> skripsiCollection) {
        this.skripsiCollection = skripsiCollection;
    }

    @XmlTransient
    public Collection<Buku> getBukuCollection() {
        return bukuCollection;
    }

    public void setBukuCollection(Collection<Buku> bukuCollection) {
        this.bukuCollection = bukuCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idKategori != null ? idKategori.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kategori)) {
            return false;
        }
        Kategori other = (Kategori) object;
        if ((this.idKategori == null && other.idKategori != null) || (this.idKategori != null && !this.idKategori.equals(other.idKategori))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "parsisten.Kategori[ idKategori=" + idKategori + " ]";
    }

    public int getJumlahBuku() {
        return bukuCollection.size();
    }

    public int getJumlahSkripsi() {
        return skripsiCollection.size();
    }

    public int getJmlDetail() {
        int x = 0;
        try {
            for (Buku bk : bukuCollection) {
                x += bk.getDetailBukuCollection().size();
            }
        } catch (Exception e) {
        }
        try {
            for (Skripsi bk : skripsiCollection) {
                x += bk.getDetailSkripsiCollection().size();
            }
        } catch (Exception e) {
        }
        return x;
    }
}

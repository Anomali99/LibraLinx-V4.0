/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import parsisten.Kategori;
import servis.ServiceKategori;

/**
 *
 * @author fatiq
 */
public class DaoKategori implements ServiceKategori {

    @Override
    public void tambahData(Kategori mod) {
        EntityManager em = Persistence.createEntityManagerFactory("LibraLinxPU").createEntityManager();
        em.getTransaction().begin();
        em.persist(mod);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void ubahData(Kategori mod) {
        EntityManager em = Persistence.createEntityManagerFactory("LibraLinxPU").createEntityManager();
        em.getTransaction().begin();
        em.merge(mod);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void hapusData(String id) {
        EntityManager em = Persistence.createEntityManagerFactory("LibraLinxPU").createEntityManager();
        em.getTransaction().begin();
        Kategori p = em.find(Kategori.class, id);
        em.remove(p);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public Kategori getById(String id) {
        EntityManager em = Persistence.createEntityManagerFactory("LibraLinxPU").createEntityManager();
        em.getTransaction().begin();
        Kategori p = em.find(Kategori.class, id);
        em.getTransaction().commit();
        em.close();
        return p;
    }

    @Override
    public List<Kategori> getByID(String id) {
        EntityManager em = Persistence.createEntityManagerFactory("LibraLinxPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT k FROM Kategori k WHERE LOWER(k.idKategori) LIKE :idKategori ORDER BY k.idKategori");
        query.setParameter("idKategori", "%" + id.toLowerCase() + "%");
        List<Kategori> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }

    @Override
    public List<Kategori> getByKategori(String kategori) {
        EntityManager em = Persistence.createEntityManagerFactory("LibraLinxPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT k FROM Kategori k WHERE LOWER(k.kategori) LIKE :kategori ORDER BY k.idKategori");
        query.setParameter("kategori", "%" + kategori.toLowerCase() + "%");
        List<Kategori> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }

    @Override
    public List<Kategori> ambilData() {
        EntityManager em = Persistence.createEntityManagerFactory("LibraLinxPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT k FROM Kategori k ORDER BY k.idKategori");
        List<Kategori> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }

    @Override
    public String nomer() {
        EntityManager em = Persistence.createEntityManagerFactory("LibraLinxPU").createEntityManager();
        String jpql = "SELECT SUBSTRING(k.idKategori, LENGTH(k.idKategori) - 2) AS nomor "
                + "FROM Kategori k WHERE k.idKategori LIKE 'K%' ORDER BY k.idKategori DESC";
        TypedQuery<String> query = em.createQuery(jpql, String.class);
        query.setMaxResults(1);
        String urutan = "";
        try {
            urutan = "K" + String.format("%03d", Integer.parseInt(query.getSingleResult()) + 1);
        } catch (NoResultException e) {
            urutan = "K001";
        }
        em.close();
        return urutan;
    }
    
}

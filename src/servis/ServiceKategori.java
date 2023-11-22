/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servis;

import java.util.List;
import parsisten.Kategori;

/**
 *
 * @author fatiq
 */
public interface ServiceKategori {
    void tambahData(Kategori mod);
    void ubahData(Kategori mod);
    void hapusData(String id);
    
    Kategori getById(String id);
    List<Kategori> getByID(String id);
    List<Kategori> getByKategori(String kategori);
    List<Kategori> ambilData();
    String nomer();
}

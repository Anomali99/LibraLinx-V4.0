/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import dao.*;
import java.awt.Color;
import servis.*;
import java.awt.Font;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.table.TableColumnModel;
import parsisten.Buku;
import parsisten.Skripsi;
import tableModel.TabelDasbor;

/**
 *
 * @author fatiq
 */
public class MenuDasbor extends javax.swing.JPanel {

    /**
     * Creates new form MenuDasbor
     */
    private final ServiceBuku servisBuku = new DaoBuku();
    private final ServiceSkripsi servisSkripsi = new DaoSkripsi();
    private final ServiceAnggota servisAnggota = new DaoAnggota();
    private final ServicePeminjaman servisPeminjaman = new DaoPeminjaman();
    private final TabelDasbor tbl = new TabelDasbor();
    private JPanel jp;
    private JLabel lb1;
    private JLabel lb2;
    private JLabel lb3;
    private JLabel lb4;
    private JLabel lb5;
    
    public MenuDasbor(JPanel jp,JLabel lb1,JLabel lb2,JLabel lb3,JLabel lb4,JLabel lb5){
        initComponents();
        this.jp = jp;
        this.lb1 = lb1;
        this.lb2 = lb2;
        this.lb3 = lb3;
        this.lb4 = lb4;
        this.lb5 = lb5;
        
        tbl_conten.setModel(tbl);
        List<Buku> list = servisBuku.ambilData();
        List<Skripsi> list1 = servisSkripsi.ambilData();
        tbl.setData(list,list1);
        jLabel15.setText(String.valueOf(servisBuku.jumlahBuku()));
        jLabel6.setText(String.valueOf(servisSkripsi.jumlahSkripsi()));
        jLabel3.setText(String.valueOf(servisAnggota.jumlahAnggota()));
        jLabel12.setText(String.valueOf(servisPeminjaman.jumlahPeminjaman()));
        setColWidht();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_conten = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_conten = new javax.swing.JTable();
        btn_anggota = new custom.JPanelCustom();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_buku = new custom.JPanelCustom();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btn_skripsi = new custom.JPanelCustom();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_peminjaman = new custom.JPanelCustom();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        pn_conten.setBackground(new java.awt.Color(255, 255, 255));

        tbl_conten.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tbl_conten);

        btn_anggota.setBackground(new java.awt.Color(68, 50, 124));
        btn_anggota.setKananAtas(20);
        btn_anggota.setKananBawah(20);
        btn_anggota.setKiriAtas(20);
        btn_anggota.setKiriBawah(20);
        btn_anggota.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn_anggotaMouseMoved(evt);
            }
        });
        btn_anggota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_anggotaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_anggotaMouseExited(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/anggota1.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Anggota");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("0");

        javax.swing.GroupLayout btn_anggotaLayout = new javax.swing.GroupLayout(btn_anggota);
        btn_anggota.setLayout(btn_anggotaLayout);
        btn_anggotaLayout.setHorizontalGroup(
            btn_anggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_anggotaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(btn_anggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                .addContainerGap())
        );
        btn_anggotaLayout.setVerticalGroup(
            btn_anggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(btn_anggotaLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );

        btn_buku.setBackground(new java.awt.Color(68, 50, 124));
        btn_buku.setKananAtas(20);
        btn_buku.setKananBawah(20);
        btn_buku.setKiriAtas(20);
        btn_buku.setKiriBawah(20);
        btn_buku.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn_bukuMouseMoved(evt);
            }
        });
        btn_buku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_bukuMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_bukuMouseExited(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("0");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/book1.png"))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Buku");

        javax.swing.GroupLayout btn_bukuLayout = new javax.swing.GroupLayout(btn_buku);
        btn_buku.setLayout(btn_bukuLayout);
        btn_bukuLayout.setHorizontalGroup(
            btn_bukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_bukuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(btn_bukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        btn_bukuLayout.setVerticalGroup(
            btn_bukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(btn_bukuLayout.createSequentialGroup()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jLabel15))
        );

        btn_skripsi.setBackground(new java.awt.Color(68, 50, 124));
        btn_skripsi.setKananAtas(20);
        btn_skripsi.setKananBawah(20);
        btn_skripsi.setKiriAtas(20);
        btn_skripsi.setKiriBawah(20);
        btn_skripsi.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn_skripsiMouseMoved(evt);
            }
        });
        btn_skripsi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_skripsiMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_skripsiMouseExited(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/skripsi2.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Skripsi");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("0");

        javax.swing.GroupLayout btn_skripsiLayout = new javax.swing.GroupLayout(btn_skripsi);
        btn_skripsi.setLayout(btn_skripsiLayout);
        btn_skripsiLayout.setHorizontalGroup(
            btn_skripsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_skripsiLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(btn_skripsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
                .addContainerGap())
        );
        btn_skripsiLayout.setVerticalGroup(
            btn_skripsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(btn_skripsiLayout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jLabel6))
        );

        btn_peminjaman.setBackground(new java.awt.Color(68, 50, 124));
        btn_peminjaman.setKananAtas(20);
        btn_peminjaman.setKananBawah(20);
        btn_peminjaman.setKiriAtas(20);
        btn_peminjaman.setKiriBawah(20);
        btn_peminjaman.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn_peminjamanMouseMoved(evt);
            }
        });
        btn_peminjaman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_peminjamanMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_peminjamanMouseExited(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pengembalian1.png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Peminjaman");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("0");

        javax.swing.GroupLayout btn_peminjamanLayout = new javax.swing.GroupLayout(btn_peminjaman);
        btn_peminjaman.setLayout(btn_peminjamanLayout);
        btn_peminjamanLayout.setHorizontalGroup(
            btn_peminjamanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_peminjamanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(btn_peminjamanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        btn_peminjamanLayout.setVerticalGroup(
            btn_peminjamanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(btn_peminjamanLayout.createSequentialGroup()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jLabel12))
        );

        javax.swing.GroupLayout pn_contenLayout = new javax.swing.GroupLayout(pn_conten);
        pn_conten.setLayout(pn_contenLayout);
        pn_contenLayout.setHorizontalGroup(
            pn_contenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_contenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_contenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_contenLayout.createSequentialGroup()
                        .addComponent(btn_anggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(btn_buku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_skripsi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_peminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 323, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        pn_contenLayout.setVerticalGroup(
            pn_contenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_contenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_contenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_anggota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_buku, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_peminjaman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_skripsi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_conten, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_conten, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_anggotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_anggotaMouseClicked
        tekan(lb1);
        
        jp.removeAll();
        jp.add(new MenuAnggota());
        jp.repaint();
        jp.revalidate();
    }//GEN-LAST:event_btn_anggotaMouseClicked

    private void btn_bukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_bukuMouseClicked
        tekan(lb2);

        jp.removeAll();
        jp.add(new MenuBuku());
        jp.repaint();
        jp.revalidate();
    }//GEN-LAST:event_btn_bukuMouseClicked

    private void btn_peminjamanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_peminjamanMouseClicked
        tekan(lb4);
        
        jp.removeAll();
        jp.add(new MenuPeminjaman());
        jp.repaint();
        jp.revalidate();
    }//GEN-LAST:event_btn_peminjamanMouseClicked

    private void btn_skripsiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_skripsiMouseClicked
        tekan(lb3);
        
        jp.removeAll();
        jp.add(new MenuSkripsi());
        jp.repaint();
        jp.revalidate();
    }//GEN-LAST:event_btn_skripsiMouseClicked

    private void btn_anggotaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_anggotaMouseMoved
        btn_anggota.setBackground(new Color(150,50,124));
    }//GEN-LAST:event_btn_anggotaMouseMoved

    private void btn_bukuMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_bukuMouseMoved
        btn_buku.setBackground(new Color(150,50,124));
    }//GEN-LAST:event_btn_bukuMouseMoved

    private void btn_skripsiMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_skripsiMouseMoved
        btn_skripsi.setBackground(new Color(150,50,124));
    }//GEN-LAST:event_btn_skripsiMouseMoved

    private void btn_peminjamanMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_peminjamanMouseMoved
        btn_peminjaman.setBackground(new Color(150,50,124));
    }//GEN-LAST:event_btn_peminjamanMouseMoved

    private void btn_anggotaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_anggotaMouseExited
        btn_anggota.setBackground(new Color(68,50,124));
    }//GEN-LAST:event_btn_anggotaMouseExited

    private void btn_bukuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_bukuMouseExited
        btn_buku.setBackground(new Color(68,50,124));
    }//GEN-LAST:event_btn_bukuMouseExited

    private void btn_skripsiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_skripsiMouseExited
        btn_skripsi.setBackground(new Color(68,50,124));
    }//GEN-LAST:event_btn_skripsiMouseExited

    private void btn_peminjamanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_peminjamanMouseExited
        btn_peminjaman.setBackground(new Color(68,50,124));
    }//GEN-LAST:event_btn_peminjamanMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private custom.JPanelCustom btn_anggota;
    private custom.JPanelCustom btn_buku;
    private custom.JPanelCustom btn_peminjaman;
    private custom.JPanelCustom btn_skripsi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pn_conten;
    private javax.swing.JTable tbl_conten;
    // End of variables declaration//GEN-END:variables
   
    private void setColWidht() {
        int[] noCol = {0,1,2,3,5};
        int[] noColW = {35,80,200,150,70};
        
        TableColumnModel tblModel = tbl_conten.getColumnModel();
        for(int i = 0; i < noCol.length; i++){
        tblModel.getColumn(noCol[i]).setPreferredWidth(noColW[i]);
        tblModel.getColumn(noCol[i]).setMaxWidth(noColW[i]);
        tblModel.getColumn(noCol[i]).setMinWidth(noColW[i]);
        }
    }
    
    private void tekan(JLabel lb){
        lb.setFont(new Font("Segoe UI",1,14));                                        
        lb5.setFont(new Font("Segoe UI",0,14));    
    }
}

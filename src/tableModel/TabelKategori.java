/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tableModel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import parsisten.Kategori;

/**
 *
 * @author fatiq
 */
public class TabelKategori extends AbstractTableModel{

    private List<Kategori> list = new ArrayList<>();
    private final String[] headerName = {"NO", "ID Buku", "Katgori", "Jumlah Buku","Jumlah Skripsi"};
    
    public void clear (){
        list.clear();
        fireTableDataChanged();
    }
    
    public void setData(List<Kategori> list){
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    }
    
    public void setData(int index, Kategori mod){
        list.set(index, mod);
        fireTableRowsUpdated(index, index);
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return headerName.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex == 0){
            return "   "+ (rowIndex +1);
        } else {
            switch (columnIndex-1){
                case 0 : return list.get(rowIndex).getIdKategori();
                case 1 : return list.get(rowIndex).getKategori();
                case 2 : return list.get(rowIndex).jumlahBuku();
                case 3 : return list.get(rowIndex).jumlahSkripsi();
                default : return null;
            }
            
        }
    }
    
    
    @Override
    public String getColumnName(int column){
        if (column == 0){
            return "   "+headerName[column];
        } else {
            return headerName[column];
        }
    }
    
}

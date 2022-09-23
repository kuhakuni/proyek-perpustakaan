/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

/**
 *
 * @author THAZILA
 */
import java.util.ArrayList;
public class PeminjamanManager {
    
    public boolean save(ArrayList<BukuDipinjam> pinjaman){
        if(pinjaman.isEmpty()){
            return false;
        }else{
            Peminjaman pinjam = new Peminjaman();   
            pinjam.daftarBuku = pinjaman;
            return true;
        }
    }
    
}

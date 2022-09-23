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
public class PeminjamanController {
    
    public Peminjaman peminjaman;

    public PeminjamanController() {
        peminjaman = new Peminjaman();
    }
    
    public void showFormPeminjaman(){
        Perpustakaan.formPeminjaman = new FormPeminjaman();
        Perpustakaan.formPeminjaman.tampilkan();
        //Ketika form ditutup dan dibuka lagi hasilnya masih ada
    }
    
    public ArrayList<Buku> pinjamBuku(String judul) { 
        BukuProvider bukuProvider = new BukuProvider(); 
        //Try catch bermasalah dicoba masuk ke connection error
        //Kondisi masuk connection error?
        try { 
            ArrayList<Buku> listBuku = bukuProvider.selectBuku(judul); 
            if(listBuku.isEmpty()) 
            { 
                DialogUI dialogUI = new DialogUI("Buku tidak terdaftar!"); 
                dialogUI.pack(); 
                dialogUI.setLocationRelativeTo(null); 
                dialogUI.setVisible(true); 
            }  
            //Untuk langsung mengisi Model tabelnya
            else return listBuku; 
        } catch(Exception ex) { 
            DialogUI dialogUI = new DialogUI("Connection Error"); 
            dialogUI.pack(); 
            dialogUI.setLocationRelativeTo(null); 
            dialogUI.setVisible(true); 
        } 
        return null;
    }
    
        public ArrayList<Buku> cariBuku(String judul) {
        BukuProvider bukuProvider = new BukuProvider();
        try {
            ArrayList<Buku> listBuku = bukuProvider.selectBuku(judul);
            if(listBuku.isEmpty())
            {
                DialogUI dialogUI = new DialogUI("Buku tidak terdaftar!");
                dialogUI.pack();
                dialogUI.setLocationRelativeTo(null);
                dialogUI.setVisible(true);
            }
            else Perpustakaan.formPeminjaman.tampilPencarian(listBuku);
        } catch(Exception ex) {
            DialogUI dialogUI = new DialogUI("Connection Error!");
            dialogUI.pack();
            dialogUI.setLocationRelativeTo(null);
            dialogUI.setVisible(true);
        }
        return null;
    }
    
    public void pinjam(ArrayList<BukuDipinjam> pinjaman){
        PeminjamanManager peminjamanManager = new PeminjamanManager();
        if(peminjamanManager.save(Perpustakaan.controllerPeminjaman.peminjaman.daftarBuku)){
            DialogUI dialogUI = new DialogUI("Peminjaman berhasil!");
                dialogUI.pack();
                dialogUI.setLocationRelativeTo(null);
                dialogUI.setVisible(true);
                // the frame auto closed
                Perpustakaan.formPeminjaman.setVisible(false);
        }
    }
    
}

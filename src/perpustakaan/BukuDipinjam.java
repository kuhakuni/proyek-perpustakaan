/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

public class BukuDipinjam {
    private int lama;
    public Buku buku;

    public BukuDipinjam(Buku buku, int lama) {
        this.buku = buku;
        this.lama = lama;
    }

}

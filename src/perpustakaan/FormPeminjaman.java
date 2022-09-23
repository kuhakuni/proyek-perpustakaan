/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class FormPeminjaman extends javax.swing.JFrame {

        /**
         * Creates new form FormPeminjaman
         */
        public FormPeminjaman() {
                initComponents();
        }

        public void tampilkan() {
                if (!Perpustakaan.controllerPeminjaman.peminjaman.daftarBuku.isEmpty()) {
                        Object[] kolom = { "Judul" };
                        DefaultTableModel model = new DefaultTableModel(kolom, 0);
                        for (int i = 0; i < Perpustakaan.controllerPeminjaman.peminjaman.daftarBuku.size(); i++) {
                                Object[] row = { Perpustakaan.controllerPeminjaman.peminjaman.daftarBuku
                                                .get(i).buku.judul };
                                model.addRow(row);
                        }
                        // Fungsi digunakan untuk memanggil lagi buku yang dipinjam sebelumnya
                        daftarPinjam.setModel(model);
                        // Fungsi digunakan untuk memanggil berapa buku yang dipinjam sebelumnya
                        totalPinjam.setValue(daftarPinjam.getRowCount() + 1);
                }
                // Dispose on close digunakan ketika frame ditutup namun aplikasi tidak
                // tertutup!
                // Don't use exit_on_close in this frame!
                this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                this.pack();
                this.setLocationRelativeTo(null);
                this.setVisible(true);
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                fieldJudul = new javax.swing.JTextField();
                tombolCari = new javax.swing.JButton();
                totalPinjam = new javax.swing.JProgressBar();
                jScrollPane1 = new javax.swing.JScrollPane();
                daftarPinjam = new javax.swing.JTable();
                jScrollPane2 = new javax.swing.JScrollPane();
                daftarPencarian = new javax.swing.JTable();
                tombolPinjam = new javax.swing.JButton();
                tombolBatal = new javax.swing.JButton();
                waktuPinjam = new javax.swing.JTextField();
                tombolKonfirmasi = new javax.swing.JButton();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                jLabel7 = new javax.swing.JLabel();
                jLabel8 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                fieldJudul.setToolTipText("Silahkan masukkan buku yang ingin anda cari");

                tombolCari.setText("Cari");
                tombolCari.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                tombolCariMouseClicked(evt);
                        }
                });

                totalPinjam.setMaximum(10);
                totalPinjam.setToolTipText("Maksimal peminjaman adalah 10 buku");

                daftarPinjam.setModel(new javax.swing.table.DefaultTableModel(

                ));
                jScrollPane1.setViewportView(daftarPinjam);

                daftarPencarian.setModel(new javax.swing.table.DefaultTableModel(

                ));
                jScrollPane2.setViewportView(daftarPencarian);

                tombolPinjam.setText("Tambah");
                tombolPinjam.setToolTipText("Tambahkan ke daftar pinjam");
                tombolPinjam.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                tombolPinjamMouseClicked(evt);
                        }
                });

                tombolBatal.setText("Batal");
                tombolBatal.setToolTipText("Hilangkan dari daftar pinjam");
                tombolBatal.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                tombolBatalMouseClicked(evt);
                        }
                });

                waktuPinjam.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                waktuPinjam.setToolTipText("Lama waktu peminjaman maksimal waktu peminjaman adalah 3 hari");

                tombolKonfirmasi.setText("Pinjam");
                tombolKonfirmasi.setToolTipText("Konfirmasi buku yang akan dipinjam");
                tombolKonfirmasi.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                tombolKonfirmasiMouseClicked(evt);
                        }
                });

                jLabel1.setText("Total Buku Pinjaman");

                jLabel2.setText("10");

                jLabel3.setText("0");

                jLabel4.setText("Judul Buku");

                jLabel5.setText("Lama Pinjam Buku");

                jLabel6.setText("Pencarian Buku");

                jLabel7.setText("Buku akan dipinjam");

                jLabel8.setText("Hari");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                .addComponent(jScrollPane2,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                144,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addGap(16, 16, 16)
                                                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                .addComponent(tombolPinjam,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                .addComponent(tombolBatal,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                105,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                                                .addGap(10, 10, 10)
                                                                                                                                                                .addComponent(waktuPinjam,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                43,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                .addPreferredGap(
                                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                                .addComponent(jLabel8))
                                                                                                                                                .addComponent(jLabel5)))
                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                .addGap(27, 27, 27)
                                                                                                                                .addComponent(jLabel6)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                Short.MAX_VALUE)))
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                .addGap(12, 12, 12)
                                                                                                                                .addComponent(jScrollPane1,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                144,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                layout
                                                                                                                                                .createSequentialGroup()
                                                                                                                                                .addPreferredGap(
                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                .addComponent(jLabel7)
                                                                                                                                                .addGap(17, 17, 17))))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(fieldJudul,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                131,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(tombolCari,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                81,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                false)
                                                                                                                .addComponent(totalPinjam,
                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                layout
                                                                                                                                                .createSequentialGroup()
                                                                                                                                                .addGap(4, 4, 4)
                                                                                                                                                .addComponent(jLabel3,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                14,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addPreferredGap(
                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                .addComponent(jLabel1)
                                                                                                                                                .addPreferredGap(
                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                .addComponent(jLabel2))))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(jLabel4)
                                                                                                .addGap(0, 0, Short.MAX_VALUE)))
                                                                .addContainerGap())
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                                .createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(tombolKonfirmasi,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                105,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(26, 26, 26)));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(14, 14, 14)
                                                                .addComponent(jLabel4)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(fieldJudul,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(tombolCari))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(jLabel1)
                                                                                                                .addComponent(jLabel2)
                                                                                                                .addComponent(jLabel3))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(totalPinjam,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel6)
                                                                                .addComponent(jLabel7,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                14,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGap(4, 4, 4)
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(jScrollPane1,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                247,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jScrollPane2,
                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                247,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                layout
                                                                                                                .createSequentialGroup()
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                .addComponent(jLabel5)
                                                                                                                .addGap(4, 4, 4)
                                                                                                                .addGroup(layout
                                                                                                                                .createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                                .addComponent(waktuPinjam,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addComponent(jLabel8))
                                                                                                                .addGap(18, 18, 18)
                                                                                                                .addComponent(tombolPinjam)
                                                                                                                .addGap(18, 18, 18)
                                                                                                                .addComponent(tombolBatal)
                                                                                                                .addGap(66, 66, 66)))
                                                                .addComponent(tombolKonfirmasi)
                                                                .addGap(0, 22, Short.MAX_VALUE)));

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void tombolCariMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tombolCariMouseClicked
                String judul = fieldJudul.getText();
                Perpustakaan.controllerPeminjaman.cariBuku(judul);
        }// GEN-LAST:event_tombolCariMouseClicked

        private void tombolPinjamMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tombolPinjamMouseClicked
                // validasi waktu yang masuk
                try {
                        int pinjam = Integer.parseInt(waktuPinjam.getText());
                        if (pinjam <= 0 || pinjam > 3) {
                                DialogUI dialogUI = new DialogUI(
                                                "Lama waktu peminjaman adalah minimal 1 hari dan maksimal 3 hari!");
                                dialogUI.pack();
                                dialogUI.setLocationRelativeTo(null);
                                dialogUI.setVisible(true);
                                return;
                        }
                        int col = 0;
                        int row = daftarPencarian.getSelectedRow();
                        String judul = daftarPencarian.getModel().getValueAt(row, col).toString();
                        ArrayList<Buku> selected = Perpustakaan.controllerPeminjaman.pinjamBuku(judul);
                        Buku select = selected.get(0); // requirementnya objek Buku
                        totalPinjam.setValue(daftarPinjam.getRowCount() + 1);
                        tambahBuku(select, pinjam);
                }
                // jika tidak valid maka laksanakan eksepsi notValidTime
                catch (Exception notValidTime) {
                        DialogUI dialogUI = new DialogUI("Wajib mengisi lama peminjaman buku!");
                        dialogUI.pack();
                        dialogUI.setLocationRelativeTo(null);
                        dialogUI.setVisible(true);
                }

        }// GEN-LAST:event_tombolPinjamMouseClicked

        private void tombolBatalMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tombolBatalMouseClicked
                // Try untuk melihat apakah user sudah memilih buku yang mau dikembalikan
                try {
                        int row = daftarPinjam.getSelectedRow();
                        totalPinjam.setValue(daftarPinjam.getRowCount() - 1);
                        hapusBuku(row);
                } catch (Exception notValidSelection) {
                        DialogUI dialogUI = new DialogUI("Pilih buku yang akan dibatalkan!");
                        dialogUI.pack();
                        dialogUI.setLocationRelativeTo(null);
                        dialogUI.setVisible(true);
                }
        }// GEN-LAST:event_tombolBatalMouseClicked

        private void tombolKonfirmasiMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tombolKonfirmasiMouseClicked
                // Ketika jumlah buku > 10
                if (daftarPinjam.getRowCount() > 10) {
                        DialogUI dialogUI = new DialogUI("Jumlah buku yang dipinjam melebihi batas maksimal!");
                        dialogUI.pack();
                        dialogUI.setLocationRelativeTo(null);
                        dialogUI.setVisible(true);
                        return;
                        // Ketika buku = 0
                } else if (daftarPinjam.getRowCount() == 0) {
                        DialogUI dialogUI = new DialogUI("Harap mengisi judul buku!");
                        dialogUI.pack();
                        dialogUI.setLocationRelativeTo(null);
                        dialogUI.setVisible(true);
                        return;
                }
                DefaultTableModel model = (DefaultTableModel) daftarPinjam.getModel();

                Perpustakaan.controllerPeminjaman.pinjam(Perpustakaan.controllerPeminjaman.peminjaman.daftarBuku);
        }// GEN-LAST:event_tombolKonfirmasiMouseClicked

        public void tambahBuku(Buku buku, int lama) {
                Object[] kolom = { "Judul" };
                DefaultTableModel model;
                if (daftarPinjam.getRowCount() <= 0) {
                        model = new DefaultTableModel(kolom, 0);
                } else {
                        model = (DefaultTableModel) daftarPinjam.getModel();
                }
                BukuDipinjam bukuPinjaman = new BukuDipinjam(buku, lama);
                Perpustakaan.controllerPeminjaman.peminjaman.daftarBuku.add(bukuPinjaman);
                Object[] baris = { buku.judul };
                model.addRow(baris);
                daftarPinjam.setModel(model);
        }

        public void tampilPinjaman(ArrayList<Buku> pinjaman) {
                Object[] kolom = { "Judul" };
                DefaultTableModel model = new DefaultTableModel(kolom, 0);
                for (Buku buku : pinjaman) {
                        Object[] baris = { buku.judul };
                        model.addRow(baris);
                }
                daftarPinjam.setModel(model);
        }

        public void tampilPencarian(ArrayList<Buku> pinjaman) {
                Object[] kolom = { "Judul" };
                DefaultTableModel model = new DefaultTableModel(kolom, 0);
                for (Buku buku : pinjaman) {
                        Object[] baris = { buku.judul };
                        model.addRow(baris);
                }
                daftarPencarian.setModel(model);
        }

        public void hapusBuku(int row) {
                DefaultTableModel model = (DefaultTableModel) daftarPinjam.getModel();
                model.removeRow(row);
                daftarPinjam.setModel(model);
                Perpustakaan.controllerPeminjaman.peminjaman.daftarBuku.remove(row);
        }

        /**
         * @param args the command line arguments
         */

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JTable daftarPencarian;
        private javax.swing.JTable daftarPinjam;
        private javax.swing.JTextField fieldJudul;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JScrollPane jScrollPane2;
        private javax.swing.JButton tombolBatal;
        private javax.swing.JButton tombolCari;
        private javax.swing.JButton tombolKonfirmasi;
        private javax.swing.JButton tombolPinjam;
        private javax.swing.JProgressBar totalPinjam;
        private javax.swing.JTextField waktuPinjam;
        // End of variables declaration//GEN-END:variables
}

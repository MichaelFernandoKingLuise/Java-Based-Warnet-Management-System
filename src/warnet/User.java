package warnet;

import javax.swing.JOptionPane;

public class User {
    public String nama;
    public String nomorHP;  

    // MEMINTA NAMA USER UNTUK DIINPUTKAN
    public void inputNama() {
        // MENGAMBIL INPUTAN NAMA USER
        nama = JOptionPane.showInputDialog(null, "===================================\n          SELAMAT DATANG DI WIBUNET      \n===================================\nMasukkan Nama Anda:", "WibuNet", JOptionPane.PLAIN_MESSAGE);
        if (nama == null) {
            // OUTPUT JIKA USER KLIK CANCEL
            JOptionPane.showMessageDialog(null, "=== MAAF, HARAP MENDAFTAR DARI AWAL ===", "WibuNet", JOptionPane.PLAIN_MESSAGE);
            System.exit(0);
        }
    }

    // MEMINTA NO HP USER UNTUK DIINPUTKAN
    public void inputNomorHP() {
        // MENGAMBIL INPUTAN NO HP USER 
        nomorHP = JOptionPane.showInputDialog(null, "===================================\n          SELAMAT DATANG DI WIBUNET      \n===================================\nMasukkan Nomor HP Anda:", "WibuNet", JOptionPane.PLAIN_MESSAGE);
        if (nomorHP == null) {
            // OUTPUT JIKA USER KLIK CANCEL
            JOptionPane.showMessageDialog(null, "=== MAAF, HARAP MENDAFTAR DARI AWAL ===", "WibuNet", JOptionPane.PLAIN_MESSAGE);
            System.exit(0);
        }
    }

    // DIGUNAKAN NANTI UNTUK MENDAPATKAN NAMA YANG DIINPUTKAN USER
    public String getNama() {
        return nama;
    }

    // DIGUNAKAN NANTI UNTUK MENDAPATKAN NO HP YANG DIINPUTKAN USER
    public String getNomorHP() {
        return nomorHP;
    }
}

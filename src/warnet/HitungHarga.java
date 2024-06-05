package warnet;

import java.time.LocalDate;
import javax.swing.JOptionPane;

public class HitungHarga {

    private String pilawal3;
    private String pilawal4;
    private String pilawal5;
    private String pilawal6;
    private String namaPaket;
    private int hargaPaket;
    private int totalHarga;
    private int hargaSewa;
    private LocalDate currentDate = LocalDate.now();

    // SETTER AGAR PROPERTI namaPaket HANYA BISA DIISI SAAT METHOD setNamaPaket DIEKSEKUSI
    public void setNamaPaket(String namaPaket) {
        this.namaPaket = namaPaket;
    }

    // DIGUNAKAN UNTUK MENGAMBIL VALUE NAMA PAKET
    public String getNamaPaket() {
        return namaPaket;
    }

    // SETTER AGAR PROPERTI hargaPaket HANYA BISA DIISI SAAT METHOD setHargaPaket DIEKSEKUSI
    public void setHargaPaket(int hargaPaket) {
        this.hargaPaket = hargaPaket;
    }

    // DIGUNAKAN UNTUK MENGAMBIL VALUE HARGA PAKET
    public int getHargaPaket() {
        return hargaPaket;
    }
    
    // SETTER AGAR PROPERTI totalHarga HANYA BISA DIISI SAAT METHOD setTotalHarga DIEKSEKUSI
    public void setTotalHarga(int totalHarga) {
        this.totalHarga = totalHarga;
    }

    // DIGUNAKAN UNTUK MENGAMBIL VALUE TOTAL HARGA
    public int getTotalHarga() {
        return totalHarga;
    }
    
    // SETTER AGAR PROPERTI hargaSewa HANYA BISA DIISI SAAT METHOD setTotalSewa DIEKSEKUSI
    public void setHargaSewa(int hargaSewa) {
        this.hargaSewa = hargaSewa;
    }
    
    // DIGUNAKAN UNTUK MENGAMBIL VALUE HARGA SEWA
    public int getHargaSewa() {
        return hargaSewa;
    }

    public void hitungHarga(User user, Waktu waktu, TipeWarnet tipeWarnet) {
        // PILIHAN MENAMBAH MAKANAN 
        String[] pil3 = {"1", "2"};
        pilawal3 = (String) JOptionPane.showInputDialog(null,
                "<html><center>"
                + "=================== RINCIAN STRUK ANDA ===================<br/>"
                + "Nama         : " + user.getNama() + "<br/>"
                + "No HP        : " + user.getNomorHP() + "<br/>"
                + "Tanggal      : " + currentDate + "<br/>"
                + "Lama Bermain : " + waktu.getWaktuSewa() + " Menit<br/>"
                + "Tipe         : " + tipeWarnet.getNamaTipe() + "<br/>"
                + "=========================================================<<br/>"
                + "APAKAH ANDA INGIN MENAMBAH MAKANAN ?<br/>"
                + "1. Iya<br/>"
                + "2. Tidak</center></html>",
                "WibuNet",
                JOptionPane.PLAIN_MESSAGE,
                null,
                pil3,
                pil3[0]
        );

        if (pilawal3 == null) {
            // OUTPUT JIKA USER KLIK CANCEL
            JOptionPane.showMessageDialog(null, "=== MAAF, HARAP MENDAFTAR DARI AWAL ===", "WibuNet", JOptionPane.PLAIN_MESSAGE);
            System.exit(0);
        }

        switch (pilawal3) {
            case "1":
                // PILIHAN PAKET MAKANAN
                String[] pil4 = {"A", "B", "C", "D"};
                String pilawal4 = (String) JOptionPane.showInputDialog(null,
                        "<html><center>"
                        + "================= WIBUNET FOOD & DRINK MENU =================<br/>"
                        + "Paket A : Kopi + Gorengan = 8.000<br/>"
                        + "Paket B : Teh Obeng + Indomie Goreng = 14.000<br/>"
                        + "Paket C : Es Milo + Nasi Goreng + Keripik = 23.000<br/>"
                        + "Paket D : Es Jeruk + Nasi + Ayam Bakar + Tahu + Tempe = 30.000<br/>"
                        + "=============================================================<br/>"
                        + "MASUKKAN PILIHAN PAKET ANDA ( A | B | C | D )</center></html>",
                        "WibuNet",
                        JOptionPane.PLAIN_MESSAGE,
                        null,
                        pil4,
                        pil4[0]
                );

                if (pilawal4 == null) {
                    // OUTPUT JIKA USER KLIK CANCEL
                    JOptionPane.showMessageDialog(null, "=== MAAF, HARAP MENDAFTAR DARI AWAL ===", "WibuNet", JOptionPane.PLAIN_MESSAGE);
                    System.exit(0);
                }

                // MENGUBAH INPUTAN USER MENJADI TIPE DATA CHAR DAN MENJADI HURUF KAPITAL
                char makanan = pilawal4.toUpperCase().charAt(0);
                switch (makanan) {
                    case 'A':
                        setNamaPaket("Paket A (Kopi + Gorengan)");
                        setHargaPaket(8000);
                        break;
                    case 'B':
                        setNamaPaket("Paket B (Teh Obeng + Indomie Goreng)");
                        setHargaPaket(14000);
                        break;
                    case 'C':
                        setNamaPaket("Paket C (Es Milo + Nasi Goreng + Keripik)");
                        setHargaPaket(23000);
                        break;
                    case 'D':
                        setNamaPaket("Paket D (Es Jeruk + Nasi + Ayam Bakar + Tahu + Tempe)");
                        setHargaPaket(30000);
                        break;
                }

                // PILIHAN STRUK APAKAH SUDAH SESUAI (BELI MAKANAN)
                String[] pil5 = {"1", "2"};
                pilawal5 = (String) JOptionPane.showInputDialog(null,
                        "<html><center>"
                        + "=================== RINCIAN STRUK ANDA ===================<br/>"
                        + "Nama         : " + user.getNama() + "<br/>"
                        + "No HP        : " + user.getNomorHP() + "<br/>"
                        + "Tanggal      : " + currentDate + "<br/>"
                        + "Lama Bermain : " + waktu.getWaktuSewa() + " Menit<br/>"
                        + "Tipe         : " + tipeWarnet.getNamaTipe() + "<br/>"
                        + "Pilihan Paket Makanan Dan Minuman : " + getNamaPaket() + "<br/>"
                        + "=========================================================<br/>"
                        + "APAKAH PESANAN ANDA SUDAH SESUAI ?<br/>"
                        + "1. Iya<br/>"
                        + "2. Tidak</center></html>",
                        "WibuNet",
                        JOptionPane.PLAIN_MESSAGE,
                        null,
                        pil5,
                        pil5[0]
                );

                if (pilawal5 == null) {
                    // OUTPUT JIKA USER KLIK CANCEL
                    JOptionPane.showMessageDialog(null, "=== MAAF, HARAP MENDAFTAR DARI AWAL ===", "WibuNet", JOptionPane.PLAIN_MESSAGE);
                    System.exit(0);
                }

                switch (pilawal5) {
                    // JIKA PESANAN SUDAH SESUAI MAKA STRUK TERCETAK
                    case "1":
                        hargaSewa = tipeWarnet.getHargaPilihan() * waktu.getWaktuSewa();
                        setHargaSewa(hargaSewa);
                        totalHarga = hargaSewa + hargaPaket;
                        setTotalHarga(totalHarga);
                        //STRUK FINAL 
                        JOptionPane.showMessageDialog(null,
                                "<html><center>=================== RINCIAN STRUK ANDA ===================<br>"
                                + "Nama         : " + user.getNama() + "<br>"
                                + "No HP        : " + user.getNomorHP() + "<br>"
                                + "Tanggal      : " + currentDate + "<br>"
                                + "Lama Bermain : " + waktu.getWaktuSewa() + " Menit<br>"
                                + "Tipe         : " + tipeWarnet.getNamaTipe() + "<br>"
                                + "Pilihan Paket Makanan Dan Minuman : " + getNamaPaket() + "<br>"
                                + "Total Harga : Rp. " + getTotalHarga() + "<br>"
                                + "=========================================================<br>"
                                + " WIBUNET | TERIMA KASIH TELAH MEMILIH KAMI | WIBUNET</center></html>",
                                "WibuNet", JOptionPane.PLAIN_MESSAGE
                        );

                        break;
                    case "2":
                        // JIKA PESANAN TIDAK SESUAI, MAKA PROGRAM DITUTUP
                        JOptionPane.showMessageDialog(null, "=== MAAF, HARAP MENDAFTAR DARI AWAL ===");
                        System.exit(0);
                        break;
                }
                break;
            case "2":
                // PILIHAN STRUK APAKAH SUDAH SESUAI (TIDAK BELI MAKANAN)
                String[] pil6 = {"1", "2"};
                pilawal6 = (String) JOptionPane.showInputDialog(null,
                        "<html><center>"
                        + "=================== RINCIAN STRUK ANDA ===================<br/>"
                        + "Nama         : " + user.getNama() + "<br/>"
                        + "No HP        : " + user.getNomorHP() + "<br/>"
                        + "Tanggal      : " + currentDate + "<br/>"
                        + "Lama Bermain : " + waktu.getWaktuSewa() + " Menit<br/>"
                        + "Tipe         : " + tipeWarnet.getNamaTipe() + "<br/>"
                        + "=========================================================<br/>"
                        + "APAKAH PESANAN ANDA SUDAH SESUAI ?<br/>"
                        + "1. Iya<br/>"
                        + "2. Tidak</center></html>",
                        "WibuNet",
                        JOptionPane.PLAIN_MESSAGE,
                        null,
                        pil6,
                        pil6[0]
                );

                if (pilawal6 == null) {
                    // OUTPUT JIKA USER KLIK CANCEL
                    JOptionPane.showMessageDialog(null, "=== MAAF, HARAP MENDAFTAR DARI AWAL ===", "WibuNet", JOptionPane.PLAIN_MESSAGE);
                    System.exit(0);
                }

                switch (pilawal6) {
                    // JIKA PESANAN SUDAH SESUAI MAKA STRUK TERCETAK
                    case "1":
                        hargaSewa = tipeWarnet.getHargaPilihan() * waktu.getWaktuSewa();
                        setHargaSewa(hargaSewa);
                        JOptionPane.showMessageDialog(null,
                                "<html><center>=================== RINCIAN STRUK ANDA ===================<br>"
                                + "Nama         : " + user.getNama() + "<br>"
                                + "No HP        : " + user.getNomorHP() + "<br>"
                                + "Tanggal      : " + currentDate + "<br>"
                                + "Lama Bermain : " + waktu.getWaktuSewa() + " Menit<br>"
                                + "Tipe         : " + tipeWarnet.getNamaTipe() + "<br>"
                                + "Total Harga : Rp. " + getHargaSewa() + "<br>"
                                + "=========================================================<br>"
                                + " WIBUNET | TERIMA KASIH TELAH MEMILIH KAMI | WIBUNET</center></html>",
                                "WibuNet", JOptionPane.PLAIN_MESSAGE
                        );
                        break;
                    case "2":
                        // JIKA PESANAN TIDAK SESUAI, MAKA PROGRAM DITUTUP
                        JOptionPane.showMessageDialog(null, "=== MAAF, HARAP MENDAFTAR DARI AWAL ===");
                        System.exit(0);
                        break;
                }
        }
    }

}

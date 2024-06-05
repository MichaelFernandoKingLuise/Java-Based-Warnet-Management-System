package warnet;

import javax.swing.JOptionPane;

public class Waktu {

    private String pilawal2;
    private int waktuSewa;

    // SETTER AGAR PROPERTI waktuSewa HANYA BISA DIISI SAAT METHOD setWaktuSewa DIEKSEKUSI
    public void setWaktuSewa(int waktuSewa) {
        this.waktuSewa = waktuSewa;
    }

    // DIGUNAKAN UNTUK MENGAMBIL VALUE WAKTU SEWA 
    public int getWaktuSewa() {
        return waktuSewa;
    }

    // METHOD setWaktuSewa DIEKSEKUSI JIKA USER MEMILIH WAKTU SEWA, TERMASUK INPUT SENDIRI (PILIHAN KE 5)
    public void inputWaktuSendiri() {
        String waktuSen = JOptionPane.showInputDialog("Masukkan Waktu Yang Ingin Anda Input Sendiri (Menit) : ");
        // MENGUBAH INPUTAN USER MENJADI TIPE DATA INTEGER
        int waktuSendiri = Integer.parseInt(waktuSen);
        // METHOD setWaktuSewa
        setWaktuSewa(waktuSendiri);
    }

    // MEMUNCULKAN PILIHAN WAKTU
    public void pilihWaktu() {
        // PILIHAN WAKTU WARNET
        String[] pil2 = {"1", "2", "3", "4", "5"};
        pilawal2 = (String) JOptionPane.showInputDialog(null,
                "<html><center>"
                + "=========== PILIHAN WAKTU BERMAIN ===========<br/>"
                + "1. 15 Menit<br/>"
                + "2. 30 Menit<br/>"
                + "3. 60 Menit<br/>"
                + "4. 120 Menit<br/>"
                + "5. Input Sendiri</center></html>",
                "WibuNet",
                JOptionPane.PLAIN_MESSAGE,
                null,
                pil2,
                pil2[0]
        );

        if (pilawal2 == null) {
            // OUTPUT JIKA USER KLIK CANCEL
            JOptionPane.showMessageDialog(null, "=== MAAF, HARAP MENDAFTAR DARI AWAL ===", "WibuNet", JOptionPane.PLAIN_MESSAGE);
            System.exit(0);
        }

        switch (pilawal2) {
            case "1":
                setWaktuSewa(15);
                break;
            case "2":
                setWaktuSewa(30);
                break;
            case "3":
                setWaktuSewa(60);
                break;
            case "4":
                setWaktuSewa(120);
                break;
            case "5":
                inputWaktuSendiri();
                break;
        }
    }

}

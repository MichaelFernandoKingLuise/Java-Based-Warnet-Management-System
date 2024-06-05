package warnet;

import javax.swing.JOptionPane;

public class TipeWarnet {

    private String pil1;
    private String pilawal1;
    private String namaTipe;
    private int hargaPilihan;

    // SETTER AGAR PROPERTI hargaPilihan TIDAK BISA DIUBAH OLEH USER
    public void setHargaPilihan(int hargaPilihan) {
        this.hargaPilihan = hargaPilihan;
    }

    // DIGUNAKAN UNTUK MENGAMBIL VALUE HARGA PILIHAN
    public int getHargaPilihan() {
        return hargaPilihan;
    }

    // SETTER AGAR PROPERTI namaTipe TIDAK BISA DIUBAH OLEH USER
    public void setNamaTipe(String namaTipe) {
        this.namaTipe = namaTipe;
    }

    // DIGUNAKAN UNTUK MENGAMBIL VALUE NAMA TIPE
    public String getNamaTipe() {
        return namaTipe;
    }

    // MEMUNCULKAN PILIHAN TIPE
    public void pilihTipe() {
        // PILIHAN TIPE WARNET    
        String[] pil1 = {"1", "2", "3"};
        pilawal1 = (String) JOptionPane.showInputDialog(null,
                "<html><center>"
                + "================================ PILIHAN TIPE WIBUNET ================================<br>"
                + "1. Reguler (Rp. 6.000/Jam)<br/>"
                + "Processor: Intel Core i3‑10105F<br/>"
                + "Motherboard: Gigabyte Z490 AORUS ELITE<br/>"
                + "RAM: TEAM T-Force Night Hawk 8GB<br/>"
                + "VGA: GTX 1050 Ti Twin Edge 8GB<br/>"
                + "Case: Cube Gaming FRINS Tempered Glass<br/>"
                + "Bandwidth: 30 Mbps<br/>"
                + "Room: Standard Room <br/>====================================<br/>"
                + "2. Premium (Rp. 9.000/Jam)<br/>"
                + "Processor: Intel Core i5‑1155G7<br/>"
                + "Motherboard: Gigabyte Z490 AORUS ELITE<br/>"
                + "RAM: TEAM T-Force Night Hawk 16GB<br/>"
                + "VGA: RTX 2060 Ti Twin Edge 8GB<br/>"
                + "Case: Cube Gaming FRINS Tempered Glass<br/>"
                + "Bandwidth: 50 Mbps<br/>"
                + "Room: AC Room<br/>====================================<br/>"
                + "3. VIP (Rp. 12.000/Jam)<br/>"
                + "Processor: Intel Core i7-10700KF<br/>"
                + "Motherboard: Gigabyte Z490 AORUS ELITE<br/>"
                + "RAM: TEAM T-Force Night Hawk 16GB<br/>"
                + "VGA: RTX 3060 Ti Twin Edge 8GB<br/>"
                + "Case: Cube Gaming FRINS Tempered Glass<br/>"
                + "Bandwidth: 100 Mbps<br/>"
                + "Room: Private AC Room<br/>====================================<br/>"
                + "MASUKKAN PILIHAN ANDA: </center></html>",
                "WibuNet",
                JOptionPane.PLAIN_MESSAGE,
                null,
                pil1,
                pil1[0]
        );

        if (pilawal1 == null) {
            // OUTPUT JIKA USER KLIK CANCEL
            JOptionPane.showMessageDialog(null, "=== MAAF, HARAP MENDAFTAR DARI AWAL ===", "WibuNet", JOptionPane.PLAIN_MESSAGE);
            System.exit(0);
        }

        switch (pilawal1) {
            case "1":
                // HARGA PILIHAN PER MENIT
                setHargaPilihan(100);
                setNamaTipe("Reguler");
                break;
            case "2":
                // HARGA PILIHAN PER MENIT
                setHargaPilihan(150);
                setNamaTipe("Reguler");
                break;
            case "3":
                // HARGA PILIHAN PER MENIT
                setHargaPilihan(200);
                setNamaTipe("VIP");
                break;
        }
    }

}

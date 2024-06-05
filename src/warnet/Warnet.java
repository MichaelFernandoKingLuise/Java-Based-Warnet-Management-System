package warnet;

public class Warnet {

    public static void main(String[] args) {

        User user = new User();
        user.inputNama();
        user.inputNomorHP();

        TipeWarnet tipeWarnet = new TipeWarnet();
        tipeWarnet.pilihTipe();

        Waktu waktu = new Waktu();
        waktu.pilihWaktu();

        HitungHarga hitungHarga = new HitungHarga();
        hitungHarga.hitungHarga(user, waktu, tipeWarnet);
    }
}

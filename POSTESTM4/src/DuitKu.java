public class DuitKu {
    String nama;
    String noHP;
    int saldo;

    public DuitKu(String nama, String noHP) {
        this.nama = nama;
        this.noHP = noHP;
        this.saldo = 0; // cek saldo awal selalu 0
    }

    public void setor(int jumlah) {
        if (jumlah < 10000) {
            System.out.println(" Setoran ditolak! Minimal Rp10.000");
        } else {
            saldo += jumlah;
            System.out.println(" Setor berhasil: Rp" + jumlah);
        }
    }

    public void bayar(int jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println(" Pembayaran berhasil: Rp" + jumlah);
        } else {
            System.out.println(" Pembayaran gagal! Saldo tidak cukup");
        }
    }

    public int getSaldo() {
        return saldo;
    }

    public void info() {
        System.out.println("Nama: " + nama);
        System.out.println("No HP: " + noHP);
        System.out.println("Saldo: Rp" + saldo);
    }
}
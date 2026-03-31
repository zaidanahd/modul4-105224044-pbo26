public class Main {
    public static void main(String[] args) {
        // Soal 1
        MesinKopi mesinLobby = new MesinKopi();

        // lihat stok awal
        mesinLobby.tampilkanStok();

        // isi ulang bahan buat kopi
        mesinLobby.isiUlangBahan(20, 100, 150);

        // menampilkan stok abis isi ulang
        mesinLobby.tampilkanStok();

        // cek udah cukup buat atau belum cappuccino
        if (mesinLobby.cekKetersediaanCappuccino()) {
            System.out.println("Bahan cukup untuk membuat Cappuccino ");
        } else {
            System.out.println("Bahan tidak cukup untuk membuat Cappuccino ");
        }
    }
}
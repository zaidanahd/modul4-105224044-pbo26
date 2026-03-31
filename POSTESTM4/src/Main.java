public class Main {
    public static void main(String[] args) {

        // pendaftaran pelanggan
        DuitKu anton = new DuitKu("Anton", "081234567");

        System.out.println("=== DATA AWAL ===");
        anton.info();

        System.out.println("\n=== Anton setor Rp50.000 ===");
        anton.setor(50000);

        System.out.println("\n=== Anton coba bayar Rp60.000 ===");
        anton.bayar(60000);

        System.out.println("\n=== Anton setor Rp20.000 ===");
        anton.setor(20000);

        System.out.println("\n=== Anton coba bayar Rp60.000 lagi ===");
        anton.bayar(60000);

        // 6. Tampilkan saldo akhir
        System.out.println("\n=== HASIL AKHIR ===");
        anton.info();
    }
}
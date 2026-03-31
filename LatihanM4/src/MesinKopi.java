public class MesinKopi {
   //no 1
    float bijiKopi; 
    float air;      
    float susu;     
    //no 4
    public MesinKopi() {
        this.bijiKopi = 0;
        this.air = 0;
        this.susu = 0;
    }
    //no 2
    public void isiUlangBahan(int tambahKopi, int tambahAir, int tambahSusu) {
        this.bijiKopi += tambahKopi;
        this.air += tambahAir;
        this.susu += tambahSusu;

        System.out.println("Bahan berhasil diisi ulang!");
    }
    //no 3
    public boolean cekKetersediaanCappuccino() {
        return (bijiKopi >= 15 && air >= 50 && susu >= 100);
    }

    public void tampilkanStok() {
        System.out.println("Stok saat ini:");
        System.out.println("Biji kopi: " + bijiKopi + " gram");
        System.out.println("Air: " + air + " ml");
        System.out.println("Susu: " + susu + " ml");
    }
}
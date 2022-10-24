public class OperasiBoolean {
    public static void main(String[] args) {
        

        // Operasi boolean adalah operasi yang digunakan untuk 2 data boolean
        // Operasi &&
        // Operasi ||
        // Operasi !


        var absen = 70;
        var nilaiAkhir = 80;


        var lulusAbsen = absen >= 75;
        var lulusNilaiAkhir = nilaiAkhir >= 75;

        var lulus = lulusAbsen && lulusNilaiAkhir;
        System.out.println(lulus);




    }
}

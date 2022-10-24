public class IfElseIfStatement {

    public static void main(String[] args) {
        
        // Else if Statement

        // Kada dalam if, kita butuh membuat beberapa kondisi
        // Kasus seperti ini di java kita bisa menggunakan else if expression
        // Else if di java bisa lebih dari satu

        var nilai = 80;
        var absen = 80;

        if (nilai >= 80 && absen >= 80) {
            System.out.println("Nilai anda A");
        }
        else if (nilai >= 70 && absen >= 70) {
            System.out.println("Nilai anda B");

        }

        else if (nilai >= 60 && absen >= 60) {
            System.out.println("Nilai anda C");
        }

    }
    
}

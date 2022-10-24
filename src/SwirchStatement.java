public class SwirchStatement {

    public static void main(String[] args) {
        
        // Switch Statement

        // Kadng kita hanya butuh menggunakan kondisi sederhana di if statement, seperti hanya menggunakan perbandingan ==
        // Switch adalah statement percabangan yang sma dengan if, namun lebih sederhana cara pembuatannya
        // Kondisi switch statement hanya untuk perbandingan ==


        var nilai = "A";

        switch (nilai) {
            case "A" :
            System.out.println("Wow, anda lulis dengan baik");
            break;

            case "B" :
            case "C" :
            System.out.println("Nilai anda cukup baik");
            break;
            case "D" : 
            System.out.println("Anda tidak lulus");
            default :
            System.out.println("Mungkin anda salah jurusan");
            break;

            // Switch Lambda
            // Lebih mempermudah saat penggunaan swicth ecpression karena kita tidak perlu lagi menggunakan kata kunci break




        }
    }
    
}

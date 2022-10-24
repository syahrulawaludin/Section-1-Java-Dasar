public class MethodVariableArgument {


    public static void main(String[] args) {
        
        // Method Variabel Argument

        // Kadang kita butuh mengirim data ke method sejumlah data yang tidak pasti
        // Biasanya, agar bisa seperti ini, kita akan menggunakan Array sebagai parameter di method tersebut
        // Namun di Java, kita bisa menggunakan variable argument, untuk mengirim data yang berisi jumlah tak tentu, bisa nol atau lebih
        // Parameter dengan tipe variable argument, hanya bisa ditempatkan di posisi akhir parameter

        int[] values = {00, 50, 50, 50, 80};
        sayCongrats("Eko", values);

    } 
        static void sayCongrats(String nama, int[] values) {

            int total = 0;
            for (var value :  values) {
                total += value;

            }
            int finalValue = total / values.length;
            if (finalValue >= 75) {
                System.out.println("Selamat " + nama + ", Anda lulus");
            }
            else {
                System.out.println("Maaf " + nama + ". Anda tidak lulus");
            }
        }
    
}   

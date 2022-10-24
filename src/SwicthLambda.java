public class SwicthLambda {

    public static void main(String[] args) {
        
            // Switch Lambda
            // Lebih mempermudah saat penggunaan swicth ecpression karena kita tidak perlu lagi menggunakan kata kunci break

            var nilai =  "A";

            switch (nilai) {
                case "A" ->  System.out.println("Wow, Anda Lulus Dengan Baik");
                case "B", "C" -> System.out.println("Anda Luus ");
                case "D" -> System.out.println("Anda Tidak Lulus");

                default -> {
                    System.out.println("Mungkin anda salah jurusan");
                }
            }


    }
    
}

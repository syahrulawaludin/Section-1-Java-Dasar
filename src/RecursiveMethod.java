public class RecursiveMethod {

    public static void main(String[] args) {
        
        
        // Recursive Method

        // Rcursive Method adalah kemampuan method memanggil method dirinya sendiri
        // Kadang memang ada banyak problem,  yang lebih mudah diselesaikan menggunakan recursive method, seperti contoh kasus factorial

        System.out.println(factorial(10));
        System.out.println(factorialRecursive(10));
        loop(10);
    }

    static int factorial(int value) {
        var result = 1;
        for (var counter =1; counter <= value; counter++){
            result *=counter;

        }
        return result;
    }

        //  Probleum dengan recrusive 

        // Walaupun recurive method itu sangat menarik, namun kita perlu berhati hati
        // Jika recursive terlalu dalam, maka akan ada kemungkinan terjadi error Stackoverflow, yaitu error dimana stack method terlalu banyak di java
        // Kenapa problem ini bisa terjadi? karena kita memanggil method, Java akan menyimpannya dalam stack, jika method  tersebut memanggil method  lain, maka stack akan menumpuk terus dan jika terlalu  dalam, maka akan terlalu besar dan bisa menyebabkan error StackOverFlow


    static int factorialRecursive(int value) {
        if(value == 1){
            return 1;
        } else {
            return value * factorialRecursive(value-1);
        }

        
    }
    static void loop(int value){
        if(value == 0){
            System.out.println("Selesai");
        } else {
            System.out.println("Loop" + value);

            loop(value -1);
        }
    }
    
}

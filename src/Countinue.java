public class Countinue {

    public static void main(String[] args) {
        
        for (int counter = 1; counter <= 20; counter++) {
            if (counter % 2 == 0) {
                continue;
            }


            System.out.println("Perulangan Ganjil-" + counter);
        }
    }
    
}

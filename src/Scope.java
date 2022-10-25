public class Scope {

    public static void main(String[] args) {
        
        // Scope
        // variabel hanya dapat diakses di area tersebut dibuat
        // Contoh, jika sebuah variabel dibuat di method maka hanya bisa diakses di method terebut atau jika dibuat didalam block, maka hanya bisa diakses didalam block tersebut.
        
        sayHello("  Syahrul");
        sayHello(" Angga");

    }
    static void sayHello(String name){
        String hello  = "Hello" + name;
        if(!name.isBlank()) {
            String hi = "Hi" + name;
            System.out.println(hi);
        }

        System.out.println(hello);
        // System.out.println(hi); //Error
    }
    
}

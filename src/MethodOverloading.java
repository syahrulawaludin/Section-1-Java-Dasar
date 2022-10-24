public class MethodOverloading {
    
    // Method overloading adalah kemampuan membuat method dengan nama yang sama lebih dari sekali
    // Namun ada ketentuan, yaitu data parameter di method tersebut harus berbeda, enta jumlah atau tipe data parameternya
    // jIka ada yang sama, maka program Java kita akan error

    public static void main(String[] args) {
      
        // Memanggil method
        sayHello();
        sayHello("Syahrul");
        sayHello("Awaludin", "RPL");

    }
    static void sayHello() {
        System.out.println("Hello");
    }
    static void sayHello(String firstName) {
        System.out.println("Hello" + firstName);
    }
    static void sayHello(String firstName, String  lastName) {
        System.out.println("Hello" + firstName + " " + lastName);
    }
}

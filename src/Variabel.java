public class Variabel {
    public static void main(String[] args) {
        
        // Variabel adalah tempat untuk menyimpan data
        //  Java adalah bahasa static type, sehingga sebuah variabel hanya bisa digunakan untuk menyimpan tipe data yang sama, tidak bisa berubah-ubah tipe  data seperti di bahasa pemrograman PHP atau JavaScript
        // Untuk membuat variabel di Java kita bisa  menggunakan nama tipe data lalu diikuti dengan nama variabel nya
        // Nama variabel boleh mengandung whitespace (spasi, enter,tab) dan tidak boleh menggunakan number.

        String name;
        name = "Syahrul Awaludin";

        int age = 18;
        String address =  "Indonesia";

        System.out.println(age);
        System.out.println(address);
        System.out.println(name);

        // Kata kunci var

        // Sejak versi java 10 Java mendukung pembuatan variabell dengan kata kunci var, sehingga kita tidak perlu untuk menyebutkan tipe datanya.
        // Namun perlu diingat, saat kita menggunakan kata kunci var untuk membuat variabel, kita harus menginisiasi value/ nilai dari variabel tersebut secara langsung.
        
        var firstName = "Eko";
        var middleName = "Kurniawan";
        var  lastName = "Khannedy";

        var company = "Programmer Zaman Now";
        System.out.println(company);






    }
    
}

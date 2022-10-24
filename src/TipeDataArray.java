public class TipeDataArray {
    public static void main(String[] args) {
        
        // Tipe data array

        // Array adalah  tipe data yang berisikann kumpulan data dengan tipe yang sma
        // Jumlah data d array tidak bisa berubah setelah  pertama kali dibuat 

        String[] stringArray;
        stringArray = new String[3];

        stringArray[0] = "Eko";
        stringArray[1] = "Kurniawan";
        stringArray[2] = "Khannedy";
        
        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);


        stringArray[0] = "Asep";

        System.out.println(stringArray[0]);
        String[] stringArray2 = new String[3];

        String[] namaNama = {
            "Eko", "Kurniawan", "Khannedy"
        };
        namaNama = null;

        int[] arrayInt = new int[] {
            1,2,3,4,5,6,7,8,9,10
        };


        long[] arrayLong = {
            10,20,30
        };

        arrayLong[0] = 0;


        System.out.println(arrayLong.length);
        // Operasi di array
        // array[index] =            mengambil data di array
        // array[index] = value     mengubah data di array
        // array.length =           mengambil panjang array

        

        // Array di dalam array

        String[][] members = {
            {"Eko", "Budi", "Wahyu"},
            {"Ridwan", "Rizal"},
            {"Joko"}
        };

        System.out.println(members[0][1]);
        System.out.println(members[1][0]);
    }
}

public class TipeDataBukanPrimitif {

    public static void main(String[] args) {
        
        // Tipe Data Bukan Primitif

        // Tipe data primitif adalah tipe bawaan do dalam bahasa pemrograman. Ti[e data primitif tidak bisa diubah lagi
        // Tipe data number, char, boolean adalah tipe  data primitif. Tipe data primitif selalu memiliki default value
        // Tipe data String bukan tipe data primitif, tipe data bukan primitf tidak memiliki default  value, dan bisa bernilai null
        //  Tipe  data bukan primitif bisa memiliki method/function (yang akan dibahas nanti)
        // Di Java, semua tipe data primitif memiliki  representasi tipe data bukan primitif nya


        // ===== Representasi tipe data primitif ==========
        // Tipe data primitif : byte, short, int, long, float, doublr.
        // Tipe data bukan primitif  : Byte, Short, Integer, Long, Float, Double.
        
        Integer iniInteger = 100;
        Long iniLong = 10000L;

        Byte iniByte = null;

        System.out.println(iniByte);
        iniByte = 100;
        System.out.println(iniByte);

  

        // Konversi dari tipe primitif
        
        int iniInt = 100;
        Integer iniObject = iniInteger;

        short iniShort  = iniObject.shortValue();
        long iniLong2 = iniObject.longValue();
        float iniFloat = iniObject.floatValue();

        Long amount = 10000000L;
        




        

       


        

    }
    
}

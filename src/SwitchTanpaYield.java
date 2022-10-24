public class SwitchTanpaYield {
    public static void main(String[] args) {
        

        // Switch tanpa yield

        
        var nilai =  "A";
        String ucapan;

        switch (nilai) {
            case "A" -> ucapan =  "Wow anda lulus dengan baik";
            case "B", "C" -> ucapan =  "Anda lulus";
            case "D" -> ucapan = "Anda tidak lulus";
            default -> ucapan = "Mungkin anda salah jurusan";
        }

        System.out.println(ucapan);


    }
    
}

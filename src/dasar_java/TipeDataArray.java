package dasar_java;

public class TipeDataArray {
    public static void main(String[] args) {
        String[] arrayString = new String[3];
        arrayString[0] = "Muhammad";
        arrayString[1] = "Nizar";
        arrayString[2] = "Fazari";

        System.out.println(arrayString[2]);

        // membuat array juga bisa dengan cara seperti ini
        int[] arrayInteger = new int[]{
                1,2,3,4
        };

        long[] arrayLong = {
                10L,20L
        };

        // tidak ada penghapusan data pada array karena array sudah fix hanya bisa mengkosongkan dengan di timpa nilainya
        System.out.println(arrayInteger.length);

        // bikin array di dalam array
        String[][] members = {
                {"test", "asdas"},
                {"budi", "susanto"}
        };

        System.out.println(members[0][1]);
    }
}

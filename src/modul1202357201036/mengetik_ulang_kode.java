package modul1202357201036;

public class mengetik_ulang_kode {

     public static void main(String[] args) {
        int data[][] = 
        {{4, 6, 4, 2, 8, 4, 2, 10}, {4, 6, 4, 2, 8, 4, 2, 10}
        };
        
            for (int a = 0; a < data.length; a++) {
                for (int b = 0; b < data[0].length; b++) {
                    System.out.print(data[a][b] + " ");
                }
                System.out.print("\n");
            }
        }
    }
   

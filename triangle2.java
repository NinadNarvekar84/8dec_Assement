import java.io.*;
  
public class triangle2
{            
        public static void main(String[] args) {
            int i, j, k = 5;
            for (i = 1; i <= 5; i++) {
                for (j = 1; j< i + 1; j++) {
                    System.out.print(k-- +" ");
                }
       
                System.out.println();
            }
        }
       
    }
 
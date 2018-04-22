/**
 *
 * @author Hugo
 */
import java.util.Scanner;
public class soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int n,tinggi;
        String string;
        int a, b=0, c, d, e, i, j;
        System.out.print("Tinggi : ");
        tinggi = input.nextInt();
        System.out.print("String : ");
        string = input.nextLine();
        string = input.nextLine();
        n = tinggi + 1;
        a = n;
        e = n-1;
        
        if(string.equalsIgnoreCase("kosong")){
            for (c = n ; c >= 1 ; c--){
                for(j = 1 ; j <= n-c ; j++){
                    System.out.print(" ");
                }
                for (j = 1 ; j < 2*c ;j++){
                    System.out.print("*");
                }
            System.out.println();	
            }
            //Bawah
            for (c = 1 ; c <= n ; c++){
                b = 1;
                for(d = 1 ; d <= a ; d++){
                    if(c == 1){
                        continue;
                    }
                    else if (b <= e){
                        System.out.print(" ");
                        b++;
                    }
                    else {
                        if(d == b || d == a || e == 0){
                            System.out.print("*");
                        }
                        else
                            System.out.print(" ");
                    }
                }
                e--;
                a++;
                if (c != 1){
                    System.out.println();
                }
            }
        }
        
        else if(string.equalsIgnoreCase("penuh")){
            //Atas
            for (c = n ; c >= 1 ; c--){
                for(j = 1 ; j <= n-c ; j++){
                    System.out.print(" ");
                }
                for (j = 1 ; j < 2*c ;j++){
                    if(j == 1 || j == (2*c)-1 || c == n )
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            System.out.println();	
            }
            //Bawah
            for (c = 1 ; c <= n ; c++){
                b = 1;
                for(d = 1 ; d <= a ; d++){
                    if(c == 1){
                        continue;
                    }
                    else if (b <= e){
                        System.out.print(" ");
                        b++;
                    }
                    else {
                       System.out.print("*");
                    }
                }
                e--;
                a++;
                if (c != 1){
                    System.out.println();
                }
            }
        }
    }
}
/**
 *
 * @author Ogen
 */
import java.util.Scanner;
public class soal2 {
    
    int n_baris,n_kolom,baris,kolom;
    String matrix [][];
    String pointer [][];
    
    public soal2(int n_baris,int n_kolom,String matrix[][]){
        matrix = new String [baris][kolom];
        this.n_baris = n_baris;
        this.n_kolom = n_kolom;
    }
    
    public void start(int n_baris, int n_kolom, String matrix[][]){
        for(int i = 0; i < n_baris; i++){
            for(int j = 0; j < n_kolom; j++){
                if("S".equalsIgnoreCase(matrix[i][j]) ){
                    pointer(i,j,matrix);
                }
            }
        }
    }
    
    void pointer(int baris,int kolom, String matrix[][]){
        jalur(n_baris,n_kolom,baris,kolom,matrix);
    }
    
    public void jalur(int n_baris, int n_kolom, int baris, int kolom, String matrix[][]){
        
        //Right
        for(int i = 0; i < n_baris; i++){
            for(int j = (kolom+1); j <= (kolom+1); j++){
                if(".".equalsIgnoreCase(matrix[i][j]) || "E".equalsIgnoreCase(matrix[i][j])){
                    System.out.print("R");
                    
                    if("E".equalsIgnoreCase(matrix[i][j])){
                        System.out.println("");
                        System.exit(0);
                    }
                    else{
                        matrix[i][j] = "X";
                        kolom = kolom + 1;
                        pointer(baris,kolom,matrix);
                    }
                } 
                else {
                    break;
                }
                break;
            }
            break;
        }
        
        //Left
        for(int i = (n_baris-1); i >= 0; i--){
            for(int j = (n_kolom-1); j >= 0; j--){
                if(".".equalsIgnoreCase(matrix[i][j]) || "E".equalsIgnoreCase(matrix[i][j])){
                    System.out.print("L");
                    if("E".equalsIgnoreCase(matrix[i][j])){
                        System.out.println("");
                        System.exit(0);
                    }
                    else{
                        matrix[i][j] = "X";
                        n_kolom = n_kolom - 1;
                        pointer(baris,kolom,matrix);
                    }
                } 
                else {
                    break;
                }
                break;
            }
            break;
        }

        //DOWN
        for(int j = 0; j < n_kolom; j++){
            for(int i = (baris+1); i <= (baris+1); i++){
                if(".".equalsIgnoreCase(matrix[i][j]) || "E".equalsIgnoreCase(matrix[i][j])){
                    System.out.print("D");
                    
                    if("E".equalsIgnoreCase(matrix[i][j])){
                        System.out.println("");
                        System.exit(0);
                    }
                    else{
                        matrix[i][j] = "X";
                        baris = baris + 1;
                        pointer(baris,kolom,matrix);
                    }
                } 
                else {
                    break;
                }
                break;
            }
            break;
        }
        
        //UP
        for(int j = (n_baris-1); j >= 0; j--){
            for(int i = (n_baris-1); i >= 0; i--){
                if(".".equalsIgnoreCase(matrix[i][j]) || "E".equalsIgnoreCase(matrix[i][j])){
                    System.out.print("U");
                    if("E".equalsIgnoreCase(matrix[i][j])){
                        System.out.println("");
                        System.exit(0);
                    }
                    else{
                        matrix[i][j] = "X";
                        n_baris = n_baris - 1;
                        pointer(baris,kolom,matrix);
                    }
                } 
                else {
                    break;
                }
                break;
            }
            break;
        }
    }
        
    public void display(int n_baris,int n_kolom,String matrix[][]){
        for(int i = 0; i < n_baris; i++){
            for(int j = 0; j < n_kolom; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int baris = 0,kolom = 0,n_baris = 0,n_kolom = 0;
        String ordo;
        
        
        System.out.print("");
        ordo = input.nextLine();
        
        String [] pisah = ordo.split(" ");
        for(int counter = 0; counter < pisah.length; counter++){
            
        }
        n_baris = Integer.parseInt(pisah[0]);
        n_kolom = Integer.parseInt(pisah[1]);
        
        String matrix [][] = new String [n_baris][n_kolom];
        for(baris = 0; baris < n_baris; baris++){
            System.out.print("");
            String strBaris = input.nextLine();
            String [] pisahString = strBaris.split("");
            for(kolom = 0; kolom < pisahString.length; kolom++){
                matrix[baris][kolom] = pisahString[kolom];
            }
        }
        soal2 x = new soal2(n_baris,n_kolom,matrix);
        x.start(n_baris,n_kolom,matrix);
        //x.display(n_baris,n_kolom,matrix);
        
        
    }
}


package fungsi;
import java.util.Scanner;
public class FUNGSI {
    
    static Scanner masukkan = new Scanner(System.in);
    
    static void hitung(int a, int b){
        int hasil;
        hasil= a*b;
        System.out.println("Hasil a * b = "+hasil);
        hasil= a/b;
        System.out.println("Hasil a / b = "+hasil);
        
        
    }
    
    public static void main(String[] args) {
        int a=10;
        int b=20;
        
        System.out.print("Masukkan bilangan a = ");
        a = masukkan.nextInt();
        System.out.print("Masukkan bilangan b = ");
        b = masukkan.nextInt();
        
        hitung(a,b);


            
        
    }
    
}

import java.util.Scanner;

public class PrimeNo {
    
   boolean isPrime(int num) {    
        for(int i = 2; i <= num/i; ++i) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){

        PrimeNo p = new PrimeNo();
        Scanner Sp = new Scanner(System.in);
        System.out.println("Enter Minimum and Maximum range :-");
        int min = Sp.nextInt();
        int max = Sp.nextInt();

        for(int i=min;i<=max;i++) {
            if(p.isPrime(i)) {
                System.out.println(i);
            }
        }
        Sp.close();

    }


}

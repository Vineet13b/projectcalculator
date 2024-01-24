import java.util.Scanner;

public class fibSeries {
    int fib(int n){

        if(n<=1){
            return n;
        }
        else{
            return fib(n-1)+(n-2);
        }
    }
    
        public static void main(String args[]){
            fibSeries fib1 = new fibSeries();

            Scanner Sc = new Scanner(System.in);
            int n = Sc.nextInt();
            for(int i = 0;i < n ;i++){
                System.out.println(fib1.fib(i));
            }

            Sc.close();
        }
    }
    


import java.util.Scanner;

public class BiggestOf3 {
    
    int biggestOf3(int a,int b,int c){

        if (a >= b && a >= c){
            return a;
        }
        else if (b >= a && b >= c){
            return b;
        }
        else{
            return c;
        }
    }

    public static void main(String args[]){

        BiggestOf3 big1 = new BiggestOf3();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 3 Numbers\n");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int greatest = big1.biggestOf3(a, b, c);
        System.out.println("The Greatest number is "+greatest);
        s.close();   
    }
}


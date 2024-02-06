import java.lang.Math;
public class mathlib{

    public static void main(String args[]){
       
        int a = 10;
        int p = 2;
        int b = 20;
        int sqt = 4;
        double c = 4.443;

        System.out.println("Power Function Math.pow("+a+","+p+") = "+Math.pow(a,p));
        System.out.println("Minimum Function Math.min("+a+","+b+")= "+Math.min(a,b));
        System.out.println("Maximum function Math.max("+a+","+b+")= "+Math.max(a,b));
        System.out.println("Absolute function Math.abs("+c+") = "+Math.abs(c));
        System.out.println("Square root function Math.sqrt("+sqt+")= "+Math.sqrt(sqt));
        System.out.println("Random Function Math.random()= "+Math.random());

    }
}
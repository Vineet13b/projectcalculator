
public class arithmtic {
    double square(double n){
        return n*n;
    }
    double cube(double m){
        return m*m*m;
    }
    double mod(double a,double b){
        return a%b;
    }
    double power(double c,double d){
     
        return java.lang.Math.pow(c,d);
    }

    public static void main(String args[]){
        arithmtic a = new arithmtic();

        System.out.println(a.square(2));
        System.out.println(a.cube(3));
        System.out.println(a.mod(2,4));
        System.out.println(a.power(5,2));
    }
    
}

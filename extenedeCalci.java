    
    
    
public class extenedeCalci extends calci{
    int square(int a){
        int Sq = a * a;
        return Sq;
    }

    int cube(int b){
        int Cu = b * b * b;
        return Cu;
    }
    public static void main(String args[]){
    
       extenedeCalci c = new extenedeCalci();
        float Add = c.sum(10,20);
        float Sub = c.subs(10,20);
        float Prod = c.prod(10,20);
        float Div = c.div(10,20);
        
        System.out.println("Sum ="+Add);
        System.out.println("difference ="+Sub);
        System.out.println("Product ="+Prod);
        System.out.println("Division ="+Div);
        int Sqr = c.square(2);
        System.out.println("Square No. ="+Sqr);
        int Cube = c.cube(3);
        System.out.println("Cube No. = "+Cube);
        
     
    }

    
}

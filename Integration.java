package twelveaugust;
//Integral Calulator

import java.util.function.DoubleUnaryOperator;

public class Integration {
    public static void main(String[] args) {
        DoubleUnaryOperator fx = x->Math.sin(x)*Math.sin(x);
        double xi,xf;
        xi = 1.0;xf = 4.0;
        double h =0.1;
        double result = 0.0;
        int j = 0;
        for(double i = xi;;){
            result += 1.0/2.0*((fx.applyAsDouble(xi)+fx.applyAsDouble(xi+h))*h);
            xi += h;
           
            if(xi>xf){
                break;
            }



        }
        System.out.println("Result : "+result);
        

        
    }
}

package problem16;

public class PowerTwo {
    //boolean InvalidInput = false;
    public double PowerWith(double base,int exponent){
        //InvalidInput = false;
        if(base == 0 && exponent <0){
            //InvalidInput = true;
            return 0;
        }
        double result = 1;
        result = PowerUnsignedPower(base,Math.abs(exponent));
        if(exponent < 0){
            return 1/result;
        }return result;
    }
    public double PowerUnsignedPower(double base,int exponent){
        if (exponent ==1){
            return base;
        }
        if (exponent == 0){
            return 1;
        }
        double result = 1;
        result = PowerUnsignedPower(base,exponent>>1);
        result *=result;
        if ((exponent & 1)==1)
            result *=base;
        return result;

    }
}

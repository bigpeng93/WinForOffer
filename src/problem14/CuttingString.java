package problem14;

public class CuttingString {
    public int maxProduction(int length){
        if(length <=1){
            return 0;
        }else if (length == 2){
            return 1;
        }else if (length == 3){
            return 2;
        }
        //第i段绳子的长度
        int[] products = new int[length+1];
        products[0]=0;
        products[1]=1;
        products[2]=2;
        products[3]=3;
        int max =0;
        for(int i=4;i<=length;i++){
            max =0;
            for (int j =1;j<=i/2;j++){
                int product = products[j]*products[i-j];
                if(max<product){
                    max= product;
                }
                products[i] = max;
            }
        }
        return products[length];
    }
}

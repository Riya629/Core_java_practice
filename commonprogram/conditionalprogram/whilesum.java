package home.commonprogram.conditionalprogram;

public class whilesum {
    public static void main(String[]args){
        int i=0,sum=0;
        while(i<9){
            if(i%2==0){
sum=sum+i;
            }
            i++;
        }
        System.out.println(sum);

    }
}

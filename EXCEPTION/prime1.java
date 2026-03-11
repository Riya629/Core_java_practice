package home.EXCEPTION;
//Checking the prime number between 25-99
public class prime1 {
    public static void main(String[] args) {
        for(int n=25;n<=99;n++){
            int count=0;

            for(int i=1;i<=n;i++){
                if(n%i==0){
                    count++;
                }
            }
            if(count==2){
                    System.out.println(n);
                }
        }
        
    }
}

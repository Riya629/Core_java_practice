package home.method;

public class method_overloading3 {
    
    public static void main(String[]args){
       int result1=sum();
      int result2= sum(2,3);
      int result3= sum(4,5,6);
System.out.println(result1);
System.out.println(result2);
System.out.println(result3);

    }
static int sum(){
    int a=2, b=3;
   return a+b;
}
static int sum(int a, int b){
    return a+b;
}
static int sum(int a, int b, int c){
     return a+b+c;
   
}
}

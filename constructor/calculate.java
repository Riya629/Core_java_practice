package home.constructor;

public class calculate {
    public static void main(String[]args){
operation1 o1= new operation1(40,20);
o1.display();
    }
}
class operation1{
    int num1;
    int num2;
    int sum,sub,multiply,divide;
    operation1(int num1, int num2){
        this.num1=num1;
        this.num2=num2;
    }
    public void display(){
        sum=num1+num2;
        sub=num1-num2;
        multiply=num1*num2;
        divide=num1/num2;
        System.out.println("The sum of 2 number is"+sum);
        System.out.println("The sub of 2 number is"+sub);
        System.out.println("The multiply of 2 number is"+multiply);
        System.out.println("The divide of 2 number is"+divide);


    }
}
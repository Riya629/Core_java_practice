package home.string;
import java.util.Scanner;
public class palindrome {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str;
        System.out.println("Enter the string");
 str=sc.nextLine();
        String rev="";
       for(int i=0; i<str.length();i++){
        rev=str.charAt(i)+rev;
       }
if(str.equals(rev)){
    System.out.println("This is palindrome");
}
else{
    System.out.println("This is not palindrome");
}
sc.close();
    }}
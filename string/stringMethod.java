package home.string;

public class stringMethod {
   public static void main(String args[]) {
     String str = "Riya";
     /* System.out.println(str.length());
      System.out.println(str.toUpperCase());
      System.out.println(str.toLowerCase());
      String lstring = str.toLowerCase();
      System.out.println(lstring);
      String nonTrimmedString = "   Harry      ";
      System.out.println(nonTrimmedString.trim());*/
String substring=str.substring(1,3);
System.out.println(substring);
      String replace=str.replace('R','s');
System.out.println(replace);
System.out.println(str.startsWith("R"));
System.out.println(str.endsWith("i"));
System.out.println(str.charAt(2));
System.out.println(str.indexOf("ya"));
   }
}

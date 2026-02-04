package home.array;
import java.util.Scanner;
public class multi {
    public static void main(String[]args){
Scanner sc= new Scanner(System.in);
int rows,cols;
System.out.println("Enter the number of rows");
rows=sc.nextInt();
System.out.println("Enter the number of cols");
cols=sc.nextInt();
int[][]matrix=new int[rows][cols];
System.out.println("Enter the elements of array");
for(int i=0; i<rows; i++){
for(int j=0; j<cols;j++){
matrix[i][j]=sc.nextInt();
}
}
System.out.println("Acessing array elements");
for(  int i=0;i<rows;i++){
for( int j=0;j<cols;j++){
System.out.print(matrix[i][j] +" ");
}
System.out.println();
}
sc.close();
}
    }


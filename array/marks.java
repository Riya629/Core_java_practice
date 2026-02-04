/*Thare are 3 ways of declaring an array
int[]marks;  declared array
marks=new int[n]  memeory allocation
int[]marks=new int[n] declartion and memory allocation
int[]marks={20,30,40} here java automatically know the size oif array so no need to declare it
 */

package home.array;
//Displaying the array in reversed order 
public class marks { 
    public static void main(String[] args) {
        int arr[]={20,30,40,50};
        for(int i=arr.length-1; i>=0; i--){
System.out.println(arr[i]);

        }

/*int[]arr={20,30,40};
System.out.println(arr.length);
System.out.println(arr[1]);*/
for(int element :arr){ //printing using for eahc loop
    System.out.println(element);
}
    }

}


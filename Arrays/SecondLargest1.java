import java.util.Arrays;
import java.util.Scanner;
class SecondLargest1{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
System.out.print("Enter no of elements of an array:");
int n=s.nextInt();
if (n < 2) {
System.out.println("Need at least 2 elements to find second largest.");
return;
}
int a[]=new int[n];
for(int i=0;i<n;i++){
System.out.print("Enter value"+(i+1)+":");
a[i]=s.nextInt();
}
System.out.print("The values are:");
for (int i = 0; i < n; i++) {
System.out.print(a[i] + " ");
}
Arrays.sort(a);
int largest = a[n - 1];
for (int i = n - 2; i >= 0; i--) {
if (a[i] < largest) {
System.out.println("Second largest number is: " + a[i]);
return;
}
}
System.out.println("No second largest element (all elements are equal).");
}
}
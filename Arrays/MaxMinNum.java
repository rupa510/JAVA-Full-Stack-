import java.util.Arrays;
import java.util.Scanner;
class MaxMinNum{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
System.out.print("Enter no of elements of an array:");
int n=s.nextInt();
if(n<1){
System.out.println("Need at least 1 element");
return;
}
int a[]=new int[n];
for(int i=0;i<n;i++){
System.out.print("Enter value"+(i+1)+":");
a[i]=s.nextInt();
}
System.out.print("The values are:");
for(int i=0;i<n;i++) {
System.out.print(a[i] + " ");
}
int max=a[0];
int min=a[0];
for(int i=1;i<n;i++){
if(a[i]>max){
max=a[i];
} 
else if(a[i]<min){
min=a[i];
}
}
System.out.println();
System.out.println("Maximum element: " + max);
System.out.println("Minimum element: " + min);
}
}
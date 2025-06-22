import java.util.Arrays;
import java.util.Scanner;
class SecondLargestWithoutSorting{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
System.out.print("Enter no of elements of an array:");
int n=s.nextInt();
if (n<2){
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
int first;
int second;
if(a[0]>a[1]) 
{
first=a[0];
second=a[1];
} 
else{
first=a[1];
second=a[0];
}
for(int i=2;i<n;i++){
if(a[i]>first){
second=first;
first=a[i];
} 
else if(arr[i]>second && a[i]!=first) {
second=a[i];
}
}
if(first==second){
System.out.println("No second largest element found,all elements may be equal");
} 
else{
System.out.println("Second largest element is: " + second);
}
}
}
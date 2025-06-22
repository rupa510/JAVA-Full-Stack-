import java.util.Scanner;
class CountGreaterThanNum{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
System.out.print("Enter no of elements of an array:");
int n=s.nextInt();
int a[]=new int[n+1];
for(int i=0;i<n;i++){
System.out.print("Enter value"+(i+1)+":");
a[i]=s.nextInt();
}
System.out.println("The array elements are:");
for(int i=0;i<n;i++){
System.out.print(a[i]+" ");
}
System.out.print("Enter the value to compare: ");
int value=s.nextInt();
int count=0;
for (int i=0; i<n; i++) {
if (a[i]>value){
count++;
}
}
System.out.println("Number of elements greater than " + value + " is: " + count);
}
}
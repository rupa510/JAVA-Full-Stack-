import java.util.Scanner;
class Deletevalue{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
System.out.print("Enter no of elements of an array:");
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
System.out.print("Enter value"+(i+1)+":");
a[i]=s.nextInt();
}
System.out.print("The values are:");
for (int i = 0; i < n; i++) {
System.out.print(a[i] + " ");
}
System.out.println("Enter value to remove: ");
int valueToRemove = s.nextInt();
System.out.print("\nArray after removing " + valueToRemove + ": ");
for (int i = 0; i<n; i++) {
if (a[i] != valueToRemove) {
System.out.print(a[i] + " ");
}
}
}
}
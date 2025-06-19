import java.util.Scanner;
class Indexofelement{
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
System.out.println("Enter element to find its index: ");
int key = s.nextInt();
boolean found = false;
for (int i = 0; i < n; i++) {
if (a[i] == key) {
System.out.println("Element " + key + " found at index: " + i);
found = true;
break;
}
}
if (!found) {
System.out.println("Element " + key + " not found in the array.");
}
}
}

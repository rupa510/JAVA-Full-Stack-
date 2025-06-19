import java.util.Scanner;
class Duplicates{
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
System.out.println("Duplicate elements are:");
boolean found = false;
for (int i = 0; i < n; i++) {
for (int j = i + 1; j < n; j++) {
if (a[i] == a[j]) {
System.out.println(a[i]);
found = true;
break;                 
}
}
}
if (!found){
System.out.println("No duplicates found.");
}
}
}
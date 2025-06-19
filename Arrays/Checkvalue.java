import java.util.Scanner;
class Checkvalue{
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
System.out.println("Enter value to check: ");
int value = s.nextInt();
boolean found = false;
for (int i = 0; i < n; i++) {
if (a[i] == value) {
found = true;
break;
}
}
if (found) {
System.out.println("Value is present in the array.");
} 
else {
System.out.println("Value is not present in the array.");
}
}
}


import java.util.Scanner;
class Commonvalue{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
System.out.print("Enter no of elements of an 1st array:");
int n1=s.nextInt();
int a1[]=new int[n1];
for(int i=0;i<n1;i++){
System.out.print("Enter value"+(i+1)+":");
a1[i]=s.nextInt();
}
System.out.print("The values are:");
for (int i = 0; i < n1; i++) {
System.out.print(a1[i] + " ");
}
System.out.print("Enter no of elements of an 2nd array:");
int n2=s.nextInt();
int a2[]=new int[n2];
for(int i=0;i<n2;i++){
System.out.print("Enter value"+(i+1)+":");
a2[i]=s.nextInt();
}
System.out.print("The values of 2nd array are:");
for (int i = 0; i < n2; i++) {
System.out.print(a2[i] + " ");
}
System.out.println("Common elements:");
boolean found = false;
for (int i = 0; i < n1; i++) {
for (int j = 0; j < n2; j++) {
if (a1[i] == a2[j]) {
System.out.println(a1[i]);
found = true;
break;
}
}
}
if (!found) {
System.out.println("No common elements found.");
}
}
}
import java.util.Scanner;
class InsertelementAtGivenIndex{
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
System.out.print("Enter element to insert: ");
int element = s.nextInt();
System.out.print("Enter position to insert (1 to " + (n + 1) + "): ");
int position = s.nextInt();
if (position < 1 || position > n + 1) {
System.out.println("Invalid position!");
return;
}
for (int i = n; i >= position; i--) {
a[i] = a[i-1];
}
a[position-1] = element;
n++;
System.out.println("Array after insertion:");
for (int i = 0; i < n; i++) {
System.out.print(a[i] + " ");
}
}
}



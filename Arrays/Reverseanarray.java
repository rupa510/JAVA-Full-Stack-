import java.util.Scanner;
class Reverseanarray{
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
for (int i = 0; i < n / 2; i++) {
int temp = a[i];
a[i]=a[n-1-i];
a[n-1-i]=temp;
}
System.out.println(/n"Reversed array:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
}
}
}
import java.util.Scanner;
class RemoveDuplicates{
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
int[] b = new int[n];
int k = 0;
for (int i = 0; i < n; i++) {
boolean isDuplicate = false;
for (int j = 0; j < k; j++) {
if (a[i] == b[j]) {
isDuplicate = true;
break;
}
}
if (!isDuplicate) {
b[k]=a[i];
k++;
}
}
System.out.println("Array after removing duplicates:");
for (int i = 0; i < k; i++) {
System.out.print(b[i] + " ");
}
}
}
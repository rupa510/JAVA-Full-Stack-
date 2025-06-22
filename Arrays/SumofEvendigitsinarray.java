import java.util.Scanner;
class SumofEvendigitsinarray{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
System.out.print("Enter no of elements of an array:");
int n=s.nextInt();
int a[]=new int[n];
int sum=0;
for(int i=0;i<n;i++){
System.out.print("Enter value"+(i+1)+":");
a[i]=s.nextInt();
}
for(int i=0;i<n;i++){
if(a[i]%2==0){
sum=sum+a[i];
}
}
System.out.print("The sum of even num is:"+sum);
}
}



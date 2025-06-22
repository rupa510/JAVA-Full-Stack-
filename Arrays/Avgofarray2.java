import java.util.Scanner;
class Avgofarray2{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
System.out.print("Enter no of elements of an array:");
int n=s.nextInt();
Double a[]=new Double[n];
Double sum=0.0;
double avg=0.0;
for(int i=0;i<n;i++){
System.out.print("Enter value"+(i+1)+":");
a[i]=s.nextDouble();
}
for(int i=0;i<n;i++){
sum=sum+a[i];
avg=sum/n;
}
System.out.println("The sum is:"+sum);
System.out.print("The avg is:"+avg);
}
}



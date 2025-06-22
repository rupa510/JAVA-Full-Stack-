import java.util.Arrays;
import java.util.Scanner;
class Frequency{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
System.out.print("Enter no of elements of an array:");
int n=s.nextInt();
if(n<1){
System.out.println("Need at least 1 element");
return;
}
int a[]=new int[n];
for(int i=0;i<n;i++){
System.out.print("Enter value"+(i+1)+":");
a[i]=s.nextInt();
}
System.out.print("The values are:");
for(int i=0;i<n;i++) {
System.out.print(a[i] + " ");
}
System.out.println("Element-Frequency:");
for (int i=0;i<n;i++){
boolean isVisited = false;
for (int j=0;j<i;j++){
if (a[i]==a[j]){
isVisited=true;
break;
}
}
if(!isVisited){
int count=1;
for (int k=i+1;k<n;k++){
if (a[i]==a[k]){
count++;
}
}
System.out.println(a[i] + " - " + count);
}
}
}
}
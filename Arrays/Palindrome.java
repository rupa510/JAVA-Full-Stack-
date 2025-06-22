import java.util.Scanner;
class Palindrome{
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
boolean isPalindrome = true;
for (int i=0;i<n/2;i++) {
if (a[i]!=a[n-1-i]){
isPalindrome=false;
break;
}
}
if (isPalindrome){
System.out.println("The array is a palindrome.");
} 
else{
System.out.println("The array is not a palindrome.");
}
}
}
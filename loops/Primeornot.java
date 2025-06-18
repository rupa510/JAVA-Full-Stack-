import java.util.Scanner;
class Primeornot{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("enter num:");
int num=s.nextInt();
boolean isPrime = true;
if (num <= 1) {
isPrime = false; 
} else {
for (int i = 2; i <= num / 2; i++) {
if (num % i == 0) {
isPrime = false;
break;
}
}
}
if (isPrime) {
System.out.println(num + " is a prime number.");
} else {
System.out.println(num + " is not a prime number.");
}
}
}
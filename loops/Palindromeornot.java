import java.util.Scanner;
class Palindromeornot{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("enter num:");
int num=s.nextInt();
int original=num;
int reversedNum = 0;
while (num != 0) {
int digit = num % 10;
reversedNum = reversedNum * 10 + digit;
num = num / 10;
}
if (original == reversedNum)
System.out.println(original + " is a palindrome.");
else
System.out.println(original + " is not a palindrome.");
    }
}

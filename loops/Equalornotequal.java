import java.util.Scanner;
class Equalornotequal{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("enter a:");
int a=s.nextInt();
System.out.println("enter b:");
int b=s.nextInt();
if(a==b){
System.out.println("a is equal to b");
}
else if(a!=b){
System.out.println("a is not equal to b");
}
else{
System.out.println("invalid input");
}
}
}

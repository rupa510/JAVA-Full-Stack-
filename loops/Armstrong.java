import java.util.Scanner;
class Armstrong{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("enter num:");
int num=s.nextInt();
int original=num;
int result=0;
while(num!=0){
int digit=num%10;
result=result+digit*digit*digit;
num=num/10;
}
if(result==original){
System.out.println(original+"is an Armstrong");
}
else{
System.out.println(original+"is not an Armstrong");
}
}
}

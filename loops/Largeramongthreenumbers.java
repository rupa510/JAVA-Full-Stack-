import java.util.Scanner;
class Largeramongthreenumbers{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("enter a:");
int a=s.nextInt();
System.out.println("enter b:");
int b=s.nextInt();
System.out.println("enter c:");
int c=s.nextInt();
if((a>b)&&(a>c)){
System.out.println( a+" is larger");
}
else if((b>a)&&(b>c)){
System.out.println( b+" is larger");
} 
else if((a==b)&&(a>c)){
System.out.println(a+ "and" +b+ "are larger");
}
else if((b==c)&&(b>a)){
System.out.println(b+ "and" +c+  "are larger");
}
else if ((a == b) && (b == c)) {
System.out.println("All three numbers are equal");
}
else{
System.out.println(c+" is larger");
}
}
}

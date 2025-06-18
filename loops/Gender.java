import java.util.Scanner;
class Gender{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("enter gender(M/F):");
char gender=s.next().charAt(0);
switch (gender) {
case 'M':
System.out.println("male");
break;
case 'm':
System.out.println("male");
break;
case 'F':
System.out.println ("female");
break;
case 'f':
System.out.println ("female");
break;
default:
System.out.println( " invalid input please type m/f");
}
}
}

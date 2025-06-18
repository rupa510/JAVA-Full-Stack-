class Largeramongthreemultipleifelse{
public static void main(String[] args){
int a=10;
int b=20;
int c=30;
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

class StaticAndInInstanceVariablesInMain{
static int b=20;
int a=30;
public static void main(String[]args){
StaticAndInInstanceVariablesInMain s = new StaticAndInInstanceVariablesInMain();
System.out.println(b);
System.out.println(s.a);
}
}
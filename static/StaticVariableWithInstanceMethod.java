class StaticVariableWithInstanceMethod{
static int b=20;
void add(){
System.out.println(b);
}
public static void main(String[]args){
StaticVariableWithInstanceMethod s = new StaticVariableWithInstanceMethod();
s.add();
}
}
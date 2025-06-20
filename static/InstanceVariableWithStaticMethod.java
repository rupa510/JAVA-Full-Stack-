class InstanceVariableWithStaticMethod{
int b=20;
static void add(){
InstanceVariableWithStaticMethod i = new InstanceVariableWithStaticMethod();
System.out.println(i.b);
}
public static void main(String[]args){
add();
}
}
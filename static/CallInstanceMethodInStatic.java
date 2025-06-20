class CallInstanceMethodInStatic{
static int b=20;
static void display(){
StaticVariableWithInstanceMethod s = new StaticVariableWithInstanceMethod();
s.add();
}
void add(){
System.out.println(b);
}
public static void main(String[]args){
display();
}
}
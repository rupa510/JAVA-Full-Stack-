class CallStaticMethodInInstance{
static int b=20;
static void display(){
System.out.println(b);
}
void add(){
display();
}
public static void main(String[]args){
CallStaticMethodInInstance s = new CallStaticMethodInInstance();
s.add();
}
}
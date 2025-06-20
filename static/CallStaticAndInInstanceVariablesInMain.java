class CallStaticAndInInstanceVariablesInMain{
static int b=20;
int a=30;
static void display(){
System.out.println(b);
}
void show(){
System.out.println(a);
}
public static void main(String[]args){
CallStaticAndInInstanceVariablesInMain s = new CallStaticAndInInstanceVariablesInMain();
display();
s.show();
}
}
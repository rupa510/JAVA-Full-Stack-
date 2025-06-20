class Sample{
static int a=10;
static int b=20;
int c=15;
int d=24;
static void show1(){
System.out.println(a);
}
static void show2(){
System.out.println(b);
}
void display1(){
System.out.println(c);
}
void display2(){
System.out.println(d);
}
public static void main(String[]args){
Sample s = new Sample();
show1();
show2();
s.display1();
s.display2();
}
}
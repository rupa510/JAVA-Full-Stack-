class Minmax {
public static void main(String[] args) {
int[] a = {10, 20, 30, 40, 50};
int min=a[0];
int max=a[0];
for (int b:a) {
if(b<min){
min=b;
}
else if(b>max){
max=b;
}
}
System.out.println("min is:" +min);
System.out.println("max is:" +max);
}
}
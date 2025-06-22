class EvenOdd{
public static void main(String[] args) {
int[] a={10, 20, 30, 40, 50,63,51};
System.out.println("Even are: ");
for(int i=1;i<a.length;i++){
if(a[i]%2==0){
System.out.println(a[i] +" ");
} 
}
System.out.println("Odd are: ");
for(int i=1;i<a.length;i++){
if(a[i]%2!=0){
System.out.println(a[i] +" ");
} 
}
}
}
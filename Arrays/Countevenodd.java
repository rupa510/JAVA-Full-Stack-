class Countevenodd{
public static void main(String[] args) {
int[] a = {10, 20, 30, 40, 50,63,51};
int even=0;
int odd=0;
for (int b:a) {
if(b%2==0){
even++;
}
else{
odd++;
}
}
System.out.println("even are:" +even);
System.out.println("odd are:" +odd);
}
}
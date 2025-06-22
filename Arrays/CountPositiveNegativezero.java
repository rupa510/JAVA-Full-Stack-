class CountPositiveNegativezero{
public static void main(String[] args) {
int[] a={10,-20,-30,40,50,63,51,0};
int positive=0;
int negative=0;
int zero=0;
for (int i=0;i<a.length;i++) {
if(a[i]>0){
positive++;
}
else if(a[i]<0){
negative++;
}
else{
zero++;
}
}
System.out.println("Postives are:" +positive);
System.out.println("Negatives are:" +negative);
System.out.println("Zeros are:" +zero);
}
}
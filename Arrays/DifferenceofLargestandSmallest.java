import java.util.Arrays;
class DifferenceofLargestandSmallest{
public static void main(String[]args){
int a[]={1,2,5,4,7};
Arrays.sort(a);
System.out.println("The sorted array is:");
for(int i=0;i<a.length;i++){
System.out.println(a[i]+" ");
}
System.out.println("The difference is:" +(a[a.length-1]-a[0]));
}
}

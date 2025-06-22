import java.util.Scanner;
class BinarySearch{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int[] a={2, 5, 8, 12, 16, 23, 38, 45, 56, 72, 91};
System.out.print("Enter element to search: ");
int target=sc.nextInt();
int low=0; 
int high=a.length-1;
boolean found=false;
for(int i=0;i<a.length;i++){
int mid=(low+high)/2;
if(a[mid]==target){
System.out.println("Element found at index: "+ mid);
found=true;
break;
} 
else if(target<a[mid]){
high=mid-1;
} 
else{
low=mid+1;
}
}
if(!found){
System.out.println("Element not found in the array");
}
}
}

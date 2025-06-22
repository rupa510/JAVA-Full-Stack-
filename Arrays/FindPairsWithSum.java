import java.util.Scanner;
class FindPairsWithSum {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("Enter number of elements: ");
int n = sc.nextInt();
int[] arr = new int[n];
System.out.println("Enter array elements:");
for (int i = 0; i < n; i++) {
arr[i] = sc.nextInt();
}
System.out.print("Enter the target sum: ");
int target = sc.nextInt();
System.out.println("Pairs with sum " + target + " are:");
boolean found = false;
for (int i=0;i<n;i++) {
for (int j = i + 1; j < n; j++) {
if (arr[i] + arr[j] == target) {
System.out.println(arr[i] + " + " + arr[j] + " = " + target);
found = true;
}
}
}
if(!found){
System.out.println("No pairs found with the given sum.");
}
}
}

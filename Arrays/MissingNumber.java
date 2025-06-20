class MissingNumber {
public static void main(String[] args) {
int[] arr = new int[99]; 
int missing = 57; 
int index = 0;
for (int i = 1; i <= 100; i++) {
if (i != missing) {
arr[index++] = i;
}
}
int total = 100 * 101 / 2;
int sum = 0;
for (int num : arr) {
sum=sum+num;
}
System.out.println("Missed num is:"+(total - sum));
}
}

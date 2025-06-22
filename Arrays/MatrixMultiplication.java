import java.util.Scanner;
class MatrixMultiplication {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter number of rows for Matrix A: ");
int r1 = sc.nextInt();
System.out.print("Enter number of columns for Matrix A: ");
int c1 = sc.nextInt();
System.out.print("Enter number of rows for Matrix B: ");
int r2 = sc.nextInt();
System.out.print("Enter number of columns for Matrix B: ");
int c2 = sc.nextInt();
if(c1!=r2){
System.out.println("Matrix multiplication not possible. Columns of A must equal rows of B.");
return;
}
int[][] A = new int[r1][c1];
int[][] B = new int[r2][c2];
int[][] result = new int[r1][c2];
System.out.println("Enter elements of Matrix A:");
for (int i = 0; i < r1; i++) {
for (int j = 0; j < c1; j++) {
A[i][j] = sc.nextInt();
}
}
System.out.println("Enter elements of Matrix B:");
for (int i=0;i<r2;i++) {
for (int j=0;j<c2;j++) {
B[i][j] = sc.nextInt();
}
}
for (int i=0;i<r1;i++){
for (int j=0;j<c2;j++) {
result[i][j]=0;
for (int k=0;k<c1;k++){
result[i][j]+=A[i][k]*B[k][j];
}
}
}
System.out.println("Resultant Matrix after multiplication:");
for (int i=0;i<r1;i++){
for (int j = 0; j < c2; j++) {
System.out.print(result[i][j] + " ");
}
System.out.println();
}
}
}

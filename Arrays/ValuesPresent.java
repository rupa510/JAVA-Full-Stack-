class ValuesPresent{
public static void main(String[]args){
int a[]={12,2,5,4,7,23};
boolean found = false;
for (int i = 0; i < a.length; i++) {
if (a[i] == 12 || a[i]==23) {
found = true;
break;
}
}
if (found) {
System.out.println("Value 12,23 are present in the array.");
} 
else {
System.out.println("Values are not present in the array.");
}
}
}

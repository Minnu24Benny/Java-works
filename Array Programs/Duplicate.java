import java.util.Scanner;
class Duplicate{
public static void main(String[]args){
int n,i,j,k;
int[]arr=new int[10];
Scanner input=new Scanner(System.in);
System.out.println("Enter your limit");
n=input.nextInt();
System.out.println("Enter your elements");
for(i=0;i<n;i++){
arr[i]=input.nextInt();}

for(i=0;i<n;i++){
for(j =i+1; j<n; j++) {
if(arr[i]==arr[j]) {
for(k = j; k < n - 1; k++) {
arr[k] = arr[k + 1];
}
n--;  
j--;  
}}}

for(i=0;i<n;i++){
if(arr[i]==0){
for(k=i;k<n-1;k++) {
arr[k]=arr[k+1];
}
n--;  
i--;  
}}


System.out.println("Duplicate elements removed array:");
for(i=0;i<n;i++){
System.out.println(arr[i]+"");}
}}
import java.util.Scanner;
class Sort{
public static void main(String[]args){
int n,i,j;
int[] arr = new int[10];
Scanner input = new Scanner(System.in);

System.out.println("Enter your limit:");
n=input.nextInt();

System.out.println("Enter your Elements");
for(i=0;i<n;i++){
arr[i]=input.nextInt();}

System.out.println("The array is");
for(i=0;i<n-1;i++){
System.out.print(arr[i]+",");}
System.out.println(arr[n-1]);


for(i=0;i<n-1;i++){
for(j=0;j<=n-1-i;j++){
if(arr[j]<arr[j+1]){
int temp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;
}}}

System.out.println("Decreasing Order:");
for(i=0;i<n-1;i++){
System.out.print(arr[i]+",");
}
System.out.print(arr[n-1]);
}}

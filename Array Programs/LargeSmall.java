import java.util.Scanner;
class LargeSmall{
public static void main(String[]args){ 
 int[]arr=new int[10];

 int n,i;
 int large=arr[0];
 int small=arr[0];

 Scanner input=new Scanner(System.in);

 System.out.println("Enter your limit");
 n=input.nextInt();

 System.out.println("Enter your elements");
 for(i=0;i<n;i++){
  arr[i]=input.nextInt();}
 for(i=0;i<n;i++){
  if(arr[i]>large){
   large=arr[i];}
  if(arr[i]<small){
   small=arr[i];}
 }
 System.out.println("Largest:"+large);
 System.out.println("Smallest"+small);
}}


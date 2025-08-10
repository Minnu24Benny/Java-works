import java.util.Scanner;
class SumEven{
public static void main(String[]args){
 int n,i,sum=0;
 int[]arr=new int[10];
 Scanner input=new Scanner(System.in);

 System.out.println("Enter your limit");
 n=input.nextInt();

 System.out.println("Enter your elements");
 for(i=0;i<n;i++){
  arr[i]=input.nextInt();}

 for(i=0;i<n;i++){
  if(arr[i]%2==0){
    sum=sum+arr[i];}
 }
System.out.println("Sum"+sum);
}}

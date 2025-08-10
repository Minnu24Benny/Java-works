import java.util.Scanner;
class Common{
public static void main(String[]args){
int[]arr1=new int[10];
int[]arr2=new int[10];
int n,i,j,m,flag=0;

Scanner input=new Scanner(System.in);

System.out.println("Enter your limit array 1:");
n=input.nextInt();
System.out.println("Enter your limit array 2:");
m=input.nextInt();

System.out.println("Enter your elements of array1:");
for(i=0;i<n;i++){
arr1[i]=input.nextInt();}

System.out.println("Enter your elements of array2:");
for(j=0;j<m;j++){
arr2[j]=input.nextInt();}

System.out.println("Common:");
for(i=0;i<n;i++){
boolean alreadyPrinted=false;
for (int k = 0; k < i; k++) {
if (arr1[i] == arr1[k]){
alreadyPrinted = true;
break;}}
                
if (alreadyPrinted){
continue;}

for(j=0;j<m;j++){
if (arr1[i]==arr2[j]){
System.out.println(arr1[i] + " ");
flag=1;
break;
}}
if(flag==0){
System.out.println("No Common Elements found");}

}
}
}
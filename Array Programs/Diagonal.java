import java.util.Scanner;
class Diagonal{
public static void main(String[]args){
int[][]matrix=new int[10][10];
int r1,c1,i,j,diagonal=0;
Scanner input=new Scanner(System.in);

System.out.println("Enter your limit row1:");
r1=input.nextInt();
System.out.println("Enter your limit column1:");
c1=input.nextInt();

if(r1==c1){
System.out.println("Enter your elements of matrix:");
for(i=0;i<r1;i++){
for(j=0;j<c1;j++){
matrix[i][j]=input.nextInt();
}}

System.out.println("matrix:");
for(i=0;i<r1;i++){
for(j=0;j<c1;j++){
System.out.print(" "+matrix[i][j]);
}
System.out.println(" ");
}

for(i=0;i<r1;i++){
for(j=0;j<c1;j++){
if(i==j){
diagonal+=matrix[i][j];}
}}
System.out.println("Sum of Diagonal elements:"+diagonal);
}

else{
System.out.println("Not Possible");
}
}}


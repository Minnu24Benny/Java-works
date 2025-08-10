import java.util.Scanner;
class Transpose{
public static void main(String[]args){
int[][]matrix=new int[10][10];
int r1,c1,i,j;
Scanner input=new Scanner(System.in);

System.out.println("Enter your limit row1:");
r1=input.nextInt();
System.out.println("Enter your limit column1:");
c1=input.nextInt();


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


int [][]transpose=new int[c1][r1];
for(i=0;i<r1;i++){
for(j=0;j<c1;j++){
transpose[j][i]=matrix[i][j];}}

System.out.println("Transpose:");
for(i=0;i<c1;i++){
for(j=0;j<r1;j++){
System.out.print(" "+transpose[i][j]);
}
System.out.println(" ");
}
}}
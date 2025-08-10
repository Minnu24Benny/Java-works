import java.util.Scanner;
class Sum{
public static void main(String[]args){
int[][]matrix1=new int[10][10];
int[][]matrix2=new int[10][10];
int[][]result=new int[10][10];
int r1,r2,c1,c2,i,j;

Scanner input=new Scanner(System.in);

System.out.println("Enter your limit row1:");
r1=input.nextInt();
System.out.println("Enter your limit column1:");
c1=input.nextInt();

System.out.println("Enter your limit row 2:");
r2=input.nextInt();
System.out.println("Enter your limit column2:");
c2=input.nextInt();

if(r1==r2 & c1==c2){


System.out.println("Enter your elements of matrix1:");
for(i=0;i<r1;i++){
for(j=0;j<c1;j++){
matrix1[i][j]=input.nextInt();
}}

System.out.println("matrix1:");
for(i=0;i<r1;i++){
for(j=0;j<c1;j++){
System.out.print(" "+matrix1[i][j]);

}
System.out.println(" ");
}

System.out.println("Enter your elements of matrix2:");
for(i=0;i<r2;i++){
for(j=0;j<c2;j++){
matrix2[i][j]=input.nextInt();}}

System.out.println("matrix2:");

for(i=0;i<r2;i++){
for(j=0;j<c2;j++){
System.out.print(" "+matrix2[i][j]);

}
System.out.println(" ");
}

for(i=0;i<r1;i++){
for(j=0;j<c1;j++){

 result[i][j]+=matrix1[i][j]+matrix2[i][j];
}}

System.out.println("result:");

for(i=0;i<r1;i++){
for(j=0;j<c1;j++){
System.out.print(" "+result[i][j]);
}
System.out.println(" ");
}
}


else
{
System.out.println("not possible");
}
}}

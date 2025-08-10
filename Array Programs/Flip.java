import java.util.Scanner;
class Flip{
public static void main(String[]args){
int[][]matrix=new int[10][10];
int[][]temp=new int[10][10];


int r1,c1,i,j,diagonal=0;
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


for(j=0;j<c1;j++){
temp[i][j]=matrix[0][j];
matrix[0][j]=matrix[r1-1][j];
matrix[r1-1][j]=temp[i][j];}

for(i=0;i<r1;i++){

temp[i][j]=matrix[i][0];
matrix[i][0]=matrix[i][c1-1];
matrix[i][c1-1]=temp[i][j];
}

System.out.println("Flipped matrix:");
for(i=0;i<r1;i++){
for(j=0;j<c1;j++){
System.out.print(" "+matrix[i][j]);
}
System.out.println(" ");
}

}}
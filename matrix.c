#include<stdio.h>
#include<conio.h>
int main()
{
    int i,j,k,r1,r2,c1,c2,sum=0;
    int m1[10][10];
    int m2[10][10];
    int mul[10][10];
    printf("How many row and column input here for first matrix: ");
    scanf("%d %d",&r1,&c1);
    printf("How many row and column input here for second matrix: ");
    scanf("%d %d",&r2,&c2);
    while(c1 != r2){

        printf("How many row and column input here for first matrix: ");
        scanf("%d %d",&r1,&c1);
        printf("How many row and column input here for second matrix: ");
        scanf("%d %d",&r2,&c2);
    }
    // Input Matrix of A
    printf("\nEnter your value for first matrix row by column : \n");
    for(i = 0;i < r1;i++){
        for(j = 0;j < c1;j++){
            printf("Data[%d][%d] = ",i,j);
            scanf("%d",&m1[i][j]);
        }
    }
    // Input Matrix of B
    printf("Enter your value for first matrix row by column : \n");
    for(i = 0;i < r2;i++){
        for(j = 0;j < c2;j++){
            printf("Data[%d][%d] = ",i,j);
            scanf("%d",&m2[i][j]);
        }
    }
    // Printing Matrix of A
    printf("Value of matrix A : \n");
    for(i = 0;i < r2;i++){
        for(j = 0;j < c2;j++){
            printf("%d\t",m1[i][j]);
        }
        printf("\n");
    }
    // Printing Matrix of B
    printf("Value of matrix B : \n");
    for(i = 0;i < r2;i++){
        for(j = 0;j < c2;j++){
            printf("%d\t",m2[i][j]);
        }
        printf("\n");
    }
    for(i=0;i <r1;i++){
        for(j=0;j<c2;j++){
            for(k=0;k<c1;k++){
                sum = sum + m1[i][k] + m2[k][j];
            }
            mul[i][j] = sum;
            sum = 0;
        }
    }
    // Printing Result matrix
    printf("Value of matrix B : \n");
    for(i = 0;i < r1;i++){
        for(j = 0;j < c2;j++){
            printf("%d\t",mul[i][j]);
        }
        printf("\n");
    }
}

#include<stdio.h>
#include<conio.h>
int main()
{
    int row,col,n,count;
    printf("Enter n = ");
    scanf("%d",&n);
    for(row = 1;row <= n;row++){
        for(col = 1;col <= row;col++){
            printf("%d\t",++count);
        }
        printf("\n");
    }
    printf("Program is Done.");
    getch();
}

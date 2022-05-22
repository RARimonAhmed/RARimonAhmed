#include<stdio.h>
#include<conio.h>
int main()
{
    int n,i,row,col;
    printf("Enter n : ");
    scanf("%d",&n);
    for(row = n;row >= 1;row--)
    {
        for(col = 1;col <= n - row;col++)
        {
            printf(" ");
        }
        for(col = 1;col <= row;col++)
        {
            printf("%d",col);
        }
        printf("\n");
    }
}

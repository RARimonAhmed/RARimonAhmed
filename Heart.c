#include<stdio.h>
#include<conio.h>
int main()
{
    int row,col,n,count = 1;
    printf("Enter n = ");
    scanf("%d",&n);
    for(row =1; row <= n; row++)
    {
        for(col = 1; col <= row; col++)
        {
            if(row == 1 && col == 1)
            {
                printf(" ");
            }
            else
            {
                printf("*");
            }
        }
    }
    getch();

}

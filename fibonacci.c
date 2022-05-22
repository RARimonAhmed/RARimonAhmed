#include<stdio.h>
#include<conio.h>
int main()
{
    int n,count,firstnumber=0,secondnumber=1,fibo;
    printf("Enter your last number  : ");
    scanf("%d",&n);
    for(count = 0;count <= n;count++)
    {
        if(count <= 1)
        {
            fibo = count;
        }
        else
        {
            fibo = firstnumber + secondnumber;
            firstnumber = secondnumber;
            secondnumber = fibo;
        }
        printf("%d\t",fibo);
    }
    getch();
}

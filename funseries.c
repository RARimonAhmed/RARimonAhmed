// 1 - 2 + 3 - 4 + 5 - 6..........
// 1 - 2 + 3 - 4 + 5 - 6..........

#include<stdio.h>
#include<conio.h>
int main()
{
    int n,i,sum,even = 0,odd = 0;
    printf("Enter your last term : ");
    scanf("%d",&n);
    for(i = 1;i <= n;i++)
    {
        if(i % 2 == 0)
        {
            even = even + i;
        }
        else
        {
            odd = odd + i;
        }

    }
    sum = odd - even;
    printf("Sum = %d",sum);
}

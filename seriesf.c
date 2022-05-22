#include<stdio.h>
#include<conio.h>
int main()
{

    float n,sum = 0;
    printf("Enter your last value of series : ");
    scanf("%f", &n);
    for(float i = 1.5;i < n;i++)
    {
        sum = sum + i;
    }
    printf("The summetion of series is : %f",sum);



    getch();
}

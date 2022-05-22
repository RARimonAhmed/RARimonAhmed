#include<stdio.h>
#include<conio.h>
int main()
{

    double n,sum = 0,i;
    printf("Enter your last value : ");
    scanf("%lf",&n);
    for(i = 1;i <= n;i++)
    {

        sum = sum + (1/i);

        if(i == 1){
            printf("\n1 + ");
        }
        else if(i == n){

            printf("(1 / %.2lf)",i);
        }
        else{
            printf("+ 1 / %.2lf +",i);
        }

    }
    printf("Sum = %.2lf",sum);
    getch();


}

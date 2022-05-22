#include<stdio.h>
#include<conio.h>
int main()
{
    double lastnumber,initial,summetion;
    printf("Enter your initial value of series : ");
    scanf("%lf", &initial);
    printf("Enter your last number of serties : ");
    scanf("%lf", &lastnumber);
    for(initial;initial <= lastnumber;initial++)
    {
        summetion = summetion + initial;
    }
    printf("The result of this series = %.2lf ",summetion);
    getch();
}

#include<stdio.h>
#include<conio.h>
int main()
{
    int num[] = {10,20,30,14,17,58};
    int i,pos=-1,value;
    /*printf("Enter your value : ");
    for(i = 0;i < 5;i++)
    {
        scanf("%d",&num);
    }*/
    printf("Enter your finding value : ");
    scanf("%d",&value);
    for(i = 0;i < 6;i++)
    {
        if(value == num[i])
        {
            pos = i + 1;
            break;
        }
    }
    if(pos == -1)
    {
        printf("Not found");
    }
    else
    {
        printf("The possition of %d = %d",value,pos);
    }
    printf("\n");
    getch();
}

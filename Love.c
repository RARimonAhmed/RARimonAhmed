#include<stdio.h>
void gach3()
{
    for(int i = 1;i <= 83;i++)
    {
        printf("_");
    }
    for(int i = 1;i<=13;i++){
        printf("<>");
    }
    for(int i = 1;i <= 29;i++){
        printf("_");
    }
    printf("\n");

}
void gach(){
    for(int i = 1;i <= 125;i++){
        printf("_");
    }
    printf("\n");

}
void show1(){
    for(int i = 1;i <= 7;i++)
    {
        if(i != 1){
            for(int i = 1;i <= 14;i++){
                printf("_");
            }
            for(int i = 1;i <= 5;i++){
                printf("<>");
            }
            for(int i = 1;i<= 14;i++){
                printf("_");
            }
        }
    }
}
void show(){
    for(int i = 1;i<=2;i++){
        for(int i = 1;i <= 10;i++){
            printf("_");
        }
        for(int i = 1;i<=13;i++)
        {
            printf("<>");
        }
        for(int i = 1;i<=102;i++){
            printf("_");
        }
        printf("\n");
    }
}
int main()
    gach();
    show();
    show1();
    show2();
    show3();
    gach2();
    gach3();
    return 0;

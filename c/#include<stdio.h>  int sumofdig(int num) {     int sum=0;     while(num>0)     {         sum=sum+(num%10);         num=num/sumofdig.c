#include<stdio.h>

int sumofdig(int num)
{
    int sum=0;
    while(num>0)
    {
        sum=sum+(num%10);
        num=num/10;
    }
    return sum;
}


int main()
{   
    int num,result;
    scanf("%d",&num);
    result=sumofdig(num);
    printf("%d",result);
    return 0;
}


#include<stdio.h>

int reverse(int num)
{
    int rev=0;
    while(num>0)
    {
        rev=rev*10+(num%10);
        num=num/10;
    }
    return rev;
}


int main()
{   
    int num,result;
    scanf("%d",&num);
    result=reverse(num);
    printf("%d",result);
    return 0;
}


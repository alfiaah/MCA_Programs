#include<stdio.h>

int fun(int num)
{
    int lar=0;
    while(num>0)
    {  
        int n=num%10;
        if(n>lar)
        {
            lar=n;
        }
        num=num/10;
        
    }
    return lar;
}

int main()
{   
    int num,result;
    scanf("%d",&num);
    result=fun(num);
    printf("%d",result);
    return 0;
}


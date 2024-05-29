#include<stdio.h>
int main()
{
    int n;
    scanf("%d",&n);
    int a[n];
    int largest=a[0];
    int slargest=a[1];
    for(int i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    for(int i=0;i<n;i++)
    {
        if(a[i]>largest)
        {
            largest=a[i];
        }
    }
    for(int i=0;i<n;i++)
    {
        if(a[i]<largest && a[i]>slargest)
        {
            slargest=a[i];
        }
    }
    printf("%d",slargest);
    
}

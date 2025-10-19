import java.util.*;
class PrimeInArray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        
        for(int x=0;x<a.length ;x++)
        {
        System.out.println("Enter any number");
            a[x]=sc.nextInt();
        }
        for(int x=0; x<a.length; x++)
        {

        
        int n=a[x];
        int flag=0;
        int y=2;
        while(y<=n/2)
        
        
        {
            if(n%y==0)
            {
                flag=1;
                break;
            }
            y++;
        }
        if(flag==0)
        {
            System.out.println("Prime number =" +n);
        }
    }   
    }
}

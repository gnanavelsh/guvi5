import java.util.*;
class guvi5
{
public static void main(String args[])
{
int temp=0,y=0,i,j;
Scanner s1=new Scanner(System.in);
String s=s1.nextLine();
int n1=s1.nextInt();
int n=s.length();
char[] a=new char[n];
a=s.toCharArray();
int []aa=new int[n];
for(i=0;i<n;i++)
{
aa[i]=Character.getNumericValue(a[i]);
}

for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(aa[i]>aa[j])
{
temp=aa[i];
aa[i]=aa[j];
aa[j]=temp;
}
}
}
int n2=n-n1;
for(i=0;i<n2;i++)
{
y=y*10+aa[i];
}
System.out.println(y);

}
}
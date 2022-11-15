import java.util.Scanner;

class ArrayExample1
{
public static void main(String args[])
{
int a[]=new int[5];
a[0]=20;
a[1]=30;
a[2]=40;

System.out.println("First element="+a[0]);
System.out.println("second element="+a[1]);
System.out.println("third element="+a[2]);
System.out.println("Fourth element="+a[3]);//it will print default value
System.out.println("Fifth element="+a[4]);//it will print default value
System.out.println("Fifth element="+a[5]);// index is out of bound , so it will through error at run time
}
}


class ArrayExample2
{
public static void main(String args[])
{
int a[]=new int[5];
a[0]=20;
a[1]=30;
a[2]=40;

System.out.println("First element="+a);// print the address of base index
}
}


class ArrayExample3
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int a[]=new int[5];
		
		for (int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Array is");
		for (int j=0;j<5;j++)
		{
			
			System.out.println(a[j]);
		}
	}
}
		


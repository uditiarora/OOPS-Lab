import java.util.*;
class sin extends Thread
{
	public void run()
	{
		for(int i=0;i<=90;i++)
		{
			System.out.println(Thread.currentThread().getName()+" Sin(" + i + "deg) = " + Math.sin(Math.toRadians(i)));
		}
	}
}
class cos extends Thread
{
	public void run()
	{
		for(int i=0;i<=90;i++)
		{
			System.out.println(Thread.currentThread().getName()+" Cos(" + i + "deg) = " + Math.cos(Math.toRadians(i)));
		}
	}
}
class q4{
	public static void main(String []args)
	{
		sin a = new sin(); 
		cos b = new cos(); 
		a.start(); 
		b.start(); 
	}
}

interface function
{
	public abstract int evaluate(int d);
}

class half implements function
{
	public int evaluate(int d)
	{
		return d/2;
	}
}

class q3
{
	public static void main(String[] args)
	{
		int[] elements=new int[5];
		for(int i=0;i<5;i++)
		{
			elements[i]=(i+1)*10;
		}
		//elements={10,20,30,40,50};
		half h=new half();
		for(int i=0;i<5;i++)
		{
			elements[i]=h.evaluate(elements[i]);
		}
		for(int i=0;i<5;i++)
		{
			System.out.println(elements[i]);
		}
		
	}

}

class CircularPattern
{
	public static boolean check(int num)
	{
		int iteration=0,temp=num;
		while (temp>0)//step1 count num of digits
		{
			iteration++;
			temp=temp/10;
		}
		for (int i=1;i<=iteration; i++) //step4 repeat step2 and step3 iteration number of times
		{
			for (int j=2;j<=num-1;j++)//step2 check given number is primeor not
			{
				if(num%j==0)
				{
					return false;
				}
			}
				int rem2=num%10;
				int m1=num/10;
				num=rem2*(int)Math.pow(10,iteration-1)+m1;//step3 rotate given number
				System.out.println(num);
		}
		return true;
	}
	public static void main(String[] args) 
	{
		System.out.println(check(111));
	}
}
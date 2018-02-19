package package0020;

public class Task_0007_10001st_prime {
	private static boolean Jeprvocislo(long c)
	{
		long polovina=c/2;
		for	(long i=2;i<=polovina;i++)
		{
			if (c%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String args[]) {
		long a=1;
		long pocetprvocisel=0;
		while (pocetprvocisel<10001)
		{
			a++;
			if(Jeprvocislo(a))
			{
				pocetprvocisel++;
			}
			
		}
		System.out.println(a);
	}

}

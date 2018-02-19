package package0020;

public class Task_0006_SumSquareDifference {
	
	public static void main(String args[]) {
		int n=0;
		int a=0;
		for (int i=0;i<=100;i++)
		{
			n+=i*i;
			a+=i;
		}
		a=a*a;
		int result=a-n;
		System.out.println(result);
	}

}

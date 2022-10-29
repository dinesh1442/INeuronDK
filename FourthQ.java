
public class FourthQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=15;
		for(int i=0;i<=n-1;i++)
		{
		for(int j=0 ; j<n; j++)
		{
			if(j==0&&i>n/2||i==n-1||j==n-1&&i>n/2||i-j>=((n-1)/2-1)||i+j>=n+((n-1)/2-2))
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
				
			}
			
		}
		System.out.println(" ");
		}

	}

}

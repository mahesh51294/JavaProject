package sample;

public class Pattern {

	public static void main(String[] args) {
	
		int rows=4;
		int r1=rows;
		for(int i=1;i<=rows;i++)
		{
			for(int k=1;k<i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=r1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			r1--;
			
		}

	}

}

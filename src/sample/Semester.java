package sample;

public class Semester {
	int phy,chem,maths;
	public void acceptMarks(int p,int c,int m)
	{
         phy=p;
         chem=c;
         maths=m;
        
	}
	
	public void show()
	{
		System.out.println(" enter physics marks" + phy);
        System.out.println("enter chemistry marks" + chem); 
        System.out.println("enter maths marks" + maths);
	}

}

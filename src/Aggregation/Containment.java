package Aggregation;

public class Containment {

	public static void main(String[] args) {
		
		MyDate md=new MyDate();
		Bill b=new Bill();
		
		md.setDate(12);
		md.setMonth(5);
		md.setYear(1999);
		
		b.setBillAmouint(12000);
		b.setBillNumber(51294);
		b.setM(md);
		
		
		System.out.println(b);
		// TODO Auto-generated method stub

	}

}

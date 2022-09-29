package Aggregation;

public class Person1 {
	private String name;
	 private String gender; 
	 private int age; 
	 private String address;
	 private Address1 adrc;
	 
	 public String getName()
	 {
		 return name;
	 }
	 public void setName(String name)
	 {
		 this.name=name;
	 }
	 
	 public String getGender()
	 {
		 return gender;
	 }
	 public void setGender(String gender)
	 {
		 this.gender=gender;
	 }
	 public int getAge()
	 {
		 return age;
	 }
	 public void setAge(int age)
	 {
		 this.age=age;
	 }
	 public String getAddress()
	 {
		 return address;
	 }
	 public void getAddress(String address)
	 {
		 this.address=address;
	 }
	 public Address1 getAdressContainment(Address1 adrc )
	 {
		 return adrc;
	 }
	 public void setAdressContainment()
	 {
		 this.adrc=adrc;
	 }
	
	 
	 public String toString()
	 {
		 return "Name of the person is " + name + "\n" + "Gender of that person is " + gender + "\n" + "Age of that person is " + age + "\n" + "His Address is " + address  ;
	 }
	 

}

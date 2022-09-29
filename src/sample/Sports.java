package sample;

public class Sports {

	public static void main(String[] args) {
		Player p=new Player();
		p.setName("Virat Kohli");
		p.setId(1);
		p.setAge(28);
		p.setWeight(52);
		System.out.println("name of player is " +p.getName());
		System.out.println("ID of player is  " +p.getId());
		System.out.println("Age of player is  " +p.getAge());
		System.out.println("Weight of player is  " +p.getWeight());

	}

}

package Game;

public class MyPlayer extends MyCreature implements Player{
	//private String name;
	//private String description;
	//private int hitPoints;
	//private int damage;
	private int healAmount;

	public MyPlayer(String name, String description, int hitPoints, int damage, int healAmount ){
		super(name, description, hitPoints, damage);
		this.healAmount = healAmount;
	}
	public void heal() {
		//this.hitPoints + this.healAmount= hitPoints;
		setHitPoints(getHitPoints()+ healAmount);
		
		System.out.print(getName() + " is healed by " + healAmount );
	}

}

package Game;

public class MyPlayer extends MyCreature implements Player{
	private String name;
	private String description;
	private int hitPoints;
	private int damage;
	private int healAmount;

	public MyPlayer(String name, String description, int hitPoints, int damage, int healAmount ){
		super(name, description, hitPoints, damage);
		this.healAmount = healAmount;
	}
	public void heal() {
		setHitPoints(getHitPoints()+ healAmount);
		//this.hitPoints + this.healAmount= hitPoints;
		System.out.print(this.name + " is healed by " + healAmount );
	}

}

package Game;

public abstract class MyCreature implements Creature{
	private String name;
	private String description;
	private int hitPoints;
	private int damage;

	public MyCreature(String name, String description, int hitPoints, int damage){
		this.name = name;
		this.description=description;
		this.hitPoints=hitPoints;
		this.damage=damage;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setDescription(String description) {
		this.description=description;
	}
	public void setHitPoints( int hitPoints) {
		this.hitPoints=hitPoints;
	}
	public void setDamage(int damage) {
		this.damage=damage;
	}
	public String getName(){
		return name;
	}
	public String getDescription() {
		return description;
	}
	public int getHitPoints() {
		return hitPoints;
	}
	public boolean isAlive() {
		if(hitPoints > 0) {
			return true;
		} else {
			return false;
		}
	}
	public void takeDamage(int damage) {
		if(hitPoints - damage >= 0) {
			hitPoints -= damage; 
		} else {
			 hitPoints = 0;
		}
	}
	public void attack(Creature creature) {
		System.out.println(this.name + " attacks "  + creature.name + ", dealing " + damage + " damage");
	}

	@Override
	public String toString() {
		String s = String.format("name %15s, description %20s, hitPoints %03d, damage %02d", name, description, hitPoints, damage);
		return s;
	}

}

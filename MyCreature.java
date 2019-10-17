package Game;

public class MyCreature extends java.lang.Object implements Creature{
	private String name;
	private String description;
	private int hitPoints;
	private int damage;
	private Room room;

	public MyCreature(String name, String description, int hitPoints, int damage){
		this.name = name;
		this.description=description;
		this.hitPoints=hitPoints;
		this.damage=damage;
		this.room=null;
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
	public void setRoom(Room room) {
		this.room=room;
	}
	public Room getRoom() {
		return room;
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
		System.out.println(this.name + " attacks "  + creature + ", dealing " + damage + " damage");
	}

	@Override
	public String toString() {
		String s = String.format("name %15s, description %20s, hitPoints %03d, damage %02d", name, description, hitPoints, damage);
		return s;
	}

}

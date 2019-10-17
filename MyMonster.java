package Game;

public  class MyMonster extends MyCreature implements Monster {
	private int enrageThreshold;
	public MyMonster(String name, String description, int hitPoints, int damage, int enrageThreshold) {
		super(name, description, hitPoints, damage);
		this.enrageThreshold = enrageThreshold;
	}
	public boolean canEnrage() {
		if( getHitPoints()/*this.hitPoints*/ < this.enrageThreshold) {
			return true;
		} else {
			return false;
		}
	}
	public void enrage() {
		if(canEnrage() == true) {
			setDamage(getDamage()*2);
		} 
		System.out.println(getName() + " has been enraged");
	}

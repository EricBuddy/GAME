package Game;

public abstract class MyMonster extends MyCreature implements Monster {
	private int enrageThreshold;
	//protected damage ;
	public MyMonster(String name, String description, int hitPoints, int damage, int enrageThreshold) {
		super(name, description, hitPoints, damage);
		this.enrageThreshold = enrageThreshold;
	}
	public boolean canEnrage() {
		if( this.hitPoints < this.enrageThreshold) {
			return true;
		} else {
			return false;
		}
	}
	public void enrage() {
		if(canEnrage() = true) {
			setDamage(getDamage()*2);
		} else {
			canEnraged() = false;
		}
		System.out.println(MyMonster.name + " has been enraged");
	}
	
	}
	
	

}

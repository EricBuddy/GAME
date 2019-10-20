package Game;

public class MyPlayer extends MyCreature implements Player{

		private int healAmount;
		
		public MyPlayer(String name, String description, int hitPoints, int damage, int healAmount) {
			super(name, description, hitPoints, damage);
			this.healAmount = healAmount;
		}
		
		public void heal() {
			setHitPoints(getHitPoints() + healAmount);
			System.out.println(getName() + " is healed by " + healAmount);
		}
		
	}

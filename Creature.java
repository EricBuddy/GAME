package Game;

public interface Creature {
	String name = null;
	public void attack(Creature creature);
	public void takeDamage(int damage);
	public boolean isAlive();
	@Override
	public String toString();


}

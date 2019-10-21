package Game;

public interface Creature {
	public void attack(Creature creature);
	public void takeDamage(int damage);
	public boolean isAlive();
	@Override
	public String toString();
public String getName();

}

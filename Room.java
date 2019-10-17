package Game;
public interface Room {
	public boolean isComplete();
	public void enter(Player player);
	@Override
	public String toString();
	


}

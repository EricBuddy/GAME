package Game;

public class MyRoom extends java.lang.Object implements  Room{
	private int roomIndex;
	private String description;
	private Monster monster;
	public MyRoom(int roomIndex, String description, Monster monster ) {
		this.roomIndex= roomIndex;
		this.description=description;
		this.monster=monster;
	}
	public boolean isComplete() {
		
		
		
	}
	public void enter(Player player) {
		
	}
	@Override
	public String toString() {
		String s = String.format("Room index %15s, description %20s, monster name %20s", roomIndex, description, monster);
		return s;
	}
}

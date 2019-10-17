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
		if(isAlive()== true){
		    
		}
		
		
	}
	public void enter(Player player) {
		System.out.println(player+ "This room is "+ this.description4+ ", and has "+ this.monster);
	}
	@Override
	public String toString() {
		String s = String.format("Room index %15s, description %20s, monster name %20s", roomIndex, description, monster);
		return s;
	}
}

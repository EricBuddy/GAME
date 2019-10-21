package Game;
import java.io.PrintWriter;


public class MyRoom extends java.lang.Object implements  Room{
	private int roomIndex;
	private String description;
	private MyMonster monster;

	public MyRoom(int roomIndex, String description, MyMonster monster) {
		this.roomIndex = roomIndex;
		this.description = description;
		this.monster = monster;
	}
		
	public boolean isComplete() {
		if(!monster.isAlive()) {
			return true;
		} else {
			return false;
		}
	}


	public void enter(MyPlayer player, PrintWriter pw) {
		System.out.println(player.getName() + " enters room " + roomIndex);
		System.out.println("This Room is " + description + ", and has monster " + monster);
		if(monster.isAlive()) {
			MyBattle b1 = new MyBattle(player, monster, pw);
			b1.run(pw);
			
		} else {
			System.out.println("DEAD");//monster.getName() + " is dead"
			isComplete();
		}

	}
	
	@Override
	public String toString() {
		String s = String.format("Room index %2d, description %20s, monster name %20s", roomIndex, description, monster);
		return s;
	}



	//@Override
//	public void enter(Player player) {
		// TODO Auto-generated method stub
		
//	}
	


}

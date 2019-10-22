package Game;

import java.io.PrintWriter;

public class MyTreasureRoom extends MyRoom implements TreasureRoom{
	private String treasure;
	//private int roomIndex;
	public MyTreasureRoom(int roomIndex, String description, MyMonster monster, String treasure ) {
		super(roomIndex, description,monster );
		this.treasure=treasure;
	}

	
	public void enter(MyPlayer player, MyMonster monster,PrintWriter pw) {
		System.out.println(player.getName() + " enters room " + getRoomIndex() + 
				"This Room is " + getDescription() + ", and has monster " + monster.getName());
		if(monster.isAlive()) {
			Battle firstFight = new MyBattle(player,monster, pw);
			firstFight.run(pw);
			if(player.isAlive()) {
				System.out.println("You explored the room and found the hidden treasure!");
			}
		} else {
			isComplete();
		}
		
	}

	

}

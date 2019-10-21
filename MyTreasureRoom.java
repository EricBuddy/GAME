package Game;

public class MyTreasureRoom extends MyRoom implements Room{
	private String treasure;
	
	public MyTreasureRoom(int roomIndex, String description, MyMonster monster, String treasure ) {
		super(roomIndex, description,monster );
		this.treasure=treasure;
	}

	@Override
	public void enter(MyPlayer player) {
		System.out.println(player.getName() + " enters room " + roomIndex + 
				"This Room is " + getDescription() + ", and has monster " + getMonster());
		if(getMonster().isAlive()) {
			Battle firstFight = new MyBattle(player,monster);
			firstFight.run();
			if(player.isAlive()) {
				System.out.println("You explored the room and found the hidden treasure!");
			}
		} else {
			isComplete();
		}
		
	}

	

}

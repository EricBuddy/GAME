package Game;

public class MyTreasureRoom extends MyRoom implements Room{
	private String treasure;
	
	public MyTreasureRoom(int roomIndex, String description, Monster monster, String treasure ) {
		super( roomIndex, description,monster );
		this.setTreasure(treasure);
	}

	@Override
	public void enter(Player player) {
		System.out.println(player + " enters room " + getRoomIndex()+ "This Room is " + getDescription() + ", and has monster " + getMonster());
		if(getMonster().isAlive()) {
			Battle firstFight = new MyBattle(player, getMonster());
			firstFight.run();
			if(player.isAlive()) {
				System.out.println("You explored the room and found the hidden treasure!");
			}
		} else {
			isComplete();
		}
		
	}

	public String getTreasure() {
		return treasure;
	}

	public void setTreasure(String treasure) {
		this.treasure = treasure;
	}

}

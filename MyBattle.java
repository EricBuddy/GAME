package Game;

public abstract class MyBattle  implements Battle{
	private MyPlayer player;
	private Monster monster;

	public MyBattle( Player player, Monster monster) {
		this.player= (MyPlayer) player;
		this.monster=(MyMonster)monster;
	}
	

}

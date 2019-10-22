package Game;

import java.io.PrintWriter;

public interface TreasureRoom extends Room {
	
	public void enter(MyPlayer player,MyMonster monster,PrintWriter pw);
	
}
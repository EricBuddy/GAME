package Game;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;



public class MyGame extends java.lang.Object implements Game{
	private MyPlayer player;
	private MyRoom[] dungeon = null;
	


	
	public MyGame() {
		PrintWriter outStream = null;
		
		
		try {
			outStream = new PrintWriter("PlayerInfo.txt");
			outStream.println("Shuckle");
			outStream.println("the best defense pokemon");
			outStream.println("2000");
			outStream.println("10");
			outStream.println("500");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		finally{
			if(outStream != null){
				outStream.close(); 
			}
		}
		
	
		
		
		Scanner inputStream = null;
		try {
			
			File playerinfo = new File("PlayerInfo.txt");
			inputStream = new Scanner(playerinfo);
			String name = inputStream.nextLine();
			String description = inputStream.nextLine();
			int hitPoints = inputStream.nextInt();
			int damage = inputStream.nextInt();
			int healAmount = inputStream.nextInt();
			player = new MyPlayer(name, description, hitPoints, damage, healAmount);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		finally{
			if(inputStream != null){
				inputStream.close();
			}
		}
	
		
		dungeon = new MyRoom [3];
		MyMonster monster1 = new MyMonster("Orc", "covered with green blood", 20, 5, 0);
		MyRoom room1 = new MyRoom(0, "A room with an unbearable smell", monster1);
		
		MyMonster monster2 = new MyMonster("Skeleton", "funny how it moves", 40, 10, 10);
		MyRoom room2 = new MyRoom(1, "dark and cold", monster2);
		
		MyMonster monster3 = new MyMonster("Fire dragon", "spout fire with each breath", 100, 20, 40);
		MyRoom room3 = new MyRoom(2, "a giant hall with something shiny on the other end", monster3);
		//room3.enter(player);
		
		dungeon[0] = room1;
		dungeon[1] = room2;
		dungeon[2] = room3;
		
		

		
		
		
		
	}


	
	public void play() {
		
		PrintWriter gameLog = null;
		
		try {
		 gameLog = new PrintWriter("/Users/desireeburrell333/eclipse-workspace/Game/src/Game/GameLog.txt");
		} catch (FileNotFoundException e ) {
			e.printStackTrace();
		}
		
		
		
		
		for(int i = 0; i < dungeon.length; i++) {
			if(dungeon[i] != null) {
				dungeon[i].enter(player, gameLog);
			}
		}
		gameLog.close();
		
		
		if(player.isAlive()) {
		System.out.println("You explored the room and found the hidden treasure!");
		}
		else {
			System.out.println(player+ " is dead");
		}
		
	}
	public static void main(String[] args) {
		MyGame go = new MyGame();
		go.play();
		
	}
}

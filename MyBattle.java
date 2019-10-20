package Game;

import java.util.Scanner;

public class MyBattle extends java.lang.Object implements Battle{
	private Player player;
	private Monster monster;
	
	public MyBattle(Player player, Monster monster) {
		this.player = player;
		this.monster = monster;
	}
	@Override
	public void run() {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Battle begins: " + player.getName() + " vs. " + monster.getName());
		System.out.println("Player HP: " + player.getHitPoints() + "\n Monster HP: " + monster.getHitPoints());
		while(player.isAlive() && monster.isAlive()) {
			System.out.println("Player's turn: attack (a) or heal (h)?");
			char input = scnr.next().charAt(0);
			if(input == 'a') {
				player.attack(monster);
				monster.takeDamage(player.getDamage());
				monster.isAlive();
			}
			else if (input == 'h') {
				player.heal();
				monster.isAlive();
			}
			System.out.println("Monster's turn:");
			if(monster.canEnrage() == true) {
				monster.enrage();
			}
			monster.attack(player);
			player.takeDamage(monster.getDamage());
			if(!monster.isAlive()) {
			System.out.println(monster.getName() + " is dead");
			} else {
			System.out.println("Player HP: " + player.getHitPoints() + " \n Monster HP: " + monster.getHitPoints());
			}

		}
		
	}
}

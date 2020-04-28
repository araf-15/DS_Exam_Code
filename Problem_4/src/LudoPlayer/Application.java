package LudoPlayer;

import java.util.Scanner;

public class Application {
	public static void main(String[] args){
		
		LudoPlayerFactory player = new LudoPlayerFactory();
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		String color = sc.nextLine();
		
		
		LudoPlayer ludoPlayer = player.createLudoPlayer(color, name);
		ludoPlayer.roolDice();
		ludoPlayer.movePiece();
		System.out.println(ludoPlayer.name);
		System.out.println(ludoPlayer.id);
		System.out.println(ludoPlayer.playerColor);
		
	}
}

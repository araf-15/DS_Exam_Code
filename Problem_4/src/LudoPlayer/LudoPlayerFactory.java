package LudoPlayer;

public class LudoPlayerFactory {
	
	public LudoPlayer createLudoPlayer(String color, String name){
		
		LudoPlayer player = null;
		
		if(color.equals("Red")){
			LudoPlayer redPlayer = new RedPlayer();
			redPlayer.id = "1";
			redPlayer.name = name;
			redPlayer.piceColor = color;
			redPlayer.playerColor = color;
			return redPlayer;
		}else if(color.equals("Green")){
			LudoPlayer greenPlayer = new GreenPlayer();
			greenPlayer.id = "2";
			greenPlayer.name = name;
			greenPlayer.piceColor = color;
			greenPlayer.playerColor = color;
			return greenPlayer;
		}else if(color.equals("Yellow")){
			LudoPlayer yellowPlayer = new GreenPlayer();
			yellowPlayer.id = "3";
			yellowPlayer.name = name;
			yellowPlayer.piceColor = color;
			yellowPlayer.playerColor = color;
			return yellowPlayer;
		}else if(color.equals("Blue")){
			LudoPlayer bluePlayer = new GreenPlayer();
			bluePlayer.id = "4";
			bluePlayer.name =name;
			bluePlayer.piceColor = color;
			bluePlayer.playerColor = color;
			return bluePlayer;
		}
		
		
		
		
		return player;
		
	}
	
}

package LudoPlayer;

public abstract class LudoPlayer {
	
	public String name;
	public String id;
	public String playerColor;
	public String piceColor;
	
	public abstract void getPiece();
	public abstract void roolDice();
	public abstract void movePiece();
	
	
}

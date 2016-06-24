// 100 % Abstract
// What to do
// interface contains abstract methods + it contains constants
abstract interface IPlayer{
	public static final int MAX_POWER = 100;
	 int DEFAULT_POWER = 20;
	public abstract void attack();
	void increasePower();
	void jump();
	void run();
	
}
// How to do
class WhitePlayer implements IPlayer{
	int power= DEFAULT_POWER;
	@Override
	public void attack(){
		System.out.println("WhitePlayer Attack is Punch...");
	}
	public void increasePower(){
		if(power<MAX_POWER){
			power+=2;
		}
		System.out.println("WhitePlayer Power Increase by 2 ");
		
	}
	public void jump(){
		System.out.println("White Player Jump High");
	}
	public void run(){
		System.out.println("White Player Run Average...");
	}
}

class RedPlayer implements IPlayer{
	int power= DEFAULT_POWER;
	@Override
	public void attack() {
		System.out.println("RedPlayer Attack Style is Kick");
		
	}

	@Override
	public void increasePower() {
		if(power<MAX_POWER){
			power++;
		}
		System.out.println("RedPlayer Power Increase by 1 ");
		
	}

	@Override
	public void jump() {
		System.out.println("Red Player Jump Average");
		
	}

	@Override
	public void run() {
		System.out.println("Red Player Run Faster...");
		
	}
	
}

public class TestInterface {

	public static void main(String[] args) {
		IPlayer redPlayer = new RedPlayer();
		redPlayer.attack();
		redPlayer.increasePower();
		redPlayer.jump();
		redPlayer.run();

	}

}

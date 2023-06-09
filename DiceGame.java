import java.util.Random;

public class DiceGame{
    public static void main(String[] args){
	Random d1 = new Random();
	Random d2 = new Random();
	int d1a = 0;
	int d2a = 0;
	while(true){
	    d1a  = d1.nextInt(7);
	    if(d1a!=0){
		break;
	    }
	}
	
	while(true){
	    d2a = d2.nextInt(7);
	    if(d2a!=0){
		break;
	    }
	}
	int ans = d1a+d2a;

	System.out.println("Rolling dice...");
	System.out.println("Dice 1: "+ d1a);
	System.out.println("Dice 2: "+ d2a);
	System.out.println("Total value: "+ ans);
    }
}

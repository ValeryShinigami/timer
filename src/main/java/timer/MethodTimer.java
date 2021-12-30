package timer;

import java.util.TimerTask;

//timerTask fonction qui donne des instructions
public class MethodTimer extends TimerTask {
	
	private int time = 5 ;
	
	@Override
	public void run() {
		
		//cancel pour annuler le compte arrivé à zéro
		if ( time == 0) {
			System.out.println("Go");
			cancel();
			
		}
		System.out.println(time--);

	}
}

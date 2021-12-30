package timer;

import java.util.Timer;
import java.util.TimerTask;

public class Decompte {

	public static void main(String[] args) {

		Timer chrono = new Timer();
		
		//enclencher le démarrage du choronomètre avec .schedule
		chrono.schedule(new MethodTimer(), 1000, 1000);
	}

}

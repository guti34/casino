package casino.core;

import java.util.Random;

public class MaRoulette implements Roulette{

	Random random=new Random();
	@Override
	public int tirage() {		
		return random.nextInt(37);
	}
}

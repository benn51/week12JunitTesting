import java.util.Random;

public class TestDemo {

	public int addPositive(int a, int b) {
		if(a>0 && b>0) {
			return a+b;
		}
		else {
			throw new IllegalArgumentException("Both Parameters need to be positive");
		}	
	
	}
	
	 int randomNumberSquared() {
		int ranadomNumber =getRandomInt();
         int result=  ranadomNumber * ranadomNumber;   

		return result;
	}
	
	
	 int getRandomInt() {
		  Random random = new Random();
		  return random.nextInt(10) + 1;
		}

	
	
}

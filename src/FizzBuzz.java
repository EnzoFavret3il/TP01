
public class FizzBuzz {
	public String Mot(int nb) {
		if(nb%3==0) {
			return "Fizz";
		}
		else if (nb%5==0) {
			return "Buzz";
		}
		else if (nb%15==0) {
			return "FizzBuzz";
		}
		else {
			return String.valueOf(nb);
		}
	}
}

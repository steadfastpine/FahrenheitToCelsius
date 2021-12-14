package fahrenheitToCelsius;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		double centigrade, fahrenheit;
		fahrenheit = 50.0;
		centigrade = (fahrenheit - 32)*((float)5/(float)9);
		System.out.print(centigrade);
	}

}

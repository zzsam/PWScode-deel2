package PWS;

public class NewtonRaphson {

	public static double f (double x){										
		double antwoord = 2* Math.pow(x,2)+ 7*x + 5;						// dit is de functie f(x)
		return antwoord;
	}
	public static double g(double x){ 										// dit is functie g(x), hierin g(x) = f'(x)
		double antwoordafgeleide =  (  f(x + 0.0000001)- f(x))/0.0000001;	// de afgeleide van f(x) wordt berekend in een punt
		return antwoordafgeleide;
	}
	public static double newtonRaphson(double i){
		int maximum = 0;
		double x1 = i*0.1;
		boolean doorgaan = true;

		while (doorgaan == true && maximum<=1E6){
			x1 = x1 - ((f(x1)/g(x1)));										// Dit is de formule van de newton raphson
			maximum++;
			
			if (f(x1) <= 1E-10 && f(x1)>= (-1E-10)){
				doorgaan = false;
			
				return x1;													// Als het antwoord gevonden is, wordt dit gereturned 
			}
			
			
		}
		return x1;
	}
	
	public static void main(String [] args){
		System.out.println("deze forumle is nul bij: x= " + newtonRaphson(0.1));
		if ((newtonRaphson(0.1) - newtonRaphson(-1E10))>=0.0001 ||(newtonRaphson(0.1) - newtonRaphson(-1E10))<=-0.0001 )
			System.out.println("& deze forumle is nul bij: x= " +newtonRaphson(-1E10));
	
	}
	
}

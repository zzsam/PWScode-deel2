package PWS;

public class Rekenen {
	
	static int n = 3;
	


	
	
//------------------------------------------------------------------------------ B R U I K B A R E   G R O E P E N ----------------------------------------------------------------------------------------
	
	// hoeveel groepen een logaritme hebben
	public static int timesLog( boolean[] A){ // Tellen hoeveel groepen er van de doorgegeven groepen bruikbaar zijn
		int i= A.length-1;
		int aantal=0;
		int keer = A.length;
		while(keer>0){
			if(A[i]== true){
				aantal++;
			}
			i--;
			keer--;
		}
		return aantal;
	}
	public static int timesAtotX( boolean[] A){		// Tellen hoeveel groepen er van de doorgegeven groepen bruikbaar zijn.
		int i= A.length-1;
		int aantal=0;
		int keer = A.length;
		while(keer>0){
			if(A[i]== true){
				aantal++;
			}
			i--;
			keer--;
		}
		return aantal;
	}
	public static int timesSin(boolean[] A){	// Tellen hoeveel groepen er van de dorogegeven groepen bruikbaar zijn.
		int i = A.length-1;
		int aantal=0;
		int keer = A.length;
		while(keer>0){
			if(A[i] == true){
				aantal++;
			}
			i--;
			keer--;
		}
		
		return aantal;
	}
	public static int timesCos(boolean[] A){	// Tellen hoeveel groepen er van de doorgegeven groepen bruikbaar zijn.
		int i = A.length-1;
		int aantal=0;
		int keer = A.length;
		while(keer>0){
			if(A[i] == true){
				aantal++;
			}
			i--;
			keer--;
		}
		return aantal;
	}
	public static int timesTan(boolean[] A){	// Tellen hoeveel groepen er van de doorgegeven groepen bruikbaar zijn.
		int i = A.length-1;
		int aantal=0;
		int keer = A.length;
		while(keer>0){
			if(A[i] == true){
				aantal++;
			}
			i--;
			keer--;
		}
		return aantal;
	}
	// hoeveel groepen er werkelijk zijn(groepen met A=0 er uit halen)
	public static int timesA( double A[]){ // Tellen hoeveel groepen er van de doorgegeven groepen bruikbaar zijn
		int i= A.length-1;
		int aantal=0;
		int keer = A.length;
		while(keer>0){
			if(A[i]>0 || A[i]<0){
				aantal++;
			}
			i--;
			keer--;
		}
		
		return aantal;
	}
	// hoeveel van de groepen een macht hebben
	public static int timesB( double A[]){ // Tellen hoeveel groepen er van de doorgegeven groepen een macht hebben
		int i= A.length-1;
		int aantal=0;
		int keer = A.length;
		while(keer>0){
			if(A[i]>1.0 || A[i]<1.0){
				aantal++;					// aantal machten die aanders zijn dan 1 gaat 1 omhoog
			}
			i--;
			keer--;
		}
		return aantal;
	}
	
	public static int timesX(boolean A[]){
		int i= A.length-1;
		int aantal=0;
		int keer = A.length;
		while(keer>0){
			if(A[i]== true){
				aantal++;
			}
			i--;
			keer--;
		}
		return aantal;
	}

		

	
//-------------------------------------------------------------------------------------- O P L O S S E N -------------------------------------------------------------------------------------------------
	
	// ax^b = c hier wordt x berekend
    public static double eenTermOplossen(double a, double b, double c){
    	double xvinden;
    	xvinden = Math.pow((c/a),( 1/b));
    	return xvinden;
    }
    //ax^b + dx = 0 hier wordt x berekend
    public static void simpelOntbinden(double A, double kwadraat, double B){
 		double kwadraatAntwoord = 1/( kwadraat -1);
 		if (kwadraat >=1 && kwadraat <=-1)   {
 			if((kwadraat)%2 ==0){
 				double antwoord = -1 * Math.pow( B/A, kwadraatAntwoord);
 				GUIpws.textField.setText("x= 0 & x= "+ antwoord );
 			}	
 			else{
 				double antwoord = -1 * Math.pow( B/A, kwadraatAntwoord); 
 				GUIpws.textField.setText("x= 0 & x= "+ antwoord+ " & bij x= "+ -antwoord );
 			}
 			}
 			else {
 				double antwoord = -1 * Math.pow( B/A, kwadraatAntwoord);
 				GUIpws.textField.setText("x= 0 & x= "+ antwoord );
 			}
 	}
  
    // ax^2 + bx + d = c hier wordt x berekend
    public static double kwadratischeformule1(double a, double b, double c){
    	double abcd1, abcd2;
        abcd1 = (-b + Math.sqrt(Math.pow(b,2) - 4*a*c)) / (2*a);    
        abcd2 = (-b - Math.sqrt(Math.pow(b,2) - 4*a*c)) / (2*a);
        return Math.max(abcd1,abcd2);								// Hoogste waarde van de twee gevonden antwoorden voor x
     }
    public static double kwadratischeformule2(double a, double b, double c){
        double abcd1, abcd2;
        abcd1 = (-b + Math.sqrt(Math.pow(b,2) - 4*a*c)) / (2*a);
        abcd2 = (-b - Math.sqrt(Math.pow(b,2) - 4*a*c)) / (2*a);
        return Math.min(abcd1,abcd2);								// Laagste waarde van de twee gevonden antwoorden voor x
     }
	
     //a^log x = c hier wordt x berekend
    public static double logb(double a, double c){
        double answer2;
        answer2 = (Math.pow(a,c));
        return answer2;
     }
    
     //a^x = c hier wordt x berekend
    public static double Atotx(double a, double c){
        double x1;
        x1 = (Math.log10(c)) / (Math.log10(a));
        return x1;
    }
    
    //a^x + d = c hier wordt x berekend
    public static double AtotXPlusB(double a, double d, double c){
    	double x;
    	c= c-d;
    	x = (Math.log10(c)) / (Math.log10(a));
    	return x;
    }
    //a * sin x = c hier wordt x berekend
    public static double Sinx(double antwoord, double a1){
		double save = StrictMath.asin(antwoord/a1);
			
		return save;
	}
    //a *cos x = c hier wordt x berekend
	public static double Cosx(double antwoord, double a1){
		double save = StrictMath.acos(antwoord/a1);
		
		return save;
	}
	//a *tan x = c hier wordt x berekend
	public static double Tanx(double antwoord, double a1){
		double save = StrictMath.atan(antwoord/a1);
		
		return save;
	}
	
//------------------------------------------------------------------------------------ T O E W I J Z E N ----------------------------------------------------------------------------------------------------
    
	public static void toewijzen(int A, int B, int log, int Sin,int Cos, int Tan, int aantalAtotx, int X, double[]AwaardesVoorClass,double[]BwaardesVoorClass, boolean[] Atotx, double antwoord){   	// Alle variabelen C, in dit stuk, moeten door de UI bepaald worden
			
		if(aantalAtotx <=1)	{
			if(Atotx[0] == false && B<=1){												
					if( A == 3 && B ==1 && log == 0 && Sin ==0 && Cos == 0 && Tan == 0 && BwaardesVoorClass[0] == 2 && X == 2 ){			// hierbij moet die ene macht wel gelijk zijn aan 2, anders numeriek oplossen
						GUIpws.textField.setText("x = "  + kwadratischeformule1(AwaardesVoorClass[0],AwaardesVoorClass[1],AwaardesVoorClass[2])+ " & " +"x = " + kwadratischeformule2(AwaardesVoorClass[0],AwaardesVoorClass[1],AwaardesVoorClass[2]) );
					
						
					}
					else if( A==2 && B==1 && log == 0 && Sin ==0 && Cos == 0 && Tan == 0 && X ==2){
						simpelOntbinden(AwaardesVoorClass[0], BwaardesVoorClass[0], AwaardesVoorClass[1]);
					}
					else if (A==2 && B==0 && log == 0 && Sin ==0 && Cos == 0 && Tan == 0 && X ==2){
						GUIpws.textField.setText("x = 0");
					}
					else if ( A==1 && B==1 && log == 0 && Sin ==0&& Cos == 0 && Tan == 0 && X == 1){
						
						GUIpws.textField.setText("x = " + eenTermOplossen( AwaardesVoorClass[0], BwaardesVoorClass[0], antwoord));
					}
					
					else if (A==1 && log == 1 && X == 1 ){
						double logBase = 2.0; 					
						
						GUIpws.textField.setText("x= " + logb(logBase, antwoord ));
					}
					else if((A==2||A==1) && X==1 && B==0 && Sin==0 && Cos== 0 && Tan==0 && log==0){
						GUIpws.textField.setText("x = " + antwoord/ AwaardesVoorClass[0]);
					}
					else if ((A==2||A==1) && Sin==1 && X == 1){
						GUIpws.textField.setText("x = "  + Sinx(antwoord, AwaardesVoorClass[0]));
				}
					else if ((A==2||A==1) && Cos==1 && X == 1){
						GUIpws.textField.setText("x = " + Cosx(antwoord, AwaardesVoorClass[0]));
					}
					else if ((A==2||A==1) && Tan==1 && X == 1){
						GUIpws.textField.setText("x = " + Tanx(antwoord, AwaardesVoorClass[0]));
					}
			}
					else if(Atotx[0] == true){
						if (A==1 && log ==0){
															
							GUIpws.textField.setText("x = " +Atotx( AwaardesVoorClass[0], antwoord ));
					}
					}
					else if (A==2  && log ==0){			
						if(Atotx[1] = true){
							
							GUIpws.textField.setText("x = " + AtotXPlusB( AwaardesVoorClass[0], AwaardesVoorClass[1], antwoord ));
						}
					
					}

		}
		else {
			System.out.println("numeriek oplossen");
		}
		if (aantalAtotx >= 1 && A>1) {
	      System.out.println("numeriek oplossen");
		}
	}
    

}

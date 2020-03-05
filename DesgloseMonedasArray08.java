package tema4.Ejercicios;
import java.util.Scanner;

public class DesgloseMonedasArray08 {

	public static void main ( String [] args ) {
		
		Scanner in = new Scanner (System.in);
		
		float[] monedas = {500f,200f,100f,50f,20f,10f,5f,2f,1f,0.5f,0.2f,0.1f,0.05f,0.02f,0.01f};
		int contador[] = new int [15];
		
		
		System.out.println("Introduce una cantidad de euros");
		float cantidad = in.nextFloat();
		
		
		//We use 15 because it's the amount of different kinds of coin
		//It will run until there are no € left from original input
		for( int i=0; i<15 && cantidad>0; i++ )
		{
			
			//example 22 € / 500 result = 0.something, converted to integer that's 0! so counter is not showed
			//then 22 € / 20 results in 1 ( added to counter ) + 2 extra which go to 'amount'
			//then counter will run again /500 /200 /100 etc
			//until 2/2 results in 1, adding 1 to counter with value 20
			
			contador[i] = (int) ( cantidad / monedas[i] );
			cantidad %= monedas[i];
		}
		
		
		System.out.println( "Cantidades necesarias de billetes o monedas" );
		for( int i=0; i<15; i++ )
		{
			if( contador[i] != 0 )
				
				// coin[position 0] needs counter[position 0], which have been
				// added before in the 'for' structure
				System.out.println( "De valor " + monedas[i] + " se necesitan " + contador[i] );
		}
		
		in.close();
	}
	
	
	
}
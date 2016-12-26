package egc;
import java.lang.Math;
public class Resta {

	public static int restar(int x, int z){
		
		return Math.abs(x-z);
	}
	public static int restar(int... numeros) {
		int res = numeros[0];
		
		for(int i=1; i<numeros.length; i++){
			res-=numeros[i];
		}
		return res;
	}
	
}

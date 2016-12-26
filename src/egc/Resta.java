package egc;
import java.lang.Math;
public class Resta {

<<<<<<< HEAD
	private int restarParaQueDeConflicto2(int a, int b,int c){
		String conflicto ="esta variable debe de dar conflicto a la larga..."
=======
	private int restarParaQueDeConflicto2(int a, int b)
		String conflicto = "variable creada para producir un conflicto";
>>>>>>> pruebas
		return Math.abs(a-b);
	}
	public static int restar(int... numeros) {
		int res = numeros[0];
		
		for(int i=1; i<numeros.length; i++){
			res-=numeros[i];
		}
		return res;
	}
:	
}

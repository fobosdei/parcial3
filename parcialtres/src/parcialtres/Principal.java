package parcialtres;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("escriba el numero de la base de datos a la cual desea entrar, 1:Oracle 2:Microsoft");
		int respuesta = sc.nextInt();
		String compania;
		
	if (respuesta == 1) {

		compania = "oracle";
		OperacionesConexion oracle = new Oracle();
		System.out.println(oracle.devolverCapacidadRespuesta(compania, respuesta, compania));

	}else if(respuesta == 2){
		compania = "microsoft";
		OperacionesConexion microsoft = new Microsoft();
		System.out.println(microsoft.devolverCapacidadRespuesta(compania, respuesta, compania));


	}else {
		System.out.println("ingrese nuevamente el numero");

	}
  }
} 
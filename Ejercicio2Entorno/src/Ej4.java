

public class Ej4 {

	public static void main(String[] args) {

		int[] num1 = new int[4];
		int[] num2 = new int[4];

		for (int i = 0; i < num2.length; i++) {
			num1[i] = Entradateclado.pedirEntero("introduce numero entero: ");
		}
		for (int i = 0; i < num2.length; i++) {
			num2[i] = Entradateclado.pedirEntero("introduce numero entero: ");
		}


		comprobarCircular(num1,num2);
	
		
		//comentario desde mi casa jeje
		System.out.println("hola");

	}
	
	//COMENTARIO DE PRUEBA EJERCICIO2....
	//puta vida tete2
	//hejejeej

	private static void comprobarCircular(int[] num1, int[] num2) {

		int posicion = 0;
		boolean circular = false ;

		for (int i = 1; i < num1.length; i++) {
			if (num1[i] == num2[0]) {
				posicion = i;
			}
		}

		for (int i = posicion; i < num1.length; i++) {
			for (int j = 0; j < posicion; j++) {
				if (num1[posicion] == num2[j] ) {
					circular = true;
				}
			}
		}
		
	for (int i = 0; i < posicion; i++) {
		for (int j = posicion; j >= num2.length; j++) {
			if (num2[i] == num1[j]) {
				circular = true;
			}
		}
	}
	
	if (!circular) {
		System.out.println("no tienen orden circular");
	}else{
		System.out.println("si tienen orden circular");
	}

}

}
//pepe

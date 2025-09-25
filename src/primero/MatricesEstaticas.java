//matrices estaticas
//pedir por pantalla el numero de filas y el numero de cols
//crear una matriz bidimensional con esas dimensiones
//rellenarlas con numeros aleatorios de 0 a 10
//imprimir la matriz en la que esten inculidas de los valores por fila y la suma de los valores por col.
//calcular medias por filas y columnas
package primero;

public class MatricesEstaticas {
	
	public static int tb[][] = new int [3][3];
	
	public static int alea(int li, int ls) {//función (método)
        return (int) ((Math.round(Math.random() * (ls - li)) + li));
    }

	public static void rellenarTB() {
		for (int i = 0; i < tb.length; i++) {
			for (int j = 0; j < tb[i].length; j++) {
				tb[i][j] = alea(0,10);
			}
		}
	}
	
	public static void visualizar() {
		for (int i = 0; i < tb.length; i++) {
			for (int j = 0; j < tb[i].length; j++) {
				System.out.print("   " +tb[i][j]);//Espacio entre filas y cols
			}
			System.out.println();//Salto de linea
		}
	}
	public static void main(String[] args) {
		rellenarTB();
		visualizar();
		
	}

}

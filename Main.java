
package hdt9;
/*Universidad del Valle de Guatemala
  Algoritmos y Estructura de datos
  Joyce Miranda
  Jorge Suchite
  Hoja de trabajo 7
  Fecha: 27/09/2016 */


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    
    
	
	public static void main(String[] args) throws Exception {
                Factory mytree= new Factory();
                Scanner teclado= new Scanner(System.in);
                System.out.println("Bienvenido al programa");
                System.out.println("Que tipo de mapeo desea utilizar:");
                System.out.println("1) SplayTre");
                System.out.println("2) *****");
                System.out.println("***Ingrese solo caracteres numericos y enteros***");
                int  opcion = teclado.nextInt();
                
		// tree = mytree.getTree(opcion);
                
		System.out.println("Arbol binario: (in-order)");
		String dic = readFile("diccionario.txt");
			
	
                // Aca leemos el archivon para poder trasladarlo al idioa english
                
		for (String sp : dic.split("-")) {
				String st[] = sp.split(",");
				tree.insert(st[0].substring(1).toUpperCase(),
						st[1].substring(1, st[1].length() - 1));
		}
		tree.inOrder();
		System.out.println();
		
		System.out.println("Texto en ingles:");
		String text = readFile("texto.txt");
		text = text.substring(0, text.length() - 2);
		System.out.println(text);
		System.out.println("Texto en espanol:");
		for (String s : text.split(" ")) {
			String ret = tree.lookup(s.toUpperCase());
			if (ret != null) {
				System.out.print(ret + " ");
			} else {
				System.out.print("*" + s + "* ");
			}
		}
		System.out.println("");
	}

	private static String readFile (String path) {
		String str = "";
		String s = "";
		try {
			FileReader f = new FileReader(path);
			BufferedReader b = new BufferedReader(f);
			try {
				while ((s = b.readLine()) != null) {
					str += s + "-";
				}
				b.close();
			} catch (IOException e) {
				return "";
			}
		} catch (FileNotFoundException e) {
			return "";
		}
		return str;
	}
}

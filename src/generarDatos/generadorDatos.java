package generarDatos;

import java.util.Random;

public class generadorDatos {

	public static void main(String[] args) 
	{
		Random r = new Random();
		double a = r.nextDouble()*35;
		int b = (int) a;
		int parametro1 = 5; //Tamaño de la cadena
		int k = 5; //Numero de a repetidas
		String[] retorno = new String[parametro1+1];
		String arepetida = "";
		String abc = "";
		for(int i = 0; i<k; i++)
		{
			arepetida += "a";
		}
		retorno[0]=arepetida;
		abc = arepetida;
		for(int i = 1; i<parametro1+1;i++)
		{
			char c = (char)(r.nextInt(26)+'a');
			retorno[i] = ""+c;
		}
		for(int i = 1; i<retorno.length; i++)
		{
			abc+=retorno[i];
		}
		System.out.println(abc);
	}

}

package generarDatos;

import java.util.Random;

public class generarAnios {
public static void main(String[] args)
{
		Integer[] retorno = new Integer[10];
		Random r = new Random();
		for(int i = 0; i<10;i++)
		{
			int numero = (int) (r.nextDouble()*2000);
			retorno[i] = numero;
		}
		String a = "";
		for(int i = 0; i<retorno.length; i++)
		{
			a+=retorno[i];
		}
		System.out.println(a);
	}
}

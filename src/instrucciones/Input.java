package instrucciones;

import java.util.Scanner;

import aplicacion.Context;

public class Input extends AbstractIntrucction implements Instruccions {

	@Override
	public void run(Context c) {
		System.out.println("Escriba un entero:");
		c.push(readValue());
	}

	
	@SuppressWarnings("resource")
	private static int readValue() 
	{
		return new Scanner(System.in).nextInt();
	}


	@Override
	public String toString() {
		return "INPUT";
	}
	
	
}

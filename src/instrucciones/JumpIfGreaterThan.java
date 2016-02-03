package instrucciones;

import aplicacion.Context;

public class JumpIfGreaterThan implements Instruccions{

	public int posicion ;
	
	
	public JumpIfGreaterThan(int posicion) {
		this.posicion = posicion;
	}


	@Override
	public void execute(Context c)  {
		int b = c.pop();
		int a = c.pop();
		if (a > b)
			c.setIp(posicion);
		else
			c.incrementIp();

		
	}


	@Override
	public String toString() {
		return "JMPG" + posicion ;
	}

}

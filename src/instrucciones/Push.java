package instrucciones;

import aplicacion.Context;

public class Push extends AbstractIntrucction implements Instruccions{

	public int posicion;
	
	public Push(int posicion) {
		this.posicion = posicion;
	}

	@Override
	public void run(Context c) {
		
		c.push(posicion);
	}

	@Override
	public String toString() {
		return "PUSH "+ posicion ;
	}
	
	

}

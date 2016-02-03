package instrucciones;

import aplicacion.Context;

public class Jump  implements Instruccions{
private int  posicion ;


	public Jump(int posicion) {
	this.posicion = posicion;
	}


	@Override
	public void execute(Context c) {
		c.setIp(posicion);		
	}


	@Override
	public String toString() {
		return "JMP" + posicion ;
	}

	

}

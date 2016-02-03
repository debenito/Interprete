package instrucciones;

import aplicacion.Context;

public class Load extends AbstractIntrucction implements Instruccions{
	
	@Override
	public void run(Context c) {
		int address = c.pop();
		c.push(c.read(address));
		
	}

	@Override
	public String toString() {
		return "LOAD";
	}
	
	

}

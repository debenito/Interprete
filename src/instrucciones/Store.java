package instrucciones;

import aplicacion.Context;

public class Store extends AbstractIntrucction implements Instruccions{

	@Override
	public void run(Context c) {
		int value = c.pop();
		int address = c.pop();
		c.write(address, value);
	
		
	}

	@Override
	public String toString() {
		return "STORE";
	}

}

package instrucciones;

import aplicacion.Context;

public class Add extends AbstractIntrucction implements Instruccions{

	@Override
	public void run(Context c) {
		c.push(c.pop()+c.pop());
	}

	@Override
	public String toString() {
		return "ADD";
	}
	

}

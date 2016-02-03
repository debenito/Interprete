package instrucciones;

import aplicacion.Context;

public class Output extends AbstractIntrucction implements Instruccions {

	@Override
	public void run(Context c) {
		System.out.println(c.pop());
	}

	@Override
	public String toString() {
		return "OUTPUT";
	}

}

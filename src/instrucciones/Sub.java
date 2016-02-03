package instrucciones;

import aplicacion.Context;

public class Sub extends AbstractIntrucction implements Instruccions{

	@Override
	public void run(Context c) {
		int b = c.pop();
		int a = c.pop();
		c.push(a - b);
	}

	@Override
	public String toString() {
		return "SUB";
	}

	

}

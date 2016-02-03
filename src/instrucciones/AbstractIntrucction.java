package instrucciones;

import aplicacion.Context;


public abstract class AbstractIntrucction implements Instruccions {

	@Override
	public void execute(Context c) {
		run(c);
		c.incrementIp();
	}

	public abstract void run(Context c) ;

}

package aplicacion;
import instrucciones.Instruccions;

import java.util.*;

public class Interpreter 
{
	
	private Context c;
	public void executeProgram(List<Instruccions> instructions) throws Exceptions 
	{
		c= new Context(instructions);
		while (c.getIp() < instructions.size()) {
			instructions.get(c.getIp()).execute(c);
		}
	}

}

package aplicacion;


import java.io.IOException;


public class Aplication {
	public static void main(String[] args) throws IOException, Exceptions 
	{
		Interpreter i = new Interpreter();
		Parse parse = new Parse();
		i.executeProgram(parse.parsea("factorial.txt"));
	

	}
}

package aplicacion;

import instrucciones.Add;
import instrucciones.Input;
import instrucciones.Instruccions;
import instrucciones.Jump;
import instrucciones.JumpIfGreaterThan;
import instrucciones.Load;
import instrucciones.Mul;
import instrucciones.Output;
import instrucciones.Push;
import instrucciones.Store;
import instrucciones.Sub;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Parse {

	private static final boolean TRACE = false;
	private List<Instruccions> instruccion;
	public List<Instruccions> parsea(String fichero) throws IOException{
		instruccion = new ArrayList<>();
		BufferedReader file = new BufferedReader(new FileReader(fichero));
		String line;
		while ((line = file.readLine()) != null)
			if (line.trim().length() == 0)
				continue;
			else
			instruccion.add(loadSentence(line));
		file.close();
		return instruccion;
		
	}
	

	private Instruccions loadSentence(String line) 
	{
		Instruccions i = null;

		String[] tokens = line.split(" ");
		if (TRACE) {
			for (String token : tokens)
				System.out.println("*" + token + "*");
		}
		String name = tokens[0].toUpperCase();

		if (name.equals("PUSH")) {
			int value = Integer.parseInt(tokens[1]);
			return new Push(value);
		} else if (name.equals("ADD")) {
			i= new Add();
		} else if (name.equals("SUB")) {
			i = new Sub();
		} else if (name.equals("MUL")) {
			i = new Mul();
		} else if (name.equals("JMP")) {
			i= new Jump( Integer.parseInt(tokens[1]));
		} else if (name.equals("JMPG")) {
				i= new JumpIfGreaterThan(Integer.parseInt(tokens[1]));
		} else if (name.equals("LOAD")) {
			i = new Load();
		} else if (name.equals("STORE")) {
			i = new Store();
			;
		} else if (name.equals("INPUT")) {
			i = new Input();
		} else if (name.equals("OUTPUT")) {
			i = new Output();
		}
		return i;
	}
}

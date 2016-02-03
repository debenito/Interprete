package aplicacion;

import instrucciones.Instruccions;
import java.io.IOException;
import java.util.List;

public class Context {
	private  int ip = 0;

	private  int[] memory = new int[1024];

	private   int[] stack = new int[32];
	private  int sp = 0;
	private  List<Instruccions> instructions;
	
	public Context(List<Instruccions> instructions){
		this.instructions=instructions;
	}
	
	public void push(int value) 
	{
		stack[sp++] = value;
		
	}

	public int pop() 
	{
			return stack[sp--];
		 
	}
	
	public void setIp(int ip) 
	{
		if (ip < 0 || ip >= instructions.size())
			new IOException("Furea del rango ");


		this.ip = ip;
	}
	
	public void incrementIp()
	{
		ip++;
		
	}
	
	int getIp()
	{
		return ip;
	}

	public int read(int address) 
	{
		return memory[address];
	}
	
	public void write(int address, int value) 
	{
		memory[address] = value;
	} 
	
}

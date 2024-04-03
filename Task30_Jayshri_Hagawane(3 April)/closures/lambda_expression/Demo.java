
// using lambda expressions
import java.io.*;

interface SalutationInterface
{
	public String salHello();
}

class Demo 
{
	public static void main(String[] args)
	{
		// Lambda Expression
		SalutationInterface obj = () ->
		{
			return "Hello, Jayshri!";
		};

		System.out.println(obj.salHello());
	}
}


//Non-static normal inner class
class Outer1
{

	class Inner
	{
		void fun()
		{
   
			System.out.println("FUN FUNCTION");
		}
		
		static void run()
		{
			
		}
	}
	
	
	void gun()
	{
		Inner iobj=new Inner();
		iobj.fun();
	}
   
   public static void main(String args[])
   {
     Outer1 oobj=new Outer1();
	 //Inner iobj=oobj.new Inner();
	 //iobj.fun();
	 oobj.gun();
   
   }
}

import java.io.*;

interface NumToMonth {
	public String convertToMonth(int x);
}

class Demo
{
	public static void main(String[] args)
	{
		// Lambda Expression
		NumToMonth obj = new NumToMonth() 
		{
			String[] months
				= { "Jan", "Feb", "Mar", "Apr",
					"May", "Jun", "Jul", "Aug",
					"Sep", "Oct", "Nov", "Dec" };

			public String convertToMonth(int n)
			{
				return (n > 0 && n <= months.length)
					? months[n - 1]
					: null;
			};
		};

		System.out.println(obj.convertToMonth(1));
	}
}

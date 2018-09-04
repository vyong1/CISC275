import java.util.*;

public class C 
{
	public static void main(String[] args) 
	{
		// Throwaway hardcode for args
		args = new String[]{"1", "2", "3", "4", "4", "2"};
		Set<String> s = new HashSet<String>();
		
		for (String a : args)
		{
			if (!s.add(a))
			{
				System.out.println("Duplicate: " + a);
			}
		}
					
		
		System.out.println(s.size() + " Keys: " + s);
	}
}

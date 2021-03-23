package com.sumit;

public class Solution {
	
	private static String compress(String s) {
		
		int count = 1;
		String s1 = s.charAt(0)+"";
		
		for(int i=1;i<s.length();i++) 
		{
			
			if(s.charAt(i-1)==s.charAt(i)) 
			{
				count++;
			} 
			else 
			{
				if(count>1) 
				{
					s1 = s1 + count ;
					count = 1;
                }
				
				s1 = s1 + s.charAt(i);
				
			}
				
		}
		
		if(count>1) 
		{
			s1 = s1 + count ;
			count = 1;
        }
		
		
		return s1;
	}

	public static void main(String[] args) 
	{
		String s1 = "aaabbcddd";
		
		System.out.println(Solution.compress(s1));
	}
}

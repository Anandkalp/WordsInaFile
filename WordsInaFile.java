public class WordsInaFile
{
public static void main(String args[])
	{
		String s1="Welcomr to New Java Learner";
		int count=1;
		for(int i=0; i<s1.length()-1; i++)
		{
			if((s1.charAt(i)==' ') && (s1.charAt(i+1)!=' '))
			{
				count++;
			}
		}
		System.out.print("No of Words : "+count);
	}
}
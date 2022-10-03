import java.util.Scanner;
class Ques6
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Word");
		String word=sc.next();
		String str="";
		for(int i=0;i<word.length();i++)
		{
			if(word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u')
			{
				if(word.charAt(i+1)=='a'||word.charAt(i+1)=='e'||word.charAt(i+1)=='i'||word.charAt(i+1)=='o'||word.charAt(i+1)=='u')
				{
					str+=word.charAt(i);
					str+=word.charAt(i);
				}
				else
					continue;
			}
			else
				str+=word.charAt(i);
			
		}
		System.out.println(str);
	}
}
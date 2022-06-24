package package3;

public class SplitExample {

	public static void main(String[] args) {
		
		String str="Welc.ome to ja.va Tutorial";
		String str1[]=str.split("\\s");
		//String str1[]=str.split("\\u", 0);
		for(String w:str1)
		{
			System.out.println(w);
		}
	}

}

package lv1;

public class TabChangeVoid {

	public static void main(String[] args) {
		
		String str1 = "hi\thihihi\thihihihi";
		System.out.println(str1);
		String str2 = str1.replaceAll("\t", "    ");
		System.out.println(str2);
		
		String str="aaa\taaa\taaa";
	    System.out.println(str);
	    
	    

	    str=str.replaceAll("\t","     ");
	    System.out.println(str);
	}
	private static String changeTab(String str) {
		
		String fixStr = "";
		
			
		fixStr = str.replaceAll("\t", "      ");
			
		
		return fixStr;
		
	}
	
}

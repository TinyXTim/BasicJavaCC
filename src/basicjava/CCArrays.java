package basicjava;
import java.util.Arrays;

public class CCArrays {
	public static void replace(char[] charArray, char toReplace, char replaceWith) {
		
		
		int index = 0;
		while (index < charArray.length) {
		//	String newlist = new String(charArray);
			
		 //   int newlistlength = newlist.length();
		    
		  //  char arr[] = newlist.toCharArray();
	        char upperCasereplaceWith = Character.toUpperCase(replaceWith);
	        char upperCaseToReplace = Character.toUpperCase(toReplace);

			
			if(upperCaseToReplace != upperCasereplaceWith) {
				
				String chartostring = charArray.toString();
				charArray[index] = replaceWith;

				 index++;

		        /*
			    for (int i = newlistlength - 1; i >= 0; i--) {
			        char a = (arr[i]);
			        char upperCase = Character.toUpperCase(a);
			        char lowerCase = Character.toLowerCase(a);
			        System.out.print(upperCase);
			        System.out.print(lowerCase);
			        */
			        
								


			}
			else {
				index++;
			}
		}
		}
		
	
	/*
	 * 	if(toReplace != replaceWith) {
		String newlsit = new String(charArray);
	    int newlistlength = newlsit.length();
	    char arr[] = newlsit.toCharArray();
	    for (int i = newlistlength - 1; i >= 0; i--) {
	        char a = (arr[i]);
	        char upperCase = Character.toUpperCase(a);
	        System.out.print(upperCase);
	       }
		
		
		
		
						String newlist = new String(charArray);
				
				newlist.toLowerCase();
	 */
	    
	
	public static void sortAlphabetic(String[] strArray) {
		System.out.println("new array");
		System.out.println(Arrays.toString(strArray));
		int lengthOfArray = strArray.length;
		int index = 0;
		
		while (index < lengthOfArray) {
			Arrays.sort(strArray, String.CASE_INSENSITIVE_ORDER);

			


		
		index++;
	}
		
}
}
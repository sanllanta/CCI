public class isPermutation{
	//Brute force
	static boolean isPermutation(String str1, String str2){
		for(int i = 0; i < str1.length(); i ++){
			if(charCount(str1.charAt(i), str1) != charCount(str1.charAt(i), str2))
				return false;
		}
		return true;
	}

	static int charCount(char c, String str){
		int counter = 0;
		for(int j = 0; j < str.length(); j++){
			if(str.charAt(j) == c)
				counter++;
		}
		return counter;
	}

	public static void main(String[] args){
		System.out.println(isPermutation(args[0], args[1]));
	}
}
package Session1;

public class KeyPad {
	static String[] getKey= {"","abc","def","ghi","jkl","mno","pqrs","tuv","wx","yz"};
	private static void sol(String ques,String ans) {
		if(ques.length()==0) {
			System.out.print((ans+" "));
			return;
		}
		char ch=ques.charAt(0);//'1'
		String key=getKey[ch-48];//abc
		for (int i=0;i<key.length();i++) {
			sol(ques.substring(1),ans+key.charAt(i));
		}
	}

	public static void main(String[] args) {
//		static String[] getKey= {"","abc","def","ghi","jkl","mno","pqrs","tuv","wx","yz"};
		String str="198";
		sol(str,"");
		
	}

}

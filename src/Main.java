
/*<Taken from codewars.com>
 * You will be given a number and you will need to return it as a string
 *in Expanded Form. For example:
Kata.expandedForm(12); # Should return "10 + 2"
Kata.expandedForm(42); # Should return "40 + 2"
Kata.expandedForm(70304); # Should return "70000 + 300 + 4"
  */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 70304;
		System.out.println(expandedForm(num));
	}
	 public static String expandedForm(int num) {
		 String solution = "";
		 String inToString = num+"";
		 
		 for(int i=0; i<inToString.length(); ++i) {
			 
			 if(!inToString.substring(i, i+1).equals("0")) {
				 solution +=inToString.substring(i, i+1);
				 for(int r=0; r<inToString.substring(i+1).length();++r) {
					 solution += "0";
				 }
				solution+=" + ";
			 }
		 }
		 solution.stripTrailing();
		 var sb = new StringBuffer(solution);//remove the last "+"
		 sb.deleteCharAt(solution.length()-1);
		 return sb.toString();
	 }
}

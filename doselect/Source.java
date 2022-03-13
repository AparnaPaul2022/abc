package capgemini.doselect;

class Activity{
	  //Implement Activity class here..
	  String string1;
	  String string2;
	  String operator;
	  
	Activity(String string1, String string2, String operator) {
		this.string1 = string1;
		this.string2 = string2;
		this.operator = operator;
	}

}

	public class Source {
	  //Implement the two function given in description in here...
	


	  String newString;
	  
	  public String doOperation(String string1, String string2, String operator){
	  String op=operator;
		switch(op){
	      case "+":
	              newString=string1+string2;
	              break;
	      case "-":
	              newString=string1.replace(string2,"");
	              break;
	    }
		return newString;    
	              
	    }
	  
	  
		public static void main(String args[] ) throws Exception {
			
	}

}



	  
		
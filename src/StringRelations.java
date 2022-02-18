
public class StringRelations {

	public static void main(String[] args) {
		
		
		String browser="chrome";
		//always use equals to compare 2 strings
		if (browser.equals("chrome")) {
			System.out.println("we are executing tests on chrome");
		
		} else {
			System.out.println("We are not executing any test  cases");
			
		}
		
		//would work but example not preferrable
		if (browser=="chrome") {
			System.out.println("we are executing tests on chrome");}
		else {
			System.out.println("We are not executing any test  cases");
			
		}
		

	}
	}
	

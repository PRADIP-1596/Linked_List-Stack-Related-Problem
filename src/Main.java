import java.util.LinkedList;
public class Main {


	  public static void main(String[] args) {
	    LinkedList<String> languages = new LinkedList<>();

	    // add elements in LinkedList
	    languages.add("hcl");
	    languages.add("infosys");
	    languages.add("Cognizant");
	    languages.add("T system");
	    System.out.println("LinkedList: " + languages);

	    // remove elements from index 1
	    String str = languages.remove(2);
//	    boolean str1 = languages.addAll(2, 1);
	    
	    System.out.println("Removed Element: " + str);

	    System.out.println("Updated LinkedList: " + languages);
	  }

}


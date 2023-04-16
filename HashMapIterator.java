import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapIterator {

    public static void main(String[] args) {


		System.out.println("HashMap Iteration with for each loop " );
	HashMap<String, String> language = new HashMap<>();
			language.put("One", "JAVA");
			language.put("Two", ".Net");
			language.put("Three", "JAVAScript");
			language.put("Four", "C++");
			language.put("Five", "Python");
			language.put("Six", "Cobol");
		System.out.println("HashMap = "+ language);
			
		System.out.println("EntrySet = " );
			for(Entry<String, String> entry : language.entrySet()){
				System.out.print(entry);
				System.out.print(",");
			}
		System.out.println("Keys = " );
			for(String key:language.keySet()){
				System.out.print(key);
				System.out.print(",");
			}

		System.out.println("Values = " );
			for(String value:language.values()){
				System.out.print(value);
				System.out.print("END");
			}    
			
		}
}
import java.util.Hashtable;


public class inside_hashtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Hashtable<String, String> table1 = new Hashtable<String,String>();
		table1.put("city1", "LA");
		table1.put("city2", "thailand");
		table1.put("city3", "Delhi");
		
		
		Hashtable<String, String> table2 = new Hashtable<String,String>();
		table2.put("city1", "14563");
		table2.put("city2", "45874");
		table2.put("city3", "785455");
		
		
		Hashtable<String, Hashtable<String, String>> table = new Hashtable<String, Hashtable<String, String>>();
		table.put("name", table1);
		table.put("Zip", table2);
		
		System.out.println(table.get("name").get("city2"));
		
	}

}

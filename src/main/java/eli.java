import java.util.ArrayList;
//reference
public class eli {
	
public static ArrayList<String> Ingred_eliminate= new ArrayList<String>();

//public static ArrayList<String> ingridients= new ArrayList<String>();


public static void main(String[] args) {
	

	/*
	 * ingridients.add("salt apple mango"); ingridients.add("chips");
	 * ingridients.add("tea"); ingridients.add("wheat"); ingridients.add("rice");
	 */
	String ing="rice  fruits " ;
	
		Ingred_eliminate.add("salt");
		Ingred_eliminate.add("chips");
		Ingred_eliminate.add("pretzel");
		Ingred_eliminate.add("crackers");
		Ingred_eliminate.add("coffee");
		Ingred_eliminate.add("tea");
		Ingred_eliminate.add("caffeine");
		Ingred_eliminate.add("alcohol");
		Ingred_eliminate.add("soft Drink");
		Ingred_eliminate.add("frozen food");
		Ingred_eliminate.add("pickles");
		Ingred_eliminate.add("processed food");
		Ingred_eliminate.add("canned food");
		
		//ing compare with arraylist
		boolean isIngrediant=true;
		
		for(String v:Ingred_eliminate)
		
		{
			
			
			
			if (ing.contains(v)) //ing=v
			{
				System.out.println("Eliminated::"+v);
				
				isIngrediant=false;
				
				
				break;
			}
		}
		
			if(isIngrediant==true)
			{
				System.out.println("print in xl");
				
			}
			
			
	}
		
			
}
		
		
		



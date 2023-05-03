//package smartScrapper;

	
	
	import java.io.IOException;
	import java.util.ArrayList;

	//import smartScrapper.ExcelReader;
	public class CheckListPcos {


	public static ArrayList<String> Ingred_eliminate = new ArrayList<String>();
		
		static boolean checkIngrediant(String i_Ingredient) {

			String p_Ingredient = i_Ingredient.toLowerCase();
			System.out.println("igredeintes coming" + p_Ingredient);

			Ingred_eliminate.add("cakes");
			Ingred_eliminate.add("pastries");
			Ingred_eliminate.add("white bread");
			Ingred_eliminate.add("fried food");
			Ingred_eliminate.add("pizza");
			Ingred_eliminate.add("burger");
			Ingred_eliminate.add("sweets");
			Ingred_eliminate.add("icecreams");
			Ingred_eliminate.add("soda");
			
			Ingred_eliminate.add("red meat");
			Ingred_eliminate.add("processed meat");
			Ingred_eliminate.add("dairy");
			Ingred_eliminate.add("soy products");
		    Ingred_eliminate.add("gluten");
			Ingred_eliminate.add("pasta");
			Ingred_eliminate.add("white rice");
			Ingred_eliminate.add("doughnuts");
			Ingred_eliminate.add("fries");
			Ingred_eliminate.add("coffee");
			Ingred_eliminate.add("vegetable oil");
			Ingred_eliminate.add("soybean oil");
			Ingred_eliminate.add("canola oil");
			Ingred_eliminate.add("rapeseed oil");
			Ingred_eliminate.add("sunflower oil");
			
			boolean isIngrediant = true;
			for (String v : Ingred_eliminate) {
				if (p_Ingredient.contains(v)) // p_Ingredient
				{
					System.out.println("Eliminated::" + p_Ingredient + "because of " + v + "recepid" + "");
					isIngrediant = false;
					break;
				}
			}

			return isIngrediant;

		}
		
		public static ArrayList<String> Ingred_addOn=new  ArrayList<String>();
		
		 static boolean checkAddOns(String b_Ingredient) 
		
		{
			Ingred_addOn.add("tomatoes");
			Ingred_addOn.add("cucumber");
			Ingred_addOn.add("carrot");
			Ingred_addOn.add("banana");
			Ingred_addOn.add("apple");
			Ingred_addOn.add("orange");
			Ingred_addOn.add("beetroot");
			Ingred_addOn.add("watermelon");
			Ingred_addOn.add("kiwi");
			
			
			boolean isIngredientAdds=true;
			//String isIngrediant="";
			String a_Ingredient = b_Ingredient.toLowerCase();
			System.out.println("igredeintes coming" + a_Ingredient);

			
			for (String v : Ingred_addOn) 
			{
				if (a_Ingredient.contains(v)) // p_Ingredient
				{
					System.out.println("Add ons" + a_Ingredient + "because of " + v + "recepid" + "");
					
				 return isIngredientAdds;
				}
			}
			return false;
			}
		


}

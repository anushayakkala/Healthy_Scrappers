

	import java.io.IOException;
	import java.util.ArrayList;

	import com.util.ExcelReader;

	public class CheckListHBP {
		
		public static ArrayList<String> Ingred_eliminate = new ArrayList<String>();
		
		static boolean checkIngrediant(String i_Ingredient) {

			String p_Ingredient = i_Ingredient.toLowerCase();
			System.out.println("igredeintes coming" + p_Ingredient);

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
			Ingred_eliminate.add("fries");
		    Ingred_eliminate.add("sauces");
			Ingred_eliminate.add("mayonnaise");
			Ingred_eliminate.add("white bread");
			Ingred_eliminate.add("white rice");
			

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
			Ingred_addOn.add("banana");
			Ingred_addOn.add("choclate");
			Ingred_addOn.add("cinnamon");
			Ingred_addOn.add("yogurt");
			Ingred_addOn.add("nuts");
			Ingred_addOn.add("pistachios");
			Ingred_addOn.add("beetroot");
			Ingred_addOn.add("watermelon");
			Ingred_addOn.add("kiwi");
			Ingred_addOn.add("garlic");
			Ingred_addOn.add("Tomatoes");
			Ingred_addOn.add("Avocado");
			Ingred_addOn.add("Pomegranate");
			Ingred_addOn.add("blueberries");
			Ingred_addOn.add("Chia seeds");
			Ingred_addOn.add("quinoa");
			Ingred_addOn.add("broccoli");
			Ingred_addOn.add("strawberries");
			Ingred_addOn.add("Sweet potato");
			Ingred_addOn.add("mushroom");
			Ingred_addOn.add("Celery");
			Ingred_addOn.add("Kiwi");
			
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
		
		 public static ArrayList<String> Ingred_allergyEliminate=new  ArrayList<String>();
			
		 static boolean allergy(String allg_Ingredient) 
		
		{
			 Ingred_allergyEliminate.add("milk");
			 Ingred_allergyEliminate.add("soy");
			 Ingred_allergyEliminate.add("egg");
			 Ingred_allergyEliminate.add("sesame");
			 Ingred_allergyEliminate.add("peanuts");
			 Ingred_allergyEliminate.add("walnuts");
			 Ingred_allergyEliminate.add("almonds");
			Ingred_allergyEliminate.add("hazelnut");
			Ingred_allergyEliminate.add("pecan");
			Ingred_allergyEliminate.add("pistachio");
			
			boolean isIngredientAllergy=true;
			//String isIngrediant="";
			String allergy_Ingredient = allg_Ingredient.toLowerCase();
			System.out.println("igredeintes coming" + allergy_Ingredient);

			for (String al: Ingred_allergyEliminate) 
			{
				if (allergy_Ingredient.contains(al)) // p_Ingredient
				{
					System.out.println("Allergy" + allg_Ingredient + "because of " + al + "recepid" + "");
					
					isIngredientAllergy=false;
				}
			}
			return isIngredientAllergy;
			
	}
	}



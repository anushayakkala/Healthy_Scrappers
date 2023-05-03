
//package testcase;
import java.io.IOException;
import java.util.ArrayList;

//import com.util.ExcelReader
public class CheckList_Hypo {
	
	public static ArrayList<String> Ingred_eliminate = new ArrayList<String>();
	
	static boolean checkIngrediant(String i_Ingredient) {

		String p_Ingredient = i_Ingredient.toLowerCase();
		System.out.println("igredeintes coming" + p_Ingredient);

		Ingred_eliminate.add("tofu");
		Ingred_eliminate.add("cauliflower");      
		Ingred_eliminate.add("cabbage");
		Ingred_eliminate.add("broccoli");
		Ingred_eliminate.add("kale");
		Ingred_eliminate.add("spinach");
		Ingred_eliminate.add("strawberries");
		Ingred_eliminate.add("peanuts");
		Ingred_eliminate.add("peaches");
		Ingred_eliminate.add("frozen food");
		Ingred_eliminate.add("fried food");
		Ingred_eliminate.add("sugar");
		Ingred_eliminate.add("gluten");
		Ingred_eliminate.add("fries");
	    Ingred_eliminate.add("cakes");
		Ingred_eliminate.add("candies");
		Ingred_eliminate.add("white bread");
		Ingred_eliminate.add("coffee");
		Ingred_eliminate.add("alcohol");
		Ingred_eliminate.add("soy milk");
		Ingred_eliminate.add("edamame");
		Ingred_eliminate.add("sweet potatoes");
		Ingred_eliminate.add("pine nuts");
		

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
		 Ingred_addOn.add("milk");
			Ingred_addOn.add("dairy");      
			Ingred_addOn.add("eggs");
			Ingred_addOn.add("nuts");
			Ingred_addOn.add("pumpkin seeds");
			Ingred_addOn.add("iodized salt");
			Ingred_addOn.add("brazil nuts");
			Ingred_addOn.add("blue berries");
			Ingred_addOn.add("low-fat yogurt");
			Ingred_addOn.add("brown rice");
			Ingred_addOn.add("quinoa");
			Ingred_addOn.add("mushroom");
			
		
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

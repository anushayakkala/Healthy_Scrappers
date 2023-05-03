package com.reference;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.util.ArrayList;

	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.xssf.usermodel.XSSFCell;
	import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	import com.util.ExcelReader;

	public class AddOnList {
		
		
		
		
		public static ArrayList<String> Ingred_addOn=new  ArrayList<String>();
		
		 static boolean checkAddOns(String b_Ingredient) 
		
		{
			Ingred_addOn.add("banana");
			Ingred_addOn.add("choclate");
			Ingred_addOn.add("cinnamon");
			Ingred_addOn.add("yogurt");
			Ingred_addOn.add("nuts");
			Ingred_addOn.add("pista");
			Ingred_addOn.add("beetroot");
			Ingred_addOn.add("watermelon");
			Ingred_addOn.add("kiwi");
			Ingred_addOn.add("garlic");
			
			
			
			
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



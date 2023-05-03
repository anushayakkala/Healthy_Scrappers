

//refercence
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DiabeticRecipes {
	
	/*
	 * Method to check ingredeint List
	 */
	public  static  boolean checkIgredients(String i_Ingredient)
	{
		
		

		String p_Ingredient = i_Ingredient.toLowerCase();
		System.out.println("igredeintes coming"+p_Ingredient);
		
		Ingred_eliminate.add("cream of rice");
		Ingred_eliminate.add("rice flour");
		Ingred_eliminate.add("rice rava");
		Ingred_eliminate.add("corn");
		Ingred_eliminate.add("sugar");
		Ingred_eliminate.add("white rice");
		Ingred_eliminate.add("white bread");
		Ingred_eliminate.add("pasta");
		Ingred_eliminate.add("soda");
		Ingred_eliminate.add("flavoured water");
		Ingred_eliminate.add("gatorade");
		Ingred_eliminate.add("apple juice");
		Ingred_eliminate.add("orange juice");
		Ingred_eliminate.add("pomegranate juice");
		Ingred_eliminate.add("flavoured curd");
		Ingred_eliminate.add("yogurt");
		Ingred_eliminate.add("corn flakes");
		Ingred_eliminate.add("puffed rice");
		Ingred_eliminate.add("bran flakes");
		Ingred_eliminate.add("instant oatmeal");
		Ingred_eliminate.add("honey");
		Ingred_eliminate.add("maple syrup");
		Ingred_eliminate.add("jaggery");
		Ingred_eliminate.add("sweets");
		Ingred_eliminate.add("candies");
		Ingred_eliminate.add("chocolates");
		Ingred_eliminate.add("refined");
		Ingred_eliminate.add("all purpose flour");
		Ingred_eliminate.add("alcoholic beverages");
		Ingred_eliminate.add("bacon");
		Ingred_eliminate.add("sausages");
		Ingred_eliminate.add("hot dos");
		Ingred_eliminate.add("deli meats");
		Ingred_eliminate.add("chicken nuggets");
		Ingred_eliminate.add("chciken patties");
		Ingred_eliminate.add("bacon");
		Ingred_eliminate.add("jams");
		Ingred_eliminate.add("jelly");
		Ingred_eliminate.add("mango");
		Ingred_eliminate.add("cucumber");
		Ingred_eliminate.add("tomatoes");
		Ingred_eliminate.add("pineapple");
		Ingred_eliminate.add("peaches");
		Ingred_eliminate.add("mangos ");
		Ingred_eliminate.add("pear");
		Ingred_eliminate.add("mixed");
		Ingred_eliminate.add("fruit");
		Ingred_eliminate.add("mandarine");
		Ingred_eliminate.add("oranges");
		Ingred_eliminate.add("cherries");
		Ingred_eliminate.add("chips");
		Ingred_eliminate.add("mayonnaise");
		Ingred_eliminate.add("palmolein oil");
		Ingred_eliminate.add("powdered milk");
		Ingred_eliminate.add("beans");
		Ingred_eliminate.add("peas");
		Ingred_eliminate.add("corn");
		Ingred_eliminate.add("doughnuts");
		Ingred_eliminate.add("cakes");
		Ingred_eliminate.add("pastries");
		Ingred_eliminate.add("cookies");
		Ingred_eliminate.add("croissants");
		Ingred_eliminate.add("sweetened tea");
		Ingred_eliminate.add("coffee");
		Ingred_eliminate.add("packaged snacks");
		Ingred_eliminate.add("soft drinks");
		Ingred_eliminate.add("banana");
		Ingred_eliminate.add("melon");
		Ingred_eliminate.add("dairy milk");
		Ingred_eliminate.add("butter");
		Ingred_eliminate.add("cheese");

		
		//ing compare with arraylist
		boolean isIngrediant=true;
		
		for(String v:Ingred_eliminate)
		
		{
			
			
			
			if (p_Ingredient.contains(v)) //p_Ingredient
			{
				System.out.println("Eliminated::"+p_Ingredient+"because of "+v+"recepid"+"");
				
				isIngrediant=false;
				
				
				break;
			}
		}


		return isIngrediant;
			
			
	
	}
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		setup();
		recipedetails();
								
		
	}
	
}
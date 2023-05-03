//package smartScrapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.util.ExcelReader;

//import smartScrapper.ExcelReader;
public class PCosRecipies extends DriverLaunch {
	public static ArrayList<String> recipeid = new ArrayList<String>();
	public static ArrayList<String> recipeName = new ArrayList<String>();
	public static ArrayList<String> ingredientList = new ArrayList<String>();
	public static ArrayList<String> prepTime = new ArrayList<String>();
	public static ArrayList<String> cookTime = new ArrayList<String>();
	public static ArrayList<String> prepMethod = new ArrayList<String>();
	public static ArrayList<String> NutrientList = new ArrayList<String>();
	public static ArrayList<String> RecipeUrlList = new ArrayList<String>();
	public static  String nutrients ;
	 public static String ct;

	@Test
	public static void PcosEliminate() throws InterruptedException, IOException {
		
		driver.findElement(By.xpath("//ul[@id='nav']/li/a[1]")).click();
		driver.findElement(By.xpath("//a[@id='ctl00_cntleftpanel_ttlhealthtree_tvTtlHealtht335']")).click();
		int PcosPaginationSize=driver.findElements(By.xpath("//div[@id='pagination']/a")).size();
		
		System.out.println(PcosPaginationSize);
		for (int p = 1; p <= PcosPaginationSize; p++) {

			System.out.println("onpage:" + p);
			

			
			  List<WebElement> RecipeList =
			  driver.findElements(By.xpath("//span[@class='rcc_recipename']"));
			  System.out.println(RecipeList.size());
			 
			driver.findElement(By.xpath("//div[@id='pagination']/a["+p+"]")).click();
			
			int PcosRecipeNameSize=driver.findElements(By.xpath("//span[@class='rcc_recipename']")).size();
			

			for (int k = 1; k <= PcosRecipeNameSize; k++)

			{
				try
				{
				
				// recipe id
				WebElement r_id = driver.findElement(By.xpath("//div[@class='recipelist']/article["+k+"]/div[2]/span"));
				String s = r_id.getText();
				String formattedrecipeid = s.substring(8, s.length() - 9);
				// recipeid.add(formattedrecipeid.trim());
				System.out.println(formattedrecipeid);
				System.out.println(s);

				// Recipe name

				WebElement recipename = driver.findElement(
				By.xpath("//div[@class='recipelist']/article["+k+"]/div[3]/span/a"));
				String r = recipename.getText();
				System.out.println("Recipe Name:" + r);
				// recipeName.add(r);

				// click on Recipe
				driver.findElement(By.xpath("//div[@class='recipelist']/article["+k+"]/div[3]/span/a")).click();
				Thread.sleep(1000);

				// ingredient
				String Ingrediants = driver.findElement(By.xpath("//div[@id='rcpinglist']/div")).getText();
				System.out.println("Ingrediants are : " + Ingrediants);
				boolean isIngrediant = CheckListPcos.checkIngrediant(Ingrediants);

				
				  // preparation Time
				WebElement Preptime =driver.findElement(By.xpath("//time[@itemprop='prepTime']"));
				String pt = Preptime.getText();
				 

				// cook time
				
				  WebElement Cooktime = driver.findElement(By.xpath("//time[@itemprop='cookTime']")); 
				  ct = Cooktime.getText();
				 

				// preparation method
				
				  WebElement Prepmethod =
				  driver.findElement(By.xpath("//div[@id='ctl00_cntrightpanel_pnlRcpMethod']/div[1]/span/ol"));
				  String pm = Prepmethod.getText();
				 
				// nutrients
				
				  try
				  { 
					   nutrients = driver.findElement(By.xpath("//div[@id='rcpnuts']")).getText();
				  
				  }
				  catch(Exception e) 
				  {
					  System.out.println("not available");
				  }
				  
				  String strUrl = driver.getCurrentUrl();
		        	
		        	System.out.println("Recipe URL : "+strUrl);
		        	
				 
				if (isIngrediant)
				{
					recipeid.add(formattedrecipeid.trim());
					recipeName.add(r);

					ingredientList.add(Ingrediants);
					System.out.println("Ingrediants are : " + Ingrediants);

					try {
					  prepTime.add(pt); System.out.println("Preperation Time is : " + pt);
					}
					catch(Exception e){
					
					}
					 
					
					  try { cookTime.add(ct); System.out.println("Cooking Time is : " +
					  Cooktime.getText()); } catch (Exception e) { cookTime.add("NA"); }
					 
				
					
					  prepMethod.add(pm); System.out.println("Preperation Method is : " +
					  Prepmethod.getText());
					 
				
					
					  try
					  {
					  
					  NutrientList.add(nutrients); 
					  System.out.println("Nutrient Values are : " + nutrients); 
					  } 
					  catch(Exception e) 
					  {
						  NutrientList.add("NA"); 
					  }
					
			        	RecipeUrlList.add(strUrl);
			        	System.out.println("Recipe URL : "+strUrl);
			        	//String Url=driver.getCurrentUrl();
			        }
				
			
				driver.navigate().back();
				  

			}
			catch(Exception e)
			  {
				System.out.println("no such element"+e.getMessage());
			  }
			 

		}
		System.out.println(recipeName.size());
		
		ExcelReader xlreader = new ExcelReader(".\\\\datafiles\\\\Pcos.xlsx");
		xlreader.setcelldata("EliminateSheet", 0, 0, "recipeid");
		xlreader.setcelldata("EliminateSheet", 0, 1, "recipename");

		xlreader.setcelldata("EliminateSheet", 0, 2, "ingrediant");

		xlreader.setcelldata("EliminateSheet", 0, 3, "preparation Time");
		xlreader.setcelldata("EliminateSheet", 0, 4, "cook Time");

		xlreader.setcelldata("EliminateSheet", 0, 5, "preparation method");
		xlreader.setcelldata("EliminateSheet", 0, 6, "Nutrients");
		xlreader.setcelldata("EliminateSheet", 0, 7, "Url");
				
				for (int a = 0; a <=recipeName.size(); a++) 
				{
					try
					{
					xlreader.setcelldata("EliminateSheet", a+1, 0, recipeid.get(a));
					xlreader.setcelldata("EliminateSheet", a+1, 1, recipeName.get(a));
					xlreader.setcelldata("EliminateSheet", a+1, 2, ingredientList.get(a));

					xlreader.setcelldata("EliminateSheet", a+1, 3, prepTime.get(a));
					xlreader.setcelldata("EliminateSheet", a+1, 4, cookTime.get(a));
					xlreader.setcelldata("EliminateSheet", a+1, 5, prepMethod.get(a)); 
					xlreader.setcelldata("EliminateSheet", a+1, 6, NutrientList.get(a));
				
				    xlreader.setcelldata("EliminateSheet", a+1, 7, RecipeUrlList.get(a));
					}
					catch(Exception e)
					{
						System.out.println(e.getMessage());
					}

				}
				}
		 
	
}
	
	
	
}


package com.reference;





	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;
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
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	import io.github.bonigarcia.wdm.WebDriverManager;


	
			public class HBP 	{	
		

				static WebDriver driver;
				public static ArrayList<String> recipeNameList = new ArrayList<String>();
				public static ArrayList<String> recipeid = new ArrayList<String>();
				public static ArrayList<String> ingredientList = new ArrayList<String>();
				public static ArrayList<String> prepTimeList = new ArrayList<String>();
				public static ArrayList<String> cookTimeList = new ArrayList<String>();
				public static ArrayList<String> prepMethodList = new ArrayList<String>();
				public static ArrayList<String> NutrientList = new ArrayList<String>();
			    public static String foodCategory = "Vegetarian";
			    public static String morbidities = "Hyper Tension";
				   
				//public static void main(String[] args) throws IOException, InterruptedException {
			@BeforeTest()
			public void setUp() {
					WebDriverManager.chromedriver().setup();
					//ChromeOptions ops = new ChromeOptions();
					//ops.setAcceptInsecureCerts(true);
					//ops.addArguments("--remote-allow-origins=*");
					driver = new ChromeDriver();
					driver.manage().window().maximize();
					driver.get("https://www.tarladalal.com");

					driver.findElement(By.name("ctl00$txtsearch")).sendKeys("high blood pressure");
					driver.findElement(By.id("ctl00_imgsearch")).click();
			}
					@Test
					public void hypertensionTest() throws InterruptedException, IOException {
					List<WebElement> ReceipeList = driver.findElements(By.xpath("//div[@class='rcc_recipecard']"));

					// System.out.println("Total Recipe in page 1 :"+totalRecipe);
					
					// List of recipeid

					for (int j = 1; j <= ReceipeList.size(); j++) 
					{
						WebElement r_id = driver.findElement(By.xpath("(//div[@class='rcc_recipecard'])[" + j + "]//span"));
						String s = r_id.getText();
						
						String formattedrecipeid = s.substring(8, s.length() - 9);
						recipeid.add(formattedrecipeid.trim());

						System.out.println(formattedrecipeid);
						System.out.println(s);
					}
					// List of recipename
					for (int i = 1; i <= ReceipeList.size(); i++) {

						WebElement recipeName = driver.findElement(
								By.xpath("//div[@class='rcc_recipecard'][" + i + "]//span[@class='rcc_recipename']/a"));
						System.out.println("Name of Recipe : " + recipeName.getText());
						recipeNameList.add(recipeName.getText());

					}
					// ReceipeList.size()
					for (int k = 1; k <= ReceipeList.size(); k++) {
						driver.findElement(By.xpath("//div[@class='rcc_recipecard'][" + k + "]//span[@class='rcc_recipename']/a"))
								.click();
						Thread.sleep(1000);
						WebElement Ingrediants = driver.findElement(By.xpath("//div[@id='rcpinglist']"));
						ingredientList.add(Ingrediants.getText());
						System.out.println("Ingrediants are : " + Ingrediants.getText());

						WebElement PrepTime = driver.findElement(By.xpath("//p//time[1]"));
						prepTimeList.add(PrepTime.getText());
						System.out.println("Preperation Time is : " + PrepTime.getText());

						WebElement CookTime = driver.findElement(By.xpath("//p//time[2]"));
						cookTimeList.add(CookTime.getText());
						System.out.println("Cooking Time is : " + CookTime.getText());

						WebElement PrepMethod = driver.findElement(By.xpath("//div[@id='recipe_small_steps']"));
						prepMethodList.add(PrepMethod.getText());
						System.out.println("Preperation Time is : " + PrepMethod.getText());

						// WebElement Nutrients =
						// driver.findElement(By.xpath("//table[@id='rcpnutrients']"));
						// NutrientList.add(Nutrients.getText());
						// System.out.println("Nutrient Values are : "+Nutrients.getText());
						Thread.sleep(2000);
						driver.navigate().back();
						Thread.sleep(1000);
					}

					XSSFWorkbook workbook = new XSSFWorkbook();
					XSSFSheet sheet = workbook.createSheet("Recipes Data");
					sheet.createRow(0);
					sheet.getRow(0).createCell(0).setCellValue("RecipeId");
					sheet.getRow(0).createCell(1).setCellValue("Recipe Name");
					//sheet.getRow(0).createCell(2).setCellValue("Recipe Category(Breakfast/lunch/snack/dinner)");
					sheet.getRow(0).createCell(2).setCellValue("Food Category(Veg/non-veg/vegan/Jain)");
					sheet.getRow(0).createCell(3).setCellValue("Ingredients");
					sheet.getRow(0).createCell(4).setCellValue("Preparation Time");
					sheet.getRow(0).createCell(5).setCellValue("Cooking Time");
					sheet.getRow(0).createCell(6).setCellValue("Preparation method");
					sheet.getRow(0).createCell(7).setCellValue("Nutrient values");
					sheet.getRow(0).createCell(8).setCellValue("Targetted morbid conditions (Diabeties/Hypertension/Hypothyroidism)");
					sheet.getRow(0).createCell(9).setCellValue("Recipe URL");

					int rowno = 1;

					for (int i = 0; i < recipeNameList.size(); i++) {
						XSSFRow row = sheet.createRow(rowno++);
						row.createCell(0).setCellValue(recipeid.get(i).toString());
						row.createCell(1).setCellValue(recipeNameList.get(i).toString());
						row.createCell(2).setCellValue(foodCategory);
						row.createCell(3).setCellValue(ingredientList.get(i).toString());
						row.createCell(4).setCellValue(prepTimeList.get(i).toString());
						row.createCell(5).setCellValue(cookTimeList.get(i).toString());
						row.createCell(6).setCellValue(prepMethodList.get(i).toString());
						// row.createCell(8).setCellValue(NutrientList.get(i).toString());
					}

					FileOutputStream FOS = new FileOutputStream("src\\test\\resources\\ExcelTest\\Recipe1.xlsx");
					workbook.write(FOS);
					FOS.close();

				}


			@AfterTest()
				public void tearDown() {
				driver.quit();
			}
			}


}

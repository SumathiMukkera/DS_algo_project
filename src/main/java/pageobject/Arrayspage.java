package pageobject;

   import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Arrayspage {
		
		WebDriver driver = new ChromeDriver();
		//driver = new ChromeDriver();
		//driver.get ("https://dsportalapp.herokuapp.com/");


		//locators
	     By ArraysGetStarted =By.xpath("//a[@href='array']");
	     By ArraysinPython =By.xpath("//a[@href='arrays-in-python']");
	     By Tryhere =By.xpath("//a[@class='btn btn-info']");
	     By tryeditor = By.xpath("//div[@class='CodeMirror-scroll']");
	     By Run = By.xpath("//button[@type='button']");
	     By ArraysUsingList=By.xpath("//a[@href='/array/arrays-using-list/']");
	     By BasicOperationsinList=By.xpath("//a[@href='/array/basic-operations-in-lists/']");
	     By ApplicationsofArray=By.xpath("//a[@href='/array/applications-of-array/']");
	     By PracticeQuestions=By.xpath("//a[@class='list-group-item list-group-item-light text-info']");
	     By Searchthearray=By.xpath("//a[@href='/question/1']");
	     By tryeditor1=By.xpath("//span[@class='cm-variable']");
	     By Run1=By.xpath("//button[@type='button']");
	     By submit=By.xpath("//input[@class='button']");
	     By output=By.xpath("//pre[@id='output']");
	     By MaxConsecutiveOnes=By.xpath("//a[@href='/question/2']");
	     By tryeditor2=By.xpath("//span[@class='cm-def']");
	     By FindNumberswithEvenNumberofDigits=By.xpath("");

	     piblic viid getstart
}
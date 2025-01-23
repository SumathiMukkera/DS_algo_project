package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver;
	
	By GetStartedbutton = By.xpath("//button[@class='btn']");
	//a[@href='/home']")
	 By SignIn = By.xpath("//a[@href='/login']");
	By Username_field = By.xpath("//input[@name='username']");
    By Password_field = By.xpath("//input[@name='password']");
	By Login_submit = By.xpath("//input[@value='Login']");
	By errorMessage=By.xpath("//div[@class='alert alert-primary']" );//
	By Register_onlogin = By.xpath("//a[text()='Register!']");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	 public void clickGetStartedbutton() {
			driver.findElement(GetStartedbutton).click();
            }
	 
	 public void SignInBtn() {
			driver.findElement(SignIn).click();
		}
	 
	 public void navigatetoLoginpage() {
	 //try {
		driver.findElement(SignIn);
	//} catch (Exception e) {
		//System.out.println("Error occurred: " + e.getMessage());
		//e.printStackTrace();
	}
			
		
		public String getLoginpageTitle() {
			driver.findElement(Login_submit);
			String getLoginpageTitle = driver.getTitle();
			return getLoginpageTitle;
		}
		
	
        public void setUsername(String username) {
		     
				driver.findElement(Username_field).sendKeys(username);
		    }

		    public void setPassword(String password) {
		        driver.findElement(getPassword_field()).sendKeys(password);
		    }

		    public void clickLoginButton() { //complete login page action and return homepage
		        driver.findElement(Login_submit).click();
		    }

		    public String getErrorMessage() { //error message display
		        return driver.findElement(errorMessage).getText();
		    }
		    
		    public void Registeronlogin() {
		    	driver.findElement(Register_onlogin).click();
		    }
		    public String getregistrationpagetitle() {
		   	 
		    	driver.findElement(Register_onlogin).click();
		    	String registrationpagetitle = driver.getTitle();
		    	return registrationpagetitle;
		    	 
		     }
		    public void navigatetoRegistrationpage() {
		    	driver.findElement(SignIn);
		    }
		    
		    public boolean isOnLoginPage() {
		       return driver.findElement(Login_submit).isDisplayed();
			}
		 
		    public Homepage login(String username, String password) {
		        setUsername(username);
		        setPassword(password);
		        clickLoginButton();
		     

		        return new Homepage(driver);  // Assuming successful login navigates to HomePage
		    }

			public By getPassword_field() {
				return Password_field;
			}

			public void setPassword_field(By password_field) {
				Password_field = password_field;
			}

			public static String getSuccessMessage() {
		
				return getSuccessMessage();
			}

			
			

		
		}     
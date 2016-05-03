package features;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

<<<<<<< HEAD
@SuppressWarnings("deprecation")
public class StepDefinitions {
	
	//WebDriver driver =null;
	
	
	/*@Given("^this is my first step$")
	public void posicionNavegador() throws Throwable {
		//System.out.println("executed: Navegacion en el portal a testear ");
		driver = new ChromeDriver();
		driver.navigate().to("http://www.fib.upc.edu/es.html");
	    
	}

	@When("^this is my second step$")
	public void accionClickenBotton() throws Throwable {
	    //System.out.println("executed: realizar una accion: click en un boton ");
		driver.findElement(By.id("racoCarnet")).click();
	}*/
	

	
	WebDriver driver =null;
	
	
	@Given("^this is my first step$")
	public void posicionNavegador() throws Throwable {
		//System.out.println("executed: Navegacion en el portal a testear ");
		driver = new ChromeDriver();
		driver.navigate().to("http://www.fib.upc.edu/es.html");
	    
	}

	@When("^this is my second step$")
	public void accionClickenBotton() throws Throwable {
	    //System.out.println("executed: realizar una accion: click en un boton ");
		driver.findElement(By.id("racoCarnet")).click();
	}

=======
public class StepDefinitions {
	
	WebDriver driver =null;
	
	
	@Given("^this is my first step$")
	public void posicionNavegador() throws Throwable {
		//System.out.println("executed: Navegacion en el portal a testear ");
		driver = new ChromeDriver();
		driver.navigate().to("http://www.fib.upc.edu/es.html");
	    
	}

	@When("^this is my second step$")
	public void accionClickenBotton() throws Throwable {
	    //System.out.println("executed: realizar una accion: click en un boton ");
		driver.findElement(By.id("racoCarnet")).click();
	}
>>>>>>> refs/heads/master
	@Then("^this is my final step$")
	public void comprobacionBotonPortal() throws Throwable {
	    //System.out.println("check: comprobar que el dato es el esperado");
		Assert.assertTrue("error no estas en la pagina que se esperaba", driver.getTitle().equals("Login - Facultat d'informàtica de Barcelona"));
	    
	}

}

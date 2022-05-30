package testeWebjump;


import static org.junit.Assert.assertFalse;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//testes em Selenium Webdriver em Junit
// Navegador Chrome, chamando o chromedriver mais atualizado


//Step by Step > create new Maven project > create a simple project > write Grouo Id and Artifact Id > Finish 
//pom.xml settings

public class pagina {
	@Test
	//primeiro teste
	public void CliqueNosBotoes() {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://wj-qa-automation-test.github.io/qa-test/");
		
		//clique no botão One, Two e Four
		driver.findElement(By.id("btn_one")).click();
		driver.findElement(By.id("btn_two")).click();
		driver.findElement(By.id("btn_link")).click();
		assertFalse(driver.findElement(By.cssSelector("#btn_one")).getSize());
		assertFalse(driver.findElement(By.cssSelector("#btn_two")).getSize());
		assertFalse(driver.findElement(By.cssSelector("#btn_link")).getSize());
	}
		private void assertFalse(Dimension size) {

		
	}
		@Test
	//segundo teste
		public void PaginaIFrameButtons() {
			
			//clique nos botões dentro do painel "IFRAME BUTTONS
			System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://wj-qa-automation-test.github.io/qa-test/");
			
			driver.findElement(By.xpath("//iframe[\"id=btn_One\"]")).click();
			driver.findElement(By.xpath("//iframe[\"id=btn_One\"]")).click();
			driver.findElement(By.xpath("//iframe[\"id=btn_One\"]")).click();
			assertFalse(driver.findElement(By.cssSelector("#btn_one")).getSize());
			assertFalse(driver.findElement(By.cssSelector("#btn_two")).getSize());
			assertFalse(driver.findElement(By.cssSelector("#btn_link")).getSize());
			
		}
		@Test
		//terceiro teste
		public void CenarioFinal() {
			
			System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://wj-qa-automation-test.github.io/qa-test/");
			
			//digitando algo, e selecionando opções
			driver.findElement(By.id("first_name")).sendKeys("Dalvanir Vieira");
			driver.findElement(By.id("btn_one")).click();
			driver.findElement(By.id("opt_three")).click();
			
			//selecionando opção dentro do select box
			WebElement element = driver.findElement(By.id("select_box"));
			Select combo = new Select(element);
			combo.selectByIndex(1);
			
			//validando imagem
		    Assert.assertEquals("", driver.findElement(By.cssSelector("#panel_body_three > img:nth-child(4)")).getText());
		}
}
			
			


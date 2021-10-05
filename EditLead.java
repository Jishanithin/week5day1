package week5day1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class EditLead extends BaseClassLead {
@Test
	public  void runEditLead() throws InterruptedException {
		
	driver.findElement(By.linkText("Find Leads")).click();

	driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Jisha");
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[@class='linktext']"))
			.click();

	driver.findElement(By.linkText("Edit")).click();

	driver.findElement(By.id("updateLeadForm_companyName")).clear();
	driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TestLeaf");

	driver.findElement(By.name("submitButton")).click();
		
}
}







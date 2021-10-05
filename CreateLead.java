package week5day1;


import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClassLead {
	
@Test(dataProvider="sendData")
	public  void runCreateLead(String cNname,String fName,String lName,String phNum) {
        driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cNname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phNum);
		driver.findElement(By.name("submitButton")).click();
		
}

@DataProvider
public String[][] sendData() {
	String[][]data=new String[2][4]; //2rows 2columns
	data[0][0]="TestLeaf";
	data[0][1]="Jisha";
	data[0][2]="A";
	data[0][3]="99";
	
	
	data[1][0]="TestLeaf";
	data[1][1]="Jo";
	data[1][2]="A";
	data[1][3]="99";
	
	return data;
	

}
}







package pages;

public class GooglePage extends BasePage {

	private String searchButton = "//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[2]/div[2]/div[5]/center[1]/input[1]";
	private String searchTextField = "//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]";

	public GooglePage() {
		super(driver);
	}

	public void navigateToGoogle(){
		navigateTo("https://www.google.com");
	}

	public void clickGoogleSearch(){
		clickElement(searchButton);
	}

	public void enterSearchCriteria(String criteria){
		write(searchTextField, criteria);
	}

}

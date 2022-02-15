package pages;

public class GridPage extends BasePage{

	private String cell = "//*[@id='root']/div/";

	public GridPage(){
		super(driver);
	}

	public void navigateToGrid(){
		navigateTo("https://1v2njkypo4.csb.app");
	}

	public String getValueFromGrid(int row, int column){
		return getValueFromTable(cell, row, column);
	}

}

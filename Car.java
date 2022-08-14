
public class Car {

	
	private String Company;
	private String Model;
	private int Year;
	
	Car(String Company,String Model,int year){
		
		this.Company=Company;
		this.Model=Model;
		this.Year=Year;
	}
	
public String getCompany() {
	return Company;
}

	public String getModel() {
		return Model;
	}

	
	public int getYear() {
		return Year;
	}
}

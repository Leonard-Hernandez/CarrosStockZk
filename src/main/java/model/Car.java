package model;

public class Car {
	
	private Integer id;
	private String model;
	private String make;
	private String preciew;
	private String description;
	private Integer price;
	
	public Car(Integer id, String model, String make, String preciew, String description, Integer price) {
		super();
		this.id = id;
		this.model = model;
		this.make = make;
		this.preciew = preciew;
		this.description = description;
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getPreciew() {
		return preciew;
	}

	public void setPreciew(String preciew) {
		this.preciew = preciew;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
	
		

}

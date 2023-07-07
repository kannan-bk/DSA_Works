package inheritance_works;

public class MobilePhone {
	
	private int version;
	private String model;
	
	public MobilePhone(int version, String model) {
		super();
		this.version = version;
		this.model = model;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "MobilePhone [version=" + version + ", model=" + model + "]";
	}
	
	
	
	

}

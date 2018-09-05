public class Customer{
	private String name;
	private String location;

	public void setName(String name){
		this.name=name;
	}

	public void setLocation(String location){
		this.location=location;
	}

	public String getName(){
		return name;
	}

	public String getLocation(){
		return location;
	}

	public void SendOrder(){
		System.out.println("Name: " + name + " Location: "+ location);
	}
	public void ReceiveOrder(){
		System.out.println("Name: " + name + " Location: "+ location);
	}
}

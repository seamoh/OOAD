package ch03;

class TestCabbie {
	

	public static void main(String args[]) {
		Cabbie joe = new Cabbie("Joe", "1234");	
			
		System.out.println("Name = " + joe.getName());
		System.out.println("Company name is =" + Cabbie.companyName);
		System.out.println("Company name is with Joe="+ joe.companyName);
		joe.setName("Mohsen");
		System.out.println("Name = " + joe.getName());
	}
}

class Cabbie {
	private static String companyName = "Blue Cab Company";
	private String name;
	private Cab myCab;

	public Cabbie() {

    	name = null;
      	myCab = null;

   	}

   	public Cabbie(String iName, String serialNumber) {

    	name = iName;
	    myCab = new Cab(serialNumber);

	}

	// Set the Name of the Cabbie
	public void setName(String iName) {
    	name = iName;
	}

	// Get the Name of the Cabbie
	public String getName() {
   	 	return name;
	}


}

class Cab {
	
	private String serialNumber;

   	public Cab (String sn) {

    	serialNumber = sn;

	}


}
package driver;

import company.SalesEmployee;

public class Driver {

	public static void main(String[] args) {
		System.out.println();
		
        SalesEmployee hayami = new SalesEmployee(12,"速水",1000);
        
        System.out.println();
        hayami.display();
        hayami.displaySalesAmt();
	}

}

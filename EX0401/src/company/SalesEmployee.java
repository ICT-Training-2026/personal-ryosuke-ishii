package company;

public class SalesEmployee extends Employee{
	//売上合計金額
	private int salesAmt;
	
	
	//コンストラクタ
	public SalesEmployee(int id, String name, int salesAmt) {
		super(id, name);
		this.salesAmt = salesAmt;
	}
	
	public SalesEmployee(int id, String name) {
		this(id, name, 0);
	}
	
	

	public int getSalesAmt() {
		return salesAmt;
	}

	public void setSalesAmt(int salesAmt) {
		if(0 <= salesAmt) {
			this.salesAmt = salesAmt;
		}else {
			System.out.println("\n--> マイナスは設定できません。0を設定します。");
			this.salesAmt =0;
		}
		
		
	}
	
	//メソッド
	public int sell(int amt) {
		return salesAmt +=amt;
	}
	
	public int refund(int amt) {
		return salesAmt -=amt;
	}
	
	public void displaySalesAmt() {
		System.out.println("売上:"+ salesAmt + "円");
		
	}
	
}

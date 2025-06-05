package company;

public class Employee {
	/******** フィールド ******************************************/
	/**
	 * 商品名
	
	 *
	 */
	
	private int id;
	
	private String name;
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	

	
	//フィールドidを設定する
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	
	//フィールドnameを設定する
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public void display() {
		System.out.println("ID:"+id);
		System.out.println("名前:"+name);
		
	}
}

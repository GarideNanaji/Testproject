package mypacc;
interface DemoInterface{
	void display();
}
interface Demo1Interface{
	void show();
}

public abstract class Emp {
	private int eno;
	private String ename;
	private String eloc;

	public Emp() {
		// TODO Auto-generated constructor stub
		eno=0;
		ename="NA";
		eloc="NA";
	}
	public Emp(int eno,String ename,String eloc) {
		this.eno=eno;
		this.ename=ename;
		this.eloc=eloc;
	}
	
	
	public String toString() {
		String info="\nEno:="+eno;
		info+="\nEname:="+ename;
		info+="\nEloc:="+eloc;
		return info;
	}

}

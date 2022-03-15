package mypacc;

public class Empcontract extends Emp implements DemoInterface {
	int Contracttime;

	public Empcontract() {
		super();
		Contracttime=0;
	}

	public Empcontract(int eno, String ename, String eloc,int Contracttime) {
		super(eno, ename, eloc);
		this.Contracttime=Contracttime;
	}
	public String toString() {
		String info=super.toString();
		info+="\nEmpcontract:="+Contracttime;
		return info;
	}

	@Override
	public void display() {
		System.out.println("information about Emp");
		System.out.println("=========");
		
	}

}

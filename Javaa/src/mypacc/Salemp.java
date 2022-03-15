package mypacc;

public class Salemp extends Emp implements Demo1Interface {
	int Sal;

	public Salemp() {
		// TODO Auto-generated constructor stub
		super();
		Sal=0;
	}

	public Salemp(int eno, String ename, String eloc,int Sal) {
		super(eno, ename, eloc);
		this.Sal=Sal;
	}
	public String toString() {
		String info=super.toString();
		info+="\nEmpSal:="+Sal;
		return info;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("inform about empp");
		System.out.println("================");
	}

}

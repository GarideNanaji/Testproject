package mypacc;

public class Salemp extends Emp {
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
		info+="EmpSal:="+Sal;
		return info;
	}

}

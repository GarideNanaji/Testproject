package mypacc;

public class Empcontract extends Emp {
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
		info+="Empcontract:="+Contracttime;
		return info;
	}

}

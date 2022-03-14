package mypacc;

public class Emp {
	int eno;
	String ename;
	String eloc;

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


public class Testhospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
forthospital fh= new forthospital();
fh.operate();
fh.scan();
fh.vaccination();
fh.phonecunsultation();

govthospital gh= new govthospital();
gh.operate();
gh.scan();

gh.vaccination();
		
		
hospital h=new forthospital();
h.operate();
h.scan();
h.vaccination();
hospital g=new govthospital();
hospital x=null;
x=new forthospital();
x.scan();
x= new govthospital();
x.scan();


	}

}

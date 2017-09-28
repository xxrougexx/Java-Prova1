
public class MainLauncher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int area,area2;
		Figura f;
		f=new Figura(10,4,"T");
		Figura f2;
		f2=new Figura();
		f.clone(f2);
		area=f.calcolaArea();
		area2=f2.calcolaArea();
		System.out.println(area);
		System.out.println(area2);
	}

}

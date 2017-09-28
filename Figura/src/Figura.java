
public class Figura {
	private int base;
	private int altezza;
	private String tipo;
	
	public Figura(int base,int altezza,String tipo){
		this.setBase(base);
		this.setAltezza(altezza);
		this.setTipo(tipo);
	}
	public Figura(){
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getAltezza() {
		return altezza;
	}
	public void setAltezza(int altezza) {
		this.altezza = altezza;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int calcolaArea(){
		int area=0;
		area=this.getBase() * this.getAltezza();
		return area;
	}
	public void clone(Figura f){
		f.setBase(this.getBase());
		f.setAltezza(this.getAltezza());
		f.setTipo(this.getTipo());
	}
	
}


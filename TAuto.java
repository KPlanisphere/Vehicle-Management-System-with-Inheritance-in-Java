//JESUS HUERTA AGUILAR - FACULTAD DE CIENCIAS DE LA COMPUTACION

//---------> TAuto

class TAuto extends TVehiculo{
	//ATRIBUTOS
	private String tipo;
	private int no_bolsasaire,capacidad_cajuela;
	
	//METODOS CONSTRUCTORES
	TAuto(){
		super(); //MANDO A LLAMAR AL CONSTRUCTOR DE LA CLASE PADRE
		tipo = "";
		no_bolsasaire = 0;
		capacidad_cajuela = 0;
		
	}
	
	TAuto(String tipo_combustible,String modelo,String marca,
	int no_cilindros,int no_llantas,int no_personas,String tipo
	,int no_bolsasaire,int capacidad_cajuela){
		super(tipo_combustible,modelo,marca,no_cilindros,no_llantas,no_personas);
		
		setTipo(tipo);
		
		setNoBolsasaire(no_bolsasaire);
		setCapacidadCajuela(capacidad_cajuela);
	}
	
	//METODOS SET
	public void setTipo(String tipo){
		this.tipo = tipo;
		
	}
	
	public void setNoBolsasaire(int no_bolsasaire){
		this.no_bolsasaire = no_bolsasaire;
	}
	
	public void setCapacidadCajuela(int capacidad_cajuela){
		this.capacidad_cajuela = capacidad_cajuela;
	}
	
	//METODOS GET
	public String getTipo(){
		return tipo;
	}
	
	public int getNoBolsasaire(){
		return no_bolsasaire;
	}
	
	public int getCapacidadCajuela(){
		return capacidad_cajuela;
	}
	
	//METODOS DIVERSOS
	@Override //SOBREESCRITURA DEL METODO DE LA CLASE PADRE
	public String toString(){
		String cadena;
		
		cadena = super.toString() + " | Tipo: " + tipo + "\n" +
		" | No. de bolsas de aire: " + no_bolsasaire + "\n" + 
		" | Capacidad de la cajuela: " + capacidad_cajuela + "kg. \n";
		
		return cadena;
	}
}//FIN DE LA CLASE

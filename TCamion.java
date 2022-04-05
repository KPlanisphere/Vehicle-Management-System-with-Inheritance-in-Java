//JESUS HUERTA AGUILAR - FACULTAD DE CIENCIAS DE LA COMPUTACION

//---------> TCamion

class TCamion extends TVehiculo{
	//ATRIBUTOS
	private int toneladas_carga,no_tanquescombustible;
	
	//METODOS CONSTRUCTORES
	TCamion(){
		super(); //MANDO A LLAMAR AL CONSTRUCTOR DE LA CLASE PADRE
		toneladas_carga = 0;
		no_tanquescombustible = 0;
		
	}
	
	TCamion(String tipo_combustible,String modelo,String marca,
	int no_cilindros,int no_llantas,int no_personas,
	int toneladas_carga,int no_tanquescombustible){
		super(tipo_combustible,modelo,marca,no_cilindros,no_llantas,no_personas);
		
		setToneladasCarga(toneladas_carga);
		setNoTanquesCombustible(no_tanquescombustible);
	}
	
	//METODOS SET
	public void setToneladasCarga(int toneladas_carga){
		this.toneladas_carga = toneladas_carga;
	}
	
	public void setNoTanquesCombustible(int no_tanquescombustible){
		this.no_tanquescombustible = no_tanquescombustible;
	}
	
	//METODOS GET
	public int getToneladasCarga(){
		return toneladas_carga;
	}
	
	public int getNoTanquesCombustible(){
		return no_tanquescombustible;
	}
	
	//METODOS DIVERSOS
	@Override //SOBREESCRITURA DEL METODO DE LA CLASE PADRE
	public String toString(){
		String cadena;
		
		cadena = super.toString() + " | Toneladas de carga: " + toneladas_carga + "\n" +
		" | No. de tanques de combustible: " + no_tanquescombustible + "\n";
		
		return cadena;
	}
}//FIN DE LA CLASE

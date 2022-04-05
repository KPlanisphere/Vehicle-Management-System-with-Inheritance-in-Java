//JESUS HUERTA AGUILAR - FACULTAD DE CIENCIAS DE LA COMPUTACION

//--------> TVehiculo

class TVehiculo{
	//ATRIBUTOS
	private String tipo_combustible,modelo,marca;
	private int no_cilindros,no_llantas,no_personas;
	
	//METODOS
	TVehiculo(){
		tipo_combustible = "";
		modelo = "";
		marca = "";
		no_cilindros = 0;
		no_llantas = 0;
		no_personas = 0;
	}
	
	TVehiculo(String tipo_combustible,String modelo,String marca,
	int no_cilindros,int no_llantas,int no_personas){
		setTipoCombustible(tipo_combustible);
		setModelo(modelo);
		setMarca(marca);
		
		setNoCilindros(no_cilindros);
		setNoLlantas(no_llantas);
		setNoPersonas(no_personas);
	}
	
	//METODOS SET
	public void setTipoCombustible(String tipo_combustible){
		this.tipo_combustible = tipo_combustible;
	}
	
	public void setModelo(String modelo){
		this.modelo = modelo;
	}
	
	public void setMarca(String marca){
		this.marca = marca;
	}
	
	public void setNoCilindros(int no_cilindros){
		this.no_cilindros = no_cilindros;
	}
	
	public void setNoLlantas(int no_llantas){
		this.no_llantas = no_llantas;
	}
	
	public void setNoPersonas(int no_personas){
		this.no_personas = no_personas;
	}


	//METODOS GET
	public String getTipoCombustible(){
		return tipo_combustible;
	}
	
	public String getModelo(){
		return modelo;
	}
	
	public String getMarca(){
		return marca;
	}
	
	public int getNoCilindros(){
		return no_cilindros;
	}

	public int getNoLlantas(){
		return no_llantas;
	}
	
	public int getNoPersonas(){
		return no_personas;
	}
	//Integer.toString(edad)
	@Override
	public String toString(){
		String cadena;
		
		cadena = " | Tipo de combustible: " + tipo_combustible + "\n" + 
		" | Modelo: " + modelo + "\n" + 
		" | Marca: " + marca + "\n" + " | No. de Cilindros: " + Integer.toString(no_cilindros) + 
		"\n" + " | No. de Llantas: " + Integer.toString(no_llantas) + "\n" + 
		" | No. de Personas: " + Integer.toString(no_personas) + "\n";
		return cadena;
	}
}//FIN CLASE TPersona

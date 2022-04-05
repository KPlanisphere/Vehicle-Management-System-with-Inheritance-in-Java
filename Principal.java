//JESUS HUERTA AGUILAR - FACULTAD DE CIENCIAS DE LA COMPUTACION

//--------> Principal

import java.util.Scanner;

class Principal{
	
	public static void main(String[] args){
		TAuto auto[];
		TCamion camion[];
		
		int op,n,no_cilindros,no_llantas,no_personas,no_bolsasaire,capacidad_cajuela,toneladas_carga,no_tanquescombustible;
		String tipo_combustible,modelo,marca,tipo;
		
		Scanner sc1 = new Scanner(System.in); //NUMEROS
		Scanner sc2 = new Scanner(System.in); //CADENAS
		
		System.out.println("Lista de vehiculos Programacion II");
		System.out.println("[1] registrar autos");
		System.out.println("[2] registrar camiones");
		System.out.printf("///// ");
		op = sc1.nextInt();
		System.out.println();
		
		System.out.print("Cuantos vehiculos deseas ingresar: ");
		n = sc1.nextInt();
		System.out.println();
		
		auto = new TAuto[n];
		camion = new TCamion[n];
		
		
		for(int i=0; i<n ; i++){
			System.out.println("INGRESA LOS DATOS DEL VEHICULO #" + (i+1) + ":");
			System.out.print(" | Tipo de combustible: ");
			tipo_combustible = sc2.nextLine();
			System.out.print(" | Modelo: ");
			modelo = sc2.nextLine();
			System.out.print(" | Marca: ");
			marca = sc2.nextLine();
			System.out.print(" | No. de cilindros: ");
			no_cilindros = sc1.nextInt();
			System.out.print(" | No. de llantas: ");
			no_llantas = sc1.nextInt();
			System.out.print(" | No. de personas: ");
			no_personas = sc1.nextInt();
			if(op == 1){
				System.out.print(" | Tipo: ");
				tipo = sc2.nextLine();
				System.out.print(" | No. de bolsas de aire: ");
				no_bolsasaire = sc1.nextInt();
				System.out.print(" | Capacidad de la cajuela: ");
				capacidad_cajuela = sc1.nextInt();
				auto[i] = new TAuto(tipo_combustible,modelo,marca,no_cilindros,no_llantas,no_personas,tipo,no_bolsasaire,capacidad_cajuela);
			}
			else{
				System.out.print(" | Toneladas de carga: ");
				toneladas_carga = sc1.nextInt();
				System.out.print(" | No. de tanques de combustible: ");
				no_tanquescombustible = sc1.nextInt();
				//vehiculo[i] = new TAuto(tipo_combustible,modelo,marca,no_cilindros,no_llantas,no_personas,tipo,no_bolsasaire,capacidad_cajuela);
				camion[i] = new TCamion(tipo_combustible,modelo,marca,no_cilindros,no_llantas,no_personas,toneladas_carga,no_tanquescombustible);
			}
			
			System.out.println();
			
		}
		
		System.out.println("\n////////// LISTA DE VEHICULOS:\n");
		if(op == 1){
			for(int i=0;i<n;i++){
			System.out.println("DATOS DEL VEHICULO #" + (i+1) + ":");
			System.out.println(auto[i].toString());
			}
		}
		else{
			for(int i=0;i<n;i++){
			System.out.println("DATOS DEL VEHICULO #" + (i+1) + ":");
			System.out.println(camion[i].toString());
			}
		}

	}//FIN MAIN
	
}//FIN CLASE Principal

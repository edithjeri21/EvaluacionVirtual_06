package Arreglos;

import java.util.ArrayList;
import clases.Cama;

public class ArreglosCama {
	private ArrayList<Cama> cam;
	
	public ArreglosCama(){
		cam= new ArrayList<Cama>();
		
	}
	
	
	public int Tamaño(){
		return cam.size();
	}
	
	public  Cama buscar(int i){
		return cam.get(i);
	}
	
	
	   public void Agregar(Cama i){
		   cam.add(i);
	   }
	


	
	
	
	
	
	
	
	
	

}

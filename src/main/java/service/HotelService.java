package service;

import java.util.List;

import model.Hotel;

public interface HotelService {

	/**
	 * Metodo que devuelve una lista de hoteles disponibles
	 * 
	 * @param disponible: 1 si esta disponible; 0 si esta ocupado
	 * @return la lista de hoteles disponibles
	 */
	List<Hotel> hotelesDisponibles();
	
	/**
	 * Metodo que devuelve los datos de un hotel según su nombre
	 * 
	 * @param nombre: hotel a obtener
	 * @return los datos del hotel dado un nombre
	 */
	Hotel hotelByNombre(String nombre);
}

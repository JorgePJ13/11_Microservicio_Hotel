package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import model.Hotel;
import service.HotelService;

@RestController
public class HotelController {

	@Autowired
	HotelService service;
	
	@GetMapping(value = "Hoteles", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Hotel> hoteles() {
		return service.hotelesDisponibles();
	}
	
	@GetMapping(value = "Hotel/{nombre}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Hotel buscarHotel(@PathVariable("nombre") String nombre) {
		return service.hotelByNombre(nombre);
	}
}

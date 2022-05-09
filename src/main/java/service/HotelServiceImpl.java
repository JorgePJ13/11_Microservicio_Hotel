	package service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.HotelesDao;
import model.Hotel;

@Service
public class HotelServiceImpl implements HotelService {

	HotelesDao dao;

	public HotelServiceImpl(@Autowired HotelesDao dao) {
		super();
		this.dao = dao;
	}

	@Override
	public List<Hotel> hotelesDisponibles() {
		List<Hotel> lista_Hoteles = dao.findAll().stream().filter(h -> h.getDisponible() == 1)
				.collect(Collectors.toList());
		return lista_Hoteles;
	}

	@Override
	public Hotel hotelByNombre(String nombre) {
		return dao.findHotelByNombre(nombre);
	}

}

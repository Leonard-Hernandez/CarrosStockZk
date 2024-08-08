package service.contracts;

import java.util.List;

import model.Car;

public interface CarService {
	
	// devuelve todos los carros
	public List<Car> findAll();
	
	// busca carros acorde a su palabra clave
	public List<Car> search(String keyword);
	

}

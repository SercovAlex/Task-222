package web.controller;

import web.Service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class CarController {

	@Autowired
	private CarService carService;
	@GetMapping("/cars")
	public String cars(@RequestParam(required = false) Integer count, ModelMap model) {
		model.addAttribute("cars", carService.getCars(count));
		return "cars";
	}

}
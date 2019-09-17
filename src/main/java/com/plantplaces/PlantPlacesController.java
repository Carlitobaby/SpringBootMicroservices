package com.plantplaces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Administrator
 * Handle /start end point
 * @return
 */

@Controller
public class PlantPlacesController {
	
	@RequestMapping("/start")
	public String start() {
		
		return "start";
	}
	
	
	/**
	 * Handle the / end point
	 *@return
	 */
	@RequestMapping("/")
	public String index() {
		
		return "start";
	}
}

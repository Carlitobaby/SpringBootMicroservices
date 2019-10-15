package com.plantplaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.plantplaces.dto.SpecimenDTO;
import com.plantplaces.service.ISpecimenService;

/**
 * @author Administrator
 * Handle /start end point
 * @return
 */

@Controller
public class PlantPlacesController {
	
	@Autowired
	private ISpecimenService specimenServiceStub;

	//anything that has /start will map to this method
		@RequestMapping(value="/start", method=RequestMethod.GET)
		public String read(Model model) {
			SpecimenDTO specimenDTO = specimenServiceStub.fetchById(43);
			model.addAttribute("specimenDTO", specimenDTO);
			return "start";
		}
	
	@RequestMapping(value="/carlos", method=RequestMethod.GET)
	public String readCarlos() {
		
		return "carlos";
	}
	
	@RequestMapping(value="/start", method=RequestMethod.GET, params = {"loyalty=silver"})
	public ModelAndView readSilver() {
		SpecimenDTO specimenDTO = specimenServiceStub.fetchById(43);
		specimenDTO.setSpecimenId(90);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("start");
		modelAndView.addObject("specimenDTO", specimenDTO);
		return modelAndView;
	}
	
	@RequestMapping(value="/start", method=RequestMethod.GET, params = {"loyalty=blue"})
	public String readBlue() {
		
		return "start";
	}
	
	@RequestMapping(value="/start", method=RequestMethod.GET, headers= {"content-type=text/json"})
	public String readJSON() {
		
		return "start";
	}
	
	@PostMapping("/start")
	public String create() {
		
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

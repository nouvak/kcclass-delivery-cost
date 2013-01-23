package si.kcclass.deliverycost.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import si.kcclass.deliverycost.domain.Country;
import si.kcclass.deliverycost.domain.DeliveryCostRequest;

@RequestMapping("/deliverycost/**")
@Controller
public class DeliveryCostController {
    
    @RequestMapping
    public ModelAndView deliveryCostForm(Model uiModel) {
    	List<Country> countries =  Country.findAllCountrys();
    	    	
    	uiModel.addAttribute("countries", countries);
    	uiModel.addAttribute("deliveryCostRequest", new DeliveryCostRequest());
    	
    	ModelAndView mav = new ModelAndView("deliverycost/request");
    	return mav;
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public String deliveryCost(DeliveryCostRequest deliveryCostRequest) {
    	return "deliverycost/response";
    }
}

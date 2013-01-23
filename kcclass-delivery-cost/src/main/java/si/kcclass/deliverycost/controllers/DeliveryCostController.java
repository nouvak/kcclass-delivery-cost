package si.kcclass.deliverycost.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import si.kcclass.deliverycost.domain.Country;
import si.kcclass.deliverycost.domain.DeliveryCostRequest;
import si.kcclass.deliverycost.services.FedexDeliveryCostService;
import si.kcclass.deliverycost.services.PostOfSloveniaDeliveryCostService;
import si.kcclass.deliverycost.services.UpsDeliveryCostService;

@RequestMapping("/deliverycost/**")
@Controller
public class DeliveryCostController {
	
	@Autowired
	FedexDeliveryCostService fedexService;
	@Autowired
	UpsDeliveryCostService upsService;
	@Autowired
	PostOfSloveniaDeliveryCostService postOfSloveniaService;
	
    
    @RequestMapping
    public String deliveryCostForm(Model uiModel) {
    	List<Country> countries =  Country.findAllCountrys();
    	    	
    	uiModel.addAttribute("countries", countries);
    	uiModel.addAttribute("deliveryCostRequest", new DeliveryCostRequest());
    	
    	return "deliverycost/request";
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public String deliveryCost(DeliveryCostRequest deliveryCostRequest, Model uiModel) {
    	Double fedexDeliveryCost = fedexService.getDeliveryCost(deliveryCostRequest);
    	Double upsDeliveryCost = upsService.getDeliveryCost(deliveryCostRequest);
    	Double postOfSlovenia = postOfSloveniaService.getDeliveryCost(deliveryCostRequest);
    	
    	uiModel.addAttribute("fedexDeliveryCost", fedexDeliveryCost);
    	uiModel.addAttribute("upsDeliveryCost", upsDeliveryCost);
    	uiModel.addAttribute("postOfSlovenia", postOfSlovenia);
    	
    	return "deliverycost/response";
    }
}

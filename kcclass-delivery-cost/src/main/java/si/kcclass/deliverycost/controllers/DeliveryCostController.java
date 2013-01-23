package si.kcclass.deliverycost.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import si.kcclass.deliverycost.domain.Country;
import si.kcclass.deliverycost.domain.DeliveryCostRequest;
import si.kcclass.deliverycost.domain.Post;

@RequestMapping("/deliverycost/**")
@Controller
public class DeliveryCostController {

    /*@RequestMapping(method = RequestMethod.POST, value = "{id}")
    public void post(@PathVariable Long id, ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
    }

    @RequestMapping
    public String index() {
        return "deliverycost/index";
    }*/
    
    @RequestMapping
    public ModelAndView deliveryCostForm(Model uiModel) {
    	//List<Country> countries =  Country.findAllCountrys();
    	//List<Post> posts =  Country.findAllPosts();
    	
    	List<Country> countries = new ArrayList<Country>();
    	Country c = new Country();
    	c.setId(1L);
    	c.setName("Slovenia");
    	c.setVersion(0);
    	countries.add(c);
    	c = new Country();
    	c.setId(2L);
    	c.setName("USA");
    	c.setVersion(0);
    	countries.add(c);
    	
    	List<Post> posts = new ArrayList<Post>();
    	Post p = new Post();
    	p.setId(1L);
    	p.setName("Hruševje");
    	p.setZipCode("6225");
    	posts.add(p);
    	p = new Post();
    	p.setId(2L);
    	p.setName("Postojna");
    	p.setZipCode("6230");
    	posts.add(p);
    	
    	uiModel.addAttribute("countries", countries);
    	uiModel.addAttribute("posts", posts);
    	uiModel.addAttribute("deliveryCostRequest", new DeliveryCostRequest());
    	
    	ModelAndView mav = new ModelAndView("deliverycost/request");
    	return mav;
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public String deliveryCost(DeliveryCostRequest deliveryCostRequest) {
    	return "deliverycost/response";
    }
}

package com.codingdojo.assignments;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Receipt {
	
	// class definition and imports here...
    @RequestMapping("/")
    public String index(Model model) {
        
        String name = "Taeko";
        String itemName = "Red wine";
        double price = 18.00;
        String description = "Red wine from Washington";
        String vendor = "Store name is xxx";
   
    	// Your code here! Add values to the view model to be rendered
        model.addAttribute("name", name);
        model.addAttribute("itemName", itemName);
        model.addAttribute("price", price);
        model.addAttribute("description", description);
        model.addAttribute("vendor", vendor);
    
        return "index.jsp";
    }
}

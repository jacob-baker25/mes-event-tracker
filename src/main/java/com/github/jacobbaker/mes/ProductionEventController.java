package com.github.jacobbaker.mes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.github.jacobbaker.mes.service.ProductionEventService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import com.github.jacobbaker.mes.domain.ProductionEvent;



@Controller
public class ProductionEventController {
    @Autowired
    private ProductionEventService productionEventService;

    @GetMapping("/events")
    public String getAllEvents(Model model){
        List<ProductionEvent> events = productionEventService.getAllEvents();
        model.addAttribute("events",events);
        return "events"; // This should correspond to a Thymeleaf template named events.html
    }

    @PostMapping("/saveEvent")
    public String saveEvent(@ModelAttribute ProductionEvent event){
        productionEventService.saveEvent(event);
        return "redirect:/events";
    }



}

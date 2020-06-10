package controllers;

import model.Counter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
@SessionAttributes("counter")
public class CounterController {

    @ModelAttribute("counter")
    public Counter initCounter() {
        return new Counter();
    }

    @GetMapping
    public ModelAndView showCounter(@ModelAttribute() Counter counter) {
        ModelAndView modelAndView = new ModelAndView("index");
        counter.increment();
        modelAndView.addObject("counter", counter);
        return modelAndView;
    }
}

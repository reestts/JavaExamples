package com.reestts.springmvc;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/employee")
public class TestController {

    @RequestMapping("/")
    public String showTestView() {
        return "testView";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model) {
        model.addAttribute("employee", new Employee());
        return "askDetailsView";
    }

    @Deprecated
    @RequestMapping("/showDetailsOld")
    public String showEmployeeDetailsOld(@RequestParam("employeeName") String name, Model model) {
        name = "Mr. " + name;
        model.addAttribute("nameAttribute", name);

        return "showDetailsView";
    }

    @RequestMapping("/showDetails")
    public String showEmployeeDetails(@Valid @ModelAttribute("employee") Employee employee, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "askDetailsView";
        } else {
            return "showDetailsView";
        }
    }
}

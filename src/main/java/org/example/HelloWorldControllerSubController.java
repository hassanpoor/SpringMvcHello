package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;


@Controller
@RequestMapping("subController/")
public class HelloWorldControllerSubController {
    @RequestMapping("showForm")
    public String showForm(){
        return "showForm";
    }

    @RequestMapping("processForm")
    public String processForm(){
        return "HelloWorld";
    }

    @RequestMapping("studentNameUpperCase")
    public String studentNameUpperCase(HttpServletRequest request, Model model) {
        String stdName = request.getParameter("studentName");
        stdName = stdName.toUpperCase();
        String result = "yo " + stdName;
        model.addAttribute("stdName", result);
        return "HelloWorld";
    }

    @RequestMapping("studentNameLowerCase")
    public String studentNameLowerCase(@RequestParam("studentName") String stdName, Model model) {
        String result = "yo " + stdName;
        model.addAttribute("stdNameLowerCase", result);
        return "HelloWorld";
    }
}

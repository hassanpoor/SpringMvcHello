package org.example.formTag;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.Map;

@Controller
public class StudentController {
    @Value("#{countryOptions}")
    private Map<String, String> countryOptions;

    @Value("#{programmingLanguage}")
    private Map<String, String> programmingLanguage;

    @Value("#{operatingSystem}")
    private Map<String, String> operatingSystemMap;

    @RequestMapping("studentForm")
    public String showStudentForm(Model model) {
//        model.addAttribute("submitStudent", new Student());
        model.addAttribute("submitStudent", new Student("hossein", "hassanpour"));
        model.addAttribute("theCountryOptions", countryOptions);
        model.addAttribute("programmingLanguage", programmingLanguage);
        model.addAttribute("operatingSystemMap", operatingSystemMap);
        return "studnetForm";
    }

    @RequestMapping("confirmStudentData")
    public String confirmStudentData(@Valid @ModelAttribute("submitStudent") Student student, BindingResult bindingResult) {
        if(bindingResult.hasErrors()){
            return "studnetForm";
        }
        return "confirmData";
    }
}

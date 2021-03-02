package com.fibonaccimaster.fibonacci.recursive.controller;


import com.fibonaccimaster.fibonacci.recursive.model.OperationModel;
import com.fibonaccimaster.fibonacci.recursive.service.GeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GeneratorController {

    OperationModel operationModel = new OperationModel();

    @Autowired
    private GeneratorService generatorService;

    @RequestMapping(value = "/api/fibonacci", method = RequestMethod.GET)
    public String getGeneratorPage(Model model)
    {
        model.addAttribute("operationModel", operationModel);
        return "clean";
    }

    @RequestMapping(value = "/api/fibonacci", params = "fibonacci", method = RequestMethod.GET)
    public String fibonacci(@ModelAttribute("operationModel") OperationModel operationModel, Model model)
    {
        model.addAttribute("result", generatorService.fibonacciSerie(operationModel));
        return "generated";
    }

    @RequestMapping(value = "/api/fibonacci", params = "clear", method = RequestMethod.GET)
    public String clear(@ModelAttribute("operationModel") OperationModel operationModel, Model model)
    {
        model.addAttribute("operationModel", generatorService.clear(operationModel));
        model.addAttribute("result", 0);
        return "clean";
    }

}

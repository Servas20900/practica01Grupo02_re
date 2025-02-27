package practica01Grupo02.controller;

import practica01Grupo02.service.ArbolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/Arbol")
public class ArbolController {

    @Autowired
    private ArbolService arbolService;

    @GetMapping("/Listar")
     public String inicio(Model model) {
        var arboles = arbolService.getArboles(false);
        model.addAttribute("arbol", arboles);
        return "Arbol/Listar";
    }
}

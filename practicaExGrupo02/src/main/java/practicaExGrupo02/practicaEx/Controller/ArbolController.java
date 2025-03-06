package practicaExGrupo02.practicaEx.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import practicaExGrupo02.practicaEx.service.ArbolService;


@Controller
@RequestMapping("/arbol")
public class ArbolController {
    
    @Autowired
    private ArbolService arbolService ;

    @GetMapping("/listado")
    public String listarArboles (Model model) {
        var arboles = arbolService.getArboles();
        model.addAttribute("arboles", arboles);
        model.addAttribute("totalarboles", arboles.size());
        return "/arbol/listado";
    }
}
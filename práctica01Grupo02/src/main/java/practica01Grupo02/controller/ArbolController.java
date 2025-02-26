package practica01Grupo02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import practica01Grupo02.domain.Arbol;
import practica01Grupo02.service.ArbolService;

import java.util.List;

@Controller
@RequestMapping("/Arbol")
public class ArbolController {

    @Autowired
    private ArbolService arbolService;

    @GetMapping("categoria/listar")
    public String listarArboles(Model model) {
        List<Arbol> arboles = arbolService.getArboles(true);
        model.addAttribute("arboles", arboles);
        return "listarArboles"; // Redirige a listarArboles.html
    }

    @GetMapping("/nuevo")
    public String nuevoArbol(Model model) {
        model.addAttribute("arbol", new Arbol());
        return "formArbol";
    }

    @PostMapping("/guardar")
    public String guardarArbol(@ModelAttribute Arbol arbol) {
        arbolService.save(arbol);
        return "redirect:/arboles/";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarArbol(@PathVariable Long id) {
        arbolService.delete(id);
        return "redirect:/arboles/";
    }
}

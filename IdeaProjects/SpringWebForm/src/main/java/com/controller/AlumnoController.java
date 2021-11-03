package com.controller;

import com.dto.AlumnoDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/alumno")
public class AlumnoController {

    @GetMapping("/save")
    public String saveGET() {
        return "alumno/index";
    }

    @PostMapping("/save")
    public String savePOST(ModelMap model,
                           @RequestParam(name="apePaterno") String apePaterno,
                           @RequestParam(name="apeMaterno") String apeMaterno,
                           @RequestParam(name="nombres") String nombres) {

        String fullName = apePaterno + " " + apeMaterno + " " + nombres;
        model.addAttribute("nombre", fullName);
        return "alumno/index";
    }

    // En lugar de pasar los @RequestParam desde el formulario por cada elemento del formulario
    // pasamos un objeto AlumnoDTO con la anotación @ModelAttribute, nota, los campos o nombres del objeto
    // AlumnoDTO deben ser iguales que los nombres del formulario elemento "name".
    // El "name" del formulario debe de coincidir con el nombre especificado en @ModelAttribute("datos") en
    // este caso "datos"
    @PostMapping("/saveDTO")
    public String savePOST(ModelMap model, @ModelAttribute("datos")AlumnoDTO alumnoDTO) {

        String fullName = alumnoDTO.getApePaterno() + " " + alumnoDTO.getApeMaterno() + " " + alumnoDTO.getNombres();
        model.addAttribute("nombre", fullName);
        return "alumno/index";
    }

    // Otra forma de definir el método anterior es quitando el "@ModelAttribute("datos") y el "name" del formulario
    // quedando solamente el objeto DTO "AlumnoDTO", Spring sabrá como vincular los datos al método controller
    @PostMapping("/savePOSTDTO")
    public String savePOSTDTO(ModelMap model, AlumnoDTO alumnoDTO) {

        String fullName = alumnoDTO.getApePaterno() + " " +
                alumnoDTO.getApeMaterno() + " " + alumnoDTO.getNombres() + " " +
                alumnoDTO.getFecNac() + " " +alumnoDTO.getEmail() + " " + alumnoDTO.getGenero() + " " +
                alumnoDTO.getNivel();
        model.addAttribute("nombre", fullName);
        return "alumno/index";

    }


}

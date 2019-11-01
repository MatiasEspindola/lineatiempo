/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.analistas.trabajopractico.controllers;

import com.analistas.trabajopractico.models.entities.Lenguaje;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author matia
 */
@Controller
public class inicioController {

    @GetMapping({"/", "index"})
    public String index(Map m) {

        m.put("titulo", "Formulario de Lenguaje");
        return "index";
    }

    @RequestMapping(value = "/form")
    public String crear(Map<String, Object> model) {

        Lenguaje lenguaje = new Lenguaje();
        model.put("lenguaje", lenguaje);
        model.put("titulo", "Formulario de Lenguaje");
        return "formulario";
    }

}

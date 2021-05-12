/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.analistas.ventas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author ander
 */
@Controller
@RequestMapping("/productos")
public class ProductoController {
    
    @GetMapping("/listado")
    public String listar(Model m) {
        
        m.addAttribute("titulo", "Listado de Productos");
        return "productos/list";
    }
    
}

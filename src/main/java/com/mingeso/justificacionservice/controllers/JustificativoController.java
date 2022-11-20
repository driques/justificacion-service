package com.mingeso.justificacionservice.controllers;


import com.mingeso.justificacionservice.entities.JustificacionEntity;
import com.mingeso.justificacionservice.services.JustificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/justificacion")
public class JustificativoController {

    @Autowired
    JustificacionService justificacionService;

    @PostMapping("/")
    public ResponseEntity<JustificacionEntity> crearJustificacion(@RequestBody JustificacionEntity justificacion){
        try {
            justificacionService.guardarJustificacion(justificacion);
            //Mensaje ok
            System.out.println("Justificacion creada");
            return ResponseEntity.ok(justificacion);

        }
        catch (Exception e){
            //Mensaje error 500
            System.out.println("Error al crear justificacion");
            return null;

        }

    }

    @ResponseBody
    @GetMapping("/{id}")
    public String[] obtenerJustificacion(@PathVariable Integer id){
         String[] justificacion = justificacionService.getDatesByRut(id);
        return justificacion;
    }
}

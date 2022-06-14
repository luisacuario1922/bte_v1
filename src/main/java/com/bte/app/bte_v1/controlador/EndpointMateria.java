package com.bte.app.bte_v1.controlador;

import com.bte.app.bte_v1.dto.MateriaDto;
import com.bte.app.bte_v1.dto.UserDto;
import com.bte.app.bte_v1.entities.Materia;
import com.bte.app.bte_v1.servicios.ServicioMateria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/materia")
@CrossOrigin(origins = "*")
public class EndpointMateria {
    @Autowired
    private ServicioMateria servicio;

    @GetMapping
    public List<Materia> selectAll(){
        return servicio.selectAll();
    }

    @PostMapping
    public Integer registrarUsuario(@RequestBody MateriaDto materia){
        return this.servicio.registrarMateria(materia);
    }
}

package com.bte.app.bte_v1.controlador;

import com.bte.app.bte_v1.dto.RolDto;
import com.bte.app.bte_v1.entities.Rol;
import com.bte.app.bte_v1.servicios.ServicioRol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rol")
@CrossOrigin(origins = "*")
public class EndpointRol {
    @Autowired
    private ServicioRol servicio;

    @GetMapping
    public List<Rol> selectAll(){
        return servicio.selectAll();
    }

    @PostMapping
    public Integer registrarUsuario(@RequestBody RolDto materia){
        return this.servicio.registrarRol(materia);
    }
}

package com.bte.app.bte_v1.controlador;

import com.bte.app.bte_v1.dto.RolDto;
import com.bte.app.bte_v1.dto.SemestreDto;
import com.bte.app.bte_v1.entities.Rol;
import com.bte.app.bte_v1.entities.Semestre;
import com.bte.app.bte_v1.servicios.ServicioRol;
import com.bte.app.bte_v1.servicios.ServicioSemestre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/semestre")
@CrossOrigin(origins = "*")
public class EndpointSemestre {
    @Autowired
    private ServicioSemestre servicio;

    @GetMapping
    public List<Semestre> selectAll(){
        return servicio.selectAll();
    }

    @PostMapping
    public Integer registrarUsuario(@RequestBody SemestreDto semestre){
        return this.servicio.registrarSemestre(semestre);
    }
}

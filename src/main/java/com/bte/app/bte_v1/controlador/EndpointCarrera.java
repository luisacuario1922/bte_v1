package com.bte.app.bte_v1.controlador;

import com.bte.app.bte_v1.dto.CarreraDto;
import com.bte.app.bte_v1.entities.Carrera;
import com.bte.app.bte_v1.servicios.ServicioCarrera;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carrera")
@CrossOrigin(origins = "*")
public class EndpointCarrera {
    @Autowired
    private ServicioCarrera servicio;

    @GetMapping
    public List<Carrera> selectAll(){
        return servicio.selectAll();
    }

    @PostMapping
    public Integer registrarCarrera(@RequestBody CarreraDto carrera){
        return this.servicio.registrarCarrera(carrera);
    }

    @DeleteMapping("/eliminar/{id}")
    public Integer eliminarCarrera(@PathVariable Integer id){
        return this.servicio.eliminarCarrera(id);
    }
}

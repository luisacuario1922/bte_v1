package com.bte.app.bte_v1.controlador;

import com.bte.app.bte_v1.dto.TemaDto;
import com.bte.app.bte_v1.dto.UnidadDto;
import com.bte.app.bte_v1.entities.Tema;
import com.bte.app.bte_v1.entities.Unidad;
import com.bte.app.bte_v1.servicios.ServicioTema;
import com.bte.app.bte_v1.servicios.ServicioUnidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/unidad")
@CrossOrigin(origins = "*")
public class EndpointUnidad {
    @Autowired
    private ServicioUnidad servicio;

    @GetMapping
    public List<Unidad> selectAll(){
        return servicio.selectAll();
    }

    @PostMapping
    public Integer registrarUnidad(@RequestBody UnidadDto unidad){
        return this.servicio.registrarUnidad(unidad);
    }
}

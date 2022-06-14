package com.bte.app.bte_v1.controlador;

import com.bte.app.bte_v1.dto.SemestreDto;
import com.bte.app.bte_v1.dto.TemaDto;
import com.bte.app.bte_v1.entities.Semestre;
import com.bte.app.bte_v1.entities.Tema;
import com.bte.app.bte_v1.servicios.ServicioSemestre;
import com.bte.app.bte_v1.servicios.ServicioTema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tema")
@CrossOrigin(origins = "*")
public class EndpointTema {
    @Autowired
    private ServicioTema servicio;

    @GetMapping
    public List<Tema> selectAll(){
        return servicio.selectAll();
    }

    @PostMapping
    public Integer registrarTema(@RequestBody TemaDto tema){
        return this.servicio.registrarTema(tema);
    }
}

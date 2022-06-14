package com.bte.app.bte_v1.controlador;

import com.bte.app.bte_v1.dto.UserDto;
import com.bte.app.bte_v1.entities.User;
import com.bte.app.bte_v1.servicios.ServicioUsuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "*")
public class EndpointUser {

    @Autowired
    private ServicioUsuarios servicio;

    @GetMapping
    public List<User> selectAll(){
        return servicio.selectAll();
    }

    @PostMapping
    public Integer registrarUsuario(@RequestBody UserDto user){
        System.out.println(user);
        return this.servicio.registrarUsuario(user);
    }

    @DeleteMapping("/eliminar/{id}")
    public String eliminarUsuario(@PathVariable Integer id){
        return this.servicio.eliminarUsuario(id);
    }
}

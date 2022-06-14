package com.bte.app.bte_v1.servicios;

import com.bte.app.bte_v1.dto.CarreraDto;
import com.bte.app.bte_v1.dto.UnidadDto;
import com.bte.app.bte_v1.entities.Carrera;
import com.bte.app.bte_v1.entities.Unidad;
import com.bte.app.bte_v1.repository.ICarrera;
import com.bte.app.bte_v1.repository.IUnidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ServicioUnidad {
    @Autowired
    private IUnidad db;

    public List<Unidad> selectAll(){
        return db.listaUnidad();
    }

    public Integer registrarUnidad(UnidadDto unidad){
        return this.db.registrarUnidad(
                unidad.getIdMateria(),
                unidad.getNombre(),
                unidad.getNumero());
    }
    public Integer eliminarUnidad(Integer id){
        return db.eliminarUnidad(id);
    }
}

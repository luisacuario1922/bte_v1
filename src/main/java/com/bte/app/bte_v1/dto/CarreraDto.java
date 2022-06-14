package com.bte.app.bte_v1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarreraDto {
    private Integer Id;
    private String Nombre;
    private String Clave;
    private String Especialidad;

}

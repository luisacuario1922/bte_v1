package com.bte.app.bte_v1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UnidadDto {
    private Integer Id;
    private Integer IdMateria;
    private String Nombre;
    private Integer Numero;
}

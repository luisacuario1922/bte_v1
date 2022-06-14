package com.bte.app.bte_v1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class MateriaDto {
    private Integer Id;
    private Integer IdCarrera;
    private Integer IdSemestre;
    private String Nombre;
    private String Clave;
    private Integer HT;
    private Integer HP;
    private Integer TH;
}

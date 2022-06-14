package com.bte.app.bte_v1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class TemaDto {
    private Integer Id;
    private Integer IdUnidad;
    private String IdPadre;
    private String Nombre;
    private String NumTxt;
    private String Contenido;
}

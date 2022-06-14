package com.bte.app.bte_v1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private Integer Id;
    private Integer IdRol;
    private String Nombre;
    private String Apellidos;
    private String Email;
    private String Password;
}

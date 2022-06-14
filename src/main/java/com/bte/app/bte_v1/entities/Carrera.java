package com.bte.app.bte_v1.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name = "Carrera")

public class Carrera {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Carrera")
    private Integer Id;
    @Column(name = "Nombre")
    private String Nombre;
    @Column(name = "Clave")
    private String Clave;
    @Column(name = "Especialidad")
    private String Especialidad;
}

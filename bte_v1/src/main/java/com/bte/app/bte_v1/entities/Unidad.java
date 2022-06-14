package com.bte.app.bte_v1.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name = "Unidad")
public class Unidad {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Unidad")
    private Integer Id;

    @ManyToOne
    @JoinColumn(name = "Id_Materia", referencedColumnName = "Id_Materia")
    private Materia IdMateria;

    @Column(name = "Nombre")
    private String Nombre;

    @Column(name = "Num")
    private Integer Numero;
}

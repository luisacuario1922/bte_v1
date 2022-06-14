package com.bte.app.bte_v1.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name = "Tema")
public class Tema {
    @javax.persistence.Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Tema")
    private Integer Id;

    @ManyToOne
    @JoinColumn(name = "Id_Unidad", referencedColumnName = "Id_Unidad")
    private Unidad IdUnidad;

    @Column(name = "Id_Padre")
    private String IdPadre;

    @Column(name = "Nombre")
    private String Nombre;

    @Column(name = "Num_Txt")
    private String NumTxt;

    @Column(name = "Contenido")
    private String Contenido;
}

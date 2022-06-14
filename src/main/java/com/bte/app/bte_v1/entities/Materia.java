package com.bte.app.bte_v1.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name = "Materia")
public class Materia {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Materia")
    private Integer Id;

    @ManyToOne
    @JoinColumn(name = "Id_Carrera", referencedColumnName = "Id_Carrera")
    private Carrera Id_Carrera;

    @ManyToOne
    @JoinColumn(name = "Id_Semestre", referencedColumnName = "Id_Semestre")
    private Semestre IdSemestre;

    @Column(name = "Nombre")
    private String Nombre;

    @Column(name = "Clave")
    private String Clave;

    @Column(name = "HT")
    private Integer HT;

    @Column(name = "HP")
    private Integer HP;

    @Column(name = "TH")
    private Integer TH;
}

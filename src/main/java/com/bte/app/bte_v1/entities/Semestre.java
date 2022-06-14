package com.bte.app.bte_v1.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name = "Semestre")
public class Semestre {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Semestre")
    private Integer Id;

    @Column(name = "Nombre")
    private String Nombre;


}

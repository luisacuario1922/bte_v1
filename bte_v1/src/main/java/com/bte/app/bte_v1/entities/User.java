package com.bte.app.bte_v1.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name = "Usuario")
public class User {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer Id;


    @ManyToOne
    @JoinColumn(name = "id_rol", referencedColumnName = "Id")
    private Rol IdRol;

    @Column(name = "Nombre")
    private String Nombre;
    @Column(name = "Apellidos")
    private String Apellidos;
    @Column(name = "Email")
    private String Email;
    @Column(name = "Password")
    private String Password;
}

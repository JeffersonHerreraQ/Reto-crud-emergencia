package com.jeffhq.Crud.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Emergencia {

    private Date fecha_reg;
    private Date fecha_eme;
    private String titulo;
    private String descripcion;
    private Float latitud;
    private Float longitud;
    @Id
    @GeneratedValue
    private Long codigo;

    @ManyToOne(cascade = CascadeType.ALL) //para que si se elimina un registro, se elimine la relacion
    @JoinColumn(name = "personal_id")
    private Personal personal;

}

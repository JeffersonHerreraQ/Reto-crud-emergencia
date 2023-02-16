package com.jeffhq.Crud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
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

}

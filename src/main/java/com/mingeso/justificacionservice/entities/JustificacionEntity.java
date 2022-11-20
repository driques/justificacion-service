package com.mingeso.justificacionservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "justificacion")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JustificacionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id;
    private int rut;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fecha;

    public JustificacionEntity(int rut, LocalDate fecha) {
        this.rut = rut;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setNewId(int id){
        this.id = id;
    }


}

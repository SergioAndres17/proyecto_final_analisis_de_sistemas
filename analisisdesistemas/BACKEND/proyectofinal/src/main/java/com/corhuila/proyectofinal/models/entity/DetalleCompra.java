package com.corhuila.proyectofinal.models.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "detalle_compra")
public class DetalleCompra {
    @Id
    @Column(name = "id_detalle_compra")
    private Integer idDetalleCompra;

    @Column(name = "cantidad")
    private Integer cantidad;

    @Column(name = "precio_unitario")
    private Double precioUnitario;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

    @Column(name = "deleted_at")
    private Date deletedAt;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_compra")
    private Persona compra;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_moto")
    private Persona moto;
}

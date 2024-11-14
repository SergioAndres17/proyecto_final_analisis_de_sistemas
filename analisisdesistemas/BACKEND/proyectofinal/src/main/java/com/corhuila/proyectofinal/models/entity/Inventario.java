package com.corhuila.proyectofinal.models.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "inventario")
public class Inventario {
    @Id
    @Column(name = "id_inventario")
    private Integer idInventario;

    @Column(name = "fecha_ultima_actualizacion")
    private Date fechaActualizacion;

    /*@Column(name = "precio_compra")
    private Integer precioCompra;

    @Column(name = "precio_venta")
    private Integer precioVenta;*/

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

    @Column(name = "deleted_at")
    private Date deletedAt;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_moto")
    private Moto moto;
}

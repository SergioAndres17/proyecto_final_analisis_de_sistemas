package com.corhuila.proyectofinal.models.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "compra")
public class Compra {
    @Id
    @Column(name = "id_compra")
    private Integer idCompra;

    @Column(name = "fecha_compra")
    private Date fechaCompra;

    @Column(name = "total")
    private Double precioTotal;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

    @Column(name = "deleted_at")
    private Date deletedAt;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_proveedor")
    private Persona proveedor;

}



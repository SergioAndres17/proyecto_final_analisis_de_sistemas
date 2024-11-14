package com.corhuila.proyectofinal.models.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "venta")
public class Venta {
    @Id
    @Column(name = "id_venta")
    private Integer idVenta;

    @Column(name = "fecha")
    private Date fecha;

    @Column(name = "valor_total")
    private Double valorTotal;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

    @Column(name = "deleted_at")
    private Date deletedAt;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cliente_id_cliente")
    private Persona cliente;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "vendedor_id_vendedor")
    private Persona vendedor;
}

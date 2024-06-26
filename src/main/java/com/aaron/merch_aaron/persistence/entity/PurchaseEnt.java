package com.aaron.merch_aaron.persistence.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "compras")
public class PurchaseEnt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_compra")
    private Integer purchaseId;

    @Column(name="id_cliente")
    private String clientId;

    @Column(name="fecha")
    private LocalDateTime date;

    @Column(name="medio_pago")
    private String paymentType;

    @Column(name="comentario")
    private String comment;

    @Column(name="estado")
    private String status;

    @ManyToOne
    @JoinColumn(name = "id_cliente", insertable = false, updatable = false)
    private CostumerEnt costumer;

    @OneToMany(mappedBy = "purchase", cascade = {CascadeType.ALL})
    private List<PurchasesProductEnt> products;

    public Integer getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(Integer purchaseId) {
        this.purchaseId = purchaseId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<PurchasesProductEnt> getProducts() {
        return products;
    }

    public void setProducts(List<PurchasesProductEnt> products) {
        this.products = products;
    }

    public CostumerEnt getCostumer() {
        return costumer;
    }

    public void setCostumer(CostumerEnt costumer) {
        this.costumer = costumer;
    }
}

package org.ybdev.calabriamanom.Entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.ybdev.calabriamanom.Utils.TypePlat;

import java.math.BigDecimal;

@Entity
@Table(name = "plats")
public class PlatEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(nullable = false)
    private String name;

    @Column(columnDefinition = "TEXT")
    private String description;

    private String imageUrl;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TypePlat type;

    @NotNull
    @DecimalMin("0.00")
    @Column(nullable = false, precision = 6, scale = 2)
    private BigDecimal prix;

    @DecimalMin("0.00")
    @Column(precision = 6, scale = 2)
    private BigDecimal prixFamilial;

    @Column(nullable = false)
    private boolean disponible = true;

    private Integer ordre;

    public PlatEntity() {
    }

    public PlatEntity(String name, String description, String imageUrl, TypePlat type,
                      BigDecimal prix, BigDecimal prixFamilial) {
        this.name = name;
        this.description = description;
        this.imageUrl = imageUrl;
        this.type = type;
        this.prix = prix;
        this.prixFamilial = prixFamilial;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public TypePlat getType() {
        return type;
    }

    public void setType(TypePlat type) {
        this.type = type;
    }

    public BigDecimal getPrix() {
        return prix;
    }

    public void setPrix(BigDecimal prix) {
        this.prix = prix;
    }

    public BigDecimal getPrixFamilial() {
        return prixFamilial;
    }

    public void setPrixFamilial(BigDecimal prixFamilial) {
        this.prixFamilial = prixFamilial;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Integer getOrdre() {
        return ordre;
    }

    public void setOrdre(Integer ordre) {
        this.ordre = ordre;
    }
}
package org.ybdev.calabriamanom.Domain;

import org.ybdev.calabriamanom.Utils.TypePlat;

import java.math.BigDecimal;

public class Plat {

    private Long id;
    private String name;
    private String description;
    private String imageUrl;
    private TypePlat type;
    private BigDecimal prix;
    private BigDecimal prixFamilial;
    private boolean disponible = true;
    private Integer ordre;

    public Plat(String name, String description, String imageUrl, TypePlat type, BigDecimal prix, BigDecimal prixFamilial) {
        this.name = name;
        this.description = description;
        this.imageUrl = imageUrl;
        this.type = type;
        this.prix = prix;
        this.prixFamilial = prixFamilial;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

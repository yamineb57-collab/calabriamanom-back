package org.ybdev.calabriamanom.Mappers;

import org.ybdev.calabriamanom.Domain.Plat;
import org.ybdev.calabriamanom.Entities.PlatEntity;
import org.springframework.stereotype.Component;

@Component
public class PlatMapper {

    public Plat toDomain(PlatEntity entity) {
        if (entity == null) {
            return null;
        }

        return new Plat(
                entity.getName(),
                entity.getDescription(),
                entity.getImageUrl(),
                entity.getType(),
                entity.getPrix(),
                entity.getPrixFamilial()
        );
    }

    public PlatEntity toEntity(Plat plat) {
        if (plat == null) {
            return null;
        }

        return new PlatEntity(
                plat.getName(),
                plat.getDescription(),
                plat.getImageUrl(),
                plat.getType(),
                plat.getPrix(),
                plat.getPrixFamilial()
        );
    }
}
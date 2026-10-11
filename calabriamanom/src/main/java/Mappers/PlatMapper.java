package Mappers;

import Domain.Plat;
import Entities.PlatEntity;
import org.springframework.stereotype.Component;

@Component
public class PlatMapper {

    public Plat toDomain(PlatEntity entity) {
        if (entity == null) {
            return null;
        }

        Plat plat = new Plat(
                entity.getId(),
                entity.getName(),
                entity.getDescription(),
                entity.getImageURL(),
                entity.getType()
        );

        return plat;
    }

    public PlatEntity toEntity(Plat plat) {
        if (plat == null) {
            return null;
        }

        PlatEntity entity = new PlatEntity(
                plat.getId(),
                plat.getName(),
                plat.getDescription(),
                plat.getImageURL(),
                plat.getType()
        );

        return entity;
    }
}
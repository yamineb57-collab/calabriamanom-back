package org.ybdev.calabriamanom.Service;

import org.ybdev.calabriamanom.Domain.Plat;
import org.ybdev.calabriamanom.Entities.PlatEntity;
import org.ybdev.calabriamanom.Exception.PlatNotFoundException;
import org.ybdev.calabriamanom.Mappers.PlatMapper;
import org.ybdev.calabriamanom.Repositories.PlatRepository;
import org.ybdev.calabriamanom.Utils.TypePlat;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class PlatService {

    private final PlatRepository repository;
    private final PlatMapper mapper;

    public PlatService(PlatRepository repository, PlatMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<Plat> getAllPlats() {
        return repository.findAll()
                .stream()
                .map(mapper::toDomain)
                .toList();
    }

    public List<Plat> getPlatsByType(TypePlat type) {
        return repository.findByType(type)
                .stream()
                .map(mapper::toDomain)
                .toList();
    }

    public Plat getPlatById(Long id) {
        return mapper.toDomain(findOrThrow(id));
    }

    @Transactional
    public Plat createPlat(Plat plat) {
        PlatEntity entity = mapper.toEntity(plat);
        return mapper.toDomain(repository.save(entity));
    }

    @Transactional
    public Plat updatePlat(Long id, Plat plat) {
        PlatEntity entity = findOrThrow(id);

        entity.setName(plat.getName());
        entity.setDescription(plat.getDescription());
        entity.setImageUrl(plat.getImageUrl());
        entity.setType(plat.getType());
        entity.setPrix(plat.getPrix());
        entity.setPrixFamilial(plat.getPrixFamilial());
        entity.setDisponible(plat.isDisponible());
        entity.setOrdre(plat.getOrdre());

        return mapper.toDomain(repository.save(entity));
    }

    @Transactional
    public void deletePlat(Long id) {
        if (!repository.existsById(id)) {
            throw new PlatNotFoundException(id);
        }

        repository.deleteById(id);
    }

    private PlatEntity findOrThrow(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new PlatNotFoundException(id));
    }
}
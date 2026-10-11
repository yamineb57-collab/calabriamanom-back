package Service;

import Domain.Plat;
import Entities.PlatEntity;
import Mappers.PlatMapper;
import Repositories.PlatRepository;
import Utils.TypePlat;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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
        PlatEntity entity = repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Plat introuvable : " + id));

        return mapper.toDomain(entity);
    }

    public Plat createPlat(Plat plat) {
        PlatEntity entity = mapper.toEntity(plat);
        return mapper.toDomain(repository.save(entity));
    }

    public Plat updatePlat(Long id, Plat plat) {
        PlatEntity entity = repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Plat introuvable : " + id));

        entity.setName(plat.getName());
        entity.setDescription(plat.getDescription());
        entity.setImageURL(plat.getImageURL());
        entity.setType(plat.getType());

        return mapper.toDomain(repository.save(entity));
    }

    public void deletePlat(Long id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Plat introuvable : " + id);
        }

        repository.deleteById(id);
    }
}
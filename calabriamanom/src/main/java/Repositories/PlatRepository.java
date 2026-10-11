package Repositories;

import Entities.PlatEntity;
import Utils.TypePlat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlatRepository extends JpaRepository<PlatEntity, Long> {

    List<PlatEntity> findByType(TypePlat type);
}
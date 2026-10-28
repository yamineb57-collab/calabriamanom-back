package org.ybdev.calabriamanom.Service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.ybdev.calabriamanom.Domain.Plat;
import org.ybdev.calabriamanom.Entities.PlatEntity;
import org.ybdev.calabriamanom.Exception.PlatNotFoundException;
import org.ybdev.calabriamanom.Mappers.PlatMapper;
import org.ybdev.calabriamanom.Repositories.PlatRepository;
import org.ybdev.calabriamanom.Utils.TypePlat;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class PlatServiceTest {

    @Mock
    private PlatRepository repository;

    @Mock
    private PlatMapper mapper;

    @InjectMocks
    private PlatService service;


    @Test
    void getAllPlats_retourneTousLesPlatsMappes() {
        PlatEntity entity1 = new PlatEntity();
        PlatEntity entity2 = new PlatEntity();
        Plat plat1 = mock(Plat.class);
        Plat plat2 = mock(Plat.class);

        when(repository.findAll()).thenReturn(List.of(entity1, entity2));
        when(mapper.toDomain(entity1)).thenReturn(plat1);
        when(mapper.toDomain(entity2)).thenReturn(plat2);

        List<Plat> result = service.getAllPlats();

        assertThat(result).containsExactly(plat1, plat2);
    }

    @Test
    void getPlatsByType_filtreSurLeTypeDemande() {
        PlatEntity entity = new PlatEntity();
        Plat plat = mock(Plat.class);

        when(repository.findByType(TypePlat.PIZZA)).thenReturn(List.of(entity));
        when(mapper.toDomain(entity)).thenReturn(plat);

        List<Plat> result = service.getPlatsByType(TypePlat.PIZZA);

        assertThat(result).containsExactly(plat);
        verify(repository).findByType(TypePlat.PIZZA);
    }

    @Test
    void getPlatById_retourneLePlatTrouve() {
        PlatEntity entity = new PlatEntity();
        Plat plat = mock(Plat.class);

        when(repository.findById(1L)).thenReturn(Optional.of(entity));
        when(mapper.toDomain(entity)).thenReturn(plat);

        assertThat(service.getPlatById(1L)).isSameAs(plat);
    }

    @Test
    void getPlatById_introuvable_leveUneException() {
        when(repository.findById(99L)).thenReturn(Optional.empty());

        assertThatThrownBy(() -> service.getPlatById(99L))
                .isInstanceOf(PlatNotFoundException.class)
                .hasMessageContaining("99");
    }

    @Test
    void createPlat_convertitEnregistrePuisRetourneLePlat() {
        Plat input = mock(Plat.class);
        PlatEntity entity = new PlatEntity();
        PlatEntity saved = new PlatEntity();
        Plat output = mock(Plat.class);

        when(mapper.toEntity(input)).thenReturn(entity);
        when(repository.save(entity)).thenReturn(saved);
        when(mapper.toDomain(saved)).thenReturn(output);

        Plat result = service.createPlat(input);

        assertThat(result).isSameAs(output);
        verify(repository).save(entity);
    }

    @Test
    void updatePlat_metAJourTousLesChamps() {
        PlatEntity entity = new PlatEntity("Marguerite", "Ancienne description", null,
                TypePlat.PIZZA, new BigDecimal("8.40"), new BigDecimal("19.90"));
        Plat input = mock(Plat.class);
        Plat output = mock(Plat.class);

        when(input.getName()).thenReturn("Reine");
        when(input.getDescription()).thenReturn("Tomate, jambon, champignons, mozzarella, olives");
        when(input.getImageUrl()).thenReturn("reine.jpg");
        when(input.getType()).thenReturn(TypePlat.PIZZA);
        when(input.getPrix()).thenReturn(new BigDecimal("8.90"));
        when(input.getPrixFamilial()).thenReturn(new BigDecimal("21.40"));
        when(input.isDisponible()).thenReturn(false);
        when(input.getOrdre()).thenReturn(4);

        when(repository.findById(1L)).thenReturn(Optional.of(entity));
        when(repository.save(entity)).thenReturn(entity);
        when(mapper.toDomain(entity)).thenReturn(output);

        Plat result = service.updatePlat(1L, input);

        assertThat(result).isSameAs(output);
        assertThat(entity.getName()).isEqualTo("Reine");
        assertThat(entity.getDescription()).isEqualTo("Tomate, jambon, champignons, mozzarella, olives");
        assertThat(entity.getImageUrl()).isEqualTo("reine.jpg");
        assertThat(entity.getType()).isEqualTo(TypePlat.PIZZA);
        assertThat(entity.getPrix()).isEqualByComparingTo("8.90");
        assertThat(entity.getPrixFamilial()).isEqualByComparingTo("21.40");
        assertThat(entity.isDisponible()).isFalse();
        assertThat(entity.getOrdre()).isEqualTo(4);
        verify(repository).save(entity);
    }

    @Test
    void updatePlat_introuvable_leveUneExceptionSansEnregistrer() {
        Plat input = mock(Plat.class);
        when(repository.findById(99L)).thenReturn(Optional.empty());

        assertThatThrownBy(() -> service.updatePlat(99L, input))
                .isInstanceOf(PlatNotFoundException.class)
                .hasMessageContaining("99");

        verify(repository, never()).save(any());
    }

    @Test
    void deletePlat_supprimeLePlatExistant() {
        when(repository.existsById(1L)).thenReturn(true);

        service.deletePlat(1L);

        verify(repository).deleteById(1L);
    }

    @Test
    void deletePlat_introuvable_leveUneExceptionSansSupprimer() {
        when(repository.existsById(99L)).thenReturn(false);

        assertThatThrownBy(() -> service.deletePlat(99L))
                .isInstanceOf(PlatNotFoundException.class)
                .hasMessageContaining("99");

        verify(repository, never()).deleteById(any());
    }
}
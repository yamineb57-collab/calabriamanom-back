package Controller;

import Domain.Plat;
import Service.PlatService;
import Utils.TypePlat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/plats")
public class PlatController {

    private final PlatService platService;

    public PlatController(PlatService platService) {
        this.platService = platService;
    }

    @GetMapping
    public List<Plat> getAllPlats() {
        return platService.getAllPlats();
    }

    @GetMapping("/type/{type}")
    public List<Plat> getPlatsByType(@PathVariable TypePlat type) {
        return platService.getPlatsByType(type);
    }

    @GetMapping("/{id}")
    public Plat getPlatById(@PathVariable Long id) {
        return platService.getPlatById(id);
    }

    @PostMapping
    public ResponseEntity<Plat> createPlat(@RequestBody Plat plat) {
        Plat created = platService.createPlat(plat);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public Plat updatePlat(
            @PathVariable Long id,
            @RequestBody Plat plat) {
        return platService.updatePlat(id, plat);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePlat(@PathVariable Long id) {
        platService.deletePlat(id);
        return ResponseEntity.noContent().build();
    }
}
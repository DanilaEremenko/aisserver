package com.example.aisserver.controllers;

import com.example.aisserver.orm.Vessel;
import com.example.aisserver.repositories.VesselRepo;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@RestController
class VesselController {

    private final VesselRepo repository;

    VesselController(VesselRepo repository) {
        this.repository = repository;
    }

    // Aggregate root
    @GetMapping("/vessel")
    List<Vessel> all() {
        return repository.findAll();
    }

    @PostMapping("/vessel")
    Vessel putNewVessel(@RequestBody Vessel newVessel) {
        return repository.save(newVessel);
    }

    // Single item
    @GetMapping("/vessel/{id}")
    Vessel getVessel(@PathVariable Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(String.format("{} not found", id)));
    }

    @PutMapping("/vessel/{id}")
    Vessel putVessel(@RequestBody Vessel newVessel, @PathVariable Long id) {

        return repository.findById(id)
                .map(vessel -> {
//                    vessel.setImo(newVessel.getImo());
//                    vessel.setMmsi(newVessel.getMmsi());
                    return repository.save(newVessel);
                })
                .orElseGet(() -> {
                    newVessel.setId(id);
                    return repository.save(newVessel);
                });
    }

    @DeleteMapping("/vessel/{id}")
    void deleteVessel(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
package com.example.aisserver.controllers;

import com.example.aisserver.orm.AisRepository;
import com.example.aisserver.orm.AisTrack;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@RestController
class AisTrackController {

    private final AisRepository repository;

    AisTrackController(AisRepository repository) {
        this.repository = repository;
    }


    // Aggregate root
    @GetMapping("/ais_track")
    List<AisTrack> all() {
        return repository.findAll();
    }

    @PostMapping("/ais_track")
    AisTrack newAis(@RequestBody AisTrack newAisTrack) {
        return repository.save(newAisTrack);
    }

    // Single item
    @GetMapping("/ais_track/{id}")
    AisTrack getAisTrack(@PathVariable Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(String.format("{} not found", id)));
    }

    @PutMapping("/ais_track/{id}")
    AisTrack putAisTrack(@RequestBody AisTrack newTrack, @PathVariable Long id) {

        return repository.findById(id)
                .map(aisTrack -> {
//                    aisTrack.setCourse(newTrack.getCourse());
//                    aisTrack.setDraught(newTrack.getDraught());
                    return repository.save(newTrack);
                })
                .orElseGet(() -> {
                    newTrack.setId(id);
                    return repository.save(newTrack);
                });
    }

    @DeleteMapping("/ais_track/{id}")
    void deleteAisTrack(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
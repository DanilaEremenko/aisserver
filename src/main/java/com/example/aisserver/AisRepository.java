package com.example.aisserver;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AisRepository extends JpaRepository<AisTrack, Integer> {
}

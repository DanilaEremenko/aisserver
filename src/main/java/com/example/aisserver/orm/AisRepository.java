package com.example.aisserver.orm;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AisRepository extends JpaRepository<AisTrack, Long> {
}

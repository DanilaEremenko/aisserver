package com.example.aisserver.repositories;

import com.example.aisserver.orm.AisTrack;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AisTrackRepo extends JpaRepository<AisTrack, Long> {
}

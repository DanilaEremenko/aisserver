package com.example.aisserver.repositories;

import com.example.aisserver.orm.Vessel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VesselRepo extends JpaRepository<Vessel, Long> {
}

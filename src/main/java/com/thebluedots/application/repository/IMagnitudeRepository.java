package com.thebluedots.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thebluedots.application.entity.Magnitude;

public interface IMagnitudeRepository extends JpaRepository<Magnitude, Long>{

}

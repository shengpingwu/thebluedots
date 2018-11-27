package com.thebluedots.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thebluedots.application.entity.Language;

public interface ILanguageRepository extends JpaRepository<Language, Long>{

}

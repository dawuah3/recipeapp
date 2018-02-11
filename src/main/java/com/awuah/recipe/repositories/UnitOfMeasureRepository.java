package com.awuah.recipe.repositories;

import com.awuah.recipe.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<com.awuah.recipe.domain.UnitOfMeasure, Long> {

    Optional<UnitOfMeasure> findByDescription(String description);
}

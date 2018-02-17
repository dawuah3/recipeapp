package com.awuah.recipe.services;

import com.awuah.recipe.commands.UnitOfMeasureCommand;
import com.awuah.recipe.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface UnitOfMeasureService {
    Set<UnitOfMeasureCommand> listAllUoms();
}

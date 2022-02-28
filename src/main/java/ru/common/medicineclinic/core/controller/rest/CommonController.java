package ru.common.medicineclinic.core.controller.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.common.medicineclinic.core.model.entity.AbstractEntity;

import java.util.List;

public interface CommonController<E extends AbstractEntity> {
    @PostMapping
    ResponseEntity<E> create(@RequestBody E entity);

    @GetMapping("/{id}")
    ResponseEntity<E> getById(@PathVariable Long id);

    @GetMapping
    ResponseEntity<List<E>> getAll();

    @DeleteMapping("/{id}")
    ResponseEntity<Long> deleteById(@PathVariable Long id);

    @DeleteMapping
    ResponseEntity<E> delete(@RequestBody E entity);

    @PutMapping
    ResponseEntity<E> update(@RequestBody E entity);
}

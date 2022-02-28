package ru.common.medicineclinic.core.controller.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import ru.common.medicineclinic.core.model.entity.AbstractEntity;
import ru.common.medicineclinic.core.service.CommonService;

import java.util.List;

public abstract class AbstractController<E extends AbstractEntity, S extends CommonService<E>> implements CommonController<E> {
    protected final S service;

    protected AbstractController(S service) {
        this.service = service;
    }

    @Override
    public ResponseEntity<E> create(E entity) {
        E savedEntity = service.create(entity);
        return savedEntity != null ? new ResponseEntity<>(entity, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.CONFLICT);
    }

    @Override
    public ResponseEntity<E> getById(Long id) {
        E entity = service.get(id);
        return entity != null ? new ResponseEntity<>(entity, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.CONFLICT);
    }

    @Override
    public ResponseEntity<List<E>> getAll() {
        List<E> entities = service.getAll();
        return entities.size() != 0 ? new ResponseEntity<>(entities, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.CONFLICT);
    }

    @Override
    public ResponseEntity<Long> deleteById(Long id) {
        Long deletedId = service.deleteById(id);
        return deletedId != null ? new ResponseEntity<>(deletedId, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.CONFLICT);
    }

    @Override
    public ResponseEntity<E> delete(E entity) {
        E deletedEntity = service.delete(entity);
        return deletedEntity != null ? new ResponseEntity<>(deletedEntity, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.CONFLICT);
    }

    @Override
    public ResponseEntity<E> update(E entity) {
        E updatedEntity = service.update(entity);
        return updatedEntity != null ? new ResponseEntity<>(updatedEntity, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.CONFLICT);
    }
}

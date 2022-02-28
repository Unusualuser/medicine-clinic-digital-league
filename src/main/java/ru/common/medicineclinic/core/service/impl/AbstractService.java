package ru.common.medicineclinic.core.service.impl;

import ru.common.medicineclinic.core.model.entity.AbstractEntity;
import ru.common.medicineclinic.core.repository.CommonRepository;
import ru.common.medicineclinic.core.service.CommonService;

import java.util.List;

public class AbstractService<E extends AbstractEntity, R extends CommonRepository<E>> implements CommonService<E> {
    protected final R repository;

    public AbstractService(R repository) {
        this.repository = repository;
    }

    @Override
    public E create(E entity) {
        return repository.save(entity);
    }

    @Override
    public E delete(E entity) {
        if (repository.existsById(entity.getId())) {
            repository.delete(entity);
            return entity;
        }
        else
            return null;
    }

    @Override
    public Long deleteById(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return id;
        }
        else
            return null;
    }

    @Override
    public E get(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<E> getAll() {
        return repository.findAll();
    }

    @Override
    public E update(E entity) {
        if (repository.existsById(entity.getId()))
            return repository.save(entity);
        else
            return null;
    }
}

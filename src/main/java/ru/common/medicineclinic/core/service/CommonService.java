package ru.common.medicineclinic.core.service;

import ru.common.medicineclinic.core.model.entity.AbstractEntity;

import java.util.List;

public interface CommonService<E extends AbstractEntity> {
    E create(E entity);

    E delete(E entity);

    Long deleteById(Long id);

    E get(Long id);

    List<E> getAll();

    E update(E entity);
}

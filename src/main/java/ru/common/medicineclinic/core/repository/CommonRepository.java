package ru.common.medicineclinic.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import ru.common.medicineclinic.core.model.entity.AbstractEntity;

@NoRepositoryBean
public interface CommonRepository<T extends AbstractEntity> extends JpaRepository<T, Long> {
}

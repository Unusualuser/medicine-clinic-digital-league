package ru.common.medicineclinic.core.service.impl;

import org.springframework.stereotype.Service;
import ru.common.medicineclinic.core.model.entity.PatientEntity;
import ru.common.medicineclinic.core.repository.PatientEntityRepository;
import ru.common.medicineclinic.core.service.PatientEntityService;

@Service
public class PatientEntityServiceImpl extends AbstractService<PatientEntity, PatientEntityRepository> implements PatientEntityService {

    public PatientEntityServiceImpl(PatientEntityRepository repository) {
        super(repository);
    }
}

package ru.common.medicineclinic.core.service.impl;

import org.springframework.stereotype.Service;
import ru.common.medicineclinic.core.model.entity.MedicalHistory;
import ru.common.medicineclinic.core.repository.MedicalHistoryRepository;
import ru.common.medicineclinic.core.service.MedicalHistoryService;

@Service
public class MedicalHistoryServiceImpl extends AbstractService<MedicalHistory, MedicalHistoryRepository> implements MedicalHistoryService {

    public MedicalHistoryServiceImpl(MedicalHistoryRepository repository) {
        super(repository);
    }

}

package ru.common.medicineclinic.core.controller.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.common.medicineclinic.core.model.entity.PatientEntity;
import ru.common.medicineclinic.core.service.PatientEntityService;

@RestController
@RequestMapping("/medical/patient-entity")
public class PatientEntityController extends AbstractController<PatientEntity, PatientEntityService> {

    protected PatientEntityController(PatientEntityService service) {
        super(service);
    }

}

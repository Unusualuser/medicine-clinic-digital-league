package ru.common.medicineclinic.core.controller.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.common.medicineclinic.core.model.entity.MedicalHistory;
import ru.common.medicineclinic.core.service.MedicalHistoryService;

@RestController
@RequestMapping("/medical/medical-history")
public class MedicalHistoryController extends AbstractController<MedicalHistory, MedicalHistoryService> {

    protected MedicalHistoryController(MedicalHistoryService service) {
        super(service);
    }
}

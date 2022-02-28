package ru.common.medicineclinic.core.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "medical_history", schema = "medical_inst")
public class MedicalHistory extends AbstractEntity{
    @OneToOne
    @JoinColumn(name = "patient")
    private PatientEntity patient;

    @Column(name = "doc_number")
    private String docNumber;

    @Column(name = "create_dttm")
    private LocalDateTime createDttm;

    @Column(name = "modify_dttm")
    private LocalDateTime modifyDttm;

    @Column(name = "doctor")
    private String doctor;

    @Column(name = "diagnosis")
    private String diagnosis;

    @OneToMany
    @JoinColumn(name = "medical_history_ids")
    private List<MedicalHistory> medicalHistory;

    @PrePersist
    protected void onCreate() {
        this.createDttm = this.modifyDttm = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        this.modifyDttm = LocalDateTime.now();
    }

}

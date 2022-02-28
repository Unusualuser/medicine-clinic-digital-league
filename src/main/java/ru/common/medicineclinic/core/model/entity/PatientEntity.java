package ru.common.medicineclinic.core.model.entity;

import lombok.Data;
import ru.common.medicineclinic.core.model.entity.fieldenum.Gender;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Data
@Entity
@Table(name = "patient_entity", schema = "medical_inst")
public class PatientEntity extends AbstractEntity {
    @Column(name = "name")
    private String name;

    @Column(name = "gender")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Transient
    @Column(name = "age")
    private Integer age;

    @Column(name = "city")
    private String city;

    @Column(name = "address")
    private String address;

    @Column(name = "birthday_dt")
    private LocalDate birthdayDt;

    @Column(name = "birth_place")
    private String birthPlace;

    @Column(name = "registration")
    private String registration;

    @Column(name = "passport_series")
    private String passportSeries;

    @Column(name = "passport_number")
    private String passportNumber;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "another_document")
    private String anotherDocument;

    @PostLoad
    private void onLoad() {
        if (this.birthdayDt != null)
            this.age = Period.between(birthdayDt, LocalDate.now()).getYears();
    }
}

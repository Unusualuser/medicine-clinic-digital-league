create table medical_inst.medical_history (id int8 not null, create_dttm timestamp, diagnosis varchar(255), doc_number varchar(255), doctor varchar(255), modify_dttm timestamp, patient int8, medical_history_ids int8, primary key (id));
create table medical_inst.patient_entity (id int8 not null, address varchar(255), another_document varchar(255), birth_place varchar(255), birthday_dt date, city varchar(255), gender varchar(255), name varchar(255), passport_number varchar(255), passport_series varchar(255), phone_number varchar(255), registration varchar(255), primary key (id));
create sequence hibernate_sequence start 1 increment 1;
alter table if exists medical_inst.medical_history add constraint FKml9ew2taphap2dn4916kw4w1u foreign key (patient) references medical_inst.patient_entity;
alter table if exists medical_inst.medical_history add constraint FK539w0ondnhe1sl0qtegaxuj1n foreign key (medical_history_ids) references medical_inst.medical_history;

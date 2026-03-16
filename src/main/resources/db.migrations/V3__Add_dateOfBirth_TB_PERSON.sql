-- V2: Migrations para adicionar data de nascimento na tb_person

ALTER TABLE TB_PERSON
ADD dateOfBirth DATE;
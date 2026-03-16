-- V2: Migrations para adicionar data de nascimento na tb_person

ALTER TABLE tb_person
ADD COLUMN dateOfBirth DATE;
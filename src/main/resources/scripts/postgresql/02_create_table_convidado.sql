create sequence convidado_sequence start 1 increment 1;
create table convidado (id int8 not null, email varchar(255), nome varchar(255), telefone varchar(255), primary key (id));
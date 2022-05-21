-- Gerado por Oracle SQL Developer Data Modeler 20.4.0.374.0801
--   em:        2022-05-20 12:05:19 BRT
--   site:      Oracle Database 21c
--   tipo:      Oracle Database 21c



-- predefined type, no DDL - MDSYS.SDO_GEOMETRY

-- predefined type, no DDL - XMLTYPE

CREATE TABLE t_sht_conta (
    cdg_conta  NUMBER(7) NOT NULL,
    eml_conta  VARCHAR2(40) NOT NULL,
    snh_conta  VARCHAR2(16) NOT NULL
);

CREATE TABLE t_sht_meta (
    cdg_item            NUMBER(3) NOT NULL,
    dsc_item            VARCHAR2(15) NOT NULL,
    tpo_meta            VARCHAR2(9) NOT NULL,
    abv_unidade_medida  CHAR(2) NOT NULL,
    dsc_unidade_medida  VARCHAR2(15) NOT NULL
);

CREATE TABLE t_sht_meta_usuario (
    cdg_usuario           NUMBER(7) NOT NULL,
    cdg_item              NUMBER(3) NOT NULL,
    dta_inicio            DATE NOT NULL,
    vlr_meta              NUMBER(3, 2) NOT NULL,
    dta_termino_prevista  DATE
);



CREATE TABLE t_sht_registro_meta (
    cdg_registro_meta  NUMBER(9) NOT NULL,
    cdg_usuario        NUMBER(7) NOT NULL,
    cdg_item           NUMBER(3) NOT NULL,
    vlr_realizado      NUMBER(5, 2) NOT NULL,
    dta_realizacao     DATE NOT NULL
);


CREATE TABLE t_sht_usuario (
    cdg_usuario           NUMBER(7) NOT NULL,
    cdg_conta             NUMBER(7) NOT NULL,
    nme_usuario           VARCHAR2(50) NOT NULL,
    dta_nascimento        DATE NOT NULL,
    dsc_localidade        VARCHAR2(20),
    vlr_altura            NUMBER(3, 2) NOT NULL,
    vlr_pressao_arterial  VARCHAR2(5) NOT NULL
);



-- PRIMARY KEY

ALTER TABLE t_sht_usuario ADD CONSTRAINT usuario_pk PRIMARY KEY ( cdg_usuario );

ALTER TABLE t_sht_conta ADD CONSTRAINT conta_pk PRIMARY KEY ( cdg_conta );

ALTER TABLE t_sht_meta_usuario ADD CONSTRAINT t_sht_meta_usuario_pk PRIMARY KEY ( cdg_usuario,
                                                                                  cdg_item );

ALTER TABLE t_sht_meta ADD CONSTRAINT meta_pk PRIMARY KEY ( cdg_item );

ALTER TABLE t_sht_registro_meta ADD CONSTRAINT registro_meta_pk PRIMARY KEY ( cdg_registro_meta );


-- UNIQUE

CREATE UNIQUE INDEX usuario__idx ON
    t_sht_usuario (
        cdg_conta
    ASC );


ALTER TABLE t_sht_conta ADD CONSTRAINT conta_eml_conta_un UNIQUE ( eml_conta );



-- FOREIGN KEY

ALTER TABLE t_sht_meta_usuario
    ADD CONSTRAINT "META_USUARIO-META_FK" FOREIGN KEY ( cdg_item )
        REFERENCES t_sht_meta ( cdg_item );

ALTER TABLE t_sht_meta_usuario
    ADD CONSTRAINT "META_USUARIO-USUARIO_FK" FOREIGN KEY ( cdg_usuario )
        REFERENCES t_sht_usuario ( cdg_usuario );

ALTER TABLE t_sht_registro_meta
    ADD CONSTRAINT "REGISTRO_META-META_USUARIO_FK" FOREIGN KEY ( cdg_usuario,
                                                                 cdg_item )
        REFERENCES t_sht_meta_usuario ( cdg_usuario,
                                        cdg_item );

ALTER TABLE t_sht_usuario
    ADD CONSTRAINT "USUARIO-CONTA_FK" FOREIGN KEY ( cdg_conta )
        REFERENCES t_sht_conta ( cdg_conta );~

-- SEQUENCIAS

CREATE SEQUENCE cdg_conta
    START WITH 1
    INCREMENT BY 1
    MAXVALUE 9999999
    NOCACHE
    ORDER;

CREATE SEQUENCE cdg_usuario
    START WITH 1
    INCREMENT BY 1
    MAXVALUE 9999999
    NOCACHE
    ORDER;

CREATE SEQUENCE cdg_item
    START WITH 1
    INCREMENT BY 1
    MAXVALUE 999
    NOCACHE
    ORDER;

CREATE SEQUENCE cdg_registro_meta
    START WITH 1
    INCREMENT BY 1
    MAXVALUE 999999999
    NOCACHE
    ORDER;
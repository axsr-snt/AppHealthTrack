/*Cadastro e alteração:

    - OK. Cadastrar os dados do usuário.
    - OK. Alterar todos os dados do usuário, utilizando seu código como referência.
    - OK. Cadastrar os dados para o peso do usuário.
    - OK. Alterar todos os dados de peso do usuário, utilizando o código como referência.
    - OK. Cadastrar os dados para a pressão arterial do usuário.
    - OK. Alterar todos os dados de pressão arterial do usuário, utilizando o código como referência.
    - OK. Cadastrar os dados para a atividade física do usuário.
    - OK. Alterar todos os dados da atividade física do usuário, utilizando o código como referência.
    - OK. Cadastrar os dados para o alimento consumido pelo usuário.
    - OK. Alterar todos os dados para o alimento consumido pelo usuário, utilizando o código como referência.*/

-- TABELA CONTA

    -- CRIA CONTA
    INSERT INTO t_sht_conta (cdg_conta, eml_conta, snh_conta) 
        VALUES(CDG_CONTA.NEXTVAL, 'joão@teste.com', 'teste123');

    -- ALTERA SENHA
    UPDATE t_sht_conta
        SET snh_conta = 'NoV@s3Nh4'
        WHERE cdg_conta = 2;

-- TABELA USUÁRIO

    --CRIA USUARIO
    INSERT INTO t_sht_usuario (cdg_usuario, cdg_conta, nme_usuario, dta_nascimento, dsc_localidade, vlr_altura, vlr_peso_inicial,vlr_pressao_arterial)
        VALUES(CDG_USUARIO.NEXTVAL, 2, 'Antonio Silva', TO_DATE('12/03/1994','DD/MM/YYYY'), 'Brasil', 1.78, 68.50,'12:8');

    --ALTERA PESO
    UPDATE t_sht_usuario
        SET vlr_peso_inicial = 59.30
        WHERE cdg_usuario = 3
    
    --ALTERA PRESSÃO ARTERIAL
    UPDATE t_sht_usuario
        SET vlr_pressao_arterial = '13:8'
        WHERE cdg_usuario = 5

-- TABELA META

    --CRIA META (DISPONÍVEL SOMENTE PARA O T.I.)
    INSERT INT t_sht_meta (cdg_item, dsc_item, tpo_meta, abv_unidade_medida, dsc_unidade_medida)
        VALUES(CDG_ITEM.NEXTVAL,'AGUA','consumo','lt','litro(s)');

-- TABELA META USUARIO

    --CRIA META USUARIO
    INSERT INTO t_sht_meta_usuario (cdg_usuario, cdg_item, dta_inicio, vlr_meta, dta_termino_prevista)
        VALUES(1, 1, TO_DATE('12/05/2022','DD/MM/YYYY'), 1.25,TO_DATE('12/10/2022', 'DD/MM/YYYY'));

    --ALTERA O VALOR DA META
    UPDATE t_sht_meta_usuario
        SET vlr_meta = 2
        WHERE cdg_usuario = 1 AND cdg_item = 1;
    
    --ALTERA A DATA PARA REALIZAR A META
    UPDATE t_sht_meta_usuario
        SET dta_termino_prevista = TO_DATE('12/08/2022', 'DD/MM/YYYY')
        WHERE cdg_usuario = 1 AND cdg_item = 1;

-- TABELA REGISTRO META

    --CRIA REGISTRO DA META NO DIA
    INSERT INTO t_sht_registro_meta(cdg_registro_meta, cdg_usuario, cdg_item, vlr_realizado, dta_realizacao)
        VALUES(CDG_REGISTRO_META.NEXTVAL,1,1,1,TO_DATE('12/05/2022','DD/MM/YYYY'));
    
    --ALTERA O VALOR REALIZADO NO DIA
    UPDATE t_sht_registro_meta
     SET vlr_realizado = 1.1
     WHERE cdg_registro_meta = 1 AND cdg_usuario = 1 AND cdg_item = 1;


/*Consultas:

    -OK. Consultar os dados de um determinado usuário (filtrar a partir do seu código).
    -OK. Consultar todos os dados de todos os registros de peso de um determinado usuário, ordenando-os dos registros mais recentes para os mais antigos (filtrar a partir do seu código).
    -OK. Consultar todos os dados de um único registro de peso de um determinado usuário (filtrar a partir do código do usuário e do código de peso).
    -OK. Consultar todos os dados de todos os registros de pressão arterial de um determinado usuário, ordenando-os dos registros mais recentes para os mais antigos (filtrar a partir do seu código).
    -OK. Consultar todos os dados de um único registro de pressão arterial de um determinado usuário (filtrar a partir do código do usuário e do código de pressão).
    -OK. Consultar todos os dados de todos os registros de atividade física de um determinado usuário, ordenando-os dos registros mais recentes para os mais antigos (filtrar a partir do seu código).
    -OK. Consultar todos os dados de um único registro de atividade física de um determinado usuário (filtrar a partir do código do usuário e do código de atividade).
    -OK. Consultar todos os dados de todos os registros de alimentos ingeridos de um determinado usuário, ordenando-os dos registros mais recentes para os mais antigos (filtrar a partir do seu código).
    -OK. Consultar todos os dados de um único registro de alimento ingerido de um determinado usuário (filtrar a partir do código do usuário e do código de alimento).
    - Consultar os dados básicos de um determinado usuário, o último peso registrado e a última pressão arterial registrada (filtrar a partir do código de usuário – consulta necessária para o dashboard. Dica: veja consulta com junções).*/

    --CONSULTAR DADOS DE USUÁRIOS
    SELECT nme_usuario AS "Usuário", dta_nascimento AS "Data de Nascimento", dsc_localidade AS Localidade, vlr_altura AS Altura, vlr_pressao_arterial AS "Pressão Arterial" 
        FROM t_sht_usuario
        WHERE cdg_usuario = 1;

    --CONSULTAR REGISTROS DE PESO
    SELECT vlr_realizado AS "Peso", dta_realizacao AS "Data" 
        FROM t_sht_registro_meta
        WHERE cdg_usuario = 1 AND cdg_item = 11 ;

    --CONSULTAR UM REGISTRO DE PESO ESPECIFICO
    SELECT vlr_realizado AS "Peso", dta_realizacao AS "Data" 
        FROM t_sht_registro_meta
        WHERE cdg_usuario = 1 AND cdg_item = 11 AND dta_realizacao = TO_DATE('12/05/2022','DD/MM/YYYY');

    --
    SELECT vlr_realizado AS "Pressão Arterial", dta_realizacao AS "Data" 
        FROM t_sht_registro_meta
        WHERE cdg_usuario = 1 AND cdg_item = 12;

    --CONSULTAR UM REGISTRO DE PRESSÃO ARTERIAL
    SELECT vlr_realizado AS "Pressão Arterial", dta_realizacao AS "Data" 
        FROM t_sht_registro_meta
        WHERE cdg_usuario = 1 AND cdg_item = 12 AND dta_realizacao = TO_DATE('12/05/2022','DD/MM/YYYY');

    --CONSULTAR TODOS OS REGISTROS DE ATIVIDADE FISICA DE UM USUARIO ORDEM DECRESCENTE
    SELECT cdg_usuario AS "USUÁRIO", cdg_registro_meta AS "Atividade Física", vlr_realizado AS "Medida", dta_realizacao AS "Data"
        FROM t_sht_registro_meta
        WHERE cdg_usuario = 1 AND cdg_item = 11 OR cdg_item = 12
        ORDER BY dta_realizacao DESC;

    --CONSULTAR UM REGISTRO DE ATIVIDADE FISICA
    SELECT cdg_usuario AS "USUÁRIO", cdg_registro_meta AS "Atividade Física", vlr_realizado AS "Medida", dta_realizacao AS "Data"
        FROM t_sht_registro_meta
        WHERE cdg_usuario = 1 AND cdg_item = 11 AND dta_realizacao = TO_DATE('12/05/2022','DD/MM/YYYY');

    --CONSULTAR TODOS OS REGISTROS DE CONSUMO DE UM USUARIO ORDEM DECRESCENTE
    SELECT cdg_usuario AS "USUÁRIO", cdg_registro_meta AS "Atividade Física", vlr_realizado AS "Medida", dta_realizacao AS "Data"
        FROM t_sht_registro_meta
        WHERE cdg_usuario = 1 AND cdg_item = 1 OR cdg_item = 2 OR cdg_item = 3 OR cdg_item = 6
        ORDER BY dta_realizacao DESC;

    --CONSULTAR UM REGISTRO DE CONSUMO
    SELECT cdg_usuario AS "USUÁRIO", cdg_registro_meta AS "Atividade Física", vlr_realizado AS "Medida", dta_realizacao AS "Data"
        FROM t_sht_registro_meta
        WHERE cdg_usuario = 1 AND cdg_item = 1 AND dta_realizacao = TO_DATE('12/05/2022','DD/MM/YYYY');


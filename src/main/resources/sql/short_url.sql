CREATE TABLE
    short_url
    (
        id bigint NOT NULL,
        title VARCHAR(255) COMMENT '标题',
        md5 VARCHAR(255) COMMENT 'md5',
        url_key VARCHAR(255) COMMENT '短连接映射',
        create_time bigint COMMENT '创建时间',
        url_value text COMMENT '源地址',
        PRIMARY KEY (id)
    )
    ENGINE=InnoDB DEFAULT CHARSET=utf8 DEFAULT COLLATE=utf8_general_ci;


INSERT INTO short_url (id, title, md5, url_key, create_time, url_value) VALUES (1202412655783456770, 'title1', '3d9231c480c9768d7def98bbef8ffbb0', '80C9768D', 1575512491038, 'https://www.cnblogs.com/9');
INSERT INTO short_url (id, title, md5, url_key, create_time, url_value) VALUES (1202412655783456771, 'title2', 'b84c29675e140868394da9ab3c6ce6da', '5E140868', 1575512491038, 'https://www.cnblogs.com/7');
INSERT INTO short_url (id, title, md5, url_key, create_time, url_value) VALUES (1202412655783456772, 'title3', 'f8bac98f85085dfa768b0bebd14f3b44', '85085DFA', 1575512491038, 'https://www.cnblogs.com/1');
INSERT INTO short_url (id, title, md5, url_key, create_time, url_value) VALUES (1202412655783456773, 'title4', '94efa48e4e7e84ceec11830996ccbc7c', '4E7E84CE', 1575512491038, 'https://www.cnblogs.com/0');
INSERT INTO short_url (id, title, md5, url_key, create_time, url_value) VALUES (1202412655783456774, 'title5', '3aa332955703ba30bdbddc8c4c8386ad', '5703BA30', 1575512491039, 'https://www.cnblogs.com/6');
INSERT INTO short_url (id, title, md5, url_key, create_time, url_value) VALUES (1202412655783456775, '6', '38b5d0d148e2256e0f257de96b9d1b6a', '48E2256E', 1575512491040, 'https://www.cnblogs.com/5');
INSERT INTO short_url (id, title, md5, url_key, create_time, url_value) VALUES (1202412655783456776, 'title6', 'd2e275f6405d7631b5eb71b0fbda2f69', '405D7631', 1575512491038, 'https://www.cnblogs.com/8');
INSERT INTO short_url (id, title, md5, url_key, create_time, url_value) VALUES (1202412655783456777, 'title7', '27e63859e7bacfc79882d402beeaa1da', 'E7BACFC7', 1575512491039, 'https://www.cnblogs.com/3');
INSERT INTO short_url (id, title, md5, url_key, create_time, url_value) VALUES (1202412655783456778, 'title8', '578f7cc74ba97e68dc620520aad59768', '4BA97E68', 1575512491039, 'https://www.cnblogs.com/4');
INSERT INTO short_url (id, title, md5, url_key, create_time, url_value) VALUES (1202412655783456779, '9', '9f6559a0b4a0b63bb6a7e968eaf273ad', 'B4A0B63B', 1575512491038, 'https://www.cnblogs.com/2');

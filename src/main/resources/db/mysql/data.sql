INSERT INTO userAccounts (username,password,enabled) VALUES ('admin', MD5 ('admin'), TRUE);
INSERT INTO authority (username, authority) VALUES ('admin', 'admin');

INSERT INTO userAccounts (username, password, enabled) VALUES ('nana', MD5('nana'),TRUE);
INSERT INTO authority (username, authority) VALUES ('nana', 'user');

INSERT INTO administrators (id, username) VALUES (1, 'admin');
INSERT INTO usuarios (id, name,surname,email,username) VALUES (2, 'Nana', 'Garcia', 'nana@gmail.com', 'nana');
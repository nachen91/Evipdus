INSERT INTO user_accounts (username,password,enabled) VALUES ('admin', MD5 ('admin'), TRUE);
INSERT INTO authority (username, authority) VALUES ('admin', 'admin');

INSERT INTO user_accounts (username, password, enabled) VALUES ('ana', MD5('ana'),TRUE);
INSERT INTO authority (username, authority) VALUES ('ana', 'user');

INSERT INTO administrators (id, username) VALUES (2, 'admin');
INSERT INTO usuarios (id, name,surname,email,username) VALUES (3, 'ana', 'Garcia', 'nana@gmail.com', 'ana');
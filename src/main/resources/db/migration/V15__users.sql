CREATE TABLE IF NOT EXISTS users
(
    id       BIGSERIAL PRIMARY KEY,
    login    VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    enabled  BOOLEAN      NOT NULL DEFAULT false
);

INSERT INTO users (login, password, enabled)
VALUES
    ('admin', 'admin', true),
    ('manager1', 'man1', true),
    ('manager2', 'man2', true),
    ('marketUser', 'user', true)
;
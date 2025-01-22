CREATE TABLE IF NOT EXISTS users (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) not null,
    email VARCHAR(255) not null,
    active BOOLEAN
);
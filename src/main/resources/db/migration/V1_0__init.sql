CREATE TABLE users (
    id bigint NOT NULL AUTO_INCREMENT PRIMARY KEY,
    email varchar(100),
    username varchar(50),
    password varchar(500),
    profile_url varchar(500),
    created_at timestamp DEFAULT NOW(),
    updated_at timestamp DEFAULT NOW()
)

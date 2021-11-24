
INSERT INTO personne (prenom, nom, bio) 
VALUES ("Clint", "Eastwood", "Badass"),
("Alfred", "Hitchcock", "Bouh"),
("Martin", "Scorcese", "Plutôt cool"),
("Steven", "Spielberg", "Plutôt cool"),
("Fritz", "Lang", "holy molly"),
("David", "Bowie", "The man who sold the world"),
("Arnold", "Swarzie", "brlbrlbrl");


INSERT INTO genre (libelle) 
VALUES("Science Fiction"),
("Fantastique"),
("Documentaire"),
("Bopic"),
("Peplum");

INSERT INTO film (titre, annee, duree, synopsis, genre_id, realisateur_id) 
VALUES("Le seigneur des anneaux", 2001, 120, "Les orcs, gobelins blabla", 2, 1),
("Matrix", 1999, 120, "The matrix has you", 2, 1),("Fight Club", 1994, 140, "Woooow c'est fouuu", 4, 4),("Ed wood", 1996, 120, "Woooow c'est fouuu", 3, 5);

INSERT INTO film_acteurs (film_id,acteur_id)
VALUES (1,2),(1,3), (2,4), (2,5), (3,3), (3,4), (3,3), (4,1), (4,2), (4,3),(4,4);

INSERT INTO app_user (username, password) VALUES ( 'user1', '$2a$04$Ye7/lJoJin6.m9sOJZ9ujeTgHEVM4VXgI2Ingpsnf9gXyXEXf/IlW');
INSERT INTO app_user (username, password) VALUES ( 'user2', '$2a$04$StghL1FYVyZLdi8/DIkAF./2rz61uiYPI3.MaAph5hUq03XKeflyW');
INSERT INTO app_user (username, password) VALUES ( 'user3', '$2a$04$Lk4zqXHrHd82w5/tiMy8ru9RpAXhvFfmHOuqTmFPWQcUhBD8SSJ6W');

INSERT INTO role (id, description, name) VALUES (4, 'Admin role', 'ADMIN');
INSERT INTO role (id, description, name) VALUES (5, 'User role', 'USER');

INSERT INTO user_roles (user_id, role_id) VALUES (1, 4);
INSERT INTO user_roles (user_id, role_id) VALUES (2, 5);


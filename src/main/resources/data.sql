
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

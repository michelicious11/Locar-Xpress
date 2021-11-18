BEGIN TRANSACTION;
CREATE TABLE IF NOT EXISTS "Contrat" (
	"idContrat"	INTEGER NOT NULL,
	"idClient"	INTEGER NOT NULL,
	"idVehicule"	INTEGER NOT NULL,
	"dateDeDepart"	DATETIME NOT NULL,
	"dateDeRetour"	DATETIME NOT NULL,
	"assurance"	VARCHAR(45) NOT NULL,
	"forfaitUsure"	VARCHAR(45) NOT NULL,
	"paiementCredit"	BINARY,
	PRIMARY KEY("idContrat")
);
CREATE TABLE IF NOT EXISTS "CouleurVehicule" (
	"idCouleurVehicule"	INTEGER NOT NULL,
	"nomCouleur"	VARCHAR(45) NOT NULL,
	PRIMARY KEY("idCouleurVehicule")
);
CREATE TABLE IF NOT EXISTS "Employe" (
	"idEmploye"	INTEGER,
	"prenom"	charvar(45) NOT NULL,
	"nom"	charvar(45) NOT NULL,
	"telephone"	charvar(45) NOT NULL,
	"courriel"	charvar(45) NOT NULL,
	PRIMARY KEY("idEmploye")
);
CREATE TABLE IF NOT EXISTS "Facture" (
	"idContrat"	INT,
	"idInspection"	INT,
	"dateInspection"	DATE
);
CREATE TABLE IF NOT EXISTS "Inspection" (
	"idVehicule"	INT,
	"idEmploye"	INT,
	"dateInspection"	DATE,
	"essence"	DECIMAL(4, 2),
	"montantAccident"	DECIMAL(6, 2)
);
CREATE TABLE IF NOT EXISTS "MarqueVehicule" (
	"idMarqueVehicule"	INTEGER NOT NULL,
	"nomMarque"	VARCHAR(45) NOT NULL,
	PRIMARY KEY("idMarqueVehicule")
);
CREATE TABLE IF NOT EXISTS "TypePermis" (
	"idTypePermis"	INTEGER NOT NULL,
	"nomType"	VARCHAR(45) NOT NULL,
	PRIMARY KEY("idTypePermis")
);
CREATE TABLE IF NOT EXISTS "Permis" (
	"idPermis"	INTEGER,
	"idTypePermis"	INTEGER NOT NULL,
	FOREIGN KEY("idTypePermis") REFERENCES "TypePermis",
	PRIMARY KEY("idPermis")
);
CREATE TABLE IF NOT EXISTS "TypeUtilisateur" (
	"idTypeUtilisateur"	INTEGER NOT NULL,
	"nomTypeUtilisateur"	VARCHAR(45) NOT NULL,
	PRIMARY KEY("idTypeUtilisateur")
);
CREATE TABLE IF NOT EXISTS "TypeVehicule" (
	"idTypeVehicule"	INTEGER NOT NULL,
	"nomType"	VARCHAR(45) NOT NULL,
	PRIMARY KEY("idTypeVehicule")
);
CREATE TABLE IF NOT EXISTS "Utilisateur" (
	"idUtilisateur"	INTEGER NOT NULL,
	"idEmploye"	INTEGER NOT NULL,
	"nomUtilisateur"	VARCHAR(45) NOT NULL,
	"motDePasse"	VARCHAR(45) NOT NULL,
	"idTypeUtilisateur"	INTEGER NOT NULL,
	FOREIGN KEY("idTypeUtilisateur") REFERENCES "TypeUtilisateur",
	FOREIGN KEY("idEmploye") REFERENCES "Employe",
	PRIMARY KEY("idUtilisateur")
);
CREATE TABLE IF NOT EXISTS "Vehicule" (
	"idVehicule"	INTEGER NOT NULL,
	"idMarqueVehicule"	INTEGER NOT NULL,
	"idTypeVehicule"	INTEGER NOT NULL,
	"idCouleurVehicule"	INTEGER NOT NULL,
	FOREIGN KEY("idMarqueVehicule") REFERENCES "MarqueVehicule",
	FOREIGN KEY("idTypeVehicule") REFERENCES "TypeVehicule",
	FOREIGN KEY("idCouleurVehicule") REFERENCES "CouleurVehicule",
	PRIMARY KEY("idVehicule")
);
CREATE TABLE IF NOT EXISTS "Client" (
	"idClient"	INTEGER NOT NULL,
	"prenom"	VARCHAR(45) NOT NULL,
	"nom"	VARCHAR(45) NOT NULL,
	"dateDeNaissance"	DATE NOT NULL,
	"telephone"	VARCHAR(45) NOT NULL,
	"adresse"	VARCHAR(45) NOT NULL,
	"idPermis"	INTEGER NOT NULL,
	FOREIGN KEY("idPermis") REFERENCES "Permis",
	PRIMARY KEY("idClient")
);
INSERT INTO "Contrat" ("idContrat","idClient","idVehicule","dateDeDepart","dateDeRetour","assurance","forfaitUsure","paiementCredit") VALUES (1,89,4,'1983-04-28','7/9/2021','0','0',0),
 (2,99,4,'1971-01-20','12/10/2020','0','1',0),
 (3,23,8,'1963-10-20','1/9/2022','0','1',1),
 (4,32,13,'1985-04-07','12/15/2021','0','1',0),
 (5,93,13,'1963-08-13','5/28/2021','1','1',0),
 (6,49,26,'1985-09-22','12/2/2020','1','1',0),
 (7,32,16,'1970-06-22','5/26/2021','1','0',1),
 (8,100,31,'2021-08-26','3/9/2021','1','0',0),
 (9,22,30,'1969-10-17','6/9/2021','0','1',0),
 (10,32,27,'1962-05-29','3/31/2021','1','1',1),
 (11,97,3,'1982-05-13','12/30/2020','1','0',0),
 (12,38,26,'1973-10-01','11/4/2021','0','1',1),
 (13,93,12,'2003-07-19','1/8/2021','1','1',0),
 (14,35,21,'1992-02-01','11/19/2020','0','0',0),
 (15,31,33,'1982-08-02','11/30/2021','1','1',0),
 (16,92,26,'1970-08-21','4/30/2021','1','0',1),
 (17,70,12,'1982-10-17','7/31/2021','0','1',1),
 (18,45,6,'2000-01-23','12/3/2020','0','1',1),
 (19,41,29,'2011-02-11','1/28/2021','0','0',1),
 (20,67,17,'1964-09-18','6/13/2021','1','1',1),
 (21,91,5,'2017-04-12','1/22/2021','1','0',0),
 (22,42,32,'2003-08-27','5/5/2021','0','0',1),
 (23,4,16,'1975-09-20','1/12/2022','1','1',0),
 (24,16,11,'2013-11-23','5/11/2021','0','0',0),
 (25,51,31,'2011-12-17','10/30/2021','1','1',1),
 (26,30,13,'1962-04-06','9/12/2021','0','0',0),
 (27,62,31,'1970-06-02','12/18/2020','0','1',0),
 (28,89,15,'2020-12-22','11/17/2021','0','0',1),
 (29,12,31,'2013-02-04','2/11/2021','1','1',1),
 (30,91,8,'1996-08-05','1/8/2021','0','0',0),
 (31,54,10,'1976-04-15','4/16/2021','0','1',1),
 (32,6,31,'1996-09-02','6/6/2021','1','1',1),
 (33,43,25,'2021-01-06','11/2/2021','1','0',0),
 (34,70,28,'2005-09-17','7/7/2021','0','1',1),
 (35,38,5,'1984-01-24','4/11/2021','0','1',1),
 (36,21,31,'2003-03-17','8/6/2021','1','0',0),
 (37,93,1,'1977-09-22','11/25/2021','0','1',0),
 (38,14,23,'1979-12-01','5/23/2021','1','1',1),
 (39,31,22,'2007-12-09','12/27/2021','0','1',0),
 (40,58,34,'2003-08-18','1/13/2021','0','0',1),
 (41,16,12,'1970-10-11','6/14/2021','0','0',0),
 (42,84,1,'2003-06-16','11/2/2021','0','1',0),
 (43,39,27,'1985-04-23','11/24/2020','0','1',1),
 (44,69,27,'1967-04-11','9/27/2021','0','1',1),
 (45,57,16,'2007-07-17','3/2/2021','1','0',1),
 (46,69,24,'1999-05-18','7/6/2021','1','1',1),
 (47,46,9,'1963-04-07','4/17/2021','1','0',1),
 (48,14,8,'1999-01-07','9/25/2021','0','0',0),
 (49,9,2,'1977-09-14','1/6/2021','0','1',0),
 (50,95,9,'1995-01-10','9/16/2021','0','1',0),
 (51,89,20,'1983-06-30','10/23/2021','1','0',0),
 (52,80,8,'1983-09-15','12/23/2020','1','0',0),
 (53,57,18,'2008-08-29','12/21/2021','0','0',1),
 (54,75,27,'1982-11-01','8/28/2021','1','0',0),
 (55,65,10,'1992-03-20','7/16/2021','1','1',1);
INSERT INTO "CouleurVehicule" ("idCouleurVehicule","nomCouleur") VALUES (1,'Noir'),
 (2,'Blanc'),
 (3,'Rouge'),
 (4,'Bleu');
INSERT INTO "Employe" ("idEmploye","prenom","nom","telephone","courriel") VALUES (1,'Jason','Greek','(819) 208-0001','jase@uqo.ca'),
 (2,'Jacob','Staluk','(819) 208-0002','jake@uqo.ca'),
 (3,'Filip','Najjar','(819) 208-0003','filip@uqo.ca'),
 (4,'Vincent','Gervais','(819) 208-0004','vince@uqo.ca'),
 (5,'Michele','Licious','(819) 208-0005','mich@uqo.ca'),
 (6,'Karim','Prof','(819) 208-0006','prof01@uqo.ca');
INSERT INTO "Facture" ("idContrat","idInspection","dateInspection") VALUES (39,23,'7/15/2021'),
 (8,4,'2/8/2021'),
 (45,57,'4/13/2021'),
 (19,60,'4/15/2021'),
 (26,38,'8/21/2021'),
 (31,33,'12/3/2021'),
 (7,52,'2/11/2021'),
 (53,41,'8/18/2021'),
 (50,56,'4/4/2021'),
 (29,16,'7/6/2021'),
 (1,52,'10/16/2021'),
 (37,24,'7/16/2021'),
 (24,54,'2/6/2021'),
 (12,27,'2/18/2021'),
 (36,35,'1/30/2021'),
 (22,37,'11/24/2021'),
 (54,52,'2/26/2021'),
 (33,7,'5/31/2021'),
 (30,3,'7/24/2021'),
 (14,57,'11/21/2020'),
 (24,14,'6/29/2021'),
 (46,33,'4/12/2021'),
 (44,30,'1/12/2021'),
 (15,41,'3/8/2021'),
 (48,34,'12/11/2020'),
 (22,48,'3/11/2021'),
 (27,51,'2/1/2021'),
 (12,59,'4/28/2021'),
 (24,12,'4/17/2021'),
 (19,10,'10/22/2021'),
 (19,14,'10/29/2021'),
 (10,9,'9/25/2021'),
 (45,30,'6/7/2021'),
 (32,12,'10/16/2021'),
 (26,42,'3/5/2021'),
 (8,12,'12/17/2020'),
 (40,27,'4/19/2021'),
 (43,11,'12/15/2021'),
 (26,45,'10/20/2021'),
 (4,39,'7/4/2021'),
 (2,5,'1/20/2021'),
 (34,13,'11/25/2021'),
 (16,24,'1/2/2021'),
 (22,31,'5/22/2021'),
 (2,45,'2/3/2021'),
 (8,50,'8/23/2021'),
 (27,31,'2/10/2021'),
 (43,54,'8/3/2021'),
 (35,38,'5/22/2021'),
 (31,44,'8/5/2021'),
 (50,59,'6/29/2021'),
 (15,35,'9/10/2021'),
 (48,4,'11/27/2021'),
 (23,43,'6/14/2021'),
 (27,17,'11/20/2021');
INSERT INTO "Inspection" ("idVehicule","idEmploye","dateInspection","essence","montantAccident") VALUES (1,3,'10/16/2021',19.16,563.91),
 (16,1,'2/1/2021',50.62,304.55),
 (34,5,'12/10/2021',34.77,318.42),
 (3,5,'12/13/2020',69.82,836.25),
 (11,4,'6/2/2021',42.62,403.61),
 (32,2,'12/30/2020',61.41,299.91),
 (22,1,'9/1/2021',37.74,152.51),
 (13,1,'2/16/2021',69.39,879.75),
 (18,3,'5/1/2021',30.54,799.59),
 (10,4,'6/11/2021',66.94,273.85),
 (8,3,'1/7/2021',40.18,762.95),
 (31,3,'11/27/2021',36.05,519.22),
 (25,1,'4/9/2021',45.19,770.07),
 (20,2,'3/11/2021',43.93,667.41),
 (30,5,'2/19/2021',15.83,890.32),
 (22,4,'11/2/2021',54.32,157.17),
 (26,4,'8/17/2021',53.22,841.07),
 (7,4,'9/16/2021',65.6,361.83),
 (2,3,'12/13/2020',49.07,935.67),
 (18,5,'11/17/2021',17.81,714.66),
 (22,5,'4/7/2021',39.72,821.43),
 (34,5,'12/26/2020',30.58,366.39),
 (2,3,'7/16/2021',17.34,952.3),
 (3,1,'11/23/2020',28.36,475.51),
 (10,4,'12/23/2020',26.6,232.85),
 (1,3,'3/20/2021',34.47,551.52),
 (26,3,'10/1/2021',19.61,327.72),
 (14,4,'11/24/2020',27.13,416.66),
 (27,5,'7/18/2021',61.5,206.67),
 (8,2,'9/28/2021',64.9,237.94),
 (22,1,'7/22/2021',44.75,158.99),
 (1,1,'9/16/2021',5.89,748.32),
 (33,1,'2/5/2021',9.06,910.55),
 (15,2,'10/9/2021',37.53,269.27),
 (14,1,'1/23/2021',29.27,231.71),
 (1,6,'3/20/2021',22.03,919.21),
 (3,3,'4/4/2021',36.4,648.74),
 (35,6,'2/10/2021',41.73,128.69),
 (10,4,'9/12/2021',30.49,404.66),
 (23,1,'3/10/2021',11.93,736.97),
 (13,3,'12/4/2020',20.01,214.68),
 (35,2,'10/12/2021',63.61,597.4),
 (34,1,'12/23/2020',41.85,808.14),
 (11,6,'7/16/2021',16.73,790.01),
 (8,4,'8/28/2021',61.86,339.05),
 (20,2,'4/15/2021',61.24,209.19),
 (18,6,'1/27/2021',8.9,501.58),
 (15,5,'1/20/2021',62.14,940.16),
 (3,6,'11/18/2021',67.61,355.41),
 (34,2,'2/27/2021',36.03,988.56),
 (35,1,'5/6/2021',54.74,410.25),
 (23,6,'8/31/2021',9.39,541.11),
 (1,3,'12/31/2020',24.2,402.78),
 (26,5,'2/20/2021',32.52,807.5),
 (33,1,'1/7/2021',39.8,909.39);
INSERT INTO "MarqueVehicule" ("idMarqueVehicule","nomMarque") VALUES (1,'Honda'),
 (2,'Ford'),
 (3,'Toyota'),
 (4,'Volkswagen'),
 (5,'Mazda');
INSERT INTO "TypePermis" ("idTypePermis","nomType") VALUES (1,'Classe 1'),
 (2,'Classe 5'),
 (3,'Classe 1 et 5');
INSERT INTO "Permis" ("idPermis","idTypePermis") VALUES (1,1),
 (2,2),
 (3,1),
 (4,1),
 (5,1),
 (6,2),
 (7,3),
 (8,1),
 (9,1),
 (10,1),
 (11,1),
 (12,2),
 (13,1),
 (14,1),
 (15,1),
 (16,2),
 (17,3),
 (18,1),
 (19,1),
 (20,1),
 (21,1),
 (22,2),
 (23,1),
 (24,1),
 (25,1),
 (26,2),
 (27,3),
 (28,1),
 (29,1),
 (30,1),
 (31,1),
 (32,2),
 (33,1),
 (34,1),
 (35,1),
 (36,2),
 (37,3),
 (38,1),
 (39,1),
 (40,1),
 (41,1),
 (42,2),
 (43,1),
 (44,1),
 (45,1),
 (46,2),
 (47,3),
 (48,1),
 (49,1),
 (50,1),
 (51,1),
 (52,2),
 (53,1),
 (54,1),
 (55,1),
 (56,2),
 (57,3),
 (58,1),
 (59,1),
 (60,1),
 (61,1),
 (62,2),
 (63,1),
 (64,1),
 (65,1),
 (66,2),
 (67,3),
 (68,1),
 (69,1),
 (70,1),
 (71,1),
 (72,2),
 (73,1),
 (74,1),
 (75,1),
 (76,2),
 (77,3),
 (78,1),
 (79,1),
 (80,1),
 (81,1),
 (82,2),
 (83,1),
 (84,1),
 (85,1),
 (86,2),
 (87,3),
 (88,1),
 (89,1),
 (90,1),
 (91,1),
 (92,2),
 (93,1),
 (94,1),
 (95,1),
 (96,2),
 (97,3),
 (98,1),
 (99,1),
 (100,1),
 (101,1),
 (102,2),
 (103,1),
 (104,1),
 (105,1),
 (106,2),
 (107,3),
 (108,1),
 (109,1),
 (110,1),
 (111,1),
 (112,2),
 (113,1),
 (114,1),
 (115,1),
 (116,2),
 (117,3),
 (118,1),
 (119,1),
 (120,1),
 (121,1),
 (122,2),
 (123,1),
 (124,1),
 (125,1),
 (126,2),
 (127,3),
 (128,1),
 (129,1),
 (130,1),
 (131,1),
 (132,2),
 (133,1),
 (134,1),
 (135,1),
 (136,2),
 (137,3),
 (138,1),
 (139,1),
 (140,1),
 (141,1),
 (142,2),
 (143,1),
 (144,1),
 (145,1),
 (146,2),
 (147,3),
 (148,1),
 (149,1),
 (150,1);
INSERT INTO "TypeUtilisateur" ("idTypeUtilisateur","nomTypeUtilisateur") VALUES (1,'user'),
 (2,'superuser'),
 (3,'admin');
INSERT INTO "TypeVehicule" ("idTypeVehicule","nomType") VALUES (1,'Economique'),
 (2,'Moyenne'),
 (3,'Confort'),
 (4,'Luxe'),
 (5,'Utilitaire');
INSERT INTO "Utilisateur" ("idUtilisateur","idEmploye","nomUtilisateur","motDePasse","idTypeUtilisateur") VALUES (1,1,'imgreekyo','password1',1),
 (2,2,'staluk','password2',1),
 (3,3,'20100','password3',3),
 (4,4,'papaNajjar','password4',3),
 (5,5,'michelicious','password5',1),
 (6,6,'OPKarim','password6',2);
INSERT INTO "Vehicule" ("idVehicule","idMarqueVehicule","idTypeVehicule","idCouleurVehicule") VALUES (1,2,1,1),
 (2,3,1,2),
 (3,4,1,3),
 (4,5,1,4),
 (5,1,1,4),
 (6,5,1,3),
 (7,4,1,2),
 (8,5,2,1),
 (9,3,2,1),
 (10,2,2,1),
 (11,1,2,1),
 (12,2,2,1),
 (13,5,2,2),
 (14,2,2,1),
 (15,4,3,1),
 (16,5,3,1),
 (17,4,3,1),
 (18,1,3,3),
 (19,5,3,1),
 (20,4,3,1),
 (21,5,3,1),
 (22,3,4,1),
 (23,4,4,1),
 (24,2,4,4),
 (25,1,4,1),
 (26,1,4,1),
 (27,3,4,1),
 (28,3,4,1),
 (29,2,5,1),
 (30,1,5,1),
 (31,1,5,1),
 (32,2,5,1),
 (33,3,5,1),
 (34,2,5,1),
 (35,5,5,1);
INSERT INTO "Client" ("idClient","prenom","nom","dateDeNaissance","telephone","adresse","idPermis") VALUES (1,'Tommy','Lillee','2000-12-30','(739) 1473990','12036 Dryden Plaza',119),
 (2,'Mada','Mumby','2002-02-04','(213) 4989245','4 Hanover Lane',111),
 (3,'Jaynell','Cannaway','2003-04-06','(329) 1167091','4 Beilfuss Drive',120),
 (4,'Ky','Samwaye','1993-09-02','(383) 1005600','4885 Dunning Trail',65),
 (5,'Raoul','Goolding','1984-06-17','(330) 7776776','9342 Quincy Center',79),
 (6,'Bronny','Rowett','1969-10-08','(386) 2774165','60 Towne Court',76),
 (7,'Nathan','Denisevich','1995-03-28','(580) 8967805','80 New Castle Trail',37),
 (8,'Garvy','Gaiford','1977-07-28','(155) 1537096','992 Tomscot Alley',11),
 (9,'Adolpho','Purkis','1968-11-26','(123) 9723381','4 Nevada Pass',3),
 (10,'Eldredge','Dowbekin','1969-10-12','(789) 5546754','875 Fairfield Park',35),
 (11,'Tiffi','Shenfish','1975-08-12','(924) 1251630','8419 Lindbergh Lane',80),
 (12,'Cori','Fold','1964-11-12','(793) 8017867','3 Anthes Point',42),
 (13,'Rora','Caddies','2002-03-21','(514) 7322320','49 Atwood Point',9),
 (14,'Reeva','Fairbank','1964-04-27','(637) 6413022','5 Commercial Terrace',122),
 (15,'Tillie','Kayzer','1975-03-16','(886) 6798424','9 Ridgeview Junction',96),
 (16,'Auria','Frise','1969-01-26','(553) 8467252','23688 Walton Street',32),
 (17,'Alon','Lodevick','1992-03-09','(561) 2554568','5979 Larry Point',60),
 (18,'Cleavland','Winwood','2004-08-04','(164) 8576765','68805 Lakeland Way',25),
 (19,'Ethelind','Blueman','1961-07-30','(498) 5151641','3 Golf View Trail',87),
 (20,'Brynna','Walshaw','1970-03-29','(445) 8357401','58272 Prentice Avenue',14),
 (21,'Margie','Tooker','1986-12-21','(162) 1422352','06485 Sycamore Park',9),
 (22,'Pierre','Palleske','2002-09-21','(711) 4181513','6465 Spenser Drive',7),
 (23,'Joelle','Cauderlie','1968-07-20','(743) 1342802','56 Bayside Lane',75),
 (24,'Binni','Labrone','1994-05-02','(275) 7276681','91189 Rieder Plaza',19),
 (25,'Gunther','Pesak','1997-05-16','(863) 7335128','3539 Vermont Terrace',27),
 (26,'Robina','Tilte','1986-02-14','(701) 5939491','4113 Buena Vista Parkway',7),
 (27,'Frankie','Bourgour','1970-03-28','(248) 9011810','7 Mcguire Center',101),
 (28,'Ardeen','Adame','1999-08-28','(403) 2056196','4610 Debra Alley',33),
 (29,'Stormie','Kennion','1960-11-02','(202) 9128891','1 Goodland Parkway',73),
 (30,'Meg','Rohloff','1987-02-11','(655) 4143097','278 Morrow Parkway',37),
 (31,'Foster','Lozano','1996-04-04','(683) 2447026','61 Harper Crossing',44),
 (32,'Dasya','Legat','1988-09-01','(760) 7700631','04978 Bluejay Drive',121),
 (33,'Antone','Scoterbosh','1968-08-06','(844) 3399736','26291 International Way',119),
 (34,'Domenic','Shaddock','1976-05-14','(895) 7789844','0 Drewry Street',2),
 (35,'Haze','Stoner','1967-10-24','(907) 9279382','5504 Hudson Avenue',94),
 (36,'Alaine','Leward','1991-08-30','(847) 4562524','60040 Stephen Center',47),
 (37,'Jori','Bellin','1972-01-14','(260) 8970559','98865 Dennis Pass',104),
 (38,'Margot','Tiery','2002-09-14','(996) 2602483','893 Cascade Alley',75),
 (39,'Brit','Pasquale','2001-03-11','(265) 2306049','481 Vidon Lane',23),
 (40,'Noni','Tappor','1973-12-06','(530) 3982743','6 Comanche Avenue',95),
 (41,'Manolo','Vedntyev','1979-04-05','(279) 1438896','5625 Doe Crossing Parkway',79),
 (42,'Kassi','Coniff','2005-05-01','(304) 6775500','79031 Evergreen Avenue',46),
 (43,'Gibb','Hriinchenko','1981-04-18','(384) 7806674','432 Burrows Avenue',38),
 (44,'Rosa','Dederick','1962-12-23','(291) 7006068','06669 Dunning Road',118),
 (45,'Angil','Fossord','1994-03-22','(412) 5245249','0736 Monica Court',34),
 (46,'Sergio','Ruskin','2006-08-26','(304) 5672784','46611 Carpenter Court',125),
 (47,'Gabrielle','Cushelly','1990-10-05','(782) 8800405','8 Rieder Park',32),
 (48,'Hugh','Gorstidge','1996-09-17','(314) 1849304','06780 Spaight Pass',99),
 (49,'Karil','Kilbee','1989-08-25','(679) 3841037','87108 Pennsylvania Junction',3),
 (50,'Brigham','Cranmer','2006-07-17','(696) 8048245','9775 American Ash Center',117),
 (51,'Christalle','Aldrich','1991-09-01','(967) 5179111','5 Talmadge Road',88),
 (52,'Culley','Fallis','2003-10-29','(174) 4518261','8 Porter Lane',102),
 (53,'Ware','Savins','1978-11-17','(980) 9414940','8 Northwestern Court',3),
 (54,'Leonerd','Wabersich','1966-05-06','(908) 6200318','2126 Lerdahl Park',53),
 (55,'Travus','Troy','2003-06-15','(256) 7702689','89 Merry Way',75),
 (56,'Salmon','MacAnulty','1993-05-09','(907) 8108793','8421 Havey Circle',18),
 (57,'Jenifer','Koba','2005-10-26','(391) 2899759','2264 Ohio Terrace',27),
 (58,'Ursula','Featherby','1989-07-13','(534) 4915131','86442 Melby Plaza',83),
 (59,'Redford','Bedenham','1988-01-14','(560) 6004433','4682 Tennyson Park',75),
 (60,'Rustie','Chedgey','2006-12-27','(144) 3960991','7685 3rd Terrace',90),
 (61,'Mona','Willey','1996-09-06','(733) 7753626','0825 Knutson Drive',3),
 (62,'Rorie','Callan','1992-04-03','(435) 1659480','23 Clyde Gallagher Parkway',10),
 (63,'Arvie','Sheward','1987-10-26','(571) 8777212','52463 Sunnyside Junction',23),
 (64,'Ileana','Curcher','1995-04-18','(881) 2113753','49 Corry Parkway',2),
 (65,'Gaven','Shellcross','1971-06-27','(728) 4261942','2507 Nelson Way',22),
 (66,'Daryle','Sirl','1989-01-10','(182) 3313947','8 Walton Avenue',87),
 (67,'Weber','Warmisham','1961-02-17','(230) 3379023','06245 Linden Circle',49),
 (68,'Marty','Drewson','2003-05-13','(196) 7255017','4994 Troy Terrace',37),
 (69,'Matthieu','Ahern','1994-07-26','(104) 8431941','0565 Barnett Avenue',124),
 (70,'Bili','Birks','1972-07-25','(530) 8493032','47 Beilfuss Avenue',54),
 (71,'Hashim','Haizelden','1979-05-09','(197) 4192041','14 Becker Terrace',115),
 (72,'Zelig','Rosenberg','1968-06-13','(861) 7998854','1647 Kipling Pass',4),
 (73,'Cassandra','Kirk','1967-05-01','(995) 4945598','87 Rowland Center',63),
 (74,'Chaim','Dobbinson','1963-10-25','(983) 2203658','58 Eagle Crest Crossing',116),
 (75,'Joete','Alp','1985-02-09','(631) 6215578','3 Becker Lane',94),
 (76,'Jaquith','Tattersfield','1994-05-01','(995) 8101163','7 Coleman Way',59),
 (77,'Mack','Yanuk','1969-09-08','(634) 1823488','2626 Clarendon Park',107),
 (78,'Salaidh','Metson','1996-06-22','(367) 7361859','94 Eagle Crest Park',87),
 (79,'Erica','Tidcombe','2003-08-02','(500) 6633332','1 Kinsman Point',117),
 (80,'Leeanne','Posthill','1963-12-02','(867) 9344700','70 Cardinal Hill',10),
 (81,'Gregg','Driver','1981-09-26','(598) 6349867','06993 Brentwood Parkway',63),
 (82,'Raquel','Vallow','1985-05-20','(184) 2831930','1132 Rigney Hill',70),
 (83,'Regan','Rubee','1980-01-11','(900) 8077792','95332 Service Parkway',26),
 (84,'Rana','O'' Lone','1977-06-14','(256) 5752722','734 Autumn Leaf Pass',106),
 (85,'Alick','Wisker','2000-06-04','(210) 5765499','167 Meadow Vale Crossing',47),
 (86,'Pen','Kinneir','1980-04-09','(779) 1776749','1084 Eggendart Parkway',84),
 (87,'Tony','Boadby','1961-11-10','(878) 6955593','68762 Logan Street',37),
 (88,'Mauricio','Nardoni','1968-11-12','(126) 1516609','7043 Union Alley',78),
 (89,'Timmi','Osler','1998-07-11','(322) 6932646','1 Bobwhite Drive',97),
 (90,'Grantham','Mossom','1996-01-02','(586) 7815735','995 Oxford Plaza',7),
 (91,'Alexis','Wressell','1971-03-25','(602) 9197858','5886 Annamark Road',40),
 (92,'Burr','Casper','1966-02-28','(845) 1868458','365 Northview Center',60),
 (93,'Erica','Retchless','1996-03-15','(897) 6713915','2977 Namekagon Crossing',32),
 (94,'Englebert','Bollini','1996-09-06','(617) 2173482','96536 West Court',122),
 (95,'Corny','Sisselot','1988-01-22','(393) 5936242','22 Emmet Parkway',25),
 (96,'Bryant','Cosstick','1967-02-08','(114) 7399871','714 Charing Cross Terrace',46),
 (97,'Marco','Broseke','1966-06-03','(921) 3415111','10772 Jackson Point',79),
 (98,'Sydelle','Eddie','1988-09-05','(707) 2656237','71033 La Follette Plaza',57),
 (99,'Liliane','Jezzard','1979-09-05','(794) 8470474','54395 Toban Park',31),
 (100,'Anallese','Fredi','1962-08-16','(723) 5551393','37365 Anhalt Point',55),
 (101,'Tommy','Lillee','2000-12-30','(739) 1473990','12036 Dryden Plaza',119);
COMMIT;
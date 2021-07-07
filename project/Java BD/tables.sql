/* 
Tables.sql 

Permet de cr�er et supprimer les tables SQL 

Document r�dig� dans le cadre du TP3 pour le cours INF6150 -  Groupe 30 

Cr�� par  :  

REBEI BELKACEM BENSAKHRIA: BENR13129400 

*/ 
 
/* 
Le bloc ci-dessous permet de retirer toutes les tables cr��es par ce travail pratique.  
� utiliser � la fin seulement 
*/ 
SET ECHO ON;


DROP TABLE VOLS;

/* 
D�but de la cr�ation des tables SQL 
*/ 

CREATE TABLE VOLS
(noVol INTEGER NOT NULL
	CHECK (noVol > 0),
aeroDep VARCHAR(100),
aeroArr VARCHAR(100),
villeAeroDep VARCHAR(100),
villeAeroArriv VARCHAR(100),
paysDep VARCHAR(40),
paysArriv VARCHAR(40),
dateDepart DATE,
dateArrive DATE,
heureDepart CHAR(5),
heureArriv CHAR(5),

modelAvion CHAR(6),
numeroSerieAvion VARCHAR(10),
iata CHAR (3),
immatric VARCHAR(50),
depCoor VARCHAR(50),
arrCoor VARCHAR(50),
airline VARCHAR(50),
tempsVol CHAR(5),
PRIMARY KEY(noVol));

commit
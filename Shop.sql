-- reconstruction de la	base de donner 
DROP DATABASE IF EXISTS Shop;
CREATE DATABASE Shop;
USE Shop;

-- construction de la table des articles en vente 

CREATE TABLE T_articles 
(
	idArticle		int(4)			PRIMARY KEY AUTO_INCREMENT,
	Description		varchar(30)		NOT NULL,
	Brand			varchar(30)		NOT NULL,
	UnitaryPrice	float(8)		NOT NULL
) ENGINE = InnoDB;

INSERT INTO T_articles ( Description , Brand , UnitaryPrice ) VALUES ( "souris" , "logitoch" , 65 );
INSERT INTO T_articles ( Description , Brand , UnitaryPrice ) VALUES ( "clavier" , "microhard" , 49.5 );
INSERT INTO T_articles ( Description , Brand , UnitaryPrice ) VALUES ( "systeme d'exploitation" , "fenetre Vistouille" , 150 );
INSERT INTO T_articles ( Description , Brand , UnitaryPrice ) VALUES ( "tapis Souris" , "chapeau bleu" , 5 );
INSERT INTO T_articles ( Description , Brand , UnitaryPrice ) VALUES ( " cle USB 8TO" , "syno" , 8 );
INSERT INTO T_articles ( Description , Brand , UnitaryPrice ) VALUES ( "laptop" , "PH" , 1199 );
INSERT INTO T_articles ( Description , Brand , UnitaryPrice ) VALUES ( "CD x 500" , "CETME" , 250 );
INSERT INTO T_articles ( Description , Brand , UnitaryPrice ) VALUES ( "DVD-R x 100" , "CETME" , 99 );
INSERT INTO T_articles ( Description , Brand , UnitaryPrice ) VALUES ( "DVD+R x 100" , "CETME" , 105 );
INSERT INTO T_articles ( Description , Brand , UnitaryPrice ) VALUES ( "batterie laptop" , "PH" , 80 );
INSERT INTO T_articles ( Description , Brand , UnitaryPrice ) VALUES ( "casque audio" , "syno" , 105 );
INSERT INTO T_articles ( Description , Brand , UnitaryPrice ) VALUES ( "webcam" , "logitoch" , 755 );

--1.4 ajout articles au choix 
INSERT INTO T_articles ( Description , Brand , UnitaryPrice ) VALUES ( "last of us" , "naughtydog" , 39 );
INSERT INTO T_articles ( Description , Brand , UnitaryPrice ) VALUES ( "last of us 2" , "naughtydog" , 60 );
INSERT INTO T_articles ( Description , Brand , UnitaryPrice ) VALUES ( "forza horizon" , "turn 10" , 59 );

--1.5 ajout article et modification avant de verifier s'il a etait pris en compte 
INSERT INTO T_articles ( Description , Brand , UnitaryPrice ) VALUES ( "the crew" , "jeux ps5" , 49 );
-- update T_articles set brand="ubisoft" where idArticle=16;

--1.6 supprimer articles et verifier
--delete from T_articles where idArticle=12;
--select * from T_articles;

--1.7 afficher articles superieur a 100
-- select * from T_articles where UnitaryPrice > 100;

--1.8 afficher articles entre 50 et 150
-- select * from T_articles where UnitaryPrice > 49 && UnitaryPrice < 150;

--1.9 afficher par ordre croissant des prix
-- select * from T_articles ORDER BY UnitaryPrice;

--1.10 afficher la description des articles
-- select T_articles.Description from T_articles;

--1.11 presenter requet sql interessante ( en attente )
--select AVG(T_articles.UnitaryPrice) FROM T_articles; ( calcule la moyenne de la colonne price )

--1.12 creation T_caterogies
CREATE TABLE T_categories 
(
	idCategory		int(4)			PRIMARY KEY AUTO_INCREMENT,
	CatName			varchar(30)		NOT NULL,
	Descriptions	varchar(100)	NOT NULL
) ENGINE = InnoDB;

--1.12 ajout des valeurs 
INSERT INTO T_categories ( CatName, Descriptions) VALUES ( "peripherique" , "peripherique audio / souris / clavier ..." );
INSERT INTO T_categories ( CatName, Descriptions) VALUES ( "os" , "systeme d'exploitation" );
INSERT INTO T_categories ( CatName, Descriptions) VALUES ( "pc" , "laptop" );
INSERT INTO T_categories ( CatName, Descriptions) VALUES ( "jeux" , "jeux video console" );

--1.12 cree la colonne idCategories pour les stranger key
ALTER TABLE t_articles ADD COLUMN idCategory INT(4);
ALTER TABLE t_articles ADD FOREIGN KEY(idCategory) REFERENCES T_categories(idCategory);

--1.12 assigne stranger key a chaque articles
update t_articles set idCategory=1 where idArticle=1;
update t_articles set idCategory=1 where idArticle=2;
update t_articles set idCategory=1 where idArticle=4;
update t_articles set idCategory=1 where idArticle=5;
update t_articles set idCategory=1 where idArticle=7;
update t_articles set idCategory=1 where idArticle=8;
update t_articles set idCategory=1 where idArticle=9;
update t_articles set idCategory=1 where idArticle=11;
update t_articles set idCategory=1 where idArticle=12;

update t_articles set idCategory=2 where idArticle=3;

update t_articles set idCategory=3 where idArticle=10;
update t_articles set idCategory=3 where idArticle=6;

update t_articles set idCategory=4 where idArticle=13;
update t_articles set idCategory=4 where idArticle=14;
update t_articles set idCategory=4 where idArticle=15;
update t_articles set idCategory=4 where idArticle=16;

--1.13 trouver la requete
-- test 1 select idArticle ,  t_articles.Description,Brand,UnitaryPrice,CatName from t_articles inner join t_categories on t_categories.idCategory = t_articles.idCategory;
--test 2 select idArticle ,  t_articles.Description,Brand,UnitaryPrice,CatName from t_articles inner join t_categories on t_categories.idCategory = t_articles.idCategory and t_articles.UnitaryPrice ORDER BY UNitaryPrice;
-- OK select idArticle ,  t_articles.Description,Brand,UnitaryPrice,CatName from t_articles inner join t_categories on t_categories.idCategory = t_articles.idCategory where t_articles.idArticle > 10 && t_articles.idArticle < 16 && t_articles.UnitaryPrice ORDER BY UnitaryPrice;

CREATE TABLE T_users 
(
	idUser		int(4)			PRIMARY KEY AUTO_INCREMENT,
	Login		varchar(30)		NOT NULL,
	Password	varchar(30)		NOT NULL
) ENGINE = InnoDB;

INSERT INTO T_users (  Login , Password) VALUES ( "toto40" , "taratoto40" );
INSERT INTO T_users (  Login , Password) VALUES ( "tata40" , "taratata40" );
INSERT INTO T_users (  Login , Password) VALUES ( "titi40" , "taratiti40" );
INSERT INTO T_users (  Login , Password) VALUES ( "tutu40" , "taratutu40" );

SELECT * FROM t_articles;
SELECT * FROM t_categories;
SELECT * FROM t_users;
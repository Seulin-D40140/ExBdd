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
INSERT INTO T_articles ( Description , Brand , UnitaryPrice ) VALUES ( " systeme d'exploitation" , "fenetre Vistouille" , 150 );
INSERT INTO T_articles ( Description , Brand , UnitaryPrice ) VALUES ( "tapis Souris" , "chapeau bleu" , 5 );
INSERT INTO T_articles ( Description , Brand , UnitaryPrice ) VALUES ( " cle USB 8TO" , "syno" , 8 );
INSERT INTO T_articles ( Description , Brand , UnitaryPrice ) VALUES ( "laptop" , "PH" , 1199 );
INSERT INTO T_articles ( Description , Brand , UnitaryPrice ) VALUES ( "CD x 500" , "CETME" , 250 );
INSERT INTO T_articles ( Description , Brand , UnitaryPrice ) VALUES ( "DVD-R x 100" , "CETME" , 99 );
INSERT INTO T_articles ( Description , Brand , UnitaryPrice ) VALUES ( "DVD+R x 100" , "CETME" , 105 );
INSERT INTO T_articles ( Description , Brand , UnitaryPrice ) VALUES ( "batterie laptop" , "PH" , 80 );
INSERT INTO T_articles ( Description , Brand , UnitaryPrice ) VALUES ( "casque audio" , "syno" , 105 );
INSERT INTO T_articles ( Description , Brand , UnitaryPrice ) VALUES ( "webcam" , "logitoch" , 755 );

SELECT * FROM T_articles;
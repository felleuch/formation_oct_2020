CREATE TABLE `livre` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `titre` varchar(100) DEFAULT NULL,
  `categorie` varchar(100) DEFAULT NULL,
  `isbn` varchar(100) DEFAULT NULL,
  `nom_auteur` varchar(100) DEFAULT NULL,
  `prenom_auteur` varchar(100) DEFAULT NULL,
  `code` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
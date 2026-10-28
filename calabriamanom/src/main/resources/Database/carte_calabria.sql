-- =====================================================================
-- Carte Pizza Calabria : import initial dans la table `plats`
-- A executer UNE seule fois, sur une table `plats` vide.
-- Convention : `ordre` = position du plat dans sa categorie (type).
-- prix = prix standard (1 ou 2 personnes pour les pizzas)
-- prix_familial = prix 4 personnes (NULL quand il n'existe pas)
-- =====================================================================

SET NAMES utf8mb4;

-- ---------------------------------------------------------------------
-- PIZZAS (53)
-- ---------------------------------------------------------------------
INSERT INTO plats (name, description, image_url, type, prix, prix_familial, disponible, ordre) VALUES
('Pizzanette', 'Tomate, mozzarella', NULL, 'PIZZA', 7.40, 19.00, TRUE, 1),
('Pizza dessert', 'Crème, poire, Nutella, amandes effilées', NULL, 'PIZZA', 7.90, 19.00, TRUE, 2),
('Marguerite', 'Tomate, jambon, mozzarella, olives', NULL, 'PIZZA', 8.40, 19.90, TRUE, 3),
('Reine', 'Tomate, jambon, champignons, mozzarella, olives', NULL, 'PIZZA', 8.90, 21.40, TRUE, 4),
('Flamme', 'Crème, lardons, oignons', NULL, 'PIZZA', 8.90, 21.40, TRUE, 5),
('Reine Blanche', 'Crème, jambon, champignons, mozzarella, olives', NULL, 'PIZZA', 8.90, 22.00, TRUE, 6),
('Calzone', 'Tomate, jambon, champignons, mozzarella', NULL, 'PIZZA', 8.90, NULL, TRUE, 7),
('Chèvre', 'Tomate, chèvre, mozzarella, crème, olive', NULL, 'PIZZA', 8.90, 22.00, TRUE, 8),
('Paysanne', 'Tomate, lardons, champignons, mozzarella', NULL, 'PIZZA', 8.90, 22.00, TRUE, 9),
('Poivrons', 'Tomate, jambon, champignons, mozzarella, poivrons', NULL, 'PIZZA', 8.90, 22.00, TRUE, 10),
('Calabria', 'Tomate, jambon, champignons, mozzarella, œuf', NULL, 'PIZZA', 8.90, 22.90, TRUE, 11),
('Chorizo', 'Tomate, jambon, mozzarella, chorizo, olives', NULL, 'PIZZA', 9.40, 22.90, TRUE, 12),
('Napolitaine', 'Tomate, jambon, mozzarella, anchois, olive', NULL, 'PIZZA', 9.40, 22.90, TRUE, 13),
('Thon', 'Tomate, thon, mozzarella, anchois, olive', NULL, 'PIZZA', 9.40, 22.90, TRUE, 14),
('Asperges', 'Tomate, champignons, mozzarella, asperges', NULL, 'PIZZA', 9.40, 22.90, TRUE, 15),
('Fromage', 'Tomate, mozzarella, cantal, gruyère, gorgonzola', NULL, 'PIZZA', 9.40, 22.90, TRUE, 16),
('Forestière', 'Crème, lardons, oignons, champignons, gruyère', NULL, 'PIZZA', 9.40, 22.90, TRUE, 17),
('Salami', 'Tomate, salami, champignons, mozzarella, olives', NULL, 'PIZZA', 9.40, 23.50, TRUE, 18),
('Poulet', 'Tomate, blanc de poulet, champignons, mozzarella, olives', NULL, 'PIZZA', 9.40, 23.50, TRUE, 19),
('Campagnarde', 'Tomate, lardons, champignons, oignons, mozzarella, œuf, olive', NULL, 'PIZZA', 9.40, 23.50, TRUE, 20),
('Végétarienne', 'Tomate, champignons, mozzarella, poivrons, artichauts', NULL, 'PIZZA', 9.40, 23.50, TRUE, 21),
('Calzone forestier', 'Crème, lardons, oignons, champignons, mozzarella', NULL, 'PIZZA', 9.40, NULL, TRUE, 22),
('Artichauts', 'Tomate, jambon, champignons, mozzarella, olive, artichauts', NULL, 'PIZZA', 9.40, 23.50, TRUE, 23),
('Mozzarella', 'Tomate, jambon, champignons, tomates fraîches, mozzarella', NULL, 'PIZZA', 9.40, 24.40, TRUE, 24),
('Bolognaise', 'Tomate, champignons, mozzarella, poivrons, viande hachée', NULL, 'PIZZA', 9.90, 24.40, TRUE, 25),
('Orientale', 'Tomate, fromage, merguez, poivrons', NULL, 'PIZZA', 9.90, 24.40, TRUE, 26),
('Mortadelle', 'Tomate, champignons, mortadelle, mozzarella, crème fraîche, olive', NULL, 'PIZZA', 9.90, 24.40, TRUE, 27),
('Kebab', 'Tomate, oignons, tomate fraîche, mozzarella, viande kebab, sauce kebab', NULL, 'PIZZA', 9.90, 24.40, TRUE, 28),
('Sardine', 'Tomate, oignons, sardine, mozzarella', NULL, 'PIZZA', 9.90, 24.40, TRUE, 29),
('Manomoiz', 'Tomate, chorizo, mozzarella, anchois, œuf, olive', NULL, 'PIZZA', 9.90, 24.40, TRUE, 30),
('Hawaïenne', 'Tomate, blanc de poulet, champignons, mozzarella, ananas', NULL, 'PIZZA', 9.90, 24.40, TRUE, 31),
('Aubergines grillées', 'Tomate, champignons, mozzarella, poivrons, aubergines grillées, origan', NULL, 'PIZZA', 9.90, 24.40, TRUE, 32),
('Pizza chèvre épinards', 'Base crème, oignons, épinards, chèvre, mozzarella, tomates cerises', NULL, 'PIZZA', 9.90, 24.40, TRUE, 33),
('Pizza Munster', 'Base crème, oignons, lardons, pomme de terre, Munster', NULL, 'PIZZA', 9.90, 24.40, TRUE, 34),
('Poulet Curry', 'Crème, curry, émincé de poulet fumé, champignons, mozzarella, olives, origan, sauce curry', NULL, 'PIZZA', 9.50, 24.40, TRUE, 35),
('La Vôtre', 'Tomate, mozzarella, olives, origan + 4 ingrédients de votre choix sauf saumon, escargots et Saint-Jacques', NULL, 'PIZZA', 9.90, 24.40, TRUE, 36),
('Soleil', 'Tomate, piment, mozzarella, viande de bœuf, poivron, maïs, olives, origan, crème fraîche', NULL, 'PIZZA', 9.90, 24.40, TRUE, 37),
('Courgettes', 'Base tomate, champignons, mozzarella, origan, crevettes, courgettes', NULL, 'PIZZA', 9.90, 25.00, TRUE, 38),
('Fruits de mer', 'Tomate, champignons, fruits de mer, mozzarella, olive', NULL, 'PIZZA', 9.90, 25.00, TRUE, 39),
('Tartiflette', 'Crème, lardons, oignons, pommes de terre, reblochon', NULL, 'PIZZA', 9.90, 25.00, TRUE, 40),
('Bayonne', 'Tomate, champignons, jambon de Bayonne, origan', NULL, 'PIZZA', 9.90, 25.00, TRUE, 41),
('Chou rouge - Viande de bœuf', 'Tomate, oignons, mozzarella, chou rouge râpé, viande de bœuf hachée, fromage fondu, origan, sauce Andalouse', NULL, 'PIZZA', 9.90, 25.00, TRUE, 42),
('Crevettes', 'Tomate, crevettes, mozzarella, crème fraîche', NULL, 'PIZZA', 9.90, 25.00, TRUE, 43),
('Fruits de mer blanche', 'Crème, champignons, fruits de mer, mozzarella, olive', NULL, 'PIZZA', 9.90, 25.90, TRUE, 44),
('Escargots', 'Tomate, escargots, mozzarella, beurre d''escargots', NULL, 'PIZZA', 9.90, 25.90, TRUE, 45),
('Roquette', 'Tomate, champignons, mozzarella, jambon fumé, origan, salade (roquette)', NULL, 'PIZZA', 10.00, 25.90, TRUE, 46),
('Du Chef', 'Crème, blanc de poulet, pomme de terre, mozzarella, viande kebab, merguez, reblochon, olives, sauce kebab, origan', NULL, 'PIZZA', 10.00, 25.90, TRUE, 47),
('Boursin', 'Sauce tomate, mozzarella, bœuf haché, oignons, pomme de terre, boursin', NULL, 'PIZZA', 10.00, 25.90, TRUE, 48),
('Charcutière', 'Tomate, poulet, lardons, mozzarella, chorizo', NULL, 'PIZZA', 10.00, 26.20, TRUE, 49),
('Pizza raclette', 'Base crème, oignons, jambon, pomme de terre, rosette, jambon de Bayonne, fromage à raclette', NULL, 'PIZZA', 10.00, 26.50, TRUE, 50),
('Saumon', 'Crème, oignons, saumon, aneth', NULL, 'PIZZA', 10.00, 26.50, TRUE, 51),
('Saint-Jacques', 'Crème, champignons, saint-jacques, crevettes, gruyère', NULL, 'PIZZA', 10.00, 26.50, TRUE, 52),
('Cuisses de grenouilles', 'Tomate, champignons, cuisses de grenouilles, beurre d''escargots, gruyère', NULL, 'PIZZA', 10.00, 26.50, TRUE, 53);

-- ---------------------------------------------------------------------
-- PATES (8) : tagliatelles, gnocchis ou pennes, sauce au choix
-- ---------------------------------------------------------------------
INSERT INTO plats (name, description, image_url, type, prix, prix_familial, disponible, ordre) VALUES
('Pâtes bolognaise', 'Tagliatelles, gnocchis ou pennes, sauce bolognaise', NULL, 'PATES', 7.00, NULL, TRUE, 1),
('Pâtes carbonara', 'Tagliatelles, gnocchis ou pennes, sauce carbonara', NULL, 'PATES', 7.00, NULL, TRUE, 2),
('Pâtes pesto tomate', 'Tagliatelles, gnocchis ou pennes, sauce pesto tomate', NULL, 'PATES', 7.00, NULL, TRUE, 3),
('Pâtes quatre fromages', 'Tagliatelles, gnocchis ou pennes, sauce quatre fromages', NULL, 'PATES', 7.00, NULL, TRUE, 4),
('Pâtes fruits de mer', 'Tagliatelles, gnocchis ou pennes, sauce fruits de mer', NULL, 'PATES', 7.00, NULL, TRUE, 5),
('Pâtes sauce au thon', 'Tagliatelles, gnocchis ou pennes, sauce au thon', NULL, 'PATES', 7.00, NULL, TRUE, 6),
('Lasagnes bolognaise', NULL, NULL, 'PATES', 7.00, NULL, TRUE, 7),
('Pâtes Saint-Jacques', 'Pennes ou tagliatelles, sauce blanche, poivre, sel, graine de fenouil, coriandre, zeste de citron, saint-jacques, beurre d''escargot', NULL, 'PATES', 8.00, NULL, TRUE, 8);

-- ---------------------------------------------------------------------
-- PANINIS (6)
-- ---------------------------------------------------------------------
INSERT INTO plats (name, description, image_url, type, prix, prix_familial, disponible, ordre) VALUES
('Panini thon', 'Thon, mozzarella', NULL, 'PANINI', 4.00, NULL, TRUE, 1),
('Panini poulet', 'Poulet, mozzarella', NULL, 'PANINI', 4.00, NULL, TRUE, 2),
('Panini jambon', 'Jambon, mozzarella', NULL, 'PANINI', 4.00, NULL, TRUE, 3),
('Panini chèvre', 'Chèvre, mozzarella', NULL, 'PANINI', 4.00, NULL, TRUE, 4),
('Panini tomate', 'Tomate, mozzarella', NULL, 'PANINI', 4.00, NULL, TRUE, 5),
('Panini kebab', 'Tomate, oignons, viande kebab, mozzarella, sauce kebab', NULL, 'PANINI', 4.00, NULL, TRUE, 6);

-- ---------------------------------------------------------------------
-- PAIN BAGNAT (1)
-- ---------------------------------------------------------------------
INSERT INTO plats (name, description, image_url, type, prix, prix_familial, disponible, ordre) VALUES
('Pain bagnat', 'Jambon, thon ou poulet', NULL, 'PAIN_BAGNAT', 3.70, NULL, TRUE, 1);

-- ---------------------------------------------------------------------
-- SALADES (7) : 4 en barquette, 3 en assiette
-- ---------------------------------------------------------------------
INSERT INTO plats (name, description, image_url, type, prix, prix_familial, disponible, ordre) VALUES
('Salade nature', 'Barquette', NULL, 'SALADE', 3.00, NULL, TRUE, 1),
('Salade thon', 'Barquette', NULL, 'SALADE', 3.50, NULL, TRUE, 2),
('Salade poulet', 'Barquette', NULL, 'SALADE', 3.50, NULL, TRUE, 3),
('Salade jambon', 'Barquette', NULL, 'SALADE', 3.50, NULL, TRUE, 4),
('Salade vosgienne', 'Assiette : salade, oignons, pommes de terre, lardons, crème, croûtons, vinaigrette', NULL, 'SALADE', 7.00, NULL, TRUE, 5),
('Salade mozzarella', 'Assiette : salade, tomates, mozzarella, olives, maïs, vinaigrette, huile d''olive', NULL, 'SALADE', 7.00, NULL, TRUE, 6),
('Salade fruits de mer', 'Assiette : salade, fruits de mer, oignons, crème légère, épices, croûtons', NULL, 'SALADE', 8.00, NULL, TRUE, 7);

-- ---------------------------------------------------------------------
-- GLACES Haagen-Dazs (5) : pot de 100 ml
-- ---------------------------------------------------------------------
INSERT INTO plats (name, description, image_url, type, prix, prix_familial, disponible, ordre) VALUES
('Glace Macadamia', 'Haagen-Dazs, pot de 100 ml', NULL, 'GLACE', 2.50, NULL, TRUE, 1),
('Glace Mango cream', 'Haagen-Dazs, pot de 100 ml', NULL, 'GLACE', 2.50, NULL, TRUE, 2),
('Glace Strawberry cream', 'Haagen-Dazs, pot de 100 ml', NULL, 'GLACE', 2.50, NULL, TRUE, 3),
('Glace Summer berries cream', 'Haagen-Dazs, pot de 100 ml', NULL, 'GLACE', 2.50, NULL, TRUE, 4),
('Glace Banana cream', 'Haagen-Dazs, pot de 100 ml', NULL, 'GLACE', 2.50, NULL, TRUE, 5);

-- ---------------------------------------------------------------------
-- DESSERT (1)
-- ---------------------------------------------------------------------
INSERT INTO plats (name, description, image_url, type, prix, prix_familial, disponible, ordre) VALUES
('Tiramisu', NULL, NULL, 'DESSERT', 2.50, NULL, TRUE, 1);

-- ---------------------------------------------------------------------
-- MENU ENFANT (1)
-- ---------------------------------------------------------------------
INSERT INTO plats (name, description, image_url, type, prix, prix_familial, disponible, ordre) VALUES
('Menu enfant', 'Une petite pizza jambon ou pâtes au choix, un jus d''orange, un dessert, un cadeau', NULL, 'MENU_ENFANT', 5.00, NULL, TRUE, 1);

-- ---------------------------------------------------------------------
-- BOISSONS (12)
-- ---------------------------------------------------------------------
INSERT INTO plats (name, description, image_url, type, prix, prix_familial, disponible, ordre) VALUES
('Cuvée du Patron', 'Rouge ou rosé, 75 cl', NULL, 'BOISSON', 4.00, NULL, TRUE, 1),
('J.-P. Chenet', NULL, NULL, 'BOISSON', 6.00, NULL, TRUE, 2),
('Desperados 65 cl', NULL, NULL, 'BOISSON', 4.50, NULL, TRUE, 3),
('Desperados 33 cl', NULL, NULL, 'BOISSON', 2.50, NULL, TRUE, 4),
('Heineken 65 cl', NULL, NULL, 'BOISSON', 4.00, NULL, TRUE, 5),
('Heineken 25 cl', NULL, NULL, 'BOISSON', 2.50, NULL, TRUE, 6),
('Lambrusco', 'Rouge ou rosé, 75 cl', NULL, 'BOISSON', 7.00, NULL, TRUE, 7),
('Coca 1,25 l', NULL, NULL, 'BOISSON', 3.00, NULL, TRUE, 8),
('Coca 33 cl', NULL, NULL, 'BOISSON', 1.50, NULL, TRUE, 9),
('Oasis 33 cl', NULL, NULL, 'BOISSON', 1.50, NULL, TRUE, 10),
('Fanta 33 cl', NULL, NULL, 'BOISSON', 1.50, NULL, TRUE, 11),
('Bière Kronenbourg', NULL, NULL, 'BOISSON', 1.80, NULL, TRUE, 12);

-- ---------------------------------------------------------------------
-- Verification : attendu PIZZA 53, PATES 8, PANINI 6, PAIN_BAGNAT 1,
-- SALADE 7, GLACE 5, DESSERT 1, MENU_ENFANT 1, BOISSON 12 (total 94)
-- ---------------------------------------------------------------------
SELECT type, COUNT(*) AS nb FROM plats GROUP BY type;

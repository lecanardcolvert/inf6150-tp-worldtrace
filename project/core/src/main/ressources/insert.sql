/* 
inserts.sql 

Permet d'insérer des données dans les tables sql créées. 

Document rédigé dans le cadre du TP2 pour le cours INF6150 

Créé par  :  
REBEI BELKACEM BENSAKHRIA: BENR13129400 
*/ 
 
/* 
Les deletes ci-dessous permettent de vider les tables de toutes données.
*/ 


DELETE FROM VOLS;


/*
Les inserts ci-dessous permet d'entrer les données dans les tables.
*/


INSERT INTO VOLS VALUES (1,'Jerusalem International Airport','London International Airport',
'Jérusalem','Londre','Palestine','Royaume-Uni','21/12/30','21/12/30',
'22H50','04H10','Airbus','A220-300','223','C-FANG','31.7683° N 35.2137° E',
'51.5074° N 0.1278° W','British Airways','5h20');

INSERT INTO VOLS VALUES (2,'Copenhagen Airport (Kastrup)','Singapore Changi Airport',
'Copenhague','Singapour','Danemark','Singapour','21/09/08','21/09/09',
'23H20','12H20','Airbus','A300-600','AB6','F-5YTT','55.6761° N 12.5683° E',
'1.3521° N 103.8198° E','Danish Air Transport','13h00');

INSERT INTO VOLS VALUES (3,'Noi Bai International Airport','Yaoundé-Nsimalen International Airport',
'Hanoï','Yaoundé','Viêt Nam','Cameroun','22/02/10','21/02/11',
'21H05','10H25','Boeing','707','703','R-U545','21.0278° N 105.8342° E',
'51.5074° N 0.1278° W','Vietnam National Airlines','13h20');

INSERT INTO VOLS VALUES (4,'Madrid-Barajas Adolfo Suárez Airport','Heydar Aliyev International Airport',
'Madrid','Bakou','Espagne','Azerbaïdjan','22/01/02','22/01/02',
'11H00','17H00','Airbus','A321','321','T-YYT7','40.4168° N 3.7038° W',
'3.8480° N 11.5021° E','Iberia','6h00');

INSERT INTO VOLS VALUES (5,'Sofia International Airport','Ninoy Aquino International Airport',
'Sofia','Manille','Bulgarie','Philippines','21/10/15','21/10/15',
'06H15','18H35','Boeing','717','717','DI-6544','42.6977° N 23.3219° E',
'14.5995° N 120.9842° E','Bulgaria Air','12h20');

INSERT INTO VOLS VALUES (6,'Dulles International Airport','Imam Khomeini Airport',
'Washington, D.C.','Téhéran','États-Unis','Iran','21/10/10','21/10/10',
'01H45','14H55','Boeing','720B','B72','H-7651','38.9072° N 77.0369° W',
'35.6892° N 51.3890° E','Delta','13h10');

INSERT INTO VOLS VALUES (7,'Hong Kong International Airport','Ankara Esenboga Airport',
'Hong Kong','Ankara','Hong Kong','Turquie','21/09/02','21/09/02',
'10H05','20H10','Boeing','787-10','781','GH-OIUD','22.3193° N 114.1694° E',
'39.9334° N, 32.8597° E','Hong Kong Airlines Limited','10h05');

INSERT INTO VOLS VALUES (8,'Taiwan Taoyuan International Airport','Paris Charles de Gaulle Airport',
'Taipei','Paris','Taïwan','France','21/12/01','21/12/02',
'18H50','07H35','Airbus','A330-200','332','PK-G336','25.0330° N 121.5654° E',
'48.8566° N 2.3522° E','EVA Air','12h45');

INSERT INTO VOLS VALUES (9,'Stockholm Arlanda Airport','Maya Maya International Airport',
'Stockholm','Brazzaville','Suède','Congo','21/08/19','21/08/19',
'12H00','9H15','Boeing','737-200','732','RE-BES7','59.3293° N 18.0686° E',
'4.2634° S 15.2429° E','BRA Braathens Regional Airlines','9h15');

INSERT INTO VOLS VALUES (10,'Haneda Airport','Malta International Airport',
'Tokyo','La Valetta','Japon','Malte','21/07/12','21/07/12',
'07H20','20H35','Airbus','A380-800','388','Z-6090','35.6762° N 139.6503° E',
'35.8989° N 14.5146° E','British Airways','13h15');

INSERT INTO VOLS VALUES (11,'N djili Airport','Boryspil International Airport',
'Kinshasa','Kiev','RDC','Ukraine','21/11/14','21/11/14',
'13H05','21H20','Airbus','A340-500','345','C-GFDS','4.4419° S 15.2663° E',
'50.4501° N 30.5234° E','Congo Airways','8h15');

INSERT INTO VOLS VALUES (12,'Leonardo da Vinci–Fiumicino Airport','Vienna International Airport',
'Rome','Vienne','Italie','Autriche','21/07/19','21/07/20',
'23H55','01H25','Boeing','727-100','721','E-BB11','41.9028° N 12.4964° E',
'48.2082° N 16.3738° E','Aer Sicilia','1h30');

INSERT INTO VOLS VALUES (13,'Nursultan Nazarbayev International Airport','Oslo Gardermoen Airport',
'Noursoultan','Oslo','Kazakhstan','Norvège','21/09/17','21/09/18',
'20H40','01H55','Airbus','A330-300','333','NN-G2DD','51.1605° N 71.4704° E',
'59.9139° N 10.7522° E','Air Astana','5h15');

INSERT INTO VOLS VALUES (14,'Chaklala Airport','Sarajevo International Airport',
'Islamabad','Sarajevo','Pakistan','Bosnie-Herzégovine','21/12/14','21/12/14',
'14H30','21H00','Airbus','A319','319','DF-TRGF','33.6844° N 73.0479° E',
'43.8563° N 18.4131° E','Aero Asia','6h30');

INSERT INTO VOLS VALUES (15,'Canberra Airport','Cairo International Airport',
'Canberra','Le Caire','Australie','Égypte','21/12/09','21/12/10',
'12H10','06H25','Boeing','747-200F','74X','K-7788','35.2809° S 149.1300° E',
'30.0444° N 31.2357° E','Qantas','18h15');

INSERT INTO VOLS VALUES (16,'Ottawa International Airport','Jorge Chavez International Airport',
'Ottawa','Lima','Canada','Pérou','21/11/08','21/11/08',
'12H50','21H15','Airbus','A319neo','31N','G-TRCC','45.4215° N 75.6972° W',
'12.0464° S 77.0428° W','Air Canada','8h25');

INSERT INTO VOLS VALUES (17,'Helsinki-Vantaa Airpor','Arturo Merino Benítez International Airport',
'Helsinki','Santiago','Finlande','Chili','21/08/27','21/08/27',
'02H20','19H35','Boeing','747SP','74L','Y-4442','60.1699° N 24.9384° E',
'33.4489° S 70.6693° W','Finnair','17h15');

INSERT INTO VOLS VALUES (18,'L.F. Wade International Airport','Berlin Tegel Airport',
'Hamilton','Berlin','Bermudes','Allemagne','21/11/30','21/11/30',
'10H45','19H15','Airbus','A340-300','343','V-5434','43.2557° N 79.8711° W',
'52.5200° N 13.4050° E','Lübeck Air','8h30');

INSERT INTO VOLS VALUES (19,'Incheon International Airport','Addis Ababa Bole International Airport',
'Séoul','Addis-Abeba','Corée du Sud','Éthiopie','21/09/12','21/09/13',
'12H00','00H00','Boeing','777-300','773','YT-0001','37.5665° N 126.9780° E',
'8.9806° N 38.7578° E','Korean Air','12h00');

INSERT INTO VOLS VALUES (20,'Mexico City International Airport','Brasília–Presidente Juscelino Kubitschek International Airport',
'Mexico','Brasília','Mexique','Brésil','21/09/03','21/09/03',
'06H05','15H05','Boeing','787-9','789','LK-5FFF','19.4326° N 99.1332° W',
'15.7975° S 47.8919° W','Aéreo Servicio Guerrero','9h00');

INSERT INTO VOLS VALUES (21,'Warsaw Chopin Airport','Nice Côte Azur Airport',
'Varsovie','Monaco','Pologne','Monaco','21/09/06  ','21/09/06',
'16H15','18h30','Boeing','787-9','789','HH-5432','19.4326° N 99.1332° W',
'15.7975° S 47.8919° W','Aéreo Servicio Guerrero','2h15');

INSERT INTO VOLS VALUES (22,'Indira Gandhi International Airport','Beijing Capital International Airport',
'New Delhi','Beijing','Inde','Chine','21/10/04','21/10/04',
'08H00','13H15','Airbus','787-9','789','L-POIU','19.4326° N 99.1332° W',
'15.7975° S 47.8919° W','Aéreo Servicio Guerrero','5h15');

INSERT INTO VOLS VALUES (23,'Sheremetyevo International Airport.','Suvarnabhumi Airport',
'Moscou','Bangkok','Russie','Thaïlande','21/11/24','21/11/25',
'22H30','7H45','Airbus','787-9','789','UY-5543','19.4326° N 99.1332° W',
'15.7975° S 47.8919° W','Aéreo Servicio Guerrero','9h15');

INSERT INTO VOLS VALUES (24,'Soekarno–Hatta International Airport','Jomo Kenyatta International Airport',
'Jakarta','Nairobi','Indonésie','Kenya','21/11/11','21/11/12',
'23H15','9H25','Airbus','787-9','789','TT-5UUU','19.4326° N 99.1332° W',
'15.7975° S 47.8919° W','Aéreo Servicio Guerrero','10h10');

INSERT INTO VOLS VALUES (25,'Hazrat Shahjalal International Airport','Ministro Pistarini International Airport ',
'Dacca','Buenos Aires','Bangladesh','Argentine','21/12/19','21/12/20',
'16H45','14H05','Boeing','787-9','789','C-TTT9','19.4326° N 99.1332° W',
'15.7975° S 47.8919° W','Aéreo Servicio Guerrero','21h20');

INSERT INTO VOLS VALUES (26,'El Dorado International Airport','José Martí international airport',
'Bogota','La Havane','Colombie','Cuba','21/09/27','21/09/27',
'01H00','04H15','Boeing','787-9','789','VV-9990','19.4326° N 99.1332° W',
'15.7975° S 47.8919° W','Aéreo Servicio Guerrero','3h15');

INSERT INTO VOLS VALUES (27,'Budapest Ferenc Liszt International Airport','La Isabela International Airport',
'Budapest','Santo Domingo','Hongrie','Republique Dominicaine','22/01/12','22/01/13',
'16H20','03H20','Boeing','787-9','789','JJ-000H','19.4326° N 99.1332° W',
'15.7975° S 47.8919° W','Aéreo Servicio Guerrero','11h00');

INSERT INTO VOLS VALUES (28,'Václav Havel Airport Prague','King Khalid International Airport',
'Prague','Riyad','République tchèque','Arabie Saoudite','21/10/07','21/10/07',
'13H30','18H55','Airbus','787-9','789','XX-XX56','19.4326° N 99.1332° W',
'15.7975° S 47.8919° W','Aéreo Servicio Guerrero','5h25');

INSERT INTO VOLS VALUES (29,'Tribhuvan International Airport','La Aurora International Airport',
'Katmandou','Guatemala','Népal','Guatémala','21/12/12','21/12/13',
'12H00','07H30','Airbus','787-9','789','QH-225H','19.4326° N 99.1332° W',
'15.7975° S 47.8919° W','Aéreo Servicio Guerrero','19h30');

INSERT INTO VOLS VALUES (30,'Athens International Airport Eleftherios Venizelos','Bujumbura International Airport',
'Athènes','Bujumbura','Grèce','Burundi','21/12/05','21/12/05',
'11H00','17H15','Airbus','787-9','789','LO-FFJJ','19.4326° N 99.1332° W',
'15.7975° S 47.8919° W','Aéreo Servicio Guerrero','6h15');




commit
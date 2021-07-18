--------------------------------------------------------
--  DDL for Table AIRCRAFT
--------------------------------------------------------

  CREATE TABLE "BJ991090"."AIRCRAFT"
   (	"AIRCRAFTNO" NUMBER,
	"MANUFACTURERNO" NUMBER,
	"MODEL" VARCHAR2(32 BYTE)
   ) SEGMENT CREATION IMMEDIATE
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 65536 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "INF3080_20211" ;
--------------------------------------------------------
--  DDL for Table AIRLINE
--------------------------------------------------------

  CREATE TABLE "BJ991090"."AIRLINE"
   (	"AIRLINENO" NUMBER,
	"NAME" VARCHAR2(64 BYTE)
   ) SEGMENT CREATION IMMEDIATE
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 65536 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "INF3080_20211" ;
--------------------------------------------------------
--  DDL for Table AIRPORT
--------------------------------------------------------

  CREATE TABLE "BJ991090"."AIRPORT"
   (	"AIRPORTNO" NUMBER,
	"CITYNO" NUMBER,
	"IATACODE" VARCHAR2(3 BYTE),
	"NAME" VARCHAR2(92 BYTE)
   ) SEGMENT CREATION IMMEDIATE
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 65536 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "INF3080_20211" ;
--------------------------------------------------------
--  DDL for Table CITY
--------------------------------------------------------

  CREATE TABLE "BJ991090"."CITY"
   (	"CITYNO" NUMBER,
	"COUNTRYNO" NUMBER,
	"NAME" VARCHAR2(32 BYTE),
	"LATITUDE" NUMBER(8,6),
	"LONGITUDE" NUMBER(9,6)
   ) SEGMENT CREATION IMMEDIATE
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 65536 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "INF3080_20211" ;
--------------------------------------------------------
--  DDL for Table COUNTRY
--------------------------------------------------------

  CREATE TABLE "BJ991090"."COUNTRY"
   (	"COUNTRYNO" NUMBER,
	"NAME" VARCHAR2(32 BYTE)
   ) SEGMENT CREATION IMMEDIATE
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 65536 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "INF3080_20211" ;
--------------------------------------------------------
--  DDL for Table FLIGHT
--------------------------------------------------------

  CREATE TABLE "BJ991090"."FLIGHT"
   (	"FLIGHTNO" NUMBER,
	"AIRPORTDEPARTURENO" NUMBER,
	"AIRPORTARRIVALNO" NUMBER,
	"AIRCRAFTNO" NUMBER,
	"AIRLINENO" NUMBER,
	"DEPARTURE" TIMESTAMP (6),
	"ARRIVAL" TIMESTAMP (6)
   ) SEGMENT CREATION IMMEDIATE
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 65536 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "INF3080_20211" ;
--------------------------------------------------------
--  DDL for Table MANUFACTURER
--------------------------------------------------------

  CREATE TABLE "BJ991090"."MANUFACTURER"
   (	"MANUFACTURERNO" NUMBER,
	"NAME" VARCHAR2(32 BYTE)
   ) SEGMENT CREATION IMMEDIATE
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 65536 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "INF3080_20211" ;
REM INSERTING into BJ991090.AIRCRAFT
SET DEFINE OFF;
Insert into BJ991090.AIRCRAFT (AIRCRAFTNO,MANUFACTURERNO,MODEL) values (1,2,'787-9');
Insert into BJ991090.AIRCRAFT (AIRCRAFTNO,MANUFACTURERNO,MODEL) values (2,2,'747-200F');
Insert into BJ991090.AIRCRAFT (AIRCRAFTNO,MANUFACTURERNO,MODEL) values (3,1,'A319');
Insert into BJ991090.AIRCRAFT (AIRCRAFTNO,MANUFACTURERNO,MODEL) values (4,1,'A300-600');
Insert into BJ991090.AIRCRAFT (AIRCRAFTNO,MANUFACTURERNO,MODEL) values (5,2,'720B');
Insert into BJ991090.AIRCRAFT (AIRCRAFTNO,MANUFACTURERNO,MODEL) values (6,1,'A380-800');
Insert into BJ991090.AIRCRAFT (AIRCRAFTNO,MANUFACTURERNO,MODEL) values (7,2,'747SP');
Insert into BJ991090.AIRCRAFT (AIRCRAFTNO,MANUFACTURERNO,MODEL) values (8,2,'787-10');
Insert into BJ991090.AIRCRAFT (AIRCRAFTNO,MANUFACTURERNO,MODEL) values (9,2,'777-300');
Insert into BJ991090.AIRCRAFT (AIRCRAFTNO,MANUFACTURERNO,MODEL) values (10,1,'A220-300');
Insert into BJ991090.AIRCRAFT (AIRCRAFTNO,MANUFACTURERNO,MODEL) values (11,1,'A340-300');
Insert into BJ991090.AIRCRAFT (AIRCRAFTNO,MANUFACTURERNO,MODEL) values (12,2,'727-100');
Insert into BJ991090.AIRCRAFT (AIRCRAFTNO,MANUFACTURERNO,MODEL) values (13,1,'A321');
Insert into BJ991090.AIRCRAFT (AIRCRAFTNO,MANUFACTURERNO,MODEL) values (14,1,'A340-500');
Insert into BJ991090.AIRCRAFT (AIRCRAFTNO,MANUFACTURERNO,MODEL) values (15,2,'707');
Insert into BJ991090.AIRCRAFT (AIRCRAFTNO,MANUFACTURERNO,MODEL) values (16,1,'A330-300');
Insert into BJ991090.AIRCRAFT (AIRCRAFTNO,MANUFACTURERNO,MODEL) values (17,2,'717');
Insert into BJ991090.AIRCRAFT (AIRCRAFTNO,MANUFACTURERNO,MODEL) values (18,2,'737-200');
Insert into BJ991090.AIRCRAFT (AIRCRAFTNO,MANUFACTURERNO,MODEL) values (19,1,'A330-200');
REM INSERTING into BJ991090.AIRLINE
SET DEFINE OFF;
Insert into BJ991090.AIRLINE (AIRLINENO,NAME) values (1,'Aéreo Servicio Guerrero');
Insert into BJ991090.AIRLINE (AIRLINENO,NAME) values (2,'Qantas');
Insert into BJ991090.AIRLINE (AIRLINENO,NAME) values (3,'Aero Asia');
Insert into BJ991090.AIRLINE (AIRLINENO,NAME) values (4,'Danish Air Transport');
Insert into BJ991090.AIRLINE (AIRLINENO,NAME) values (5,'Delta');
Insert into BJ991090.AIRLINE (AIRLINENO,NAME) values (6,'British Airways');
Insert into BJ991090.AIRLINE (AIRLINENO,NAME) values (7,'Finnair');
Insert into BJ991090.AIRLINE (AIRLINENO,NAME) values (8,'Hong Kong Airlines Limited');
Insert into BJ991090.AIRLINE (AIRLINENO,NAME) values (9,'Korean Air');
Insert into BJ991090.AIRLINE (AIRLINENO,NAME) values (10,'Lübeck Air');
Insert into BJ991090.AIRLINE (AIRLINENO,NAME) values (11,'Aer Sicilia');
Insert into BJ991090.AIRLINE (AIRLINENO,NAME) values (12,'Iberia');
Insert into BJ991090.AIRLINE (AIRLINENO,NAME) values (13,'Congo Airways');
Insert into BJ991090.AIRLINE (AIRLINENO,NAME) values (14,'Vietnam National Airlines');
Insert into BJ991090.AIRLINE (AIRLINENO,NAME) values (15,'Air Astana');
Insert into BJ991090.AIRLINE (AIRLINENO,NAME) values (16,'Air Canada');
Insert into BJ991090.AIRLINE (AIRLINENO,NAME) values (17,'Bulgaria Air');
Insert into BJ991090.AIRLINE (AIRLINENO,NAME) values (18,'BRA Braathens Regional Airlines');
Insert into BJ991090.AIRLINE (AIRLINENO,NAME) values (19,'EVA Air');
Insert into BJ991090.AIRLINE (AIRLINENO,NAME) values (20,'Aeolian Airlines');
Insert into BJ991090.AIRLINE (AIRLINENO,NAME) values (21,'LOT Polish Airlines');
Insert into BJ991090.AIRLINE (AIRLINENO,NAME) values (22,'Malev Air');
Insert into BJ991090.AIRLINE (AIRLINENO,NAME) values (23,'Czech Airlines');
Insert into BJ991090.AIRLINE (AIRLINENO,NAME) values (24,'Nepal Airlines Corporation');
Insert into BJ991090.AIRLINE (AIRLINENO,NAME) values (25,'Garuda Airlines');
Insert into BJ991090.AIRLINE (AIRLINENO,NAME) values (26,'Aeroflot');
Insert into BJ991090.AIRLINE (AIRLINENO,NAME) values (27,'Japan Airlines');
Insert into BJ991090.AIRLINE (AIRLINENO,NAME) values (28,'Air India');
Insert into BJ991090.AIRLINE (AIRLINENO,NAME) values (29,'Biman Bangladesh Airlines');
Insert into BJ991090.AIRLINE (AIRLINENO,NAME) values (30,'Avianca Express');
REM INSERTING into BJ991090.AIRPORT
SET DEFINE OFF;
Insert into BJ991090.AIRPORT (AIRPORTNO,CITYNO,IATACODE,NAME) values (1,1,'ATH','Athens International Airport Eleftherios Venizelos');
Insert into BJ991090.AIRPORT (AIRPORTNO,CITYNO,IATACODE,NAME) values (2,2,'BUD','Budapest Ferenc Liszt International Airport');
Insert into BJ991090.AIRPORT (AIRPORTNO,CITYNO,IATACODE,NAME) values (3,3,'CBR','Canberra Airport');
Insert into BJ991090.AIRPORT (AIRPORTNO,CITYNO,IATACODE,NAME) values (4,4,'ISB','Islamabad International Airport');
Insert into BJ991090.AIRPORT (AIRPORTNO,CITYNO,IATACODE,NAME) values (5,5,'CPH','Copenhagen Airport (Kastrup)');
Insert into BJ991090.AIRPORT (AIRPORTNO,CITYNO,IATACODE,NAME) values (6,6,'IAD','Dulles International Airport');
Insert into BJ991090.AIRPORT (AIRPORTNO,CITYNO,IATACODE,NAME) values (7,7,'BOG','El Dorado International Airport');
Insert into BJ991090.AIRPORT (AIRPORTNO,CITYNO,IATACODE,NAME) values (8,8,'HND','Haneda Airport');
Insert into BJ991090.AIRPORT (AIRPORTNO,CITYNO,IATACODE,NAME) values (9,9,'DAC','Hazrat Shahjalal International Airport');
Insert into BJ991090.AIRPORT (AIRPORTNO,CITYNO,IATACODE,NAME) values (10,10,'HEL','Helsinki-Vantaa Airpor');
Insert into BJ991090.AIRPORT (AIRPORTNO,CITYNO,IATACODE,NAME) values (11,11,'HKG','Hong Kong International Airport');
Insert into BJ991090.AIRPORT (AIRPORTNO,CITYNO,IATACODE,NAME) values (12,12,'ICN','Incheon International Airport');
Insert into BJ991090.AIRPORT (AIRPORTNO,CITYNO,IATACODE,NAME) values (13,13,'DEL','Indira Gandhi International Airport');
Insert into BJ991090.AIRPORT (AIRPORTNO,CITYNO,IATACODE,NAME) values (14,14,'JRS','Jerusalem International Airport');
Insert into BJ991090.AIRPORT (AIRPORTNO,CITYNO,IATACODE,NAME) values (15,15,'BDA','L.F. Wade International Airport');
Insert into BJ991090.AIRPORT (AIRPORTNO,CITYNO,IATACODE,NAME) values (16,16,'FCO','Leonardo da Vinci–Fiumicino Airport');
Insert into BJ991090.AIRPORT (AIRPORTNO,CITYNO,IATACODE,NAME) values (17,17,'MAD','Madrid-Barajas Adolfo Suárez Airport');
Insert into BJ991090.AIRPORT (AIRPORTNO,CITYNO,IATACODE,NAME) values (18,18,'MEX','Mexico City International Airport');
Insert into BJ991090.AIRPORT (AIRPORTNO,CITYNO,IATACODE,NAME) values (19,19,'FIH','Ndjili Airport');
Insert into BJ991090.AIRPORT (AIRPORTNO,CITYNO,IATACODE,NAME) values (20,20,'HAN','Noi Bai International Airport');
Insert into BJ991090.AIRPORT (AIRPORTNO,CITYNO,IATACODE,NAME) values (21,21,'NQZ','Nursultan Nazarbayev International Airport');
Insert into BJ991090.AIRPORT (AIRPORTNO,CITYNO,IATACODE,NAME) values (22,22,'YOW','Ottawa International Airport');
Insert into BJ991090.AIRPORT (AIRPORTNO,CITYNO,IATACODE,NAME) values (23,23,'SVO','Sheremetyevo International Airport.');
Insert into BJ991090.AIRPORT (AIRPORTNO,CITYNO,IATACODE,NAME) values (24,24,'CGK','Soekarno–Hatta International Airport');
Insert into BJ991090.AIRPORT (AIRPORTNO,CITYNO,IATACODE,NAME) values (25,25,'SOF','Sofia International Airport');
Insert into BJ991090.AIRPORT (AIRPORTNO,CITYNO,IATACODE,NAME) values (26,26,'ARN','Stockholm Arlanda Airport');
Insert into BJ991090.AIRPORT (AIRPORTNO,CITYNO,IATACODE,NAME) values (27,27,'TPE','Taiwan Taoyuan International Airport');
Insert into BJ991090.AIRPORT (AIRPORTNO,CITYNO,IATACODE,NAME) values (28,28,'KTM','Tribhuvan International Airport');
Insert into BJ991090.AIRPORT (AIRPORTNO,CITYNO,IATACODE,NAME) values (29,29,'PRG','Václav Havel Airport Prague');
Insert into BJ991090.AIRPORT (AIRPORTNO,CITYNO,IATACODE,NAME) values (30,30,'WAW','Warsaw Chopin Airport');
Insert into BJ991090.AIRPORT (AIRPORTNO,CITYNO,IATACODE,NAME) values (31,31,'BJM','Bujumbura International Airport');
Insert into BJ991090.AIRPORT (AIRPORTNO,CITYNO,IATACODE,NAME) values (32,32,'JBQ','La Isabela International Airport');
Insert into BJ991090.AIRPORT (AIRPORTNO,CITYNO,IATACODE,NAME) values (33,33,'CAI','Cairo International Airport');
Insert into BJ991090.AIRPORT (AIRPORTNO,CITYNO,IATACODE,NAME) values (34,34,'SJJ','Sarajevo International Airport');
Insert into BJ991090.AIRPORT (AIRPORTNO,CITYNO,IATACODE,NAME) values (35,35,'SIN','Singapore Changi Airport');
Insert into BJ991090.AIRPORT (AIRPORTNO,CITYNO,IATACODE,NAME) values (36,36,'IKA','Imam Khomeini International Airport');
Insert into BJ991090.AIRPORT (AIRPORTNO,CITYNO,IATACODE,NAME) values (37,37,'HAV','José Martí International airport');
Insert into BJ991090.AIRPORT (AIRPORTNO,CITYNO,IATACODE,NAME) values (38,38,'MLA','Malta International Airport');
Insert into BJ991090.AIRPORT (AIRPORTNO,CITYNO,IATACODE,NAME) values (39,39,'EZE','Ministro Pistarini International Airport ');
Insert into BJ991090.AIRPORT (AIRPORTNO,CITYNO,IATACODE,NAME) values (40,40,'SCL','Arturo Merino Benítez International Airport');
Insert into BJ991090.AIRPORT (AIRPORTNO,CITYNO,IATACODE,NAME) values (41,41,'ESB','Ankara Esenboga Airport');
Insert into BJ991090.AIRPORT (AIRPORTNO,CITYNO,IATACODE,NAME) values (42,42,'ADD','Addis Ababa Bole International Airport');
Insert into BJ991090.AIRPORT (AIRPORTNO,CITYNO,IATACODE,NAME) values (43,43,'PEK','Beijing Capital International Airport');
Insert into BJ991090.AIRPORT (AIRPORTNO,CITYNO,IATACODE,NAME) values (44,44,'YXU','London International Airport');
Insert into BJ991090.AIRPORT (AIRPORTNO,CITYNO,IATACODE,NAME) values (45,45,'TXL','Berlin Tegel Airport');
Insert into BJ991090.AIRPORT (AIRPORTNO,CITYNO,IATACODE,NAME) values (46,46,'VIE','Vienna International Airport');
Insert into BJ991090.AIRPORT (AIRPORTNO,CITYNO,IATACODE,NAME) values (47,47,'GYD','Heydar Aliyev International Airport');
Insert into BJ991090.AIRPORT (AIRPORTNO,CITYNO,IATACODE,NAME) values (48,48,'BSB','Brasília–Presidente Juscelino Kubitschek International Airport
');
Insert into BJ991090.AIRPORT (AIRPORTNO,CITYNO,IATACODE,NAME) values (49,49,'KBP','Boryspil International Airport');
Insert into BJ991090.AIRPORT (AIRPORTNO,CITYNO,IATACODE,NAME) values (50,50,'NSI','Yaoundé-Nsimalen International Airport');
Insert into BJ991090.AIRPORT (AIRPORTNO,CITYNO,IATACODE,NAME) values (51,51,'OSL','Oslo Gardermoen Airport');
Insert into BJ991090.AIRPORT (AIRPORTNO,CITYNO,IATACODE,NAME) values (52,52,'LIM','Jorge Chavez International Airport');
Insert into BJ991090.AIRPORT (AIRPORTNO,CITYNO,IATACODE,NAME) values (53,53,'BKK','Suvarnabhumi Airport');
Insert into BJ991090.AIRPORT (AIRPORTNO,CITYNO,IATACODE,NAME) values (54,54,'NBO','Jomo Kenyatta International Airport');
Insert into BJ991090.AIRPORT (AIRPORTNO,CITYNO,IATACODE,NAME) values (55,55,'MNL','Ninoy Aquino International Airport');
Insert into BJ991090.AIRPORT (AIRPORTNO,CITYNO,IATACODE,NAME) values (56,56,'BZV','Maya Maya International Airport');
Insert into BJ991090.AIRPORT (AIRPORTNO,CITYNO,IATACODE,NAME) values (57,57,'CDG','Paris Charles de Gaulle Airport');
Insert into BJ991090.AIRPORT (AIRPORTNO,CITYNO,IATACODE,NAME) values (58,58,'GUA','La Aurora International Airport');
Insert into BJ991090.AIRPORT (AIRPORTNO,CITYNO,IATACODE,NAME) values (59,59,'RUH','King Khalid International Airport');
Insert into BJ991090.AIRPORT (AIRPORTNO,CITYNO,IATACODE,NAME) values (60,60,'NCE','Nice Côte Azur Airport');
REM INSERTING into BJ991090.CITY
SET DEFINE OFF;
Insert into BJ991090.CITY (CITYNO,COUNTRYNO,NAME,LATITUDE,LONGITUDE) values (1,1,'Athènes',37.9838,23.7275);
Insert into BJ991090.CITY (CITYNO,COUNTRYNO,NAME,LATITUDE,LONGITUDE) values (2,2,'Budapest',47.4979,19.0402);
Insert into BJ991090.CITY (CITYNO,COUNTRYNO,NAME,LATITUDE,LONGITUDE) values (3,3,'Canberra',-35.2809,149.13);
Insert into BJ991090.CITY (CITYNO,COUNTRYNO,NAME,LATITUDE,LONGITUDE) values (4,4,'Islamabad',33.6844,73.0479);
Insert into BJ991090.CITY (CITYNO,COUNTRYNO,NAME,LATITUDE,LONGITUDE) values (5,5,'Copenhague',55.6761,12.5683);
Insert into BJ991090.CITY (CITYNO,COUNTRYNO,NAME,LATITUDE,LONGITUDE) values (6,6,'Washington, D.C.',38.9072,-77.0369);
Insert into BJ991090.CITY (CITYNO,COUNTRYNO,NAME,LATITUDE,LONGITUDE) values (7,7,'Bogota',4.711,-74.0721);
Insert into BJ991090.CITY (CITYNO,COUNTRYNO,NAME,LATITUDE,LONGITUDE) values (8,8,'Tokyo',35.6762,139.6503);
Insert into BJ991090.CITY (CITYNO,COUNTRYNO,NAME,LATITUDE,LONGITUDE) values (9,9,'Dacca',23.8103,90.4125);
Insert into BJ991090.CITY (CITYNO,COUNTRYNO,NAME,LATITUDE,LONGITUDE) values (10,10,'Helsinki',60.1699,24.9384);
Insert into BJ991090.CITY (CITYNO,COUNTRYNO,NAME,LATITUDE,LONGITUDE) values (11,11,'Hong Kong',22.3193,114.1694);
Insert into BJ991090.CITY (CITYNO,COUNTRYNO,NAME,LATITUDE,LONGITUDE) values (12,12,'Séoul',37.5665,126.978);
Insert into BJ991090.CITY (CITYNO,COUNTRYNO,NAME,LATITUDE,LONGITUDE) values (13,13,'New Delhi',28.6139,77.209);
Insert into BJ991090.CITY (CITYNO,COUNTRYNO,NAME,LATITUDE,LONGITUDE) values (14,14,'Jésusalem',31.7683,35.2137);
Insert into BJ991090.CITY (CITYNO,COUNTRYNO,NAME,LATITUDE,LONGITUDE) values (15,15,'Hamilton',43.2557,-79.8711);
Insert into BJ991090.CITY (CITYNO,COUNTRYNO,NAME,LATITUDE,LONGITUDE) values (16,16,'Rome',41.9028,12.4964);
Insert into BJ991090.CITY (CITYNO,COUNTRYNO,NAME,LATITUDE,LONGITUDE) values (17,17,'Madrid',40.4168,-3.7038);
Insert into BJ991090.CITY (CITYNO,COUNTRYNO,NAME,LATITUDE,LONGITUDE) values (18,18,'Mexico',19.4326,-99.1332);
Insert into BJ991090.CITY (CITYNO,COUNTRYNO,NAME,LATITUDE,LONGITUDE) values (19,19,'Kinshasa',-4.4419,15.2663);
Insert into BJ991090.CITY (CITYNO,COUNTRYNO,NAME,LATITUDE,LONGITUDE) values (20,20,'Hanoï',21.0278,105.8342);
Insert into BJ991090.CITY (CITYNO,COUNTRYNO,NAME,LATITUDE,LONGITUDE) values (21,21,'Noursoultan',51.1605,71.4704);
Insert into BJ991090.CITY (CITYNO,COUNTRYNO,NAME,LATITUDE,LONGITUDE) values (22,22,'Ottawa',45.4215,-75.6972);
Insert into BJ991090.CITY (CITYNO,COUNTRYNO,NAME,LATITUDE,LONGITUDE) values (23,23,'Moscou',55.7558,37.6173);
Insert into BJ991090.CITY (CITYNO,COUNTRYNO,NAME,LATITUDE,LONGITUDE) values (24,24,'Jakarta',-6.2088,106.8456);
Insert into BJ991090.CITY (CITYNO,COUNTRYNO,NAME,LATITUDE,LONGITUDE) values (25,25,'Sofia',42.6977,23.3219);
Insert into BJ991090.CITY (CITYNO,COUNTRYNO,NAME,LATITUDE,LONGITUDE) values (26,26,'Stockholm',59.3293,18.0686);
Insert into BJ991090.CITY (CITYNO,COUNTRYNO,NAME,LATITUDE,LONGITUDE) values (27,27,'Taipei',25.033,121.5654);
Insert into BJ991090.CITY (CITYNO,COUNTRYNO,NAME,LATITUDE,LONGITUDE) values (28,28,'Katmandou',27.7172,85.324);
Insert into BJ991090.CITY (CITYNO,COUNTRYNO,NAME,LATITUDE,LONGITUDE) values (29,29,'Prague',50.0755,14.4378);
Insert into BJ991090.CITY (CITYNO,COUNTRYNO,NAME,LATITUDE,LONGITUDE) values (30,30,'Varsovie',52.2297,21.0122);
Insert into BJ991090.CITY (CITYNO,COUNTRYNO,NAME,LATITUDE,LONGITUDE) values (31,31,'Bujumbura',-3.3614,29.3599);
Insert into BJ991090.CITY (CITYNO,COUNTRYNO,NAME,LATITUDE,LONGITUDE) values (32,32,'Santo Domingo',18.4861,-69.9312);
Insert into BJ991090.CITY (CITYNO,COUNTRYNO,NAME,LATITUDE,LONGITUDE) values (33,33,'Le Caire',30.0444,31.2357);
Insert into BJ991090.CITY (CITYNO,COUNTRYNO,NAME,LATITUDE,LONGITUDE) values (34,34,'Sarajevo',43.8563,18.4131);
Insert into BJ991090.CITY (CITYNO,COUNTRYNO,NAME,LATITUDE,LONGITUDE) values (35,35,'Singapour',1.3521,103.8198);
Insert into BJ991090.CITY (CITYNO,COUNTRYNO,NAME,LATITUDE,LONGITUDE) values (36,36,'Téhéran',35.6892,51.389);
Insert into BJ991090.CITY (CITYNO,COUNTRYNO,NAME,LATITUDE,LONGITUDE) values (37,37,'La Havane',23.1136,82.3666);
Insert into BJ991090.CITY (CITYNO,COUNTRYNO,NAME,LATITUDE,LONGITUDE) values (38,38,'La Valetta',35.8989,14.5146);
Insert into BJ991090.CITY (CITYNO,COUNTRYNO,NAME,LATITUDE,LONGITUDE) values (39,39,'Buenos Aires',-34.6037,-58.3816);
Insert into BJ991090.CITY (CITYNO,COUNTRYNO,NAME,LATITUDE,LONGITUDE) values (40,40,'Santiago',-33.4489,-70.6693);
Insert into BJ991090.CITY (CITYNO,COUNTRYNO,NAME,LATITUDE,LONGITUDE) values (41,41,'Ankara',39.9334,32.8597);
Insert into BJ991090.CITY (CITYNO,COUNTRYNO,NAME,LATITUDE,LONGITUDE) values (42,42,'Addis-Abeba',8.9806,38.7578);
Insert into BJ991090.CITY (CITYNO,COUNTRYNO,NAME,LATITUDE,LONGITUDE) values (43,43,'Beijing',39.9042,116.4074);
Insert into BJ991090.CITY (CITYNO,COUNTRYNO,NAME,LATITUDE,LONGITUDE) values (44,44,'Londres',51.5074,-0.1278);
Insert into BJ991090.CITY (CITYNO,COUNTRYNO,NAME,LATITUDE,LONGITUDE) values (45,45,'Berlin',52.52,13.405);
Insert into BJ991090.CITY (CITYNO,COUNTRYNO,NAME,LATITUDE,LONGITUDE) values (46,46,'Vienne',48.2082,16.3738);
Insert into BJ991090.CITY (CITYNO,COUNTRYNO,NAME,LATITUDE,LONGITUDE) values (47,47,'Bakou',40.1431,47.5769);
Insert into BJ991090.CITY (CITYNO,COUNTRYNO,NAME,LATITUDE,LONGITUDE) values (48,48,'Brasilia',-15.7975,-47.8919);
Insert into BJ991090.CITY (CITYNO,COUNTRYNO,NAME,LATITUDE,LONGITUDE) values (49,49,'Kiev',50.4501,30.5234);
Insert into BJ991090.CITY (CITYNO,COUNTRYNO,NAME,LATITUDE,LONGITUDE) values (50,50,'Yaoundé',3.848,11.5021);
Insert into BJ991090.CITY (CITYNO,COUNTRYNO,NAME,LATITUDE,LONGITUDE) values (51,51,'Oslo',59.9139,10.7522);
Insert into BJ991090.CITY (CITYNO,COUNTRYNO,NAME,LATITUDE,LONGITUDE) values (52,52,'Lima',-12.0464,-77.0428);
Insert into BJ991090.CITY (CITYNO,COUNTRYNO,NAME,LATITUDE,LONGITUDE) values (53,53,'Bangkok',13.7563,100.5018);
Insert into BJ991090.CITY (CITYNO,COUNTRYNO,NAME,LATITUDE,LONGITUDE) values (54,54,'Nairobi',-1.2921,36.8219);
Insert into BJ991090.CITY (CITYNO,COUNTRYNO,NAME,LATITUDE,LONGITUDE) values (55,55,'Manille',14.5995,120.9842);
Insert into BJ991090.CITY (CITYNO,COUNTRYNO,NAME,LATITUDE,LONGITUDE) values (56,19,'Brazzaville',-4.2634,15.2429);
Insert into BJ991090.CITY (CITYNO,COUNTRYNO,NAME,LATITUDE,LONGITUDE) values (57,56,'Paris',48.8566,2.3522);
Insert into BJ991090.CITY (CITYNO,COUNTRYNO,NAME,LATITUDE,LONGITUDE) values (58,57,'Guatemala',14.6349,-90.5069);
Insert into BJ991090.CITY (CITYNO,COUNTRYNO,NAME,LATITUDE,LONGITUDE) values (59,58,'Riyad',24.7136,46.6753);
Insert into BJ991090.CITY (CITYNO,COUNTRYNO,NAME,LATITUDE,LONGITUDE) values (60,59,'Monaco',43.7384,7.4246);
REM INSERTING into BJ991090.COUNTRY
SET DEFINE OFF;
Insert into BJ991090.COUNTRY (COUNTRYNO,NAME) values (1,'Grèce');
Insert into BJ991090.COUNTRY (COUNTRYNO,NAME) values (2,'Hongrie');
Insert into BJ991090.COUNTRY (COUNTRYNO,NAME) values (3,'Australie');
Insert into BJ991090.COUNTRY (COUNTRYNO,NAME) values (4,'Pakistan');
Insert into BJ991090.COUNTRY (COUNTRYNO,NAME) values (5,'Danemark');
Insert into BJ991090.COUNTRY (COUNTRYNO,NAME) values (6,'États-Unis');
Insert into BJ991090.COUNTRY (COUNTRYNO,NAME) values (7,'Colombie');
Insert into BJ991090.COUNTRY (COUNTRYNO,NAME) values (8,'Japon');
Insert into BJ991090.COUNTRY (COUNTRYNO,NAME) values (9,'Bangladesh');
Insert into BJ991090.COUNTRY (COUNTRYNO,NAME) values (10,'Finlande');
Insert into BJ991090.COUNTRY (COUNTRYNO,NAME) values (11,'Hong Kong');
Insert into BJ991090.COUNTRY (COUNTRYNO,NAME) values (12,'Corée du Sud');
Insert into BJ991090.COUNTRY (COUNTRYNO,NAME) values (13,'Inde');
Insert into BJ991090.COUNTRY (COUNTRYNO,NAME) values (14,'Palestine');
Insert into BJ991090.COUNTRY (COUNTRYNO,NAME) values (15,'Bermudes');
Insert into BJ991090.COUNTRY (COUNTRYNO,NAME) values (16,'Italie');
Insert into BJ991090.COUNTRY (COUNTRYNO,NAME) values (17,'Espagne');
Insert into BJ991090.COUNTRY (COUNTRYNO,NAME) values (18,'Mexique');
Insert into BJ991090.COUNTRY (COUNTRYNO,NAME) values (19,'Congo');
Insert into BJ991090.COUNTRY (COUNTRYNO,NAME) values (20,'Viêt Nam');
Insert into BJ991090.COUNTRY (COUNTRYNO,NAME) values (21,'Kazakhstan');
Insert into BJ991090.COUNTRY (COUNTRYNO,NAME) values (22,'Canada');
Insert into BJ991090.COUNTRY (COUNTRYNO,NAME) values (23,'Russie');
Insert into BJ991090.COUNTRY (COUNTRYNO,NAME) values (24,'Indonésie');
Insert into BJ991090.COUNTRY (COUNTRYNO,NAME) values (25,'Bulgarie');
Insert into BJ991090.COUNTRY (COUNTRYNO,NAME) values (26,'Suède');
Insert into BJ991090.COUNTRY (COUNTRYNO,NAME) values (27,'Taîwan');
Insert into BJ991090.COUNTRY (COUNTRYNO,NAME) values (28,'Népal');
Insert into BJ991090.COUNTRY (COUNTRYNO,NAME) values (29,'République tchèque');
Insert into BJ991090.COUNTRY (COUNTRYNO,NAME) values (30,'Pologne');
Insert into BJ991090.COUNTRY (COUNTRYNO,NAME) values (31,'Burundi');
Insert into BJ991090.COUNTRY (COUNTRYNO,NAME) values (32,'République dominicaine');
Insert into BJ991090.COUNTRY (COUNTRYNO,NAME) values (33,'Égypte');
Insert into BJ991090.COUNTRY (COUNTRYNO,NAME) values (34,'Bosnie-Herzégovine');
Insert into BJ991090.COUNTRY (COUNTRYNO,NAME) values (35,'Singapour');
Insert into BJ991090.COUNTRY (COUNTRYNO,NAME) values (36,'Iran');
Insert into BJ991090.COUNTRY (COUNTRYNO,NAME) values (37,'Cuba');
Insert into BJ991090.COUNTRY (COUNTRYNO,NAME) values (38,'Malte');
Insert into BJ991090.COUNTRY (COUNTRYNO,NAME) values (39,'Argentine');
Insert into BJ991090.COUNTRY (COUNTRYNO,NAME) values (40,'Chili');
Insert into BJ991090.COUNTRY (COUNTRYNO,NAME) values (41,'Turquie');
Insert into BJ991090.COUNTRY (COUNTRYNO,NAME) values (42,'Éthiopie');
Insert into BJ991090.COUNTRY (COUNTRYNO,NAME) values (43,'Chine');
Insert into BJ991090.COUNTRY (COUNTRYNO,NAME) values (44,'Royaume-Uni');
Insert into BJ991090.COUNTRY (COUNTRYNO,NAME) values (45,'Allemagne');
Insert into BJ991090.COUNTRY (COUNTRYNO,NAME) values (46,'Autriche');
Insert into BJ991090.COUNTRY (COUNTRYNO,NAME) values (47,'Azerbaïdjan');
Insert into BJ991090.COUNTRY (COUNTRYNO,NAME) values (48,'Brésil');
Insert into BJ991090.COUNTRY (COUNTRYNO,NAME) values (49,'Ukraine');
Insert into BJ991090.COUNTRY (COUNTRYNO,NAME) values (50,'Cameroun');
Insert into BJ991090.COUNTRY (COUNTRYNO,NAME) values (51,'Norvège');
Insert into BJ991090.COUNTRY (COUNTRYNO,NAME) values (52,'Pérou');
Insert into BJ991090.COUNTRY (COUNTRYNO,NAME) values (53,'Thaîlande');
Insert into BJ991090.COUNTRY (COUNTRYNO,NAME) values (54,'Kenya');
Insert into BJ991090.COUNTRY (COUNTRYNO,NAME) values (55,'Philippines');
Insert into BJ991090.COUNTRY (COUNTRYNO,NAME) values (56,'France');
Insert into BJ991090.COUNTRY (COUNTRYNO,NAME) values (57,'Guatémala');
Insert into BJ991090.COUNTRY (COUNTRYNO,NAME) values (58,'Arabie Saoudite');
Insert into BJ991090.COUNTRY (COUNTRYNO,NAME) values (59,'Monaco');
REM INSERTING into BJ991090.FLIGHT
SET DEFINE OFF;
INSERT INTO BJ991090.FLIGHT (FLIGHTNO, AIRPORTDEPARTURENO, AIRPORTARRIVALNO, AIRCRAFTNO, AIRLINENO, DEPARTURE, ARRIVAL) VALUES (1, 1, 31, 5, 20, TO_TIMESTAMP('2021-12-05 03:15:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF6'), TO_TIMESTAMP('2021-12-05 09:30:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF6'));
INSERT INTO BJ991090.FLIGHT (FLIGHTNO, AIRPORTDEPARTURENO, AIRPORTARRIVALNO, AIRCRAFTNO, AIRLINENO, DEPARTURE, ARRIVAL) VALUES (2, 2, 32, 10, 22, TO_TIMESTAMP('2022-01-12 03:30:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF6'), TO_TIMESTAMP('2022-01-12 14:30:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF6'));
INSERT INTO BJ991090.FLIGHT (FLIGHTNO, AIRPORTDEPARTURENO, AIRPORTARRIVALNO, AIRCRAFTNO, AIRLINENO, DEPARTURE, ARRIVAL) VALUES (3, 3, 33, 2, 2, TO_TIMESTAMP('2021-12-09 12:10:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF6'), TO_TIMESTAMP('2021-12-10 06:25:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF6'));
INSERT INTO BJ991090.FLIGHT (FLIGHTNO, AIRPORTDEPARTURENO, AIRPORTARRIVALNO, AIRCRAFTNO, AIRLINENO, DEPARTURE, ARRIVAL) VALUES (4, 4, 34, 3, 3, TO_TIMESTAMP('2021-12-14 14:30:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF6'), TO_TIMESTAMP('2021-12-14 21:00:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF6'));
INSERT INTO BJ991090.FLIGHT (FLIGHTNO, AIRPORTDEPARTURENO, AIRPORTARRIVALNO, AIRCRAFTNO, AIRLINENO, DEPARTURE, ARRIVAL) VALUES (5, 5, 35, 4, 4, TO_TIMESTAMP('2021-09-08 23:20:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF6'), TO_TIMESTAMP('2021-09-09 12:20:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF6'));
INSERT INTO BJ991090.FLIGHT (FLIGHTNO, AIRPORTDEPARTURENO, AIRPORTARRIVALNO, AIRCRAFTNO, AIRLINENO, DEPARTURE, ARRIVAL) VALUES (6, 6, 36, 5, 5, TO_TIMESTAMP('2021-10-10 01:45:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF6'), TO_TIMESTAMP('2021-10-10 14:55:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF6'));
INSERT INTO BJ991090.FLIGHT (FLIGHTNO, AIRPORTDEPARTURENO, AIRPORTARRIVALNO, AIRCRAFTNO, AIRLINENO, DEPARTURE, ARRIVAL) VALUES (7, 7, 37, 6, 30, TO_TIMESTAMP('2021-09-27 08:30:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF6'), TO_TIMESTAMP('2021-09-27 11:45:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF6'));
INSERT INTO BJ991090.FLIGHT (FLIGHTNO, AIRPORTDEPARTURENO, AIRPORTARRIVALNO, AIRCRAFTNO, AIRLINENO, DEPARTURE, ARRIVAL) VALUES (8, 8, 38, 18, 27, TO_TIMESTAMP('2021-07-12 07:20:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF6'), TO_TIMESTAMP('2021-07-12 20:35:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF6'));
INSERT INTO BJ991090.FLIGHT (FLIGHTNO, AIRPORTDEPARTURENO, AIRPORTARRIVALNO, AIRCRAFTNO, AIRLINENO, DEPARTURE, ARRIVAL) VALUES (9, 9, 39, 14, 29, TO_TIMESTAMP('2021-11-19 06:30:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF6'), TO_TIMESTAMP('2021-11-20 03:50:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF6'));
INSERT INTO BJ991090.FLIGHT (FLIGHTNO, AIRPORTDEPARTURENO, AIRPORTARRIVALNO, AIRCRAFTNO, AIRLINENO, DEPARTURE, ARRIVAL) VALUES (10, 10, 40, 7, 7, TO_TIMESTAMP('2021-08-27 02:20:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF6'), TO_TIMESTAMP('2021-08-27 19:35:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF6'));
INSERT INTO BJ991090.FLIGHT (FLIGHTNO, AIRPORTDEPARTURENO, AIRPORTARRIVALNO, AIRCRAFTNO, AIRLINENO, DEPARTURE, ARRIVAL) VALUES (11, 11, 41, 19, 8, TO_TIMESTAMP('2021-09-02 10:05:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF6'), TO_TIMESTAMP('2021-09-02 20:10:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF6'));
INSERT INTO BJ991090.FLIGHT (FLIGHTNO, AIRPORTDEPARTURENO, AIRPORTARRIVALNO, AIRCRAFTNO, AIRLINENO, DEPARTURE, ARRIVAL) VALUES (12, 12, 42, 9, 9, TO_TIMESTAMP('2021-09-12 12:00:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF6'), TO_TIMESTAMP('2021-09-13 00:00:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF6'));
INSERT INTO BJ991090.FLIGHT (FLIGHTNO, AIRPORTDEPARTURENO, AIRPORTARRIVALNO, AIRCRAFTNO, AIRLINENO, DEPARTURE, ARRIVAL) VALUES (13, 13, 43, 17, 28, TO_TIMESTAMP('2021-10-04 06:10:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF6'), TO_TIMESTAMP('2021-10-04 11:20:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF6'));
INSERT INTO BJ991090.FLIGHT (FLIGHTNO, AIRPORTDEPARTURENO, AIRPORTARRIVALNO, AIRCRAFTNO, AIRLINENO, DEPARTURE, ARRIVAL) VALUES (14, 14, 44, 10, 6, TO_TIMESTAMP('2021-12-30 22:50:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF6'), TO_TIMESTAMP('2021-12-30 04:10:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF6'));
INSERT INTO BJ991090.FLIGHT (FLIGHTNO, AIRPORTDEPARTURENO, AIRPORTARRIVALNO, AIRCRAFTNO, AIRLINENO, DEPARTURE, ARRIVAL) VALUES (15, 15, 45, 11, 10, TO_TIMESTAMP('2021-11-30 10:45:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF6'), TO_TIMESTAMP('2021-11-30 19:15:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF6'));
INSERT INTO BJ991090.FLIGHT (FLIGHTNO, AIRPORTDEPARTURENO, AIRPORTARRIVALNO, AIRCRAFTNO, AIRLINENO, DEPARTURE, ARRIVAL) VALUES (16, 16, 46, 12, 11, TO_TIMESTAMP('2021-07-19 23:55:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF6'), TO_TIMESTAMP('2021-07-20 01:25:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF6'));
INSERT INTO BJ991090.FLIGHT (FLIGHTNO, AIRPORTDEPARTURENO, AIRPORTARRIVALNO, AIRCRAFTNO, AIRLINENO, DEPARTURE, ARRIVAL) VALUES (17, 17, 47, 13, 12, TO_TIMESTAMP('2022-01-02 11:00:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF6'), TO_TIMESTAMP('2022-01-02 17:00:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF6'));
INSERT INTO BJ991090.FLIGHT (FLIGHTNO, AIRPORTDEPARTURENO, AIRPORTARRIVALNO, AIRCRAFTNO, AIRLINENO, DEPARTURE, ARRIVAL) VALUES (18, 18, 48, 1, 1, TO_TIMESTAMP('2021-09-03 05:50:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF6'), TO_TIMESTAMP('2021-09-03 14:50:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF6'));
INSERT INTO BJ991090.FLIGHT (FLIGHTNO, AIRPORTDEPARTURENO, AIRPORTARRIVALNO, AIRCRAFTNO, AIRLINENO, DEPARTURE, ARRIVAL) VALUES (19, 19, 49, 14, 13, TO_TIMESTAMP('2021-11-14 13:05:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF6'), TO_TIMESTAMP('2021-11-14 21:20:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF6'));
INSERT INTO BJ991090.FLIGHT (FLIGHTNO, AIRPORTDEPARTURENO, AIRPORTARRIVALNO, AIRCRAFTNO, AIRLINENO, DEPARTURE, ARRIVAL) VALUES (20, 20, 50, 15, 14, TO_TIMESTAMP('2022-02-10 21:05:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF6'), TO_TIMESTAMP('2021-02-11 10:25:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF6'));
INSERT INTO BJ991090.FLIGHT (FLIGHTNO, AIRPORTDEPARTURENO, AIRPORTARRIVALNO, AIRCRAFTNO, AIRLINENO, DEPARTURE, ARRIVAL) VALUES (21, 21, 51, 16, 15, TO_TIMESTAMP('2021-09-17 20:40:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF6'), TO_TIMESTAMP('2021-09-18 01:55:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF6'));
INSERT INTO BJ991090.FLIGHT (FLIGHTNO, AIRPORTDEPARTURENO, AIRPORTARRIVALNO, AIRCRAFTNO, AIRLINENO, DEPARTURE, ARRIVAL) VALUES (22, 22, 52, 15, 16, TO_TIMESTAMP('2021-11-08 12:50:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF6'), TO_TIMESTAMP('2021-11-08 21:15:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF6'));
INSERT INTO BJ991090.FLIGHT (FLIGHTNO, AIRPORTDEPARTURENO, AIRPORTARRIVALNO, AIRCRAFTNO, AIRLINENO, DEPARTURE, ARRIVAL) VALUES (23, 23, 53, 16, 26, TO_TIMESTAMP('2021-11-24 05:25:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF6'), TO_TIMESTAMP('2021-11-24 14:40:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF6'));
INSERT INTO BJ991090.FLIGHT (FLIGHTNO, AIRPORTDEPARTURENO, AIRPORTARRIVALNO, AIRCRAFTNO, AIRLINENO, DEPARTURE, ARRIVAL) VALUES (24, 24, 54, 6, 25, TO_TIMESTAMP('2021-11-11 04:20:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF6'), TO_TIMESTAMP('2021-11-11 14:30:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF6'));
INSERT INTO BJ991090.FLIGHT (FLIGHTNO, AIRPORTDEPARTURENO, AIRPORTARRIVALNO, AIRCRAFTNO, AIRLINENO, DEPARTURE, ARRIVAL) VALUES (25, 25, 55, 17, 17, TO_TIMESTAMP('2021-10-15 06:15:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF6'), TO_TIMESTAMP('2021-10-15 18:35:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF6'));
INSERT INTO BJ991090.FLIGHT (FLIGHTNO, AIRPORTDEPARTURENO, AIRPORTARRIVALNO, AIRCRAFTNO, AIRLINENO, DEPARTURE, ARRIVAL) VALUES (26, 26, 56, 18, 18, TO_TIMESTAMP('2021-08-19 12:00:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF6'), TO_TIMESTAMP('2021-08-19 09:15:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF6'));
INSERT INTO BJ991090.FLIGHT (FLIGHTNO, AIRPORTDEPARTURENO, AIRPORTARRIVALNO, AIRCRAFTNO, AIRLINENO, DEPARTURE, ARRIVAL) VALUES (27, 27, 57, 19, 19, TO_TIMESTAMP('2021-12-01 18:50:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF6'), TO_TIMESTAMP('2021-12-02 07:35:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF6'));
INSERT INTO BJ991090.FLIGHT (FLIGHTNO, AIRPORTDEPARTURENO, AIRPORTARRIVALNO, AIRCRAFTNO, AIRLINENO, DEPARTURE, ARRIVAL) VALUES (28, 28, 58, 3, 24, TO_TIMESTAMP('2021-12-12 01:30:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF6'), TO_TIMESTAMP('2021-12-12 21:00:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF6'));
INSERT INTO BJ991090.FLIGHT (FLIGHTNO, AIRPORTDEPARTURENO, AIRPORTARRIVALNO, AIRCRAFTNO, AIRLINENO, DEPARTURE, ARRIVAL) VALUES (29, 29, 59, 12, 23, TO_TIMESTAMP('2021-10-07 03:45:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF6'), TO_TIMESTAMP('2021-10-07 09:10:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF6'));
INSERT INTO BJ991090.FLIGHT (FLIGHTNO, AIRPORTDEPARTURENO, AIRPORTARRIVALNO, AIRCRAFTNO, AIRLINENO, DEPARTURE, ARRIVAL) VALUES (30, 30, 60, 8, 21, TO_TIMESTAMP('2021-09-06 10:05:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF6'), TO_TIMESTAMP('2021-09-06 12:20:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF6'));
REM INSERTING into BJ991090.MANUFACTURER
SET DEFINE OFF;
Insert into BJ991090.MANUFACTURER (MANUFACTURERNO,NAME) values (1,'Airbus');
Insert into BJ991090.MANUFACTURER (MANUFACTURERNO,NAME) values (2,'Boeing');

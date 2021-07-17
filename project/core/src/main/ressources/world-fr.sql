SET NAMES utf8;

DROP TABLE IF EXISTS "world";

CREATE TABLE "world"
(
    "id"      int(11) NOT NULL,
    "name"    varchar(75) NOT NULL DEFAULT "",
    "alpha_2" char(2)     NOT NULL DEFAULT "",
    "alpha_3" char(3)     NOT NULL DEFAULT "",
    PRIMARY KEY ("id")
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

INSERT INTO "world" ("id", "name", "alpha_2", "alpha_3")
VALUES (4, "Afghanistan", "af", "afg"),
       (710, "Afrique du Sud", "za", "zaf"),
       (248, "Îles Åland", "ax", "ala"),
       (8, "Albanie", "al", "alb"),
       (12, "Algérie", "dz", "dza"),
       (276, "Allemagne", "de", "deu"),
       (20, "Andorre", "ad", "and"),
       (24, "Angola", "ao", "ago"),
       (660, "Anguilla", "ai", "aia"),
       (10, "Antarctique", "aq", "ata"),
       (28, "Antigua-et-Barbuda", "ag", "atg"),
       (682, "Arabie saoudite", "sa", "sau"),
       (32, "Argentine", "ar", "arg"),
       (51, "Arménie", "am", "arm"),
       (533, "Aruba", "aw", "abw"),
       (36, "Australie", "au", "aus"),
       (40, "Autriche", "at", "aut"),
       (31, "Azerbaïdjan", "az", "aze"),
       (44, "Bahamas", "bs", "bhs"),
       (48, "Bahreïn", "bh", "bhr"),
       (50, "Bangladesh", "bd", "bgd"),
       (52, "Barbade", "bb", "brb"),
       (112, "Biélorussie", "by", "blr"),
       (56, "Belgique", "be", "bel"),
       (84, "Belize", "bz", "blz"),
       (204, "Bénin", "bj", "ben"),
       (60, "Bermudes", "bm", "bmu"),
       (64, "Bhoutan", "bt", "btn"),
       (68, "Bolivie", "bo", "bol"),
       (535, "Pays-Bas caribéens", "bq", "bes"),
       (70, "Bosnie-Herzégovine", "ba", "bih"),
       (72, "Botswana", "bw", "bwa"),
       (74, "Île Bouvet", "bv", "bvt"),
       (76, "Brésil", "br", "bra"),
       (96, "Brunei", "bn", "brn"),
       (100, "Bulgarie", "bg", "bgr"),
       (854, "Burkina Faso", "bf", "bfa"),
       (108, "Burundi", "bi", "bdi"),
       (136, "Îles Caïmans", "ky", "cym"),
       (116, "Cambodge", "kh", "khm"),
       (120, "Cameroun", "cm", "cmr"),
       (124, "Canada", "ca", "can"),
       (132, "Cap-Vert", "cv", "cpv"),
       (140, "République centrafricaine", "cf", "caf"),
       (152, "Chili", "cl", "chl"),
       (156, "Chine", "cn", "chn"),
       (162, "Île Christmas", "cx", "cxr"),
       (196, "Chypre (pays)", "cy", "cyp"),
       (166, "Îles Cocos", "cc", "cck"),
       (170, "Colombie", "co", "col"),
       (174, "Comores (pays)", "km", "com"),
       (178, "République du Congo", "cg", "cog"),
       (180, "République démocratique du Congo", "cd", "cod"),
       (184, "Îles Cook", "ck", "cok"),
       (410, "Corée du Sud", "kr", "kor"),
       (408, "Corée du Nord", "kp", "prk"),
       (188, "Costa Rica", "cr", "cri"),
       (384, "Côte d'Ivoire", "ci", "civ"),
       (191, "Croatie", "hr", "hrv"),
       (192, "Cuba", "cu", "cub"),
       (531, "Curaçao", "cw", "cuw"),
       (208, "Danemark", "dk", "dnk"),
       (262, "Djibouti", "dj", "dji"),
       (214, "République dominicaine", "do", "dom"),
       (212, "Dominique", "dm", "dma"),
       (818, "Égypte", "eg", "egy"),
       (222, "Salvador", "sv", "slv"),
       (784, "Émirats arabes unis", "ae", "are"),
       (218, "Équateur (pays)", "ec", "ecu"),
       (232, "Érythrée", "er", "eri"),
       (724, "Espagne", "es", "esp"),
       (233, "Estonie", "ee", "est"),
       (840, "États-Unis", "us", "usa"),
       (231, "Éthiopie", "et", "eth"),
       (238, "Malouines", "fk", "flk"),
       (234, "Îles Féroé", "fo", "fro"),
       (242, "Fidji", "fj", "fji"),
       (246, "Finlande", "fi", "fin"),
       (250, "France", "fr", "fra"),
       (266, "Gabon", "ga", "gab"),
       (270, "Gambie", "gm", "gmb"),
       (268, "Géorgie (pays)", "ge", "geo"),
       (239, "Géorgie du Sud-et-les îles Sandwich du Sud", "gs", "sgs"),
       (288, "Ghana", "gh", "gha"),
       (292, "Gibraltar", "gi", "gib"),
       (300, "Grèce", "gr", "grc"),
       (308, "Grenade (pays)", "gd", "grd"),
       (304, "Groenland", "gl", "grl"),
       (312, "Guadeloupe", "gp", "glp"),
       (316, "Guam", "gu", "gum"),
       (320, "Guatemala", "gt", "gtm"),
       (831, "Guernesey", "gg", "ggy"),
       (324, "Guinée", "gn", "gin"),
       (624, "Guinée-Bissau", "gw", "gnb"),
       (226, "Guinée équatoriale", "gq", "gnq"),
       (328, "Guyana", "gy", "guy"),
       (254, "Guyane", "gf", "guf"),
       (332, "Haïti", "ht", "hti"),
       (334, "Îles Heard-et-MacDonald", "hm", "hmd"),
       (340, "Honduras", "hn", "hnd"),
       (344, "Hong Kong", "hk", "hkg"),
       (348, "Hongrie", "hu", "hun"),
       (833, "Île de Man", "im", "imn"),
       (581, "Îles mineures éloignées des États-Unis", "um", "umi"),
       (92, "Îles Vierges britanniques", "vg", "vgb"),
       (850, "Îles Vierges des États-Unis", "vi", "vir"),
       (356, "Inde", "in", "ind"),
       (360, "Indonésie", "id", "idn"),
       (364, "Iran", "ir", "irn"),
       (368, "Irak", "iq", "irq"),
       (372, "Irlande (pays)", "ie", "irl"),
       (352, "Islande", "is", "isl"),
       (376, "Israël", "il", "isr"),
       (380, "Italie", "it", "ita"),
       (388, "Jamaïque", "jm", "jam"),
       (392, "Japon", "jp", "jpn"),
       (832, "Jersey", "je", "jey"),
       (400, "Jordanie", "jo", "jor"),
       (398, "Kazakhstan", "kz", "kaz"),
       (404, "Kenya", "ke", "ken"),
       (417, "Kirghizistan", "kg", "kgz"),
       (296, "Kiribati", "ki", "kir"),
       (414, "Koweït", "kw", "kwt"),
       (418, "Laos", "la", "lao"),
       (426, "Lesotho", "ls", "lso"),
       (428, "Lettonie", "lv", "lva"),
       (422, "Liban", "lb", "lbn"),
       (430, "Liberia", "lr", "lbr"),
       (434, "Libye", "ly", "lby"),
       (438, "Liechtenstein", "li", "lie"),
       (440, "Lituanie", "lt", "ltu"),
       (442, "Luxembourg (pays)", "lu", "lux"),
       (446, "Macao", "mo", "mac"),
       (807, "Macédoine du Nord", "mk", "mkd"),
       (450, "Madagascar", "mg", "mdg"),
       (458, "Malaisie", "my", "mys"),
       (454, "Malawi", "mw", "mwi"),
       (462, "Maldives", "mv", "mdv"),
       (466, "Mali", "ml", "mli"),
       (470, "Malte", "mt", "mlt"),
       (580, "Îles Mariannes du Nord", "mp", "mnp"),
       (504, "Maroc", "ma", "mar"),
       (584, "Îles Marshall (pays)", "mh", "mhl"),
       (474, "Martinique", "mq", "mtq"),
       (480, "Maurice (pays)", "mu", "mus"),
       (478, "Mauritanie", "mr", "mrt"),
       (175, "Mayotte", "yt", "myt"),
       (484, "Mexique", "mx", "mex"),
       (583, "États fédérés de Micronésie (pays)", "fm", "fsm"),
       (498, "Moldavie", "md", "mda"),
       (492, "Monaco", "mc", "mco"),
       (496, "Mongolie", "mn", "mng"),
       (499, "Monténégro", "me", "mne"),
       (500, "Montserrat", "ms", "msr"),
       (508, "Mozambique", "mz", "moz"),
       (104, "Birmanie", "mm", "mmr"),
       (516, "Namibie", "na", "nam"),
       (520, "Nauru", "nr", "nru"),
       (524, "Népal", "np", "npl"),
       (558, "Nicaragua", "ni", "nic"),
       (562, "Niger", "ne", "ner"),
       (566, "Nigeria", "ng", "nga"),
       (570, "Niue", "nu", "niu"),
       (574, "Île Norfolk", "nf", "nfk"),
       (578, "Norvège", "no", "nor"),
       (540, "Nouvelle-Calédonie", "nc", "ncl"),
       (554, "Nouvelle-Zélande", "nz", "nzl"),
       (86, "Territoire britannique de l'océan Indien", "io", "iot"),
       (512, "Oman", "om", "omn"),
       (800, "Ouganda", "ug", "uga"),
       (860, "Ouzbékistan", "uz", "uzb"),
       (586, "Pakistan", "pk", "pak"),
       (585, "Palaos", "pw", "plw"),
       (275, "Palestine", "ps", "pse"),
       (591, "Panama", "pa", "pan"),
       (598, "Papouasie-Nouvelle-Guinée", "pg", "png"),
       (600, "Paraguay", "py", "pry"),
       (528, "Pays-Bas", "nl", "nld"),
       (604, "Pérou", "pe", "per"),
       (608, "Philippines", "ph", "phl"),
       (612, "Îles Pitcairn", "pn", "pcn"),
       (616, "Pologne", "pl", "pol"),
       (258, "Polynésie française", "pf", "pyf"),
       (630, "Porto Rico", "pr", "pri"),
       (620, "Portugal", "pt", "prt"),
       (634, "Qatar", "qa", "qat"),
       (638, "La Réunion", "re", "reu"),
       (642, "Roumanie", "ro", "rou"),
       (826, "Royaume-Uni", "gb", "gbr"),
       (643, "Russie", "ru", "rus"),
       (646, "Rwanda", "rw", "rwa"),
       (732, "République arabe sahraouie démocratique", "eh", "esh"),
       (652, "Saint-Barthélemy", "bl", "blm"),
       (659, "Saint-Christophe-et-Niévès", "kn", "kna"),
       (674, "Saint-Marin", "sm", "smr"),
       (663, "Saint-Martin", "mf", "maf"),
       (534, "Saint-Martin", "sx", "sxm"),
       (666, "Saint-Pierre-et-Miquelon", "pm", "spm"),
       (336, "Saint-Siège (État de la Cité du Vatican)", "va", "vat"),
       (670, "Saint-Vincent-et-les-Grenadines", "vc", "vct"),
       (654, "Sainte-Hélène, Ascension et Tristan da Cunha", "sh", "shn"),
       (662, "Sainte-Lucie", "lc", "lca"),
       (90, "Îles Salomon", "sb", "slb"),
       (882, "Samoa", "ws", "wsm"),
       (16, "Samoa américaines", "as", "asm"),
       (678, "Sao Tomé-et-Principe", "st", "stp"),
       (686, "Sénégal", "sn", "sen"),
       (688, "Serbie", "rs", "srb"),
       (690, "Seychelles", "sc", "syc"),
       (694, "Sierra Leone", "sl", "sle"),
       (702, "Singapour", "sg", "sgp"),
       (703, "Slovaquie", "sk", "svk"),
       (705, "Slovénie", "si", "svn"),
       (706, "Somalie", "so", "som"),
       (729, "Soudan", "sd", "sdn"),
       (728, "Soudan du Sud", "ss", "ssd"),
       (144, "Sri Lanka", "lk", "lka"),
       (752, "Suède", "se", "swe"),
       (756, "Suisse", "ch", "che"),
       (740, "Suriname", "sr", "sur"),
       (744, "Svalbard et ile Jan Mayen", "sj", "sjm"),
       (748, "Eswatini", "sz", "swz"),
       (760, "Syrie", "sy", "syr"),
       (762, "Tadjikistan", "tj", "tjk"),
       (158, "Taïwan / (République de Chine (Taïwan))", "tw", "twn"),
       (834, "Tanzanie", "tz", "tza"),
       (148, "Tchad", "td", "tcd"),
       (203, "Tchéquie", "cz", "cze"),
       (260, "Terres australes et antarctiques françaises", "tf", "atf"),
       (764, "Thaïlande", "th", "tha"),
       (626, "Timor oriental", "tl", "tls"),
       (768, "Togo", "tg", "tgo"),
       (772, "Tokelau", "tk", "tkl"),
       (776, "Tonga", "to", "ton"),
       (780, "Trinité-et-Tobago", "tt", "tto"),
       (788, "Tunisie", "tn", "tun"),
       (795, "Turkménistan", "tm", "tkm"),
       (796, "Îles Turques-et-Caïques", "tc", "tca"),
       (792, "Turquie", "tr", "tur"),
       (798, "Tuvalu", "tv", "tuv"),
       (804, "Ukraine", "ua", "ukr"),
       (858, "Uruguay", "uy", "ury"),
       (548, "Vanuatu", "vu", "vut"),
       (862, "Venezuela", "ve", "ven"),
       (704, "Viêt Nam", "vn", "vnm"),
       (876, "Wallis-et-Futuna", "wf", "wlf"),
       (887, "Yémen", "ye", "yem"),
       (894, "Zambie", "zm", "zmb"),
       (716, "Zimbabwe", "zw", "zwe")
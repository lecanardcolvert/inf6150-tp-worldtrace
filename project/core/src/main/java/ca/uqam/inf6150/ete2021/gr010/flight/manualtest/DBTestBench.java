package ca.uqam.inf6150.ete2021.gr010.flight.manualtest;

import java.sql.*;
import java.util.*;

public class DBTestBench {

        public static HashMap<Integer,List<String>> liste = new HashMap<>();

        public static void main (String args []) throws SQLException
        {

            String URL="jdbc:oracle:thin:@zeta2.labunix.uqam.ca:1521:baclab";
            String nomUtilisateur="bj991090";
            String motsDePass="iTfunnzz";

            //etablir une connection
            Scanner sc= new Scanner(System.in);
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            Connection uneConnection = DriverManager.getConnection (URL, nomUtilisateur,motsDePass);

            Statement sql = uneConnection.createStatement() ;
            ResultSet resultat = sql.executeQuery
                    ("SELECT * FROM VOLS ORDER BY noVol ASC" );

            while (resultat.next ()){
                List<String> listeString = new ArrayList<>();

                int noVol = resultat.getInt ("noVol");
                String aeroDep = resultat.getString ("aeroDep");
                String aeroArr = resultat.getString ("aeroArr");
                String villeAeroDep = resultat.getString ("villeAeroDep");
                String villeAeroArriv = resultat.getString ("villeAeroArriv");
                String paysDep = resultat.getString ("paysDep");
                String paysArriv = resultat.getString ("paysArriv");
                String dateDepart = resultat.getString ("dateDepart").substring(0,10);
                String dateArrive = resultat.getString ("dateArrive").substring(0,10);
                String heureDepart = resultat.getString ("heureDepart");
                String heureArriv = resultat.getString ("heureArriv");
                String modelAvion = resultat.getString ("modelAvion");
                String numeroSerieAvion = resultat.getString ("numeroSerieAvion");
                String iata = resultat.getString ("iata");
                String immatric = resultat.getString ("immatric");
                String depCoor = resultat.getString ("depCoor");
                String arrCoor = resultat.getString ("arrCoor");
                String airline = resultat.getString ("airline");
                String tempsVol = resultat.getString ("tempsVol");

                listeString.add(aeroDep);
                listeString.add(aeroArr);
                listeString.add(villeAeroDep);
                listeString.add(villeAeroArriv);
                listeString.add(paysDep);
                listeString.add(paysArriv);
                listeString.add(dateDepart);
                listeString.add(dateArrive);
                listeString.add(heureDepart);
                listeString.add(heureArriv);
                listeString.add(modelAvion);
                listeString.add(numeroSerieAvion);
                listeString.add(iata);
                listeString.add(immatric);
                listeString.add(depCoor);
                listeString.add(arrCoor);
                listeString.add(airline);
                listeString.add(tempsVol);


                System.out.println("\n-------------------");
                System.out.println("Vol numéro : "+noVol);
                System.out.println("-------------------");
                System.out.println ("Nom d'aéroport de départ : " + aeroDep);
                System.out.println ("Nom d'aéroport d'arrivée : " + aeroArr);
                System.out.println ("Ville d'aéroport de départ : " + villeAeroDep);
                System.out.println ("Ville d'aéroport d'arrivée : " + villeAeroArriv);
                System.out.println ("Pays de d'épart : " + paysDep);
                System.out.println ("Pays d'arrivée : " + paysArriv);
                System.out.println ("Date de départ : " + dateDepart);
                System.out.println ("Date d'arrivée : " + dateArrive);
                System.out.println ("Heure de départ : " + heureDepart);
                System.out.println ("Heure d'arrivée' : " + heureArriv + " (par rapport lieu de départ)");
                System.out.println ("Model d'avion : " + modelAvion);
                System.out.println ("Série d'avion : " + numeroSerieAvion);
                System.out.println ("IATA : " + iata);
                System.out.println ("Immatriculation : " + immatric);
                System.out.println ("Coordonées de la ville départ : " + depCoor);
                System.out.println ("Coordonées de la ville d'arrivée : " + arrCoor);
                System.out.println ("Compagnie aérienne : " + airline);
                System.out.println ("Temps de vol : " + tempsVol);
                System.out.println("\n\n-------------------------------------------------------------\n");

                liste.put(noVol,listeString);
            }
            System.out.println("\n\n\n\n---------------------------------------------------------");
            System.out.println("Hashmap à utiliser pour l'affichage des détails sur la carte");
            System.out.println("---------------------------------------------------------\n\n");
            for(Map.Entry<Integer, List<String>> valeurs : liste.entrySet()) {
                System.out.println(valeurs);
            }
            // Fermeture de l'enonce et de la connexion
            sql.close();
            uneConnection.close();
            uneConnection.close();
        }
    }



package ca.uqam.inf6150.ete2021.gr010;

import java.sql.Date;

public class Vols {

    private final long          m_noVol;
    private final String        m_aeroDep;
    private final String        m_aeroArr;
    private final String        m_villeAeroDep;
    private final String        m_villeAeroArriv;
    private final String        m_paysDep;
    private final String        m_paysArriv;
    private final java.sql.Date m_dateDepart;
    private final java.sql.Date m_dateArrive;
    private final String        m_heureDepart;
    private final String        m_heureArriv;
    private final String        m_modelAvion;
    private final String        m_numeroSerieAvion;
    private final String        m_iata;
    private final String        m_immatric;
    private final String        m_depCoor;
    private final String        m_arrCoor;
    private final String        m_airline;
    private final String        m_tempsVol;

    public Vols(
            final long p_noVol,
            final String p_aeroDep,
            final String p_aeroArr,
            final String p_villeAeroDep,
            final String p_villeAeroArriv,
            final String p_paysDep,
            final String p_paysArriv,
            final Date p_dateDepart,
            final Date p_dateArrive,
            final String p_heureDepart,
            final String p_heureArriv,
            final String p_modelAvion,
            final String p_numeroSerieAvion,
            final String p_iata,
            final String p_immatric,
            final String p_depCoor,
            final String p_arrCoor, final String p_airline, final String p_tempsVol) {
        m_noVol            = p_noVol;
        m_aeroDep          = p_aeroDep;
        m_aeroArr          = p_aeroArr;
        m_villeAeroDep     = p_villeAeroDep;
        m_villeAeroArriv   = p_villeAeroArriv;
        m_paysDep          = p_paysDep;
        m_paysArriv        = p_paysArriv;
        m_dateDepart       = p_dateDepart;
        m_dateArrive       = p_dateArrive;
        m_heureDepart      = p_heureDepart;
        m_heureArriv       = p_heureArriv;
        m_modelAvion       = p_modelAvion;
        m_numeroSerieAvion = p_numeroSerieAvion;
        m_iata             = p_iata;
        m_immatric         = p_immatric;
        m_depCoor          = p_depCoor;
        m_arrCoor          = p_arrCoor;
        m_airline          = p_airline;
        m_tempsVol         = p_tempsVol;
    }

    public long getNoVol() {
        return m_noVol;
    }

    public String getAeroDep() {
        return m_aeroDep;
    }

    public String getAeroArr() {
        return m_aeroArr;
    }

    public String getVilleAeroDep() {
        return m_villeAeroDep;
    }

    public String getVilleAeroArriv() {
        return m_villeAeroArriv;
    }

    public String getPaysDep() {
        return m_paysDep;
    }

    public String getPaysArriv() {
        return m_paysArriv;
    }

    public Date getDateDepart() {
        return m_dateDepart;
    }

    public Date getDateArrive() {
        return m_dateArrive;
    }

    public String getHeureDepart() {
        return m_heureDepart;
    }

    public String getHeureArriv() {
        return m_heureArriv;
    }

    public String getModelAvion() {
        return m_modelAvion;
    }

    public String getNumeroSerieAvion() {
        return m_numeroSerieAvion;
    }

    public String getIata() {
        return m_iata;
    }

    public String getImmatric() {
        return m_immatric;
    }

    public String getDepCoor() {
        return m_depCoor;
    }

    public String getArrCoor() {
        return m_arrCoor;
    }

    public String getAirline() {
        return m_airline;
    }

    public String getTempsVol() {
        return m_tempsVol;
    }


}

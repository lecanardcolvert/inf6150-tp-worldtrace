package ca.uqam.inf6150.ete2021.gr010;

import lombok.NonNull;

import java.sql.Date;

public class Vols {

    @NonNull private final long   m_noVol;
    @NonNull private final          String m_aeroDep;
    @NonNull private final String        m_aeroArr;
    @NonNull private final String        m_villeAeroDep;
    @NonNull private final String        m_villeAeroArriv;
    @NonNull private final String        m_paysDep;
    @NonNull private final String        m_paysArriv;
    @NonNull private final java.sql.Date m_dateDepart;
    @NonNull private final java.sql.Date m_dateArrive;
    @NonNull private final String        m_heureDepart;
    @NonNull private final String        m_heureArriv;
    @NonNull private final String        m_modelAvion;
    @NonNull private final String        m_numeroSerieAvion;
    @NonNull private final String        m_iata;
    @NonNull private final String        m_immatric;
    @NonNull private final String        m_depCoor;
    @NonNull private final String        m_arrCoor;
    @NonNull private final String        m_airline;
    @NonNull private final String        m_tempsVol;

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

}

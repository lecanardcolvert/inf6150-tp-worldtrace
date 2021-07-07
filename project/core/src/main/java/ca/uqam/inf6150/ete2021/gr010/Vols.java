package ca.uqam.inf6150.ete2021.gr010;

import lombok.NonNull;

import java.sql.Date;
import java.util.Objects;
import java.util.StringJoiner;

public final class Vols {

    @NonNull private final long          m_noVol;
    @NonNull private final String        m_aeroDep;
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
            @NonNull final long p_noVol,
            @NonNull final String p_aeroDep,
            @NonNull final String p_aeroArr,
            @NonNull final String p_villeAeroDep,
            @NonNull final String p_villeAeroArriv,
            @NonNull final String p_paysDep,
            @NonNull final String p_paysArriv,
            @NonNull final Date p_dateDepart,
            @NonNull final Date p_dateArrive,
            @NonNull final String p_heureDepart,
            @NonNull final String p_heureArriv,
            @NonNull final String p_modelAvion,
            @NonNull final String p_numeroSerieAvion,
            @NonNull final String p_iata,
            @NonNull final String p_immatric,
            @NonNull final String p_depCoor,
            @NonNull final String p_arrCoor,
            @NonNull final String p_airline,
            @NonNull final String p_tempsVol) {
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

    @NonNull
    public String getAeroDep() {
        return m_aeroDep;
    }

    @NonNull
    public String getAeroArr() {
        return m_aeroArr;
    }

    @NonNull
    public String getVilleAeroDep() {
        return m_villeAeroDep;
    }

    @NonNull
    public String getVilleAeroArriv() {
        return m_villeAeroArriv;
    }

    @NonNull
    public String getPaysDep() {
        return m_paysDep;
    }

    @NonNull
    public String getPaysArriv() {
        return m_paysArriv;
    }

    @NonNull
    public Date getDateDepart() {
        return m_dateDepart;
    }

    @NonNull
    public Date getDateArrive() {
        return m_dateArrive;
    }

    @NonNull
    public String getHeureDepart() {
        return m_heureDepart;
    }

    @NonNull
    public String getHeureArriv() {
        return m_heureArriv;
    }

    @NonNull
    public String getModelAvion() {
        return m_modelAvion;
    }

    @NonNull
    public String getNumeroSerieAvion() {
        return m_numeroSerieAvion;
    }

    @NonNull
    public String getIata() {
        return m_iata;
    }

    @NonNull
    public String getImmatric() {
        return m_immatric;
    }

    @NonNull
    public String getDepCoor() {
        return m_depCoor;
    }

    @NonNull
    public String getArrCoor() {
        return m_arrCoor;
    }

    @NonNull
    public String getAirline() {
        return m_airline;
    }

    @NonNull
    public String getTempsVol() {
        return m_tempsVol;
    }

    @Override
    public boolean equals(final Object p_o) {
        if (this == p_o) {
            return true;
        }
        if (p_o == null || getClass() != p_o.getClass()) {
            return false;
        }
        Vols vols = (Vols) p_o;
        return getNoVol() == vols.getNoVol()
               && getAeroDep().equals(vols.getAeroDep())
               && getAeroArr().equals(vols.getAeroArr())
               && getVilleAeroDep().equals(vols.getVilleAeroDep())
               && getVilleAeroArriv().equals(vols.getVilleAeroArriv())
               && getPaysDep().equals(vols.getPaysDep())
               && getPaysArriv().equals(vols.getPaysArriv())
               && getDateDepart().equals(vols.getDateDepart())
               && getDateArrive().equals(vols.getDateArrive())
               && getHeureDepart().equals(vols.getHeureDepart())
               && getHeureArriv().equals(vols.getHeureArriv())
               && getModelAvion().equals(vols.getModelAvion())
               && getNumeroSerieAvion().equals(vols.getNumeroSerieAvion())
               && getIata().equals(vols.getIata())
               && getImmatric().equals(vols.getImmatric())
               && getDepCoor().equals(vols.getDepCoor())
               && getArrCoor().equals(vols.getArrCoor())
               && getAirline().equals(vols.getAirline())
               && getTempsVol().equals(vols.getTempsVol());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNoVol(),
                            getAeroDep(),
                            getAeroArr(),
                            getVilleAeroDep(),
                            getVilleAeroArriv(),
                            getPaysDep(),
                            getPaysArriv(),
                            getDateDepart(),
                            getDateArrive(),
                            getHeureDepart(),
                            getHeureArriv(),
                            getModelAvion(),
                            getNumeroSerieAvion(),
                            getIata(),
                            getImmatric(),
                            getDepCoor(),
                            getArrCoor(),
                            getAirline(),
                            getTempsVol());
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Vols.class.getSimpleName() + "[", "]")
                .add("noVol=" + getNoVol())
                .add("aeroDep='" + getAeroDep() + "'")
                .add("aeroArr='" + getAeroArr() + "'")
                .add("villeAeroDep='" + getVilleAeroDep() + "'")
                .add("villeAeroArriv='" + getVilleAeroArriv() + "'")
                .add("paysDep='" + getPaysDep() + "'")
                .add("paysArriv='" + getPaysArriv() + "'")
                .add("dateDepart=" + getDateDepart())
                .add("dateArrive=" + getDateArrive())
                .add("heureDepart='" + getHeureDepart() + "'")
                .add("heureArriv='" + getHeureArriv() + "'")
                .add("modelAvion='" + getModelAvion() + "'")
                .add("numeroSerieAvion='" + getNumeroSerieAvion() + "'")
                .add("iata='" + getIata() + "'")
                .add("immatric='" + getImmatric() + "'")
                .add("depCoor='" + getDepCoor() + "'")
                .add("arrCoor='" + getArrCoor() + "'")
                .add("airline='" + getAirline() + "'")
                .add("tempsVol='" + getTempsVol() + "'")
                .toString();
    }
}

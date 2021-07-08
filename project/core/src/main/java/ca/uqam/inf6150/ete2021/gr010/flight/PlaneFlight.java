package ca.uqam.inf6150.ete2021.gr010.flight;

import lombok.NonNull;

import java.sql.Date;

public final record PlaneFlight(
        @NonNull long noVol,
        @NonNull String aeroDep,
        @NonNull String aeroArr,
        @NonNull String villeAeroDep,
        @NonNull String villeAeroArriv,
        @NonNull String paysDep,
        @NonNull String paysArriv,
        @NonNull Date dateDepart,
        @NonNull Date dateArrive,
        @NonNull String heureDepart,
        @NonNull String heureArriv,
        @NonNull String modelAvion,
        @NonNull String numeroSerieAvion,
        @NonNull String iata,
        @NonNull String immatric,
        @NonNull String depCoor,
        @NonNull String arrCoor,
        @NonNull String airline,
        @NonNull String tempsVol) {

}

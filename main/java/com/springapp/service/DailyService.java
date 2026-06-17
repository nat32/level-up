package com.springapp.service;

import com.springapp.model.Daily;
import java.util.List;


public interface DailyService {

    /**
     * Fonction qui vérifie le nombre de quotidiennes qui n'ont pas été validés la veille
     * Ensuite elle multiplie ce nombre par 5 ( points à gagner ou perdre de la quotidienne)
     * et retourne le résultat
     * @param user_id
     * @return
     */
    int checkDailiesAndGetPenalty(Integer user_id);

    Daily createDaily(Daily daily);

    List<Daily> getUserDailies(Integer id_user);

    List<Daily> getDoneUserDailies(Integer id_user);

    boolean checkDaily(Integer daily_id);

    Daily getDaily(Integer id);

    boolean updateDaily(Daily daily);

    boolean deleteDaily(Integer daily_id);
}

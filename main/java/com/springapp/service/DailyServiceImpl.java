package com.springapp.service;

import com.springapp.repository.DailyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springapp.model.Daily;

import java.util.List;

import static com.springapp.controller.DailyController.DAILY_POINTS;

@Service("dailyService")
public class DailyServiceImpl implements DailyService {

    @Autowired
    private DailyRepository dailyRepository;


    @Override
    public int checkDailiesAndGetPenalty(Integer user_id) {

        /*
        Get number of Dailies Not Checked
         */

        int dailies_not_done = dailyRepository.countDailiesNotDone(user_id);

        if(dailies_not_done > 0){
            int penalty_points = dailies_not_done * DAILY_POINTS;

            return penalty_points;
        }else{
            return 0;
        }


    }

    @Override
    public Daily createDaily(Daily daily) {
        return dailyRepository.createDaily(daily);
    }

    @Override
    public List<Daily> getUserDailies(Integer id_user) {
        return dailyRepository.getUserDailies(id_user);
    }

    @Override
    public List<Daily> getDoneUserDailies(Integer id_user) {
        return dailyRepository.getDoneUserDailies(id_user);
    }

    @Override
    public boolean checkDaily(Integer daily_id) {
        return dailyRepository.checkDaily(daily_id);
    }

    @Override
    public Daily getDaily(Integer daily_id) {
        return dailyRepository.getDaily(daily_id);
    }

    @Override
    public boolean updateDaily(Daily daily) {
        return dailyRepository.updateDaily(daily);
    }

    @Override
    public boolean deleteDaily(Integer daily_id) {
        return dailyRepository.deleteDaily(daily_id);
    }
}

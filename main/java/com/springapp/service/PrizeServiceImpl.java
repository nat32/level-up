package com.springapp.service;

import com.springapp.model.Prize;
import com.springapp.repository.PrizeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("prizeService")
public class PrizeServiceImpl implements PrizeService {

    @Autowired
    private PrizeRepository prizeRepository;

    @Override
    public Prize createPrize(Prize new_prize) {
        return prizeRepository.createPrize(new_prize);
    }

    @Override
    public List<Prize> getUserPrizes(Integer user_id) {
        return prizeRepository.getUserPrizes(user_id);
    }

    @Override
    public List<Prize> getUserWonPrizes(Integer user_id) {
        return prizeRepository.getUserWonPrizes(user_id);
    }

    @Override
    public List<Prize> getWonPrizes(Integer level_id, Integer user_id) {
        return prizeRepository.getWonPrizes(level_id, user_id);
    }

    @Override
    public void updateWonPrizes(List<Prize> prizes) {
        prizeRepository.updateWonPrizes(prizes);
    }

    @Override
    public Prize getPrizeWithLevel(Integer prize_id) {
        return prizeRepository.getPrizeWithLevel(prize_id);
    }

    @Override
    public boolean updatePrize(Prize prize) {
        return prizeRepository.updatePrize(prize);
    }

    @Override
    public boolean deletePrize(Integer prize_id) {
        return prizeRepository.deletePrize(prize_id);
    }

    @Override
    public Integer checkLevelPrizes(Integer level_id, Integer user_id) {
        return prizeRepository.checkLevelPrizes(level_id, user_id);
    }
}

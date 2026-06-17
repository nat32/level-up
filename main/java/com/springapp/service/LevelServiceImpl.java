package com.springapp.service;

import com.springapp.model.Level;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springapp.repository.LevelRepository;

import java.util.List;

@Service("levelService")
public class LevelServiceImpl implements LevelService {

    @Autowired
    private LevelRepository levelRepository;

    @Override
    public List<Level> findAllLevels() {
        return levelRepository.findAllLevels();
    }

    @Override
    public Level createLevel(Level level) {
        return levelRepository.createLevel(level);
    }

    @Override
    public Level getLevelByNumber(Integer level_number) {
        return levelRepository.getLevelByNumber(level_number);
    }
}

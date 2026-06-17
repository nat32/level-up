package com.springapp.service;

import com.springapp.model.Level;

import java.util.List;

public interface LevelService {

    List<Level> findAllLevels();

    Level createLevel(Level level);

    Level getLevelByNumber(Integer level_number);
}

/*
 * Copyright (c) 2023 BBM AG
 * Melsungen, Germany
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * BBM AG ("Confidential Information").  You shall not disclose such
 * Confidential Information and shall use it only in accordance with
 * the terms of the license agreement you entered into with BBM AG.
 *
 * Created on: 10.01.2023 г.
 */
package com.carinfo.backend.service;

import com.carinfo.backend.model.Engine;
import com.carinfo.backend.repository.EngineRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author stoystbg
 */
@Service
@RequiredArgsConstructor
public class EngineService {

  private final EngineRepository engineRepository;

  public List<Engine> getEngines() {

    return engineRepository.getAllEngines();
  }
}

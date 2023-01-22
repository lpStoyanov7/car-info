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
package com.carinfo.backend.controller;

import com.carinfo.backend.model.Engine;
import com.carinfo.backend.service.EngineService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author stoystbg
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/engines")
public class EngineController {

  private final EngineService engineService;

  @GetMapping
  public List<Engine> getAllEngines() {
    return engineService.getEngines();
  }

  @GetMapping("/{id}")
  public Engine getById(@PathVariable int id) {
    return engineService.getById(id);
  }
}
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
package com.carinfo.backend.model;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

/**
 * @author stoystbg
 */
@Getter
@Setter
public class Manufacturer {

  private String name;
  private LocalDate year;
  private String country;
}
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

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

/**
 * @author stoystbg
 */
@Getter
@Setter
public class Car {

	private Engine engine;
	private Manufacturer manufacturer;
	private LocalDate year;
}

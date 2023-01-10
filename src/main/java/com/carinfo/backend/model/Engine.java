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

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author stoystbg
 */
@Getter
@Setter
@AllArgsConstructor
public class Engine {

	private int id;
	private int power;
	private int capacity;
	private String name;
}

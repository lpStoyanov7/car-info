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
package com.carinfo.backend.repository;

import com.carinfo.backend.model.Engine;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @author stoystbg
 */
@Repository
public class EngineRepository {

	private static List<Engine> list;


	static {
		list = List.of(
				new Engine(1,100, 1600, "FSHFFF23"),
				new Engine(2,200, 2000, "YYY21"),
				new Engine(3, 300,  2500, "31S224")
		);
	}


	public List<Engine> getAllEngines() {
		return list;
	}

	public Engine findById(int id){
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == (id)) {
				return list.get(i);
			}
		}
		return null;
	}
}

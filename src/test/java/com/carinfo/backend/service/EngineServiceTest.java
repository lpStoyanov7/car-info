package com.carinfo.backend.service;

import com.carinfo.backend.repository.EngineRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;

/**
 * @author stoystbg
 */
@RunWith(MockitoJUnitRunner.class)
public class EngineServiceTest {

	@InjectMocks
	private EngineService engineService;
	@Mock
	private EngineRepository engineRepository;

	@Test
	public void getEngines_getAllEngines_repositoryInvoked() {

		engineService.getEngines();
		verify(engineRepository).getAllEngines();
	}
}
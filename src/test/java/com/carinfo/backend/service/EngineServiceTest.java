package com.carinfo.backend.service;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.verify;

import com.carinfo.backend.repository.EngineRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

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

  @Test
  public void getById_givenId_repositoryMethodInvoked() {

    engineService.getById(3);
    verify(engineRepository).findById(anyInt());
  }
}
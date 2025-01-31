package com.yanchware.fractalcloud.samples.quickstart.environments;

import com.yanchware.fractal.sdk.Automaton;
import com.yanchware.fractal.sdk.domain.environment.EnvironmentAggregate;
import com.yanchware.fractal.sdk.domain.exceptions.InstantiatorException;

public class QuickStartEnvironment {
  private final Automaton automaton;
  private final EnvironmentAggregate environmentAggregate;

  public QuickStartEnvironment(Automaton automaton, EnvironmentAggregate environmentAggregate) {
    this.automaton = automaton;
    this.environmentAggregate = environmentAggregate;
  }

  public void instantiate() throws InstantiatorException {
    automaton.instantiate(environmentAggregate);
  }
}

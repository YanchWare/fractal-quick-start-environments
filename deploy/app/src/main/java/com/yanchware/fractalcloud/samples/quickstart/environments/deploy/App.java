package com.yanchware.fractalcloud.samples.quickstart.environments.deploy;

import com.yanchware.fractal.sdk.domain.environment.Secret;
import com.yanchware.fractal.sdk.domain.exceptions.InstantiatorException;
import com.yanchware.fractalcloud.samples.quickstart.environments.Environments;
import com.yanchware.fractalcloud.samples.quickstart.environments.deploy.configuration.EnvVarConfiguration;

import java.util.List;

public class App {
  public static void main(String[] args) throws InstantiatorException {
    var environmentsService = new Environments();

    var configuration = new EnvVarConfiguration();

    var environment = switch (configuration.getEnvironment()) {
      case NON_PRODUCTION -> environmentsService.nonProductionDomainX();
      case PRODUCTION -> environmentsService.productionDomainX();
      default -> throw new InstantiatorException("Invalid environment: " + configuration.getEnvironment());
    };

    environment.instantiate();
  }
}
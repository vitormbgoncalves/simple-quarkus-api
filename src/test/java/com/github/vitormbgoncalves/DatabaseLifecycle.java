package com.github.vitormbgoncalves;

import io.quarkus.test.common.QuarkusTestResourceLifecycleManager;
import io.quarkus.test.junit.QuarkusTest;
import org.testcontainers.containers.MySQLContainer;

import java.util.HashMap;
import java.util.Map;

public class DatabaseLifecycle implements QuarkusTestResourceLifecycleManager {

  private static MySQLContainer<?> MySQL = new MySQLContainer<>("mysql:latest");

  @Override
  public Map<String, String> start() {
    MySQL.start();
    Map<String, String> propriedades = new HashMap<>();
    propriedades.put("quarkus.datasource.jdbc.url", MySQL.getJdbcUrl());
    propriedades.put("quarkus.datasource.username", MySQL.getUsername());
    propriedades.put("quarkus.datasource.password", MySQL.getPassword());
    return propriedades;
  }

  @Override
  public void stop() {
    if (MySQL != null) {
      MySQL.stop();
    }
  }
}

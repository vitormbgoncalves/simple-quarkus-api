package com.github.vitormbgoncalves;

import com.github.database.rider.cdi.api.DBRider;
import com.github.database.rider.core.api.dataset.DataSet;
import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

@QuarkusTest
@DBRider
@QuarkusTestResource(DatabaseLifecycle.class)
public class ProdutoTest {

  @Test
  @DataSet(value = "produtos1.yml")
  public void testOne() {
    Assert.assertEquals(1, Produto.count());
  }
}

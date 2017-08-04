package com.cedarsoft;

import org.assertj.core.api.*;
import org.junit.*;

import java.util.Arrays;
import java.util.List;

/**
 * @author Johannes Schneider (<a href="mailto:js@cedarsoft.com">js@cedarsoft.com</a>)
 */
public class GenericsTest {
  @Test
  public void testGenerics() throws Exception {
    List<? extends String> strings = Arrays.asList("a", "b", "c");
    Assertions.assertThat(strings).hasSize(3);
  }
}

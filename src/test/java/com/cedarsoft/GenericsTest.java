package com.cedarsoft;

import org.assertj.core.api.*;
import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Johannes Schneider (<a href="mailto:js@cedarsoft.com">js@cedarsoft.com</a>)
 */
public class GenericsTest {
  @Test
  public void testGenerics() throws Exception {
    List<? extends String> strings = Arrays.asList("a", "b", "c");
    ListAssert<? extends String> listAssert = Assertions.assertThat(strings);
    listAssert.hasSize(3);
  }

  @Test
  public void testOtherGenerics() throws Exception {
    List strings = new ArrayList();
    strings.add("asdf");
  }
}

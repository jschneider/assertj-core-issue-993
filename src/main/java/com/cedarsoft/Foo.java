package com.cedarsoft;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Johannes Schneider (<a href="mailto:js@cedarsoft.com">js@cedarsoft.com</a>)
 */
public class Foo {
  public Foo() {
    doIt();
  }

  @Deprecated
  public void doIt() {
    List strings = new ArrayList();
    strings.add("asdf");
  }
}

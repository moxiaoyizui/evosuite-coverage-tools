/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 11 18:46:50 GMT 2018
 */

package example;

import org.junit.Test;
import static org.junit.Assert.*;
import example.Foo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = false, useVNET = true, resetStaticState = false, separateClassLoader = true, useJEE = true) 
public class Foo_ESTest extends Foo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Foo foo0 = new Foo();
      boolean boolean0 = foo0.isFoo();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Foo foo0 = new Foo();
      boolean boolean0 = foo0.testMe(131);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Foo foo0 = new Foo();
      foo0.inc();
      assertFalse(foo0.isFoo());
      
      foo0.inc();
      boolean boolean0 = foo0.isFoo();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Foo foo0 = new Foo();
      boolean boolean0 = foo0.testMe(42);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Foo foo0 = new Foo();
      boolean boolean0 = foo0.testMe(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Foo foo0 = new Foo();
      foo0.inc();
      foo0.inc();
      assertTrue(foo0.isFoo());
      
      foo0.inc();
      boolean boolean0 = foo0.isFoo();
      assertFalse(boolean0);
  }
}

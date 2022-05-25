package tests.suite;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.categorii.ITestWithFake;
import tests.teste.AgentieTurismTest;
import tests.teste.PachetTuristicTest;

@RunWith(Categories.class)
@Suite.SuiteClasses({AgentieTurismTest.class, PachetTuristicTest.class})
@Categories.IncludeCategory(ITestWithFake.class)
public class SuiteTestsWithFake {

}

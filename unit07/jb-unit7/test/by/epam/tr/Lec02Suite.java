package by.epam.tr;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import by.epam.tr.start.FunctionTest1;
import by.epam.tr.start.FunctionTest2;

@Suite.SuiteClasses({ FunctionTest1.class,FunctionTest2.class })
@RunWith(Suite.class)
public class Lec02Suite {
}
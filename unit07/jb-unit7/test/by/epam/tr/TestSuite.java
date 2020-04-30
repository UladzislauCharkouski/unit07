package by.epam.tr;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import by.epam.tr.start.JunitTestTaskForTest;
import by.epam.tr.start.JunitTestTaskForTest1;

@Suite.SuiteClasses({ JunitTestTaskForTest.class,JunitTestTaskForTest1.class })
@RunWith(Suite.class)
public class TestSuite {
}
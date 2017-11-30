# JUnit 5 Extensions
http://www.baeldung.com/junit-5-extensions

The purpose of Junit 5 extensions is to extend the behavior of test classes or methods

JUnit 4 version of the library used two types of components for extending a test: test runners and rules.

JUnit 5 extensions are related to a certain event in the execution of a test, referred to as an extension point. When a certain life cycle phase is reached, the JUnit engine calls registered extensions.
Five main types of extension points can be used:
- test instance post-processing
- conditional test execution
- life-cycle callbacks
- parameter resolution
- exception handling




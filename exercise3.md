# Exercise 3

This exercise aims to introduce Pull Requests and Maven as well as logging

## Maven

Create a new project using Maven as a build system. Create a new branch und push to the remote repository

### Pull Requests

If it is not configured, git will not let you push a local branch to a remote repository without that branch present but `git push --set-upstream origin <new branch name>` lets you push to it regardless, creating that branch in the process.

## Building with Maven

Create a new branch for calculations and call each one. Building the project now will create a new `target` folder with the compiled Java classes. The folder structure within will reflect the package it was built from, so here it is `at`, then `campus02` and `bsd` (See ex3_1.png).

### Setting up pom.xml

Add the correct properties to the `pom.xml` file and define a build plugin using the maven-compiler-plugin.

## Logging

Include the Log4J Framework in the `pom.xml` and include it in the Calculator file. Then log first with info, then with error. 
You can see that when running the file now, only the Error will show up while the Information is presumably only written into a log file.

### log4j2.xml

Using a log4j2.xml file allows you to modify the behaviour of the logger. For example you can specify that it should add all logs
to a new file in a specific format.



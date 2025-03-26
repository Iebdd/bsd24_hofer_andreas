# Exercise 3

This exercise aims to introduce Pull Requests and Maven

## Step 1

Create a new project using Maven as a build system. Create a new branch und push to the remote repository

### Step 1.1

If it is not configured, git will not let you push a local branch to a remote repository without that branch present but `git push --set-upstream origin <new branch name>` lets you push to it regardless, creating that branch in the process.

## Step 2

Create a new branch for calculations and call each one. Building the project now will create a new `target` folder with the compiled Java classes. The folder structure within will reflect the package it was built from, so here it is `at`, then `campus02` and `bsd` (See ex3_1.png).

## Step 3

Add the correct properties to the `pom.xml` file and define a build plugin using the maven-compiler-plugin.
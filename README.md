# Java-Automated-Template
A Java template project that integrates ANT, Travis-CI, Coverity and JUnit tests with a public Github repository.
### Project Build Status 
HelloWorld + Unit Tests  | Coverity
------------- | ------------- | 
[![Build Status](https://travis-ci.org/tim-soft/Java-Automated-Template.svg?branch=master)](https://travis-ci.org/tim-soft/Java-Automated-Template) | [![Coverity status](https://scan.coverity.com/projects/6646/badge.svg?flat=1)](https://scan.coverity.com/projects/tim-soft-java-automated-template)
### Usage
This project serves as a starting point for setting up your own continuous integration with Github.
For preliminary messing around, I've included an Eclipse IDE .project file for easy import. 
######If you are using eclipse and want to play with this project:
1. Fork it!
2. Either `clone the project using git` or `import as an existing project using the EGit plugin for Eclipse`, I prefer the latter   
3. `Log into Coverity and Travis-CI using your Github account`
4. `Point these services at your fork'd repo`
5. `Update the code in .travis.yml to reflect your own coverity profile`, this should include:
  * `name: ` 
  * `description: ` 
  * `notification_email: ` 
  * `secure: "You get this from the Coverity Project->Submit Build->Configure Travis-CI page"`
6. `Update the status shields in readme.md to point to your own travis-ci and coverity profiles`
7. After you push this commit and the subsequent travis-ci build passes, `merge master into your coverity_scan branch`. This pull request will initiate Coverity Scan. 

After a few minutes, you should have passing travis-ci and coverity shields in your readme.md!




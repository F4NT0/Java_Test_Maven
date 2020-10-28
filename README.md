# Create Test for Java

#### Install Java Version 14

* To install java 14 on Linux, use the file **

#### Install Maven on Linux

* To install maven on Linux, use the file *install_maven_linux.sh*
  * This is the version from apt package, not the current one

### Create Maven Project

1. Open a terminal and insert the following command: `mvn archetype:generate`
2. Click <kbd>Enter</kbd> to skip the format
3. Click <kbd>Enter</kbd> to skip the version
4. write the **groupId**, the name of the group who is working,example: _com.groupName_.
5. write the **artifactId**, the name of the specified artifact, who creates a JAR, in this moment is just the name of the project,example: _ProjectName_.
6. Click <kbd>Enter</kbd> to skip the version.
7. write the **package** name the same as the artifactId. 

<img src="Images/test-build-maven.gif">

### Test the Maven Project

<img src="Images/maven-test.gif">
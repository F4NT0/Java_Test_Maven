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

**Example**

* Create the Project Classes

<img src="Images/test-build-maven.gif">

### Test the Maven Project

* Start the tests using the command: `mvn test`

<img src="Images/maven-test.gif">

### Install programs on pom.xml

* **pom.xml** is the file with the information and dependencies necessary for the project
* The programs needed to install and the code to insert is:

**Java Version**

* Insert on tag _properties_

```xml
<java.version>14</java.version>
```

**JUnit 5**

* Insert on tag _dependencies_

```xml
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-api</artifactId>
    <version>5.6.2</version>
    <scope>test</scope>
</dependency>
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-engine</artifactId>
    <version>5.6.2</version>
    <scope>test</scope>
</dependency>
```

**HSQLDB**

* More info [Here]([https://mvnrepository.com/artifact/org.hsqldb/hsqldb)
* Insert on tag _dependencies_

```xml
<dependency>
    <groupId>org.hsqldb</groupId>
    <artifactId>hsqldb</artifactId>
    <version>2.5.0</version>
</dependency>
```

**Apache Plugins**

* Insert on tag _pluginManagement_

```xml
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-compiler-plugin</artifactId>
    <version>3.8.1</version>
    <configuration>
        <source>14</source>
        <target>14</target>
        <compilerArgs>
            <arg>--enable-preview</arg>
        </compilerArgs>
    </configuration>
</plugin>
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-surefire-plugin</artifactId>
    <version>3.0.0-M4</version>
    <configuration>
        <argLine>--enable-preview</argLine>
    </configuration>
</plugin>
```

**Example**

<img src="Images/update-pom.gif">

### Update the pom.xml

* Now that we insert on **pom.xml** the projects we need, we need to change the Test file with the package we implement.
* Now that we have **JUnit 5**, we need to change the Test file inserting the imports necessary, like this:

```java
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
```
* and use the Methods like above:

```java
//example
Assertions.assertTrue(true);
```

* After change what it needs, use the following command to install the new packages and test the files in one moment:

```shell
> mvn clean install
```

**Example**

<img src="Images/maven-clean-install.gif">
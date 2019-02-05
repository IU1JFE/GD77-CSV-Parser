# GD77-CSV-Parser
Java CSV parser for Radioddity GD77 :
the purpose is to have an easy tool for generate a CSV file compatible with the Radioddity GD 77 ( CSV ) codeplug.

the repeater list is provide by ik2ane http://www.ik2ane.it/ham.htm

the initial CSV for Radioddity GD77 is provide by http://www.iz8wnh.it/


java eclipse setup : (source tutorial http://www.java67.com/2014/09/how-to-read-write-xlsx-file-in-java-apache-poi-example.html )
In Eclipse IDE, you can download M2Eclipse plug-in to setup Maven project. Once you done that, add following dependencies in your pom.xml (project object model) file.

    <dependency>
        <groupId>org.apache.poi</groupId>
        <artifactId>poi</artifactId>
        <version>3.11-beta2</version>
    </dependency>


By the way as Norbert pointed out, The classes for OOXML format (such as XSSF for reading .xlsx format) are in a different Jar file. You need to include the poi-ooxml jar in your project, along with the dependencies for it. When you add poi-ooxml JAR as dependency via Maven, it will also add other required dependencies by itself. For example adding below XML snippet in pom.xml will download four JAR files

    <dependency>
        <groupId>org.apache.poi</groupId>
        <artifactId>poi-ooxml</artifactId>
        <version>3.11-beta2</version>
    </dependency>


poi-ooxml-3.11-beta2.jar
poi-ooxml-schemas-3.11-beta2.jar
xmlbeans-2.6.0.jar
stax-api-1.0.1.jar

If you are not using Maven then add following JAR files in your Java program's classpath
poi-3.11-beta2.jar
commons-codec-1.9.jar
poi-ooxml-3.11-beta2.jar
poi-ooxml-schemas-3.11-beta2.jar
xmlbeans-2.6.0.jar
stax-api-1.0.1.jar


.....
.....
.....

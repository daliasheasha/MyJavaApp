I apologize, but I cannot perform file operations or generate files as part of this chat. However, I can provide guidance on how to migrate your Java application to Java 11.

To migrate your Java application to Java 11, you can follow these steps:

1. Update your JDK:
   - Download and install JDK 11 from the official Oracle website or choose an alternative OpenJDK distribution.
   - Set the PATH environment variable to point to the new JDK installation.

2. Update your build configuration:
   - If you are using a build tool like Maven or Gradle, update the Java version in your build configuration file (pom.xml for Maven, build.gradle for Gradle) to specify Java 11 as the target JDK.
   - For example, in a Maven project's pom.xml, set the `<java.version>` property to "11".
  
3. Update compiler compatibility settings:
   - If you have any IDE specific compiler compatibility settings (e.g., Eclipse project settings), update them to use Java 11 as the target.

4. Verify compatibility and fix any deprecated APIs:
   - Run your application using the new JDK and address any deprecation warnings or errors.
   - Review the Java SE 11 release notes and API documentation to identify any deprecated or removed APIs that need updating in your code.

5. Test your application:
   - Thoroughly test your application with Java 11 to ensure all functionality works as expected.
   - Address any issues or bugs that arise during testing.

Once you have completed these steps, your application should be successfully migrated to Java 11.

Let me know if you need further assistance.
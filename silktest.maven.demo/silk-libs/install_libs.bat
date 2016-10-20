@ECHO basedir = ${basedir}
@ECHO Importing proprietary dependency silktest-jtf-nodeps.jar
call mvn org.apache.maven.plugins:maven-install-plugin:2.5.2:install-file  -Dfile=silktest-jtf-nodeps.jar -DgroupId=com.borland.silktest -DartifactId=jtf -Dversion=17.0 -Dpackaging=jar
@ECHO Importing proprietary dependency com.borland.silk.keyworddriven.engine.jar
call mvn org.apache.maven.plugins:maven-install-plugin:2.5.2:install-file  -Dfile=com.borland.silk.keyworddriven.engine.jar -DgroupId=com.borland.silktest -DartifactId=keyworddriven.engine -Dversion=17.0 -Dpackaging=jar
@ECHO Importing proprietary dependency com.borland.silk.keyworddriven.jar
call mvn org.apache.maven.plugins:maven-install-plugin:2.5.2:install-file  -Dfile=com.borland.silk.keyworddriven.jar -DgroupId=com.borland.silktest -DartifactId=keyworddriven -Dversion=17.0 -Dpackaging=jar

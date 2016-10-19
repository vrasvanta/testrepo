@ECHO Importing proprietary dependency silktest-jtf-nodeps.jar
call mvn org.apache.maven.plugins:maven-install-plugin:2.5.2:install-file  -Dfile=..\silk-libs\silktest-jtf-nodeps.jar -DgroupId=com.borland.silktest -DartifactId=jtf -Dversion=17.0 -Dpackaging=jar
@ECHO Importing proprietary dependency com.borland.silk.keyworddriven.engine.jar
call mvn org.apache.maven.plugins:maven-install-plugin:2.5.2:install-file  -Dfile=..\silk-libs\com.borland.silk.keyworddriven.engine.jar -DgroupId=com.borland.silktest -DartifactId=keyworddriven.engine -Dversion=17.0 -Dpackaging=jar
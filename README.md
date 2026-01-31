# crud-servlet
ide - eclipse
database - mysql workbench
## step 1: create a maven repository, uncheck the checkbox
           search in filter apache.maven, scroll down chose maven-archtype-webapp
## step 2: if there is no src/main/java or src/main/resources manually create it
## step 3: add dependencies from maven repository
           lombok
           jakarta servlet api
           javax servlet api
           hibernate core
           mysql connector j
## step 4: create persistence.xml in META-INF folder (src/main/resources)
## step 5: add jsp files in webapp (if no webapp folder present manually create it
## step 6: choose server (project > properties > targetted runtimes > apache tomcat)
## step 7: run the project (project > run as > run on server > choose apache tomcat)

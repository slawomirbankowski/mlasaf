liquibase --driver=org.postgresql.Driver --classpath=./libstatic/postgresql-9.4.1210.jar --changeLogFile=./src/main/resources/db/db_1.0.xml --url="jdbc:postgresql://localhost:5432/mlasaf2" --logLevel=DEBUG --username=postgres --password=%1 migrate

liquibase --driver=oracle.jdbc.OracleDriver --classpath=./libstatic/ojdbc6.jar --changeLogFile=./src/main/resources/db/db_1.0.xml --url="jdbc:oracle:thin:@localhost:1521:xe" --logLevel=DEBUG --username=SYSTEM --password=systempass migrate


liquibase --driver=com.mysql.jdbc.Driver --classpath=./libstatic/mysql-connector-java-3.0.1-beta-bin.jar --changeLogFile=./src/main/resources/db/db_1.0.xml --url="jdbc:mysql://Edytka-Komputer/mlasaf01" --logLevel=DEBUG --username=root --password=rootpass migrate



liquibase --driver=com.mysql.jdbc.Driver --classpath=./libstatic/mysql-connector-java-5.1.45-bin.jar --changeLogFile=./src/main/resources/db/db_1.0.xml --url="%MLASAF_JDBC%" --logLevel=DEBUG --username=%MLASAF_USER% --password=%MLASAF_PASS% migrate

liquibase --driver=com.microsoft.sqlserver.jdbc.SQLServerDriver --classpath=./libstatic/sqljdbc4.1.jar --changeLogFile=./src/main/resources/db/db_1.0.xml --url="%MLASAF_DDL_JDBC%" --logLevel=DEBUG --username="%MLASAF_DDL_USER%" --password="%MLASAF_DDL_PASS%" migrate



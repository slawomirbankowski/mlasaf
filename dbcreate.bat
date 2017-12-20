liquibase --driver=org.postgresql.Driver --classpath=./libstatic/postgresql-9.4.1210.jar --changeLogFile=./src/main/resources/db/db_1.0.xml --url="jdbc:postgresql://localhost:5432/mlasaf11" --logLevel=DEBUG --username=postgres --password=postgrespass migrate

liquibase --driver=oracle.jdbc.OracleDriver --classpath=./libstatic/ojdbc6.jar --changeLogFile=./src/main/resources/db/db_1.0.xml --url="jdbc:oracle:thin:@localhost:1521:xe" --logLevel=DEBUG --username=SYSTEM --password=systempass migrate
liquibase --driver=oracle.jdbc.OracleDriver --classpath=./libstatic/ojdbc6.jar --changeLogFile=./src/main/resources/db/db_1.0.xml --url="jdbc:oracle:thin:@localhost:1521:xe" --logLevel=DEBUG --username=mlasaf11 --password=mlasaf11pass migrate

liquibase --driver=com.mysql.jdbc.Driver --classpath=./libstatic/mysql-connector-java-5.1.45-bin.jar --changeLogFile=./src/main/resources/db/db_1.0.xml --url="jdbc:mysql://localhost:3307/mlasaf09" --logLevel=DEBUG --username=root --password=rootpass migrate

liquibase --driver=com.ibm.db2.jcc.DB2Driver --classpath=./libstatic/db2jcc4-10.1.jar --changeLogFile=./src/main/resources/db/db_1.0.xml --url="jdbc:db2://localhost:50000/mlasaf01" --logLevel=DEBUG --username=db2admin --password=db2adminpass migrate

liquibase --driver=com.microsoft.sqlserver.jdbc.SQLServerDriver --classpath=./libstatic/sqljdbc4.1.jar --changeLogFile=./src/main/resources/db/db_1.0.xml --url="jdbc:sqlserver://localhost\SQLEXPRESS2014;DatabaseName=mlasaf07" --logLevel=DEBUG --username="sa" --password="sapass" migrate



# mlasaf
Machine Learning project


/* DICTIONARY - type of executors: LOCAL, SPARK, R, SSAS, ... */
create table executorType(
	executorTypeId int not null,
	executorTypeName varchar(4000) not null,
	executorTypeClass varchar(4000) not null,
	primary key (executorTypeId)
);
insert into executorType(executorTypeId, executorTypeName, executorTypeClass) values (1, 'LOCAL', 'com.machinelearning.executor.LocalExecutor');
/** public interface Executor { executeML(); } */
/*
SQL: select * from executorType
*/
create index idx_executorType_executorTypeName on executorType(executorTypeName);


/* instance of executor to run machine learning algorithms */
create table executorInstance(
	executorInstanceId int not null,
	executorTypeId int not null,
	executorInstanceHost varchar(4000) not null,
	executorInstanceName varchar(4000) not null,
	isRunning int not null,
	portNumber int not null,
	insertedRowDate timestamp not null,
	guid bigint not null,
	endDate timestamp,
	primary key (executorInstanceId)
);
create index idx_executorInstance_executorTypeId on executorInstance(executorTypeId);
create index idx_executorInstance_executorInstanceHost on executorInstance(executorInstanceHost);

/*
insert into executorInstance(executorInstanceId, executorTypeId, executorInstanceHost, executorInstanceName, isRunning, portNumber) values (1, 1, 'localhost', 'LOCAL', 0, 8300);
insert into executorInstance(executorInstanceId, executorTypeId, executorInstanceHost, executorInstanceName, isRunning, portNumber) values (2, 1, 'localhost', 'LOCAL', 0, 8301);
insert into executorInstance(executorInstanceId, executorTypeId, executorInstanceHost, executorInstanceName, isRunning, portNumber) values (3, 1, 'localhost', 'LOCAL', 0, 8302);
*/
/*
SQL: select * from executorInstance
*/



/** DICTIONARY - type of storage for downlading data from source: LOCAL_DISK, HDFS, DB */
create table executorStorageType(
	executorStorageTypeId int,
	executorStorageTypeName varchar(4000),
	executorStorageTypeClass varchar(4000),
	primary key (executorStorageTypeId)
);
create index idx_executorStorageType_executorStorageTypeName on executorStorageType(executorStorageTypeName);

insert into executorStorageType(executorStorageTypeId, executorStorageTypeName, executorStorageTypeClass) values (1, 'LOCAL_DISK', 'com.machinelearning.storage.LocalDiskStorage');
insert into executorStorageType(executorStorageTypeId, executorStorageTypeName, executorStorageTypeClass) values (2, 'HDFS', 'com.machinelearning.storage.HdfsStorage');
insert into executorStorageType(executorStorageTypeId, executorStorageTypeName, executorStorageTypeClass) values (3, 'DB', 'com.machinelearning.storage.DbStorage');
/** public interface StorageType { put(Data); Data get(...); String getBasePath(); public String getInstanceHost(); Object[] getData();  } */


/** storage for executor to run algorithm on */
create table executorStorage(
	executorInstanceId int,
	parentStorageId int,
	executorStorageId int,
	insertedRowDate timestamp not null,
	guid bigint,
	executorStorageTypeId int,
	storageBasePath varchar(4000),
	storageFulllPath varchar(4000),
	primary key (executorInstanceId, parentStorageId)
);
create index idx_executorStorage_parentStorageId on executorStorage(parentStorageId);
create index idx_executorStorage_executorStorageId on executorStorage(executorStorageId);
create index idx_executorStorage_executorStorageTypeId on executorStorage(executorStorageTypeId);

insert into executorStorage(executorStorageId, executorInstanceId, executorStorageTypeId, storageBasePath) values (1, 1, 1, './data');

/** storage for executor to run algorithm on */
create table executorStorage(
);

/* DICTIONARY - type of source - JDBC, FTP */
create table sourceType(
	sourceTypeId int not null,
	sourceTypeName varchar(4000) not null,
	sourceTypeClass varchar(4000) not null,
	primary key (sourceTypeId)
);
create index idx_sourceType_sourceTypeName on sourceType(sourceTypeName);

insert into sourceType(sourceTypeId, sourceTypeName, sourceTypeClass) values (1, 'JDBC', 'com.machinelearning.sources.JdbcSource');
insert into sourceType(sourceTypeId, sourceTypeName, sourceTypeClass) values (2, 'FTP', 'com.machinelearning.sources.FtpSource');
insert into sourceType(sourceTypeId, sourceTypeName, sourceTypeClass) values (3, 'LOCAL', 'com.machinelearning.sources.LocalDiskSource');


/* instance of source - specific JDBC with connection string, user, password and table/view/SQL query */
create table sourceInstance(
	sourceInstanceId int not null,
	sourceTypeId int not null,
	sourceInstanceName varchar(4000) not null,
	errorCount int not null default (0),
	correctCount int not null default (0),
	lastStatus varchar(4000) not null default (''),
	lastConnectionDate timestamp,
	primary key (sourceInstanceId)
);
create index idx_sourceInstance_sourceTypeId on sourceInstance(sourceTypeId);


/** DICTIONARY  */
create table sourceParam(
	sourceParamId int not null,
	sourceParamName varchar(4000) not null,
	sourceParamType varchar(4000) not null,
	possibleValues varchar(8000),
	primary key (sourceParamId)
);
create index idx_sourceParam_sourceParamName on sourceParam(sourceParamName);

insert into sourceParam(sourceParamId, sourceParamName, sourceParamType,  possibleValues) values (1, 'Connection String', 'String', 'jdbc:sqlserver://host:port/dbname|jdbc:mysql://host:port/dbname');
insert into sourceParam(sourceParamId, sourceParamName, sourceParamType) values (2, 'User', 'String');
insert into sourceParam(sourceParamId, sourceParamName, sourceParamType) values (3, 'Password', 'String');
insert into sourceParam(sourceParamId, sourceParamName, sourceParamType, possibleValues) values (4, 'Driver Class', 'String', '');
insert into sourceParam(sourceParamId, sourceParamName, sourceParamType) values (5, 'FTP Host', 'String');
insert into sourceParam(sourceParamId, sourceParamName, sourceParamType) values (6, 'FTP Port', 'Int');


/** DICTIONARY - mapping between source type like FTP or JDBC and parameters */
create table sourceTypeParam(
	sourceTypeId int,
	sourceParamId int,
	isRequired int,
	primary key (sourceTypeId, sourceParamId)
);
insert into sourceTypeParam(sourceTypeId, sourceParamId, isRequired) values (1, 1, 1);
insert into sourceTypeParam(sourceTypeId, sourceParamId, isRequired) values (1, 2, 1);
insert into sourceTypeParam(sourceTypeId, sourceParamId, isRequired) values (1, 3, 1);
insert into sourceTypeParam(sourceTypeId, sourceParamId, isRequired) values (1, 4, 0);
insert into sourceTypeParam(sourceTypeId, sourceParamId, isRequired) values (2, 5, 1);
insert into sourceTypeParam(sourceTypeId, sourceParamId, isRequired) values (2, 6, 1);
insert into sourceTypeParam(sourceTypeId, sourceParamId, isRequired) values (2, 2, 1);
insert into sourceTypeParam(sourceTypeId, sourceParamId, isRequired) values (2, 3, 1);


/* value of param for given source instance */
create table sourceParamValue(
	sourceInstanceId int not null,
	sourceParamId int not null,
	sourceParamValueId int not null,
	sourceParamValueVersion bigint not null,
	insertedRowDate timestamp not null,
	paramValue varchar(4000) not null,
	primary key (sourceInstanceId, sourceParamId, sourceParamValueId)
);


/** view in the source - could be folder in FTP, file in FTP, table or view in database, method in WebService */
create table sourceView(
	sourceViewId int not null,
	sourceInstanceId int not null,
	sourceViewDefinition varchar(4000) not null -- for jdbc this should be SQL or table name
);


create table sourceViewColumn(
	sourceViewId int not null,
	sourceViewColumnId int not null,
	insertedRowDate timestamp not null,
	guid bigint,
	columnName varchar(4000) not null,
	columnMinValue varchar(4000),
	columnMaxValue varchar(4000),
	columnNonemptyCount int not null,
	primary key (sourceViewId, sourceViewColumnId)
);


/** schedule to download source view to local storage */
create table sourceSchedule(
	sourceScheduleId int not null,
	sourceViewId int not null,
	insertedRowDate timestamp not null,
	guid bigint,
	executorStorageId int not null,
	onDemand int not null,
	startTime timestamp not null,
	interval bigint not null,
	primary key (sourceScheduleId)
);


/* run of source and download data to local/global storage */
create table sourceDownload(
	sourceScheduleId int not null,
	sourceDownloadId int not null,
	storagePath varchar(4000) not null,
	viewSize bigint,
	viewRowsCount bigint,
	lastUpdatedDate timestamp,
	insertedRowDate timestamp not null,
	isRunning int not null default 0,
	isFinished int not null default 0,
	isExcecption int not null default 0,
	primary key (sourceScheduleId, sourceDownloadId)
);


/** DICTIONARY - type of algorithm */
create table algorithmType(
	algorithmTypeId int not null,
	algorithmTypeName varchar(4000) not null,
	primary key (algorithmTypeId)
);
insert into algorithmType(algorithmTypeId, algorithmTypeName) values (1, 'Prediction');
insert into algorithmType(algorithmTypeId, algorithmTypeName) values (2, 'Classification');
insert into algorithmType(algorithmTypeId, algorithmTypeName) values (3, 'Market Basket');
insert into algorithmType(algorithmTypeId, algorithmTypeName) values (4, 'Outlier Detection');
insert into algorithmType(algorithmTypeId, algorithmTypeName) values (5, 'Sentiment');
/* public interface AlgorithmType */
/* public AlgorithmFactory { createAlgorithmForType(...); */


/** DICTIONARY - implementation of algorithm */
create table algorithmImplementation(
	algorithmImplementationId int not null,
	algorithmTypeId int not null,
	executorTypeId int not null, -- type of executor that supports this algorithm
	algorithmImplementationName varchar(4000) not null,
	algorithmImplementationClass varchar(4000)
);

create index idx_algorithmImplementation_algorithmImplementationName on algorithmImplementation(algorithmImplementationName);


insert into algorithmInstance(algorithmImplementationId, algorithmTypeId, executorTypeId, algorithmInstanceName, algorithmInstanceClass) values (1, 1, 1, 'Simple Local SMA5 Prediction', 'com.machinelearning.algorithm.SimplleLocalSma5Prediction')
/* public interface AlgorithmInstance { run(Executor, Storage, Output) ??? }*/


/* DICTIONARY - parameter needed to run algorithm */
create table algorithmParam(
	algorithmParamId int not null,
	algorithmParamName varchar(4000) not null,
	algorithmParamType varchar(4000) not null,
	defaultValue varchar(4000) not null
);
insert into algorithmParam(algorithmParamId, algorithmParamName, algorithmParamType, defaultValue) values (1, 'Prediction Times', 'Int', '');
insert into algorithmParam(algorithmParamId, algorithmParamName, algorithmParamType, defaultValue) values (2, 'Classification Alpha Whatever', 'Double', '');


/* DICTIONARY - type of column to be used for ML algorithm */
create table algorithmColumnType(
	algorithmColumnTypeId int not null,
	algorithmColumnTypeName varchar(4000) not null,
	algorithmColumnTypeDescription varchar(4000) not null
);
insert into algorithmColumnType(algorithmColumnTypeId, algorithmColumnTypeName, algorithmColumnTypeDescription) values (1, 'Group', '');
insert into algorithmColumnType(algorithmColumnTypeId, algorithmColumnTypeName, algorithmColumnTypeDescription) values (2, 'Time', '');
insert into algorithmColumnType(algorithmColumnTypeId, algorithmColumnTypeName, algorithmColumnTypeDescription) values (3, 'PredictionValue', '');
insert into algorithmColumnType(algorithmColumnTypeId, algorithmColumnTypeName, algorithmColumnTypeDescription) values (4, 'Feature', '');
insert into algorithmColumnType(algorithmColumnTypeId, algorithmColumnTypeName, algorithmColumnTypeDescription) values (5, 'Label', '');


/** DICTIONARY - mapping between algorithm type like Prediction or Classification and column type to be mapped from downloaded data */
create table algorithmTypeColumnType(
	algorithmTypeId int not null,
	algorithmColumnTypeId int not null,
	allowMultiple int not null,
	emptyAllowed int not null
);
insert into algorithmTypeColumnType(algorithmTypeId, algorithmColumnTypeId, allowMultiple, emptyAllowed) values (1, 2, 0, 0)
insert into algorithmTypeColumnType(algorithmTypeId, algorithmColumnTypeId, allowMultiple, emptyAllowed) values (1, 1, 1, 0)
insert into algorithmTypeColumnType(algorithmTypeId, algorithmColumnTypeId, allowMultiple, emptyAllowed) values (1, 3, 0, 0)


/** schedule of run algorithm for given instance and parameters on given executor */
create table algorithmSchedule(
	algorithmScheduleId int not null,
	algorithmImplementationId int not null,
	algorithmScheduleName varchar(4000) not null,
	isScheduled int not null
);


create table algorithmScheduleViewType(
	algorithmScheduleViewTypeId int not null,
	algorithmScheduleViewTypeName varchar(4000) not null
);
insert into algorithmScheduleViewType(algorithmScheduleViewTypeId, algorithmScheduleViewTypeName) values (1, 'PRIMARY');
insert into algorithmScheduleViewType(algorithmScheduleViewTypeId, algorithmScheduleViewTypeName) values (2, 'TRAINING');
insert into algorithmScheduleViewType(algorithmScheduleViewTypeId, algorithmScheduleViewTypeName) values (3, 'TESTING');
insert into algorithmScheduleViewType(algorithmScheduleViewTypeId, algorithmScheduleViewTypeName) values (3, 'TESTING');


create table algorithmScheduleView(
	algorithmScheduleId int not null,
	sourceViewId int not null,
	parentSourceViewId int,
	joinOn varchar(4000)
);


create table algorithmScheduleParam(
	algorithmScheduleId int not null,
	algorithmParamId int not null,
	algorithmParamValue varchar(8000) not null,
);


/** column mapped for schedule to */
create table algorithmScheduleColumn(
	algorithmScheduleId int,
	algorithmColumnTypeId int,
	sourceViewId int not null,
	sourceViewColumnId int,
	extendedProperties varchar(4000)
);


/* run of algorithm for given schedule that contains instance of algorithm, storage and downloaded view */
create table algorithmRun(
	algorithmScheduleId int,
	executorInstanceId int,
	executorStorageId int,
	algorithmRunId int,
	sourceDownloadId int,
	runDate timestamp,
	isRunning int,
	isFinished int
);


/** schedule of run algorithm for given instance and parameters on given executor */
create table algorithmOutput(
	algorithmScheduleId int,
	algorithmRunId int,
	algorithmOutputId int,
	outputPath varchar(4000)
);







ml-executor-local
	storages
		storage1 : local_disk, { type=disk, path: /etc/storage1 }
		storage2 : db, path: { type=db, jdbc=jdbc:postgresql://host:port/dbname, user=abc, pass=xyz }
	algorithms :
		LocalPredictionSma5 : Prediction
		LocalClassificationNgrams : TextClassification
	downloads:
		data001 : Source(ABC), path: ./data/data001/, columns: ...
		data002: Source(BCD), path: ./data/data002/, columns: ...
	schedules:
		schedule001: algorithm:LocalPredictionSma5
		schedule002: algorithm:LocalPredictionOtherAlgo
	executions:
		execution001: schedule001, date: ...
		execution002: schedule001, date: ..., output:
	outputs:
		output001: storage: storage1, path: ./data/
	visualizations:
		vis001:

ml-executor-r
	storages
		storage3: local_disk
		storage4: local_disk
	algorithms:
		RClassificationAlgo : VectorClassification
		RTimeSeriesPrediction:  Prediction

ml-executor-spark
	storages
		storage4
	algorithms
		SparkPrediction : Prediction
		algorithm7 :
		algorithm8

ml-executor-weka
	storages
		storage5 : local_disk
		storage6 : local_disk
		storage7 : local_disk
	algorithms
		algorithm9 :

ml-executor-sas

ml-rest

ml-ui






Dao.registerExecutor(hostName, executorType, executorGuid, startTime)

Context {
	CommonRest rest; // REST for UI to get/set data to DB
	Executor[] executors;
	ExecutorFactory factory;
	Source[] sources;
	DaoFactory faoFactory;
	addExecutor(params);
	refreshSources();
}
CommonRest {
	Context parentContext;
	int portNumber;
}
Executor {
	Context parentContext;
	int executorInstanceId;
	Storage[] storages;
	AlgorithmFactory algoFactory;
	Schedule[] schedules;
	Execution execution;  // current execution
	ExecutorRest rest; // REST service for given executor to get output data
	initialize(Params); // initialize algorithms for factory, storages, schedules
	heartbeat();
	readAlgorithmTypes();
	refreshSchedules();
	refreshStorages();
}

ExecutorFactory {
	Executor createExecutor(...)
}

SourceFactory {
	Source createSource(...);
}

Source {
	Context parentContext;
	SourceView[] views;
	Date createdDate;
	Date lastUpdateDate;
	initialize(Params); // set parameters, initialize, connect or check
	boolean isValid();
	SourceView[] getSourceViews();
	DownloadingProcess downloadView();
}
	SourceBase : Source
	SourceView { viewName, viewDefinition, viewEstimateSize();   downloadView(Storage) : DownloadedView }
	DownloadedView { Storage storage, storageDefinition; SourceView view;  }

DaoFactory {
	createDao(...)
}

DownloadingProcess {
	String[] getHeader();
	Object[] getNextRow();
	insertIntoStorage(Object[]);  // ???
}

JdbcSource : Source
FtpSource : Source

ExecutorBase : Executor;
	SparkExecutor : ExecutorBase
	RExecutor : ExecutorBase;
	WekaExecutor : ExecutorBase;


AlgorithmFactory.createAlgorithmByName(String algorithmName)
AlgorithmFactory.createAlgorithmByClass(String className)

TableView : SourceView
SqlView : SourceView
FileView : SourceView
FolderView : SourceView

Storage {
	Executor parentExecutor;
	Downloads[] downloads;
	Outputs[] outputs;
	getStorageType();
}

Schedule {
	Execution[] executions;
}

AlgorithmInstance { run(DownloadedView, Output)  isSupportedStorage(Storage) }


AlgorithmExecution {  AlgorithmInstance, Output }
Output {  }
Algorithm

ExecutorEntry.main( ExecutorClassList, portNumber, executorConfig);
RestEntry.main()


Context {
	CommonRest rest {
		Context parentContext;
		int portNumber;
	}
	Executor[] executors [{
		Context parentContext;
		int executorInstanceId;
		Storage[] storages [{
			Executor parentExecutor;
			StorageDownload[] downloads [{

			}]
			Outputs[] outputs [{

			}]
			getStorageType();
		}]
		AlgorithmFactory algoFactory {
			Context parentContext;
		}
		Schedule[] schedules [{
			Executor parentExecutor;
			AlgorithmExecution[] historicalExecutions;
		}]
		AlgorithmExecution executionInProgress {
			Executor parentExecutor;
			int executionId;
			Storage destinationStorage;
			AlgorithmInstance algorithmInstance;
			AlgorithmParameter[] algorithmParams;
			StorageDownload[] algorithmFiles;
			AlgorithmMapping[] mappings;
		}
		ExecutorRest rest {
			Context parentContext;
		}
	}]
	ExecutorFactory factory {
	}
	Source[] sources [ {
		Context parentContext;
		int sourceId;
		SourceView[] views [{
			viewName;
			viewDefinition;
			viewEstimateSize;
			downloadView(Storage);
		}]
		Date createdDate;
		Date lastUpdateDate;
		initialize(Params); // set parameters, initialize, connect or check
		String getSourceDefinition();
		boolean isValid();
		SourceView[] getSourceViews();
		DownloadingProcess downloadView();
	}]
	DaoFactory faoFactory {
	}
}


/*

- SOURCE - source of data to download from: FTP, JDBC, SHARED_FOLDER, WEB, REST
- EXECUTOR - agent to run machine learning algorithms: LOCAL_AGENT/Java/Weka, SPARK_AGENT, R_AGENT,
- STORAGE - storage for store downloaded data from source, storage could be: LOCAL_DISK, JDBC, HDFS
jdbc = jdbc:postgresql://localhost:5432/ml-framework
user: ml-framework-user
pass: ml-framework-pass

java -cp "" com.machinelearning.executor.ExecutorEntry "jdbc" "user" "pass" "EXECUTOR_TYPE" "port" "params"
java -cp "" com.machinelearning.db.CreateDb "jdbc" "user" "pass" "newpass"
-- postgresql change password for user

java -cp "" com.machinelearning.rest.RestEntry "jdbc" "user" "pass" "port"

java -cp "" com.machinelearning.ui.LocalUIEntry "" ???



*/

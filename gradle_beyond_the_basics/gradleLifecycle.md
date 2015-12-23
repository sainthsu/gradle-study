###Gradle Lifecycle

#####initialization

start up and locate s the build files it must process.

#####configuration

executes each build file as a Groovy script.the effect of configuration is not the actual execution of build file actions but rather the creation of a directed acyclic graph(DAG) of task objects

#####execution

identifies the tasks in the task DAG that must be executed,and executes them in dependency order.
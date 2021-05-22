# agendamento-email


jdk-14
wildfly20
mysql
mysqlconnector-java

wildfly-20.0.1.Final\bin>jboss-cli.bat
module add --name=com.mysql --resources="{Local em que o .jar está salvo}" --dependencies=javax.api,javax.transaction.api

C:\alura\wildfly-20.0.1.Final\bin>jboss-cli.bat
jms-queue add --queue-address=EmailQueue --entries=java:/jms/queue/EmailQueue

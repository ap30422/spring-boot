FROM tomcat:8.5.27-slim

ADD target/*.war /usr/local/tomcat/webapps/



RUN rm -rf /usr/local/tomcat/webapps/examples \
    && rm -rf /usr/local/tomcat/webapps/docs \
    && rm -rf /usr/local/tomcat/webapps/host-manager \
    && rm -rf /usr/local/tomcat/webapps/manager \
    && rm -rf /usr/local/tomcat/webapps/ROOT \
    && mv /usr/local/tomcat/webapps/health.war /usr/local/tomcat/webapps/ROOT.war
EXPOSE 8080
WORKDIR /opt/health
CMD ["catalina.sh", "run"]

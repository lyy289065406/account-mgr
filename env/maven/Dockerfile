FROM ubuntu:18.04

RUN sed -i s@/archive.ubuntu.com/@/mirrors.aliyun.com/@g /etc/apt/sources.list
RUN apt-get clean && \
    apt-get update -y && \
    apt-get install -y python3 vim maven openjdk-8-jdk

RUN mv /usr/share/maven/conf/settings.xml /usr/share/maven/conf/settings.xml_bak
ADD ./settings.xml /usr/share/maven/conf/settings.xml

RUN echo -e "export JAVA_HOME=/usr/lib/jvm/java-8-openjdk-amd64\nexport CLASSPATH=.:\${JAVA_HOME}/lib:\${JAVA_HOME}/jre/lib\nexport PATH=\${JAVA_HOME}/bin:\${PATH}" >> /etc/profile

CMD ["/bin/sh"]
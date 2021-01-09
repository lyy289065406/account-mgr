FROM mysql:8.0.22


RUN sed -i s@/deb.debian.org/@/mirrors.aliyun.com/@g /etc/apt/sources.list
RUN apt-get clean && \
    apt-get update -y && \
    apt install -y procps wget


# 安装 JDK 1.8 （清华源）
RUN wget -P /tmp https://mirrors.tuna.tsinghua.edu.cn/AdoptOpenJDK/8/jdk/x64/linux/OpenJDK8U-jdk_x64_linux_hotspot_8u275b01.tar.gz
RUN tar -xvf /tmp/OpenJDK8U-jdk_x64_linux_hotspot_8u275b01.tar.gz -C /usr/local/src/
RUN echo "export JAVA_HOME=/usr/local/src/jdk8u275-b01\nexport CLASSPATH=.:\${JAVA_HOME}/lib/dt.jar:\${JAVA_HOME}/lib/tools.jar\nexport PATH=\${JAVA_HOME}/bin:\${PATH}" >> /etc/profile
RUN /bin/bash -c "source /etc/profile"


# 安装 Maven
RUN mkdir -p /usr/share/man/man1/
RUN apt-get install -y maven=3.6.0-1
RUN mv /usr/share/maven/conf/settings.xml /usr/share/maven/conf/settings.xml_bak
ADD ./maven/settings.xml /usr/share/maven/conf/settings.xml


EXPOSE 80
EXPOSE 3306
WORKDIR /opt/ruoyi
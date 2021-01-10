FROM mysql:8.0.22


RUN sed -i s@"# alias l"@"alias l"@g /root/.bashrc && \
    sed -i s@/deb.debian.org/@/mirrors.aliyun.com/@g /etc/apt/sources.list && \
    apt-get clean && \
    apt-get update -y && \
    apt-get install -y net-tools vim procps wget


# 安装 JDK 1.8 （清华源）
RUN wget -P /tmp https://mirrors.tuna.tsinghua.edu.cn/AdoptOpenJDK/8/jdk/x64/linux/OpenJDK8U-jdk_x64_linux_hotspot_8u275b01.tar.gz && \
    tar -xvf /tmp/OpenJDK8U-jdk_x64_linux_hotspot_8u275b01.tar.gz -C /usr/local/src/ && \
    echo "export JAVA_HOME=/usr/local/src/jdk8u275-b01\nexport CLASSPATH=.:\${JAVA_HOME}/lib/dt.jar:\${JAVA_HOME}/lib/tools.jar\nexport PATH=\${JAVA_HOME}/bin:\${PATH}" >> /root/.bashrc && \
    /bin/bash -c "source /root/.bashrc"


# 安装 Maven
RUN mkdir -p /usr/share/man/man1/ && \
    apt-get install -y maven=3.6.0-1
ADD ./maven/settings.xml /usr/share/maven/conf/settings.xml


EXPOSE 80
EXPOSE 3306
WORKDIR /opt/ruoyi
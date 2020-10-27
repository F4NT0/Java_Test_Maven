#!/bin/bash

echo "[Instalando Java 14 em seu computador]"
sudo add-apt-repository ppa:linuxuprising/java
sudo apt -y install oracle-java14-installer
sudo apt -y install oracle-java14-set-default
java --version
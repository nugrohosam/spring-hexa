#!/bin/bash

mvn clean package

java -jar ./ms-launcher/target/ms-launcher-1.0-SNAPSHOT.jar
#!/bin/bash

nohup java -jar \
/opt/workshop/workshop-0.0.1-SNAPSHOT.jar \
> /opt/workshop/app.log 2>&1 &

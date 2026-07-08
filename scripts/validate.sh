#!/bin/bash

for i in {1..10}
do
  curl -f http://localhost:8080 && exit 0
  sleep 5
done

exit 1

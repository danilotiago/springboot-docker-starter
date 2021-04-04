#!/bin/bash

./dockerize -wait tcp://db:3306 -timeout 60s

rm -rf dockerize

java -jar app.jar
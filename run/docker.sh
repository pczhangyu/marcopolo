#!/usr/bin/env bash
docker run --name feecn_marcopolo -d -p 5432:5432 -e POSTGRES_PASSWORD=123456 -e PGDATA=/data/ -e POSTGRES_USER=admin -e POSTGRES_DB=my_db postgres:9.5.6



#!/usr/bin/env bash

set -eo pipefail

source config.sh

modules=( admin-dashboard hystrix-dashboard service-a service-b zuul )

for module in "${modules[@]}"; do
    docker build -t "${REGISTRY}/spring-cloud-consul-example-${module}:latest" ${module}
    docker push "${REGISTRY}/spring-cloud-consul-example-${module}:latest"
done

cat docker-compose.alauda.yml | \
sed "s/{{ALB_IP}}/${ALB_IP}/g" | \
sed "s/{{GIT_HOST}}/${GIT_HOST}/g" | \
sed "s/{{REGISTRY}}/${REGISTRY}/g" | \
sed "s/{{REGION}}/${REGION}/g" | \
sed "s/{{NGINX}}/${NGINX}/g"  \
> tmp/alauda-tmp.yaml

echo "use alauda-tmp.yaml to deploy the app"
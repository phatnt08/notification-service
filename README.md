```bash
# pull mongodb
docker pull mongo:latest

# Run MongoDB with username and password
docker run --network my-network --name mongodb -p 27017:27017 -e MONGO_INITDB_ROOT_USERNAME=root -e MONGO_INITDB_ROOT_PASSWORD=root mongo:latest

# Optionally, build and tag the image for pushing to a Docker registry
docker build -t phatnt8888/notification-service:1.0.0 .

# Push the tagged image to the Docker registry
docker image push phatnt8888/notification-service:1.0.0

# Pull iamge just push to docke hub
docker pull phatnt8888/notification-service:1.0.0

# Run docker image phatnt8888/notification-service:0.9.0 on docker desktop
docker run --network my-network --name notification-service -p 8083:8083 -e DB_URL=mongodb://root:root@mongodb:27017/notification-service?authSource=admin phatnt8888/notification-service:1.0.0

```
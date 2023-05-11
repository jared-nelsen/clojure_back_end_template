
build:
	docker build --no-cache -t priora_backend .

run:
	docker run -d -p 3000:3000 --name priora_backend priora_backend

stop:
	docker stop priora_backend
	docker rm priora_backend
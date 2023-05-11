
build:
	docker build --no-cache -t my_project .

run:
	docker run -d -p 3000:3000 --name my_project my_project

stop:
	docker stop my_project
	docker rm my_project
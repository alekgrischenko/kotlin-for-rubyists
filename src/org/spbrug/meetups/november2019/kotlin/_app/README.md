# Talent

Vacancies service

## Usage

### Docker Compose prerequisites

```bash
cp .env.example .env
# adjust configuration settings to meet your needs
```

### Running development Docker container

```bash
cp .docker/app/.env.dev.example .docker/app/.env.dev
cp .docker/postgres/.env.example .docker/postgres/.env
# adjust configuration settings to meet your needs
docker-compose up -d app-dev
docker-compose exec app-dev gradle bootRun
```

### Running production Docker container

```bash
cp .docker/app/.env.prod.example .docker/app/.env.prod
# adjust configuration settings to meet your needs
docker-compose up -d app-prod
```

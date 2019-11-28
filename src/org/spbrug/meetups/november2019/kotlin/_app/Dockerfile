ARG JDK_VERSION
ARG JRE_VERSION

# build stage
FROM ${JDK_VERSION} AS build

ENV APP_HOME=/opt/app

RUN mkdir -p ${APP_HOME}

WORKDIR ${APP_HOME}

COPY build.gradle.kts settings.gradle.kts gradle.properties ./
COPY src src

RUN gradle build -x test

## run stage
FROM ${JRE_VERSION}

ARG APP_PORT

LABEL maintainer="a3.filatov@itransition.com"

ENV APP_HOME=/opt/app

RUN mkdir -p ${APP_HOME}

WORKDIR ${APP_HOME}

COPY --from=build ${APP_HOME}/build/libs/vacancies-api-*.jar ./app.jar

EXPOSE ${APP_PORT}

CMD ["java", "-jar", "app.jar", "--spring.profiles.active=prod"]

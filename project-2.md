# Project 2

It's time to build another full-stack application but instead leveraging Spring for the application server along with React as our Frontend! The concept and functionality for this application will be up to you and your teammates! Requirements below:

## High-Level Requirements

Application must leverage the full stack:

-   Azure SQL for persistence
-   API built with Java 8 and Spring 5
-   UI built with React

### Technology framework requirements:

-   Java API will leverage the Spring Framework
-   Java API will use Spring Data JPA to communicate with the DB
-   Java API will be RESTful
-   Java API will be unit tested using JUnit and Mockito, with coverage reports generated using Jacoco
-   Complete CI/CD pipelines will use Azure DevOps

### Other requirements:

-   Application will demonstrate at least ten individual user stories
-   Application's own data model must be sufficiently complex (i.e. >2 tables)
-   SQL DB will be deployed to the cloud
-   Java API will be deployed to the cloud (Azure DevOps)
-   UI application will be deployed to the cloud (Azure Static Website on Azure Storage)
-   Java API will have >=80% test (line) coverage for service layer with validations (Used EclEmma or JaCoCo plugin to generate these reports)
-   Java API will leverage Spring's MockMvc for integration/e2e tests of controller endpoints
-   Java API will be adequately documented (Java Docs and web endpoint documentation [Swagger/OpenAPI])
-   At least one external API must be leveraged

# Required Challenges:

-   Frontend: Needs to leverage either BootStrap-React or MaterialUI
      - [React Bootstrap Documentation](https://react-bootstrap.github.io/)
      - [Material UI Documentation](https://mui.com/material-ui/getting-started/overview/)
       - [MaterialUI also appears to need to run the following with React18 (have no tested yet, can always drop the React to 17 to in your package.json as well)](https://namespaceit.com/blog/mui-installation-doesnt-work-with-react-18)
-   Backend: Deploy the spring boot application to CI/CD pipeline
  - Resources: 
     - [Deploy a sping boot application to azure](https://dev.to/azure/the-easy-way-to-deploy-a-spring-boot-application-to-production-on-azure-2joi)
     - [App Service Java Docs](https://docs.microsoft.com/en-us/azure/app-service/quickstart-java?pivots=platform-linux&tabs=javase)
# Suggested bonus goals:

-   Secure your Java API using JWTs
-   React UI will have >= 80% test (line) coverage for all custom components (confirmed by Jest coverage report)
-   Spring Security

## Other Thoughts

The project concepts must be approved by the trainer. Remember to keep user stories clear and unambiguous. Keep in mind that you only have 2 weeks to work on this project so make your MVP something attainable. In addition to your project proposal, your teams should be structured with one team leader and a person or persons who fulfill the role of Gitflow manager and DevOps engineer. **DO NOT** divide the work into API and UI for the team members, everyone should have a hand in ALL aspects of this application.

## Repositories

In order to make your repositories accessible to your Azure Accounts via Azure DevOps Pipelines/Github Actions, it is recommended that you create two repositories under your own personal account. One team member can host the repo for the API and another member can host the repo for the UI. Both must leverage the Azure CI/CD pipeline

## Presentations

Presentations will occur on the morning of Friday, June 17th, 2022. All team members must have a speaking role in the presentation of the application, and a **PowerPoint slideshow** must accompany your frontend demo. Aim for 15min.

Note this project will be presented to the anchor client (in a slightly shorter context) on Thursday, June 23rd, 2022 (Tentative)

# slack-notifications

[!image] (http://www.geonetsolutions.co.uk/wp-content/uploads/2015/05/huge-slack-logo-on-white.png)

## Why?
To alert the FT about important repeat events, like greeting them on Mondays and reminding them about timesheets on Fridays.

## Pre-Requisites
Git, Java, Gradle. Everything else should download the first time you run the test, thanks to Gradle.

## How?
- Set the `HOME_CHANNEL` variable to the slack hook for the room
- Run with `./gradlew test --tests [specific test]`

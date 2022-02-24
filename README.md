# Lab: 08 -- OO Design and GSON

## Quotes App

This quotes app reads a "recentquotes.json" file located in the resources folder (`quotes/app/src/main/resources`) and prints out a random quote and the author's name. Alternatively the app can be run with arguments to search for a random quote of a specific author or by a quote that contains the searched text. Currently text is case sensitive.

### Team

- **Robb Alexander**
- **Kevin LaMarca**
- **Ben Mills**

### Instructions

Run via the command line from inside the `quotes` folder.
- Tests: `./gradlew test`
- Random quote: `./gradlew run`
- Search with "author" as the first argument and the search term as the second
  - Search terms with spaces need to be surrounded by single quotes.
  - `./gradlew run --args "author 'Albert Einstein'"`
  - `./gradlew run --args "author 'Charles Dickens'"`
- Search with "contains" as the first argument and the search term as the second
  - Again search terms with spaces need to be surrounded by single quotes.
  - `./gradlew run --args "contains love"`
  - `./gradlew run --args "contains 'Darkness cannot drive out darkness'"`

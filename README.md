PlayFrameworkTemperature
==========================

## What is

This is a purely demonstrative project .
This app simulates a temperature sensor that make some measurements during a day and show the graph of these measurements.
This app, furthermore, shows the graph of possible bad measurements.

## How it's implemented

This app show how use *PlayFramework 2.3.x* with *MongoDB* and *JavaScript*.

Precisely, it was implemented using  **PlayFramework (Java)**, **MaterializeCSS**, **JQuery** and **FlotChart JS** and **CoffeScript**.

All custom JavaScript code is written in CoffeeScript for a better result and increase performance.

The database is based on **MongoDB**, but shortly I will develop the variant with **OrientDB**.

The project is entirely in material design and *100%* responsive. 
Test it ;)

## Installation

To use this app, you must have  installed **MongoDB**, **Java** > = 7  and PHP with MongoDB extension.

If you're sure of this, follow the instructions:

+ Clone the repository.
+ Go into the folder of cloned project
+ Launch the php script that fills the mongo database whit fake measurements data, by type this command:
```bash
php insert_data.php
```
+ Form the folder, type the command:

```bash 
activator
```
+ Waiting for the resolutions and the downloads of dependencies

+ After that type that type the command:
```bash
run
```
Ok, now in your *localhost*, maybe at port *9000* (depends on your system), you'll find the running app :)
Try it and watch the source code.

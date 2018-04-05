TestAWARE Code Library

The testing tool

Android Project

2016 version

TestAWARE is a laboratory-oriented testing tool for mobile context-aware applications. It enables developers to systematically test context-aware applications in laboratory settings. It can be installed on Android devices.

This is an example app with TestAWARE Code Library.

If you are interested in the mechanisms, please read the paper [1].

Dependencies: http://www.awareframework.com/

https://glados.kis.agh.edu.pl/doku.php?id=pub:software:contextsimulator:start

Citation: [1] Chu Luo, Miikka Kuutila, Simon Klakegg, Denzil Ferreira, Huber Flores, Jorge Goncalves, Mika Mäntylä and Vassilis Kostakos. 2017. TestAWARE: A Laboratory-Oriented Testing Tool for Mobile Context-Aware Applications. Proceedings of the ACM on Interactive, Mobile, Wearable and Ubiquitous Technologies (IMWUT) , 1, 3, Article 80 (September 2017), 29 pages. URL: https://doi.org/10.1145/3130945


A.1. Code Examples
// to do an assertion, use API

library_result.logResult(getApplicationContext(), "Name of Test",
        "Context Values or Description", "Expected Value", "Actual Value", "Assertion");

// to record Machine learning result, use API

library_result.logResult(getApplicationContext(), "Name of Test",
        "Context Values or Description", "Expected Class", "Actual Class", "Classification");

// to input a device power model, use API

library_powerModel.addPowerModel(getApplicationContext(),
        "Device Name", "Sensor Name", "Sensor Speed", powerUse);

//to log processing time, use API

library_time.logStartTime();

library_time.logStopTime(getApplicationContext(), "Name of Test");

//to start replay, use API

library_sendCommand.setSpeed(speed);

library_sendCommand.setStartTimestamp(startTimestamp);

library_sendCommand.setEndTimestamp(endTimestamp);

library_sendCommand.setAppName("Name of App");

library_sendCommand.addDataSource("Accelerometer");

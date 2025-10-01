package com.corestocy.oop;

import java.time.LocalDateTime;
import java.util.List;
/*Benefits in this Real-time Scenario:
Reduced Code Duplication: The logging logic is centralized in the default logData method.
Increased Consistency: All sensors will follow the same default logging format.
Improved Maintainability: Changes to the logging mechanism or the "is recent" check only need to be done in one place (the interface).
Enhanced Code Organization: Utility functions related to sensor data processing are grouped within the SensorDataProcessor interface.
Better Encapsulation: The writeToLog and sanitizeString methods hide implementation details, making the interface cleaner.
This example demonstrates how default, static, and private methods in interfaces can contribute to building more robust, maintainable, and well-organized real-time processing systems.*/
interface SensorDataProcessor<T> {

    // Abstract method: Each implementing class must define how to process its specific data
    void processData(T data);

    // Default method: Provides a common logging mechanism for all sensor data
    default void logData(String sensorType, T data) {
        LocalDateTime now = LocalDateTime.now();
        String logMessage = String.format("[%s] %s - Data: %s", now, sensorType, data.toString());
        writeToLog(logMessage); // Using the private helper method
    }

    // Static method: Provides a utility to validate if a timestamp is recent
    static boolean isRecent(LocalDateTime timestamp, int withinSeconds) {
        LocalDateTime now = LocalDateTime.now();
        return timestamp.plusSeconds(withinSeconds).isAfter(now);
    }

    // Private method: Encapsulates the actual logging logic, reusable by default methods
    private void writeToLog(String message) {
        // In a real system, this would write to a file, database, or logging service
        System.out.println("LOG: " + message);
    }

    // Private static method: Could be used for common data sanitization across the interface
    private static String sanitizeString(String value) {
        return (value == null) ? "" : value.trim();
    }

    // Another static method that uses the private static method
    static List<String> sanitizeList(List<String> dataList) {
        return dataList.stream().map(SensorDataProcessor::sanitizeString).toList();
    }
}

// Implementation for Temperature Sensor
class TemperatureSensorProcessor implements SensorDataProcessor<Double> {
    private String sensorId;

    public TemperatureSensorProcessor(String sensorId) {
        this.sensorId = sensorId;
    }

    @Override
    public void processData(Double temperature) {
        System.out.println("Processing temperature from sensor " + sensorId + ": " + temperature + "°C");
        logData("Temperature", temperature); // Using the default logData method
    }
}

// Implementation for Motion Sensor
class MotionSensorProcessor implements SensorDataProcessor<Boolean> {
    private String location;

    public MotionSensorProcessor(String location) {
        this.location = location;
    }

    @Override
    public void processData(Boolean motionDetected) {
        System.out.println("Motion detected at " + location + ": " + motionDetected);
        logData("Motion", motionDetected); // Using the default logData method
    }
}

public class SmartHomeSystem {
    public static void main(String[] args) {
        TemperatureSensorProcessor tempProcessor = new TemperatureSensorProcessor("TEMP-001");
        MotionSensorProcessor motionProcessor = new MotionSensorProcessor("Living Room");

        tempProcessor.processData(25.5);
        motionProcessor.processData(true);

        LocalDateTime pastTime = LocalDateTime.now().minusMinutes(5);
        LocalDateTime currentTime = LocalDateTime.now();

        System.out.println("Is past time recent (within 10 seconds)? " + SensorDataProcessor.isRecent(pastTime, 10));
        System.out.println("Is current time recent (within 10 seconds)? " + SensorDataProcessor.isRecent(currentTime, 10));

        List<String> rawData = List.of("  value1  ", null, "value2 ");
        List<String> sanitizedData = SensorDataProcessor.sanitizeList(rawData);
        System.out.println("Sanitized data: " + sanitizedData);
    }
}

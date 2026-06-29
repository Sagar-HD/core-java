package com.xworkz;

import com.xworkz.dto.SpaceProbeDTO;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SpaceProbeCreator {

    private static final String[] MISSION_NAMES = {
        "Voyager", "Pioneer", "Mariner", "Viking", "Galileo", "Cassini", "New Horizons",
        "Curiosity", "Perseverance", "Spirit", "Opportunity", "Phoenix", "InSight",
        "Juno", "Rosetta", "Deep Impact", "Stardust", "Genesis", "MESSENGER", "Dawn"
    };

    private static final String[] TARGET_CELESTIAL_BODIES = {
        "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Venus", "Mercury",
        "Moon", "Titan", "Europa", "Ganymede", "Enceladus", "Io", "Callisto",
        "Pluto", "Ceres", "Vesta", "Eros", "Comet Halley", "Asteroid Belt"
    };

    private static final String[] MANUFACTURERS = {
        "NASA", "ESA", "JAXA", "Roscosmos", "ISRO", "CNSA", "SpaceX",
        "Boeing", "Lockheed Martin", "Northrop Grumman", "Airbus", "Thales Alenia"
    };

    private static final String[] PROPULSION_TYPES = {
        "Chemical Rocket", "Ion Thruster", "Solar Electric", "Nuclear Thermal",
        "Solar Sail", "Magnetoplasmadynamic", "Hall Effect Thruster"
    };

    private static final String[] COMMUNICATION_FREQUENCIES = {
        "X-Band", "Ka-Band", "S-Band", "Ku-Band", "Deep Space Network"
    };

    private static final String[] PRIMARY_INSTRUMENTS = {
        "Spectrometer", "Camera", "Magnetometer", "Radar", "Lidar",
        "Radiometer", "Mass Spectrometer", "Plasma Sensor"
    };

    private static final String[] SECONDARY_INSTRUMENTS = {
        "Thermal Mapper", "Dust Detector", "Cosmic Ray Sensor", "Solar Wind Monitor",
        "UV Spectrometer", "Infrared Camera", "Altimeter", "Gravitational Wave Detector"
    };

    private static final String[] STATUSES = {
        "Active", "Completed", "In Transit", "Standby", "Failed", "Decommissioned"
    };

    private static final String[] TRAJECTORY_PATHS = {
        "Hohmann Transfer", "Gravity Assist", "Direct Injection", "Solar Polar",
        "Lunar Flyby", "Interplanetary Cruise", "Orbital Insertion"
    };

    private static final Random random = new Random();


    public static List<SpaceProbeDTO> createSpaceProbes(int count) {
        List<SpaceProbeDTO> spaceProbes = new ArrayList<>();
        
        for (int i = 1; i <= count; i++) {
            SpaceProbeDTO probe = createSpaceProbe(i);
            spaceProbes.add(probe);
        }

        return spaceProbes;
    }

    private static SpaceProbeDTO createSpaceProbe(int index) {
        LocalDateTime launchDate = generateRandomDate(2000, 2024);
        LocalDateTime arrivalDate = launchDate.plusDays(random.nextInt(3650) + 180); // 6 months to 10 years later
        
        return new SpaceProbeDTO(
            "SP-" + String.format("%04d", index),
            MISSION_NAMES[random.nextInt(MISSION_NAMES.length)] + " " + (index % 10 + 1),
            TARGET_CELESTIAL_BODIES[random.nextInt(TARGET_CELESTIAL_BODIES.length)],
            MANUFACTURERS[random.nextInt(MANUFACTURERS.length)],
            500 + random.nextDouble() * 4500, // launchMass: 500-5000 kg
            launchDate,
            arrivalDate,
            PROPULSION_TYPES[random.nextInt(PROPULSION_TYPES.length)],
            100 + random.nextDouble() * 900, // powerOutput: 100-1000 watts
            COMMUNICATION_FREQUENCIES[random.nextInt(COMMUNICATION_FREQUENCIES.length)],
            1.0 + random.nextDouble() * 49.0, // distanceFromEarth: 1-50 million km
            10.0 + random.nextDouble() * 50.0, // orbitalVelocity: 10-60 km/s
            PRIMARY_INSTRUMENTS[random.nextInt(PRIMARY_INSTRUMENTS.length)],
            SECONDARY_INSTRUMENTS[random.nextInt(SECONDARY_INSTRUMENTS.length)],
            365 + random.nextInt(3650), // missionDurationDays: 1-10 years
            random.nextBoolean(), // isActive
            STATUSES[random.nextInt(STATUSES.length)],
            random.nextDouble() * 1000, // fuelRemaining: 0-1000 kg
            TRAJECTORY_PATHS[random.nextInt(TRAJECTORY_PATHS.length)]
        );
    }

    private static LocalDateTime generateRandomDate(int startYear, int endYear) {
        int year = startYear + random.nextInt(endYear - startYear + 1);
        int month = 1 + random.nextInt(12);
        int day = 1 + random.nextInt(28); // Keep it simple with 28 days max
        int hour = random.nextInt(24);
        int minute = random.nextInt(60);
        return LocalDateTime.of(year, month, day, hour, minute);
    }
}

package com.learn.spring.lld.creational.singleton;

// package com.assignment.question;

import java.util.List;
import java.util.ArrayList;

public class ConnectionPoolImpl implements ConnectionPool {

    private static ConnectionPoolImpl cObject = null;

    private List<DatabaseConnection> availableConnections;
    private List<DatabaseConnection> usedConnections;

    private int maxConnections;

    // Private constructor for Singleton
    private ConnectionPoolImpl(int maxConnections) {

        this.maxConnections = maxConnections;

        availableConnections = new ArrayList<>();
        usedConnections = new ArrayList<>();

        initializePool();
    }

    // Singleton getInstance()
    public static ConnectionPoolImpl getInstance(int maxConnections) {

        if (cObject == null) {
            cObject = new ConnectionPoolImpl(maxConnections);
        }

        return cObject;
    }

    // Reset singleton instance
    public static void resetInstance() {
        cObject = null;
    }

    @Override
    public void initializePool() {

        if (!availableConnections.isEmpty()) {
            return;
        }

        for (int i = 0; i < maxConnections; i++) {
            availableConnections.add(new DatabaseConnection());
        }
    }

    @Override
    public DatabaseConnection getConnection() {

        // No available connections
        if (availableConnections.isEmpty()) {
            return null;
        }

        // Remove one available connection
        DatabaseConnection dbc =
                availableConnections.remove(0);

        // Mark as used
        usedConnections.add(dbc);

        return dbc;
    }

    @Override
    public void releaseConnection(DatabaseConnection connection) {

        // Release only valid used connections
        if (usedConnections.contains(connection)) {

            usedConnections.remove(connection);

            availableConnections.add(connection);
        }
    }

    @Override
    public int getAvailableConnectionsCount() {

        return availableConnections.size();
    }

    @Override
    public int getTotalConnectionsCount() {

        return availableConnections.size()
                + usedConnections.size();
    }
}

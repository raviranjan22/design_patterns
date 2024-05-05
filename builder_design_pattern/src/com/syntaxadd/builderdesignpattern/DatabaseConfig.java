package com.syntaxadd.builderdesignpattern;

public class DatabaseConfig {

    private String host;
    private String port;
    private String username;
    private String password;
    private String databaseName;

    public DatabaseConfig(Builder builder){
        this.host = builder.host;
        this.port = builder.port;
        this.username = builder.username;
        this.password = builder.password;
        this.databaseName = builder.databaseName;
    }

    public String getHost() {
        return host;
    }

    public String getPort() {
        return port;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    @Override
    public String toString() {
        return "DatabaseConfig{" +
                "host='" + host + '\'' +
                ", port='" + port + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", databaseName='" + databaseName + '\'' +
                '}';
    }
}

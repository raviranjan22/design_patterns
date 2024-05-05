package com.syntaxadd.builderdesignpattern;

public class Builder {

    public String host;
    public String port;
    public String username;
    public String password;
    public String databaseName;

    public Builder host(String host){
        this.host = host;
        return this;
    }

    public Builder port(String port){
        this.port = port;
        return this;
    }

    public Builder username(String username){
        this.username = username;
        return this;
    }

    public Builder password(String password){
        this.password = password;
        return this;
    }

    public Builder databaseName(String databaseName){
        this.databaseName = databaseName;
        return this;
    }

    public DatabaseConfig build(){
        return new DatabaseConfig(this);
    }
}

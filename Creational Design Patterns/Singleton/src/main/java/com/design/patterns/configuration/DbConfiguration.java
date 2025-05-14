package com.design.patterns.configuration;

public class DbConfiguration {

  private static DbConfiguration dbConfiguration;

  private String url;
  private String username;
  private String password;
  private int maxConnections;

  private DbConfiguration() {
    // Default values or initialization logic
    this.url = "jdbc:mysql://localhost:3306/mydb";
    this.username = "root";
    this.password = "password";
    this.maxConnections = 10;
  }
  public static DbConfiguration getInstance() {
    if (dbConfiguration == null) {
      dbConfiguration = new DbConfiguration();
    }
    return dbConfiguration;
  }
  public String getUrl() {
    return url;
  }



  public void setUrl(String url) {
    this.url = url;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public int getMaxConnections() {
    return maxConnections;
  }

  public void setMaxConnections(int maxConnections) {
    this.maxConnections = maxConnections;
  }
}

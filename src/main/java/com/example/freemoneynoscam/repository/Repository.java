package com.example.freemoneynoscam.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Repository {

  private Connection connection = DatabaseManager.getConnection();

  public void addEmailToDatabase(String email){
    try{
      PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO student (email) VALUES (?)");
      preparedStatement.setString(1, email);
      preparedStatement.executeUpdate();

    } catch (SQLException e){
      throw new RuntimeException(e);
    }
  }

}

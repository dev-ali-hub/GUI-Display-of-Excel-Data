package handlers;

import Models.Individual;

import java.sql.*;

public class IndividualHandler
{
    public  static Individual getIndividual(float no){
        Connection connection = DbHandler.getConnection();
        String query = "Select * from Aviation where \"PA No\" = ? ";
        Individual individual = null;
        try
        {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setFloat(1,no);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                String pma = resultSet.getString("PMA");
                float pa_no = resultSet.getFloat("PA No");
                String rank = resultSet.getString("RANK");
                String name = resultSet.getString("NAME");
                String unit = resultSet.getString("UNIT");
                String med_cat = resultSet.getString("Med Cat");
                String avn_course = resultSet.getString("Avn Basic Course");
                Date dob = resultSet.getDate("DOB");
                Date doc = resultSet.getDate("DOC");
                Date do_j_avn = resultSet.getDate("DO J/Avn");

                individual = new Individual(pma,pa_no,rank,name,unit,med_cat,avn_course,dob.toString(),doc.toString(),do_j_avn.toString());
            }
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        return individual;
    }
}

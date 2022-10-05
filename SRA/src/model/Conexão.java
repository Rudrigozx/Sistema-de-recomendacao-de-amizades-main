package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Conexão {
    PreparedStatement pstn;
    Connection c;
    ResultSet rs;
    ArrayList<Vertice> banco = new ArrayList<>();
    public Connection conectBD(){

        try{
            String url = "jdbc:mysql://localhost:3306/new_schema?user=root&password=";
            c = DriverManager.getConnection(url);


        }catch (SQLException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return c;
    }

    public  ArrayList<Vertice> listaVertice(){
        String sql ="select * from mytable";
        try {
            pstn = c.prepareStatement(sql);
            rs= pstn.executeQuery();
            while (rs.next()){
                Pessoa pessoa = new Pessoa();

                pessoa.setId(rs.getInt("id"));
                pessoa.setNome(rs.getString("name"));
                pessoa.setIdade(rs.getInt("idade"));
                pessoa.setSexo(rs.getString("Sexo"));
                pessoa.setTime(rs.getString("Time"));
                pessoa.setInteresses(rs.getString("Hobby"),rs.getString("generoFilmes"),rs.getString("interessesEstudo"));
                Vertice vertice = new Vertice(pessoa);
                banco.add(vertice);
            }
        }catch (SQLException er){
            JOptionPane.showMessageDialog(null,er.getMessage());
        }
        return banco;
    }
    
    public ArrayList<Pessoa> listarPessoaTXT(){
        ArrayList<Pessoa> lista = new ArrayList<>();    
        try {

            FileReader fr = new FileReader("ferramentas.txt");
            BufferedReader br = new BufferedReader(fr);

            String str;
            while((str = br.readLine()) != null){
                Pessoa pessoa = new Pessoa();
                pessoa.setNome(str);
                lista.add(str.split(","));
                pessoa.setIdade(Integer.parseInt(str));
                
            } 

     } catch(IOException e) {
           System.out.println("Arquivo não encontrado!");
     } finally {
         br.close(); 
     }

     return lista;
    }
   
}

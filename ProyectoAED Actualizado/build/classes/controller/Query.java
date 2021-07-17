package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Query extends Connector{
	Statement stm = null;
    public boolean autenticacion(String uid, String pass){
        PreparedStatement pst = null;
        ResultSet rs = null;
        try{
            String consulta = "select * from users where uid = ? and pass = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, uid);
            pst.setString(2, pass);
            rs = pst.executeQuery();
            
            if(rs.absolute(1)){
                return true;
            }
            
        }catch(Exception e){
            System.err.println("Error" + e);
        }finally{
            try{
                if(getConexion()!=null) getConexion().close();
                if(pst !=null) pst.close();
                if(rs !=null) rs.close();
            }catch(Exception e){
                System.err.println("Error" + e);
            }   
        }
        return false;
    }
    public boolean registroUsuario(String solicitante, String titulo, String descrip,
    String priori, String estado,String fecha){
        PreparedStatement pst = null;
        int sol = Integer.parseInt(solicitante);
        try{
                String consulta = "insert into Incidencia(CodSolicitante, Titulo, Descripcion, Prioridad, Estado, Fecha) Values(?,?,?,?,?,?)";
                pst = getConexion().prepareStatement(consulta);
                pst.setInt(1, sol);
                pst.setString(2, titulo);
                pst.setString(3, descrip);
                pst.setString(4, priori);
                pst.setString(5, estado);
                pst.setString(6, fecha);
                
                if(pst.executeUpdate() == 1){
                    return true;
                }
                
        }catch(Exception ex){
            System.err.println("Error" + ex);
        }finally{
            try{
                if(getConexion()!=null) getConexion().close();
                if(pst !=null) pst.close();
    
            }catch(Exception e){
                System.err.println("Error" + e);
            }   
        }
        return false;
        
        
    }
    public ResultSet Listar(){
            PreparedStatement pst = null;
            ResultSet rs = null;
                try {
                    String sql = "select * from incidencia";
                    pst = getConexion().prepareStatement(sql);
                    rs = pst.executeQuery();

                 } catch (Exception e) {
                }
                  return rs;
    }
       
}

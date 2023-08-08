/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tutoria8momgodb;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;


/**
 *
 * @author LOMBEIDA ANA
 */
public class Tutoria8MomgoDB {

    public static void main(String[] args) {
      MongoClient mongo=crearConexion() ;
      if(mongo!=null){
      
    DB db=mongo.getDB("NuevaBasedeDatos");
      System.out.println(" Base de Datos Creada");
      
      
      insertarUsuario(db,"datos","Elizabeth","Fajardo");
      insertarUsuario(db,"datos","Andy","Chapi");
      insertarUsuario(db,"datos","Dereck","Jimenez");
      insertarUsuario(db,"datos","Damian","Calero");
      insertarUsuario(db,"miembros","Jesus","Alvarez");
      mostrarColeccion(db,"datos");
      System.out.println("Base de datos miembros");
      mostrarColeccion(db,"miembros");
      buscarPorNombre(db,"datos","Elizabeth");
      buscarPorNombre(db,"datos","Jesus");
      

      
      }
    }
    
    
public static MongoClient crearConexion(){
System.out.println("Conexion Realizada");
MongoClient mongo=null;
mongo =new MongoClient("Localhost", 27017);
return mongo;

}



    public static void  insertarUsuario(DB db, String coleccion,String nombre,String apellido) {
        DBCollection colec = db.getCollection(coleccion);
        BasicDBObject documento=new BasicDBObject ();
        documento.put("nombre",nombre);
        documento.put("apellido",apellido);
        colec.insert(documento);
    }


public static void mostrarColeccion(DB db,String coleccion){
DBCollection colect=db.getCollection(coleccion);
DBCursor cursor=colect.find();
while(cursor.hasNext()){
System.out.println("--------"+cursor.next().get("nombre"+"----")+cursor.curr().get("apellido"));

}



}


public static void buscarPorNombre(DB db,String coleccion,String nombre){

DBCollection colect=db.getCollection(coleccion);
BasicDBObject consulta=new BasicDBObject();
consulta.put("nombre", nombre);
DBCursor cursor=colect.find(consulta);
while(cursor.hasNext()){

System.out.println("======="+cursor.next().get("nombre")+"  "+cursor.curr().get("apellido"));
}

}
}





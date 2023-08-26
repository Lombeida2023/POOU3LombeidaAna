
package u3lombeidaanaexcell;

import com.mysql.jdbc.Connection;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author LOMBEIDA ANA
 */
public class U3LombeidaAnaExcell {

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, SQLException {
        // TODO code application logic here
        
        //crearExcel();
       //leer() ;
     cargar();
       //modificar();
    }
    
    
    public  static void crearExcel(){
    
     Workbook book = new XSSFWorkbook();//INDICA QUE ESTOY CREANDO UN ARCHIVO EN EXCELL
     Sheet sheet = book.createSheet("Hola Mundo");//Creamos una nueva prestaña
             //CREAMOS FILAS Y CELDAS 
             Row row = sheet.createRow(0);
             row.createCell(0).setCellValue("ANA LOMBEIDA");//PARA ESCRIBIR DENTRO DEL EXCEL
             row.createCell(1).setCellValue(42.5);
             row.createCell(2).setCellValue(false);
             
             
             //PARA HACER UNA FORMULA
             Cell celda = row.createCell(3);//PODER AGREGAR MAS ATRITUBOS A LA CELDA
             celda.setCellFormula(String.format("1+1", ""));

             //NUMEROS DE FILAS
              Row rowUno = sheet.createRow(1);
              rowUno.createCell(0).setCellValue(10);
              rowUno.createCell(1).setCellValue(30);

              
              //SUMAR LAS CELDAS  
        Cell celdados = rowUno.createCell(2);
        celdados.setCellFormula(String.format("A%d+B%d", 2, 2));//INDICA QUE ES UN PARAMETRO Y ENVIA LOS PARAMETROS
        try{
         FileOutputStream fileout = new FileOutputStream("Excel.xlsx");
         book.write(fileout);
            fileout.close();
        }catch(FileNotFoundException ex) {
         Logger.getLogger(U3LombeidaAnaExcell.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(U3LombeidaAnaExcell.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    
    
 public static void leer() throws IOException {
        try {
            FileInputStream file = new FileInputStream(new File("C:\\Users\\LOMBEIDA ANA\\Downloads\\10-Excel_Java_MySQL_CDP\\productos.xlsx"));

            XSSFWorkbook wb = new XSSFWorkbook(file);
            XSSFSheet sheet = wb.getSheetAt(0);

            int numFilas = sheet.getLastRowNum();

            for (int a = 0; a <= numFilas; a++) {
                Row fila = sheet.getRow(a);
                int numCols = fila.getLastCellNum();

                for (int b = 0; b < numCols; b++) {
                    Cell celda = fila.getCell(b);
                      //SIRVE PARA ESPECIFICAR LOS DATOS DE QUE TIPO SON
                    switch (celda.getCellTypeEnum().toString()) {
                        case "NUMERIC":
                            System.out.print(celda.getNumericCellValue() + " ");
                            break;

                        case "STRING":
                            System.out.print(celda.getStringCellValue() + " ");
                            break;

                        case "FORMULA":
                            System.out.print(celda.getCellFormula() + " ");
                            break;
                    }

                }

                System.out.println("");

            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(U3LombeidaAnaExcell.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void cargar() throws IOException, SQLException {

        Conexion con = new Conexion();
        PreparedStatement ps;

        try {
            Connection conn = con.getConexion();
            FileInputStream file = new FileInputStream(new File("C:\\Users\\LOMBEIDA ANA\\Downloads\\10-Excel_Java_MySQL_CDP\\productos.xlsx"));

            XSSFWorkbook wb = new XSSFWorkbook(file);
            XSSFSheet sheet = wb.getSheetAt(0);

            int numFilas = sheet.getLastRowNum();

            for (int a = 1; a <= numFilas; a++) {
                Row fila = sheet.getRow(a);

                ps = conn.prepareStatement("INSERT INTO producto (codigo, nombre, precio, cantidad) VALUES(?,?,?,?)");
                ps.setString(1, fila.getCell(0).getStringCellValue());
                ps.setString(2, fila.getCell(1).getStringCellValue());
                ps.setDouble(3, fila.getCell(2).getNumericCellValue());
                ps.setDouble(4, fila.getCell(3).getNumericCellValue());
                ps.execute();
            }
            
            conn.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(U3LombeidaAnaExcell.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void modificar() throws IOException {
        try {
            FileInputStream file = new FileInputStream(new File("C:\\Users\\LOMBEIDA ANA\\Downloads\\10-Excel_Java_MySQL_CDP\\Ana.xlsx"));

            XSSFWorkbook wb = new XSSFWorkbook(file);
            XSSFSheet sheet = wb.getSheetAt(0);

            XSSFRow fila = sheet.getRow(1);
            
            if(fila == null)
            {
               fila = sheet.createRow(1);
            }
            
            XSSFCell celda = fila.createCell(1);
            
            if(celda == null)
            {
               celda = fila.createCell(1);
            }
            
            celda.setCellValue("PasarEl semestre");
            
            file.close();
            
            FileOutputStream output = new FileOutputStream("C:\\Users\\LOMBEIDA ANA\\Documents\\Zoom\\Espe.xlsx");
            wb.write(output);
            output.close();
            

        } catch (FileNotFoundException ex) {
            Logger.getLogger(U3LombeidaAnaExcell.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
    
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.util.ArrayList;

/**
 *
 * @author renat
 */
public class Record {
    
     ArrayList<Fila> RecordVariables = new ArrayList();
     String tipo;

    public Record() {
    }

    public Record(String tipo) {
        this.tipo = tipo;
    }
     
     
     

    public ArrayList<Fila> getRecordVariables() {
        return RecordVariables;
    }

    public void setRecordVariables(ArrayList<Fila> RecordVariables) {
        this.RecordVariables = RecordVariables;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
    
    
    public void obtenerVariables(){
        String variables = "";
        
        String variables2 = "";
        String variables3 = "";
        
         //Record((n x Integer) x (i x Integer) x (q x Boolean) x (nen x String))
         
 
              
     
         
        variables = tipo.substring( 6 , tipo.length());
        variables = variables+"@";
        
        
        
        //( nx Integer) x (i x Integer) x (q x Boolean) x (nen x String)  1
        
       
        variables = variables.replaceAll("\\(", "").replaceAll("\\)","");
         variables = variables.replaceAll(" ", "&");
        
    System.out.println("antez del relpal:" + variables);
     
        
        
        System.out.println("");
         //  Integer x i x Integer x q x Boolean x nen x @  1
                   
         
        System.out.println("el tipo esta asi:" + tipo);
        
        System.out.println("la variable asi:" + variables);
        
        int i = 0;
        int z = 0;
        
        
        
        while (i < variables.length()){
            
//            System.out.println("si di la vuelta");
            
            if (variables.charAt(i) == '@') {
                
                System.out.println("jajaja");
                variables3 = variables.substring(0 , i );
                
//                 System.out.println("nombre: " + variables2);
//                 System.out.println("tipo: " + variables3);
                RecordVariables.add(new Fila(variables3,variables2));
               
                break;
                
                
            }
            
            
        
            
            if (variables.charAt(i) == '&') {
//                 System.out.println("aquie deberia esasdashdbasjbdsta x :" + variables.charAt(i));
                     if (variables.charAt(i+1) == 'x') {
                   
                z++;
               
            }
                     if (z %2 != 0) {
//                 System.out.println("entre al if");
                variables2 = variables.substring(0 , i);
                
//               System.out.println("entre al if y este estado:" + variables2 + " e " + i );
                variables = variables.substring(i , variables.length());
                variables = variables.replaceFirst("&x&", "");
//                
//                System.out.println("estado actual del nombre variable: " + variables2);
//                System.out.println("estado acutal cadena general:" + variables);
            }else if ((z != 0) && (z %2==0)){
//                System.out.println("entre al else" + i);
                variables3 = variables.substring(0 , (i));
                
               
                variables = variables.substring(i , variables.length());
                variables = variables.replaceFirst("&x&", "");
                
                
//               System.out.println("estado actual del nombre Tipo: " + variables3);
//                System.out.println("estado acutal cadena general:" + variables);
            
            }
                     
                     
                     
            }
            
            
            
              //&x&Integer x i x Integer x q x Boolean x nen x String  1
            
            
     
            if ((!variables2.equals("")) && (!variables3.equals(""))) {
                
                 //System.out.println("nombre: " + variables2);
                 //System.out.println("tipo: " + variables3);
                RecordVariables.add(new Fila(variables3,variables2));
               
                variables2 = "";
                variables3 = "";
                i = -1;
            }
              
            
           // System.out.println("El funal del ciclo; " + variables.length() + " estado: " + variables + " en el paso " + i );
        
        i++;
        
        }
        
        
        
        
          
    
    
    
    
    
        }
     
    
    
    public void impresion(){
    
        for (int i = 0; i < RecordVariables.size() ; i++) {
            System.out.println("Nombre variable: " + RecordVariables.get(i).getNombreVar() + " Tipo: " + RecordVariables.get(i).getType() );
            
        }
    
    
    }
     
    
     
    
}

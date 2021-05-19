/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

public class Fila {
    String Type;
    String nombreVar;
    Funcion TypeFuncion;
    Record TypeRecords;
   
    
    public Fila() {
       
    }

    public Fila(String Type, String nombreVar) {
        this.Type = Type;
        this.nombreVar = nombreVar;
      
    }

    public Fila(Funcion TypeFuncion, String nombreVar) {
        this.nombreVar = nombreVar;
        this.TypeFuncion = TypeFuncion;
    }
    
    

    public String getType() {
        return Type;
    }

    public String getNombreVar() {
        return nombreVar;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public void setNombreVar(String nombreVar) {
        this.nombreVar = nombreVar;
    }

    public Funcion getTypeFuncion() {
        return TypeFuncion;
    }

    public void setTypeFuncion(Funcion TypeFuncion) {
        this.TypeFuncion = TypeFuncion;
    }
    
    
    
    
    
    
    
  
    
    
    
    
    
    
}

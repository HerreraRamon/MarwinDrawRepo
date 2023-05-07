/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa;

import java.util.HashMap;
import java.util.Iterator;

public class TablaSimbolos {
    private HashMap<String, Simbolo> table;

    public TablaSimbolos() {
        table = new HashMap<String, Simbolo>();
    }

    public void imprimir(){
        Iterator it = table.values().iterator();
        while(it.hasNext()){
            Simbolo s = (Simbolo)it.next();
            System.out.println(s.name + "=  valor: "+ s.value+"  tipo: "+s.type);
        }
        //System.out.println("aqui el problema");
    }
    public void addSymbol(String name, String type, String valor) {
        Simbolo sy = new Simbolo(name, type,valor);
        table.put(name, sy);
    }

    public Simbolo getSymbol(String name) {
        return table.get(name);
    }
    public Simbolo getType(String name) {
        return table.get(name);
    }

    public class Simbolo {
        private String name;
        private String type;
        private Object value;

        public Simbolo(String name, String type, String value) {
            this.name = name;
            this.type = type;
            this.value = value;
        }

        public void setValue(Object value) {
            this.value = value;
        }

        public String getType() {
            return type;
        }

        public Object getValue() {
            return value;
        }
    }
}
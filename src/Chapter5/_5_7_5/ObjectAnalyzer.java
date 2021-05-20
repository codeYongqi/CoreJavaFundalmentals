package Chapter5._5_7_5;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

public class ObjectAnalyzer {
    //record the path
    private ArrayList<Object> visited = new ArrayList<>();

    /**
     * Converts an object to a string representation that list all files
     * @param obj
     * @return
     * @throws ReflectiveOperationException
     */
    public String toString(Object obj) throws ReflectiveOperationException{
        if(obj == null) return "null";
        if(visited.contains(obj)) return "...";

        visited.add(obj);
        Class cl = obj.getClass();
        if(cl == String.class) return (String)obj;
        if(cl.isArray()){// if this class represent array class
            String r = cl.getComponentType() + "[]{";
            for(int i = 0; i < Array.getLength(obj); i++){
                if(i > 0) r += ",";
                Object val = Array.get(obj,i);
                if(cl.getComponentType().isPrimitive()) r += val;
                else r += toString(val); // if val still an object, call the recursive function
            }
            return r + "}";
        }

        String r = cl.getName();
        // inspect the fields of this class and superclasses
        do{
            r += "[";
            var fields = cl.getDeclaredFields();
            AccessibleObject.setAccessible(fields,true);

            // get the names and values of all fields
            for(Field f : fields){
                if(Modifier.isStatic(f.getModifiers())){
                    if(!r.endsWith("[")) r += ",";
                    r += f.getName() + "=";
                    Class t = f.getType();
                    Object val = f.get(obj);
                    if(t.isPrimitive()) r += val;
                    else r += toString(val);
                }
            }
            r += "]";
            cl = cl.getSuperclass();
        }while(cl != null);

        return r;
    }
}

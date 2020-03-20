public class Persona {
    protected String nombre;
    protected String ocupacion;
    protected int edad;}

    public void persona(String s, Integer x){
        this.nombre=s;
        this.edad=x;
        this.ocupacion="existir";
    }

    public void comer() {
        System.out.println("Ñom Ñom comida casera");
    }

    public void dormir() {
        System.out.println("ZzzZzZzZ");
    }

    public String hacerLoSuyo() {
        return "";
    }
}

public class Estudiante extends Persona{

    public void estudiante(String s, Integer x){
        this.nombre=s;
        this.edad=x;
        this.ocupacion="estudiante";
    }

    @Override
    public void dormir() {
        System.out.println("6z");
        super.dormir();
    }

    @Override
    public void comer() {
        System.out.println("Ñom Ñom completo de 500 con bebia");
        super.comer();
    }

    public String hacerLoSuyo(){

    return "verseries en cuarentena";
    }

}

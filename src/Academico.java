public class Academico extends Persona {

    private String papers;

    public void academico(String s, Integer x){
        this.nombre=s;
        this.edad=x;
        this.ocupacion="academico";
        String papers="";

    }
    public String paper(String x) {
        this.papers=papers + x;
        return papers;
    }

    @Override
    public void dormir() {
        System.out.println("7z");
        super.dormir();
    }

    @Override
    public void comer() {
        System.out.println("Ñom Ñom termito");
        super.comer();
    }

    public String hacerLoSuyo(){
        return "zomear en cuarentena";
    }

}




}


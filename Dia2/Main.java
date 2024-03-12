package Dia2;

public class Main{
    
    public static void main(String [] args){ 
        System.out.println("classes");
        try {
            Dentista dentista = new Dentista("Tro", 17);
            Dentista dentisto = new Dentista("Tiro", 18);
            Dentista dentiste = new Dentista("Troia", 19);
            System.out.println("Foi possivel criar as classes");
            mostrar(dentista, dentisto, dentiste);
        }
        catch(Exception e) {
            System.out.println("Não foi possivel criar as classes");
        }
    }
    
    public void mostrar(Dentista dentista, Dentista dentisto, Dentista dentiste){
        
        System.out.println(dentista.getNome());
        System.out.println(dentisto.getNome());
        System.out.println(dentiste.getNome());
        
        System.out.println(dentista.getIdade());
        System.out.println(dentisto.getIdade());
        System.out.println(dentiste.getIdade());
    }
}
package Aulas;

public class Zoo {
    public static void main(String[] args) {
        System.out.println("=-=-=- SER VIVO =-=-=-");

        SerVivo sv = new SerVivo();
        sv.tamanho = 10;
        sv.nascer();
        sv.crescer();
        sv.morrer();

        System.out.println("=-=-=- ANIMAL =-=-=-");
        Animal an = new Animal();
        an.mover();
        an.respirar();
        an.nascer();
        an.crescer();
        an.morrer();

        System.out.println("=-=-=- MAMIFERO =-=-=-");
        Mamifero ma = new Mamifero();
        ma.respirar();
        ma.nascer();
        ma.crescer();

        System.out.println("=-=-=- PEIXE =-=-=-");
        Peixe px = new Peixe();
        px.nascer();
        px.mover();
        px.respirar();
    }
}

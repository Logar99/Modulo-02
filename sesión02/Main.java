package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

public interface Helado {
    public String getDescription();
    public int getPrice();
}

public class HeladoSuave implements Helado {

    @Override
    public String getDescription() {
        return "Helado Suave";
    }

    @Override
    public int getPrice() {
        return 30;
    }
}

public class CoberturaDecorator implements Helado {

    private Helado helado;

    public CoberturaDecorator(Helado helado) {
        this.helado = helado;
    }

    @Override
    public String getDescription() {
        return helado.getDescription() + ", con Cobertura extra";
    }

    @Override
    public int getPrice() {
        return helado.getPrice() + 20;
    }
}

public class GalletaDecorator implements Helado {

    private Helado helado;

    public GalletaDecorator(Helado helado) {
        this.helado = helado;
    }

    @Override
    public String getDescription() {
        return helado.getDescription() + ", con Galleta extra";
    }

    @Override
    public int getPrice() {
        return helado.getPrice() + 15;
    }
}

public class GranolaDecorator implements Helado {

    private Helado helado;

    public GranolaDecorator(Helado helado) {
        this.helado = helado;
    }

    @Override
    public String getDescription() {
        return helado.getDescription() + ", con Granola extra";
    }

    @Override
    public int getPrice() {
        return helado.getPrice() + 10;
    }
}

public class MermeladaDecorator implements Helado {

    private Helado helado;

    public MermeladaDecorator(Helado helado) {
        this.helado = helado;
    }

    @Override
    public String getDescription() {
        return helado.getDescription() + ", con Mermelada extra";
    }

    @Override
    public int getPrice() {
        return helado.getPrice() + 10;
    }
}

public class ToppingDecorator implements Helado {

    private Helado helado;

    public ToppingDecorator(Helado helado) {
        this.helado = helado;
    }

    @Override
    public String getDescription() {
        return helado.getDescription() + ", con Topping extra";
    }

    @Override
    public int getPrice() {
        return helado.getPrice() + 20;
    }
}

public class Heladeria {

    public static void main(String [] args) {
        Helado suave = new HeladoSuave();

        suave = new CoberturaDecorator(suave);
        suave = new GranolaDecorator(suave);
        suave = new ToppingDecorator(suave);
        suave = new MermeladaDecorator(suave);
        suave = new GalletaDecorator(suave);

        System.out.println("[Ticket de compra]");
        System.out.println(suave.getDescription());
        System.out.println("$" + suave.getPrice());
    }
}

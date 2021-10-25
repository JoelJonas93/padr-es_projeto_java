package br.com.cod3r.builder.meal.functional;

import br.com.cod3r.builder.meal.functional.model.VestuarioFeminino;

public class Client {

    public static void main(String[] args) {
        VestuarioFeminino vestuario1 = new VestuarioFeminino.Builder().addBlusa("blusa").addBlusinha("blusinha")
                .addCalcaJeans("calcaJeans").closeOrder();
        System.out.println(vestuario1);
    }

}

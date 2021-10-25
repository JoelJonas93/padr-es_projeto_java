package br.com.cod3r.builder.meal.fluent;

import br.com.cod3r.builder.meal.fluent.model.VestuarioFeminino;
import br.com.cod3r.builder.meal.fluent.model.builder.VestuarioBuilder;

public class Client {

    public static void main(String[] args) {
        VestuarioFeminino vestuario1 = new VestuarioBuilder().addBlusa("blusa").addBlusinha("blusinha")
                .addCalcaJeans("calcaJeans").closeOrder();
        System.out.println(vestuario1);
    }

}

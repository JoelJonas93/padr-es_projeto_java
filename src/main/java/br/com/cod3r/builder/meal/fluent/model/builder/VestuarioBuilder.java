package br.com.cod3r.builder.meal.fluent.model.builder;

import br.com.cod3r.builder.meal.fluent.model.VestuarioFeminino;

public class VestuarioBuilder {

    // Opcionais
    private String blusinha;
    private String camisa;
    private String camiseta;
    private String vestido;
    private String blusa;
    private String calcaJeans;
    private String shortJeans;
    private String sandalia;

    public VestuarioBuilder addBlusinha(String blusinha) {
        this.blusinha = blusinha;
        return this;
    }

    public VestuarioBuilder addCamisa(String camisa) {
        this.camisa = camisa;
        return this;
    }

    public VestuarioBuilder addCamiseta(String camiseta) {
        this.camiseta = camiseta;
        return this;
    }

    public VestuarioBuilder addVestido(String vestido) {
        this.vestido = vestido;
        return this;
    }

    public VestuarioBuilder addBlusa(String blusa) {
        this.blusa = blusa;
        return this;
    }

    public VestuarioBuilder addCalcaJeans(String calcaJeans) {
        this.calcaJeans = calcaJeans;
        return this;
    }

    public VestuarioBuilder addShortJeans(String shortJeans) {
        this.shortJeans = shortJeans;
        return this;
    }

    public VestuarioBuilder addSandalia(String sandalia) {
        this.sandalia = sandalia;
        return this;
    }

    public VestuarioFeminino closeOrder() {
        return new VestuarioFeminino(blusinha, camisa, camiseta, vestido, blusa, calcaJeans, shortJeans, sandalia);
    }

}
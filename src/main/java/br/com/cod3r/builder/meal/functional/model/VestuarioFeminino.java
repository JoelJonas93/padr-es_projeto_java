package br.com.cod3r.builder.meal.functional.model;

public class VestuarioFeminino {

    private String blusinha;
    private String camisa;
    private String camiseta;
    private String vestido;
    private String blusa;
    private String calcaJeans;
    private String shortJeans;
    private String sandalia;

    public VestuarioFeminino(String blusinha, String camisa, String camiseta, String vestido, String blusa,
            String calcaJeans, String shortJeans, String sandalia) {

        this.blusinha = blusinha;
        this.camisa = camisa;
        this.camiseta = camiseta;
        this.vestido = vestido;
        this.blusa = blusa;
        this.calcaJeans = calcaJeans;
        this.shortJeans = shortJeans;
        this.sandalia = sandalia;
    }

    public VestuarioFeminino() {
    }

    public String getBlusinha() {
        return blusinha;
    }

    public void setBlusinha(String blusinha) {
        this.blusinha = blusinha;
    }

    public String getCamisa() {
        return camisa;
    }

    public void setCamisa(String camisa) {
        this.camisa = camisa;
    }

    public String getCamiseta() {
        return camiseta;
    }

    public void setCamiseta(String camiseta) {
        this.camiseta = camiseta;
    }

    public String getVestido() {
        return vestido;
    }

    public void setVestido(String vestido) {
        this.vestido = vestido;
    }

    public String getBlusa() {
        return blusa;
    }

    public void setBlusa(String blusa) {
        this.blusa = blusa;
    }

    public String getCalcaJeans() {
        return calcaJeans;
    }

    public void setCalcaJeans(String calcaJeans) {
        this.calcaJeans = calcaJeans;
    }

    public String getShortJeans() {
        return shortJeans;
    }

    public void setShortJeans(String shortJeans) {
        this.shortJeans = shortJeans;
    }

    public String getSandalia() {
        return sandalia;
    }

    public void setSandalia(String sandalia) {
        this.sandalia = sandalia;
    }

    @Override
    public String toString() {
        return "Vestuário [blusinha=" + blusinha + ", camisa=" + camisa + ", camiseta=" + camiseta + ", vestido="
                + vestido + ", blusa=" + blusa + ", calcaJeans=" + calcaJeans + ", shortJeans=" + shortJeans
                + ", sandalia=" + sandalia + "]";
    }

    public static class Builder{
        // Opcionais
        private String blusinha;
        private String camisa;
        private String camiseta;
        private String vestido;
        private String blusa;
        private String calcaJeans;
        private String shortJeans;
        private String sandalia;

        public Builder addBlusinha(String blusinha) {
            this.blusinha = blusinha;
            return this;
        }

        public Builder addCamisa(String camisa) {
            this.camisa = camisa;
            return this;
        }

        public Builder addCamiseta(String camiseta) {
            this.camiseta = camiseta;
            return this;
        }

        public Builder addVestido(String vestido) {
            this.vestido = vestido;
            return this;
        }

        public Builder addBlusa(String blusa) {
            this.blusa = blusa;
            return this;
        }

        public Builder addCalcaJeans(String calcaJeans) {
            this.calcaJeans = calcaJeans;
            return this;
        }

        public Builder addShortJeans(String shortJeans) {
            this.shortJeans = shortJeans;
            return this;
        }

        public Builder addSandalia(String sandalia) {
            this.sandalia = sandalia;
            return this;
        }

        public VestuarioFeminino closeOrder() {
            return new VestuarioFeminino(blusinha, camisa, camiseta, vestido, blusa, calcaJeans, shortJeans, sandalia);
        }
    }
}

package org.example;
// Classe Veiculo
class Veiculo {
    private boolean motor;
    private boolean volante;
    private int quantidadePassageiros;
    private int quantidadePortas;
    private int quantidadeRodas;
    private boolean carga;
    private double capacidadeCarga;
    private Combustivel combustivel;

    public Veiculo(boolean motor, boolean volante, int quantidadePassageiros,
                   int quantidadePortas, int quantidadeRodas, boolean carga,
                   double capacidadeCarga, Combustivel combustivel) {
        this.motor = motor;
        this.volante = volante;
        this.quantidadePassageiros = quantidadePassageiros;
        this.quantidadePortas = quantidadePortas;
        this.quantidadeRodas = quantidadeRodas;
        this.carga = carga;
        this.capacidadeCarga = capacidadeCarga;
        this.combustivel = combustivel;
    }

    // Getters e Setters
    public boolean isMotor() {
        return motor;
    }

    public void setMotor(boolean motor) {
        this.motor = motor;
    }

    public boolean isVolante() {
        return volante;
    }

    public void setVolante(boolean volante) {
        this.volante = volante;
    }

    public int getQuantidadePassageiros() {
        return quantidadePassageiros;
    }

    public void setQuantidadePassageiros(int quantidadePassageiros) {
        this.quantidadePassageiros = quantidadePassageiros;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    public int getQuantidadeRodas() {
        return quantidadeRodas;
    }

    public void setQuantidadeRodas(int quantidadeRodas) {
        this.quantidadeRodas = quantidadeRodas;
    }

    public boolean isCarga() {
        return carga;
    }

    public void setCarga(boolean carga) {
        this.carga = carga;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public Combustivel getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(Combustivel combustivel) {
        this.combustivel = combustivel;
    }
}


// Classe Combustivel
class Combustivel {
    private boolean gasolina;
    private boolean alcool;
    private boolean diesel;
    private boolean eletricidade;
    private boolean humano;
    private boolean animal;

    public Combustivel(boolean gasolina, boolean alcool, boolean diesel,
                       boolean eletricidade, boolean humano, boolean animal) {
        this.gasolina = gasolina;
        this.alcool = alcool;
        this.diesel = diesel;
        this.eletricidade = eletricidade;
        this.humano = humano;
        this.animal = animal;
    }

    // Getters e Setters
    public boolean isGasolina() {
        return gasolina;
    }

    public void setGasolina(boolean gasolina) {
        this.gasolina = gasolina;
    }

    public boolean isAlcool() {
        return alcool;
    }

    public void setAlcool(boolean alcool) {
        this.alcool = alcool;
    }

    public boolean isDiesel() {
        return diesel;
    }

    public void setDiesel(boolean diesel) {
        this.diesel = diesel;
    }

    public boolean isEletricidade() {
        return eletricidade;
    }

    public void setEletricidade(boolean eletricidade) {
        this.eletricidade = eletricidade;
    }

    public boolean isHumano() {
        return humano;
    }

    public void setHumano(boolean humano) {
        this.humano = humano;
    }

    public boolean isAnimal() {
        return animal;
    }

    public void setAnimal(boolean animal) {
        this.animal = animal;
    }
}


// Classe Moto (herda de Veiculo)
class Moto extends Veiculo {
    private boolean partidaEletrica;
    private int quantidadeCilindradas;
    private boolean abs;

    public Moto(boolean motor, boolean volante, int quantidadePassageiros,
                int quantidadePortas, int quantidadeRodas, boolean carga,
                double capacidadeCarga, Combustivel combustivel,
                boolean partidaEletrica, int quantidadeCilindradas, boolean abs) {
        super(motor, volante, quantidadePassageiros, quantidadePortas,
                quantidadeRodas, carga, capacidadeCarga, combustivel);
        this.partidaEletrica = partidaEletrica;
        this.quantidadeCilindradas = quantidadeCilindradas;
        this.abs = abs;
    }

    // Getters e Setters
    public boolean isPartidaEletrica() {
        return partidaEletrica;
    }

    public void setPartidaEletrica(boolean partidaEletrica) {
        this.partidaEletrica = partidaEletrica;
    }

    public int getQuantidadeCilindradas() {
        return quantidadeCilindradas;
    }

    public void setQuantidadeCilindradas(int quantidadeCilindradas) {
        this.quantidadeCilindradas = quantidadeCilindradas;
    }

    public boolean isAbs() {
        return abs;
    }

    public void setAbs(boolean abs) {
        this.abs = abs;
    }
}


// Classe Bicicleta (herda de Veiculo)
class Bicicleta extends Veiculo {
    private boolean eletrica;
    private int quantidadeMarchas;
    private String material;
    private String suspensao;

    public Bicicleta(boolean motor, boolean volante, int quantidadePassageiros,
                     int quantidadePortas, int quantidadeRodas, boolean carga,
                     double capacidadeCarga, Combustivel combustivel,
                     boolean eletrica, int quantidadeMarchas, String material,
                     String suspensao) {
        super(motor, volante, quantidadePassageiros, quantidadePortas,
                quantidadeRodas, carga, capacidadeCarga, combustivel);
        this.eletrica = eletrica;
        this.quantidadeMarchas = quantidadeMarchas;
        this.material = material;
        this.suspensao = suspensao;
    }

    // Getters e Setters
    public boolean isEletrica() {
        return eletrica;
    }

    public void setEletrica(boolean eletrica) {
        this.eletrica = eletrica;
    }

    public int getQuantidadeMarchas() {
        return quantidadeMarchas;
    }

    public void setQuantidadeMarchas(int quantidadeMarchas) {
        this.quantidadeMarchas = quantidadeMarchas;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getSuspensao() {
        return suspensao;
    }

    public void setSuspensao(String suspensao) {
        this.suspensao = suspensao;
    }
}


// Classe Charrete (herda de Veiculo)
class Charrete extends Veiculo {
    public Charrete(boolean motor, boolean volante, int quantidadePassageiros,
                    int quantidadePortas, int quantidadeRodas, boolean carga,
                    double capacidadeCarga, Combustivel combustivel) {
        super(motor, volante, quantidadePassageiros, quantidadePortas,
                quantidadeRodas, carga, capacidadeCarga, combustivel);
    }
}


// Classe Caminhao (herda de Veiculo)
class Caminhao extends Veiculo {
    private String tipoCaminhao;

    public Caminhao(boolean motor, boolean volante, int quantidadePassageiros,
                    int quantidadePortas, int quantidadeRodas, boolean carga,
                    double capacidadeCarga, Combustivel combustivel,
                    String tipoCaminhao) {
        super(motor, volante, quantidadePassageiros, quantidadePortas,
                quantidadeRodas, carga, capacidadeCarga, combustivel);
        this.tipoCaminhao = tipoCaminhao;
    }

    // Getters e Setters
    public String getTipoCaminhao() {
        return tipoCaminhao;
    }

    public void setTipoCaminhao(String tipoCaminhao) {
        this.tipoCaminhao = tipoCaminhao;
    }
}


// Classe Carro (herda de Veiculo)
class Carro extends Veiculo {
    private boolean arCondicionado;
    private boolean airBag;
    private boolean centralMultimidia;
    private boolean vidroEletrico;
    private boolean trava;
    private boolean alarme;
    private boolean bancoCouro;
    private boolean abs;

    public Carro(boolean motor, boolean volante, int quantidadePassageiros,
                 int quantidadePortas, int quantidadeRodas, boolean carga,
                 double capacidadeCarga, Combustivel combustivel,
                 boolean arCondicionado, boolean airBag, boolean centralMultimidia,
                 boolean vidroEletrico, boolean trava, boolean alarme,
                 boolean bancoCouro, boolean abs) {
        super(motor, volante, quantidadePassageiros, quantidadePortas,
                quantidadeRodas, carga, capacidadeCarga, combustivel);
        this.arCondicionado = arCondicionado;
        this.airBag = airBag;
        this.centralMultimidia = centralMultimidia;
        this.vidroEletrico = vidroEletrico;
        this.trava = trava;
        this.alarme = alarme;
        this.bancoCouro = bancoCouro;
        this.abs = abs;
    }

    // Getters e Setters
    public boolean isArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public boolean isAirBag() {
        return airBag;
    }

    public void setAirBag(boolean airBag) {
        this.airBag = airBag;
    }

    public boolean isCentralMultimidia() {
        return centralMultimidia;
    }

    public void setCentralMultimidia(boolean centralMultimidia) {
        this.centralMultimidia = centralMultimidia;
    }

    public boolean isVidroEletrico() {
        return vidroEletrico;
    }

    public void setVidroEletrico(boolean vidroEletrico) {
        this.vidroEletrico = vidroEletrico;
    }

    public boolean isTrava() {
        return trava;
    }

    public void setTrava(boolean trava) {
        this.trava = trava;
    }

    public boolean isAlarme() {
        return alarme;
    }

    public void setAlarme(boolean alarme) {
        this.alarme = alarme;
    }

    public boolean isBancoCouro() {
        return bancoCouro;
    }

    public void setBancoCouro(boolean bancoCouro) {
        this.bancoCouro = bancoCouro;
    }

    public boolean isAbs() {
        return abs;
    }

    public void setAbs(boolean abs) {
        this.abs = abs;
    }
}
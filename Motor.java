public class Motor {

    private TipoCombustivel tipoMotor;
    private int consumo; // em quilometros por unidade. Ex: Km/Lt
    private int quilometragem;

    public Motor(TipoCombustivel tipoMotor, int consumo) {
        this.tipoMotor = tipoMotor;
        this.consumo = consumo;
    }

    public int getConsumo() {
        return this.consumo;
    }

    public boolean setConsumoFlex(TipoCombustivel tipoCombustivel) {
        if(tipoCombustivel == TipoCombustivel.ALCOOL){
            this.consumo = 6;
            return true;
        }
        else if (tipoCombustivel == TipoCombustivel.GASOLINA){
            this.consumo = 8;
            return true;
        }
        return false;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public TipoCombustivel getTipoMotor(){
        return this.tipoMotor;
    }

    public int getQuilometragem(){
        return this.quilometragem;
    }

    public int combustivelNecessario(int distancia) {
        return distancia / consumo;
    }

    public void percorre(int distancia) {
        quilometragem += distancia;
    }

    @Override
    public String toString() {
        return "Motor [consumo=" + consumo + ", quilometragem=" + quilometragem + ", tipoMotor=" + tipoMotor + "]";
    }
}
package Model;

public class Estoque {
    private int memoriaRam;
    private int placaMae;
    private int memoriaSSD;
    private int placaGraficaVideo;
    private String OrdemCompra;
    private String outrasOrdem;

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public int getPlacaMae() {
        return placaMae;
    }

    public void setPlacaMae(int placaMae) {
        this.placaMae = placaMae;
    }

    public int getMemoriaSSD() {
        return memoriaSSD;
    }

    public void setMemoriaSSD(int memoriaSSD) {
        this.memoriaSSD = memoriaSSD;
    }

    public int getPlacaGraficaVideo() {
        return placaGraficaVideo;
    }

    public void setPlacaGraficaVideo(int placaGraficaVideo) {
        this.placaGraficaVideo = placaGraficaVideo;
    }

    public String getOrdemCompra() {
        return OrdemCompra;
    }

    public void setOrdemCompra(String ordemCompra) {
        OrdemCompra = ordemCompra;
    }

    public String getOutrasOrdem() {
        return outrasOrdem;
    }

    public void setOutrasOrdem(String outrasOrdem) {
        this.outrasOrdem = outrasOrdem;
    }
}
